package com.hufudb.openhufu.mpc.gmw;

import static org.junit.Assert.assertEquals;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import com.google.common.collect.ImmutableList;
import com.hufudb.openhufu.mpc.bristol.CircuitType;
import com.hufudb.openhufu.mpc.codec.OpenHuFuCodec;
import com.hufudb.openhufu.mpc.ot.PublicKeyOT;
import com.hufudb.openhufu.mpc.random.BasicRandom;
import com.hufudb.openhufu.mpc.random.OpenHuFuRandom;
import com.hufudb.openhufu.rpc.Party;
import com.hufudb.openhufu.rpc.grpc.OpenHuFuOwnerInfo;
import com.hufudb.openhufu.rpc.grpc.OpenHuFuRpc;
import com.hufudb.openhufu.rpc.grpc.OpenHuFuRpcManager;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import io.grpc.Channel;
import io.grpc.Server;
import io.grpc.inprocess.InProcessChannelBuilder;
import io.grpc.inprocess.InProcessServerBuilder;
import io.grpc.testing.GrpcCleanupRule;
import org.junit.Ignore;

@RunWith(JUnit4.class)
public class GMWTest {
  @Rule
  public final GrpcCleanupRule grpcCleanup = new GrpcCleanupRule();

  public static OpenHuFuRandom rand = new BasicRandom();

  List<byte[]> encodeValue(int value) {
    return ImmutableList.of(OpenHuFuCodec.encodeInt(value));
  }

  public void testcase(int a, int b) throws Exception {
    try {
      String ownerName0 = InProcessServerBuilder.generateName();
      String ownerName1 = InProcessServerBuilder.generateName();
      Party owner0 = new OpenHuFuOwnerInfo(0, ownerName0);
      Party owner1 = new OpenHuFuOwnerInfo(1, ownerName1);
      List<Party> parties = ImmutableList.of(
        owner0, owner1
      );
      List<Channel> channels = Arrays.asList(
        grpcCleanup.register(InProcessChannelBuilder.forName(ownerName0).directExecutor().build()),
        grpcCleanup.register(InProcessChannelBuilder.forName(ownerName1).directExecutor().build())
      );
      OpenHuFuRpcManager manager = new OpenHuFuRpcManager(parties, channels);
      OpenHuFuRpc rpc0 = (OpenHuFuRpc) manager.getRpc(0);
      OpenHuFuRpc rpc1 = (OpenHuFuRpc) manager.getRpc(1);
      Server server0 = InProcessServerBuilder.forName(ownerName0).directExecutor().addService(rpc0.getgRpcService()).build().start();
      Server server1 = InProcessServerBuilder.forName(ownerName1).directExecutor().addService(rpc1.getgRpcService()).build().start();
      grpcCleanup.register(server0);
      grpcCleanup.register(server1);
      rpc0.connect();
      rpc1.connect();
      ExecutorService threadPool0 = Executors.newFixedThreadPool(4);
      ExecutorService threadPool1 = Executors.newFixedThreadPool(4);
      PublicKeyOT otSender = new PublicKeyOT(rpc0);
      PublicKeyOT otReceiver = new PublicKeyOT(rpc1);
      GMW gmwSender = new GMW(rpc0, otSender, threadPool0);
      GMW gmwReceiver = new GMW(rpc1, otReceiver, threadPool1);
      ExecutorService service = Executors.newFixedThreadPool(2);
      Future<Object> senFuture = service.submit(
        new Callable<Object>() {
          @Override
          public Object call() throws Exception {
            return gmwSender.run(0, ImmutableList.of(0, 1), encodeValue(a), CircuitType.ADD_32.getId());
          }
        }
      );
      Future<Object> recFuture = service.submit(
        new Callable<Object>() {
        @Override
        public Object call() throws Exception {
          return gmwReceiver.run(0, ImmutableList.of(0, 1), encodeValue(b), CircuitType.ADD_32.getId());
        }
      });
      byte[] senRes = ((List<byte[]>) senFuture.get()).get(0);
      byte[] recRes = ((List<byte[]>) recFuture.get()).get(0);
      byte[] res = new byte[4];
      OpenHuFuCodec.xor(senRes, recRes, res);
      int actual = OpenHuFuCodec.decodeInt(res);
      int expect = a + b;
      assertEquals(expect, actual);
      rpc0.disconnect();
      rpc1.disconnect();
    } catch (Exception e) {
      e.printStackTrace();
      throw e;
    }
  }

  @Ignore
  @Test
  public void testGMW() throws Exception {
    testcase(2, 6);
    testcase(1, 256);
    testcase(2, 255);
    testcase(241, 278);
    testcase(278, 241);
    testcase(65536, 258);
    testcase(0x000F0F00, 0x10001000);
  }
}

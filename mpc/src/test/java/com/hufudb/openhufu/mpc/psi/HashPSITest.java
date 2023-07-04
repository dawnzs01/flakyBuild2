package com.hufudb.openhufu.mpc.psi;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import com.google.common.collect.ImmutableList;
import com.hufudb.openhufu.mpc.codec.HashFunction;
import com.hufudb.openhufu.mpc.codec.OpenHuFuCodec;
import com.hufudb.openhufu.mpc.random.BasicRandom;
import com.hufudb.openhufu.mpc.random.OpenHuFuRandom;
import com.hufudb.openhufu.rpc.Party;
import com.hufudb.openhufu.rpc.grpc.OpenHuFuOwnerInfo;
import com.hufudb.openhufu.rpc.grpc.OpenHuFuRpcManager;
import com.hufudb.openhufu.rpc.grpc.OpenHuFuRpc;
import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import io.grpc.Channel;
import io.grpc.inprocess.InProcessChannelBuilder;
import io.grpc.inprocess.InProcessServerBuilder;
import io.grpc.testing.GrpcCleanupRule;
import org.junit.Test;

@Ignore
@RunWith(JUnit4.class)
public class HashPSITest {
  @Rule
  public final GrpcCleanupRule grpcCleanup = new GrpcCleanupRule();
  public static OpenHuFuRandom rand = new BasicRandom();

  public List<byte[]> generateData(int size, int rowNum) {
    ImmutableList.Builder<byte[]> randomData = ImmutableList.builder();
    for (int i = 0; i < 5; ++i) {
      // create duplicate elements
      randomData.add(OpenHuFuCodec.encodeInt(i));
      randomData.add(OpenHuFuCodec.encodeInt(i));
    }
    for (int i = 0; i < rowNum; ++i) {
      randomData.add(OpenHuFuCodec.encodeInt(i));
      randomData.add(OpenHuFuCodec.encodeInt(i));
    }
    return randomData.build();
  }

  private OpenHuFuRpc rpc0;
  private OpenHuFuRpc rpc1;
  private HashPSI psi0;
  private HashPSI psi1;

  @Before
  public void setUp() throws IOException {
    String ownerName0 = InProcessServerBuilder.generateName();
    String ownerName1 = InProcessServerBuilder.generateName();
    Party owner0 = new OpenHuFuOwnerInfo(0, ownerName0);
    Party owner1 = new OpenHuFuOwnerInfo(1, ownerName1);
    List<Party> parties = ImmutableList.of(owner0, owner1);
    List<Channel> channels = Arrays.asList(
        grpcCleanup.register(InProcessChannelBuilder.forName(ownerName0).directExecutor().build()),
        grpcCleanup.register(InProcessChannelBuilder.forName(ownerName1).directExecutor().build()));
    OpenHuFuRpcManager manager = new OpenHuFuRpcManager(parties, channels);
    rpc0 = (OpenHuFuRpc) manager.getRpc(0);
    rpc1 = (OpenHuFuRpc) manager.getRpc(1);
    grpcCleanup.register(InProcessServerBuilder.forName(ownerName0).directExecutor()
    .addService(rpc0.getgRpcService()).build().start());
    grpcCleanup.register(InProcessServerBuilder.forName(ownerName1).directExecutor()
        .addService(rpc1.getgRpcService()).build().start());
    rpc0.connect();
    rpc1.connect();
    psi0 = new HashPSI(rpc0);
    psi1 = new HashPSI(rpc1);
  }

  @After
  public void shutdown() {
    rpc0.disconnect();
    rpc1.disconnect();
  }

  public void runHashPSI(List<byte[]> data0, List<byte[]> data1, HashFunction func, int senderId, int receiverId) throws Exception {
    ExecutorService service = Executors.newFixedThreadPool(2);
    int taskId = 0;
    int hashType = func.getId();
    Future<Object> psiRes0 = service.submit(new Callable<Object>() {
      @Override
      public Object call() throws Exception {
        return psi0.run(taskId, ImmutableList.of(senderId, receiverId), data0, hashType);
      }
    });
    Future<Object> psiRes1 = service.submit(new Callable<Object>() {
      @Override
      public Object call() throws Exception {
        return psi1.run(taskId, ImmutableList.of(senderId, receiverId), data1, hashType);
      }
    });
    List<byte[]> expect0 = new ArrayList<>();
    List<byte[]> expect1 = new ArrayList<>();
    for (int i = 0; i < data0.size(); ++i) {
      byte[] d1 = data0.get(i);
      for (int j = 0; j < data1.size(); ++j) {
        byte[] d0 = data1.get(j);
        if (Arrays.equals(d0, d1)) {
          expect0.add(OpenHuFuCodec.encodeInt(i));
          expect1.add(OpenHuFuCodec.encodeInt(j));
        }
      }
    }
    List<byte[]> actual0 = (List<byte[]>) psiRes0.get();
    List<byte[]> actual1 = (List<byte[]>) psiRes1.get();
    assertEquals(expect0.size(), actual0.size());
    assertEquals(expect1.size(), actual1.size());
    for (int i = 0; i < expect0.size(); ++i) {
      assertArrayEquals(expect0.get(i), actual0.get(i));
    }
    for (int i = 0; i < expect1.size(); ++i) {
      assertArrayEquals(expect1.get(i), actual1.get(i));
    }
  }

  @Test
  public void testHashPSIMD5() throws Exception {
    try {
      runHashPSI(generateData(8, 10), generateData(8, 100), HashFunction.MD5, 0, 1);
    } catch (Exception e) {
      e.printStackTrace();
      throw e;
    }
  }

  @Test
  public void testHashPSISHA256() throws Exception {
    try {
      runHashPSI(generateData(8, 10), generateData(8, 100), HashFunction.SHA256, 0, 1);
    } catch (Exception e) {
      e.printStackTrace();
      throw e;
    }
  }

  @Test
  public void testHashPSIEqaulSize() throws Exception {
    try {
      runHashPSI(generateData(8, 10), generateData(8, 10), HashFunction.MD5, 0, 1);
    } catch (Exception e) {
      e.printStackTrace();
      throw e;
    }
  }

  @Test
  public void testHashPSISenderLarger() throws Exception {
    try {
      runHashPSI(generateData(8, 10), generateData(8, 100), HashFunction.MD5, 1, 0);
    } catch (Exception e) {
      e.printStackTrace();
      throw e;
    }
  }

  @Test
  public void testHashPSIEqaul() throws Exception {
    try {
      List<byte[]> data0 = new ArrayList<>();
      List<byte[]> data1 = new ArrayList<>();
      data0.add(OpenHuFuCodec.encodeInt(21));
      data0.add(OpenHuFuCodec.encodeInt(20));
      data0.add(OpenHuFuCodec.encodeInt(20));
      data1.add(OpenHuFuCodec.encodeInt(20));
      data1.add(OpenHuFuCodec.encodeInt(21));
      data1.add(OpenHuFuCodec.encodeInt(22));
      runHashPSI(data0, data1, HashFunction.MD5, 0, 1);
      runHashPSI(data1, data0, HashFunction.MD5, 0, 1);
    } catch (Exception e) {
      e.printStackTrace();
      throw e;
    }
  }
}

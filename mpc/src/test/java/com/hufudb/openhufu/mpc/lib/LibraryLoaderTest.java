package com.hufudb.openhufu.mpc.lib;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import com.google.common.collect.ImmutableList;
import com.hufudb.openhufu.mpc.ProtocolExecutor;
import com.hufudb.openhufu.mpc.ProtocolFactory;
import com.hufudb.openhufu.mpc.ProtocolType;
import com.hufudb.openhufu.mpc.codec.OpenHuFuCodec;
import com.hufudb.openhufu.proto.OpenHuFuData.ColumnType;
import com.hufudb.openhufu.proto.OpenHuFuPlan.OperatorType;
import com.hufudb.openhufu.proto.OpenHuFuService.OwnerInfo;
import org.junit.Ignore;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Ignore
public class LibraryLoaderTest {
  static Random random = new Random();
  private static final Logger LOG = LoggerFactory.getLogger(LibraryLoaderTest.class);


  @Test
  public void testLoadEmptyProtocolLibrary() {
    String openhufuRoot = System.getenv("OPENHUFU_ROOT");
    Path libDir = Paths.get(openhufuRoot, "lib");
    Map<ProtocolType, ProtocolFactory> factories =
        LibraryLoader.loadProtocolLibrary(libDir.toString());
    assertTrue(factories.size() >= 0);
  }

  /**
   * require the installation of aby4j
   */
  @Test
  public void testLoadProtocolLibrary() throws InterruptedException, ExecutionException {
    String openhufuRoot = System.getenv("OPENHUFU_ROOT");
    Path libDir = Paths.get(openhufuRoot, "lib");
    Map<ProtocolType, ProtocolFactory> factories =
        LibraryLoader.loadProtocolLibrary(libDir.toString());
    ProtocolFactory factory = factories.get(ProtocolType.ABY);
    ProtocolExecutor aby0 = factory.create(
        OwnerInfo.newBuilder().setEndpoint("127.0.0.1:7766").setId(0).build(),
        ProtocolType.ABY);
    assertNotNull(aby0);
    ProtocolExecutor aby1 = factory.create(
        OwnerInfo.newBuilder().setEndpoint("127.0.0.1:7766").setId(1).build(),
        ProtocolType.ABY);
    assertNotNull(aby1);
    ExecutorService service = Executors.newFixedThreadPool(2);
    final int A = 40;
    final int B = 30;
    final boolean expect = A > B;
    Future<Boolean> r0 = service.submit(new Callable<Boolean>() {
      @Override
      public Boolean call() throws Exception {
        LOG.info("0 call");
        List<byte[]> res = (List<byte[]>) aby0.run(0, ImmutableList.of(0), ImmutableList.of(OpenHuFuCodec.encodeInt(A)), 
          OperatorType.GT, ColumnType.INT, "127.0.0.1", 7766, false);
        return OpenHuFuCodec.decodeBoolean(res.get(0));
      }
    });
    Future<Boolean> r1 = service.submit(new Callable<Boolean>() {
      @Override
      public Boolean call() throws Exception {
        LOG.info("1 call");
        List<byte[]> res = (List<byte[]>) aby1.run(0, ImmutableList.of(1), ImmutableList.of(OpenHuFuCodec.encodeInt(B)), 
          OperatorType.GT, ColumnType.INT, "127.0.0.1", 7766, false);
        return OpenHuFuCodec.decodeBoolean(res.get(0));
      }
    });
    assertEquals(expect, r0.get());
    assertEquals(expect, r1.get());
  }
}

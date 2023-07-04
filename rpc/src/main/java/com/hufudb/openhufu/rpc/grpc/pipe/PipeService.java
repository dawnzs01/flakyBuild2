package com.hufudb.openhufu.rpc.grpc.pipe;

import java.util.Map;
import com.hufudb.openhufu.proto.PipeGrpc;
import com.hufudb.openhufu.proto.DataPacket.DataPacketProto;
import com.hufudb.openhufu.proto.DataPacket.ResponseProto;
import com.hufudb.openhufu.rpc.concurrent.ConcurrentBuffer;
import com.hufudb.openhufu.rpc.utils.DataPacket;
import com.hufudb.openhufu.rpc.utils.DataPacketHeader;
import io.grpc.stub.StreamObserver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PipeService extends PipeGrpc.PipeImplBase {
  private static final Logger LOG = LoggerFactory.getLogger(PipeService.class);
  private static final ResponseProto OK = ResponseProto.newBuilder().build();

  private final Map<Integer, ConcurrentBuffer<DataPacketHeader, DataPacket>> buffers;

  /*
   * partyId -> concurrentBuffer each buffer only collects packets from the correspongding party
   */
  public PipeService(Map<Integer, ConcurrentBuffer<DataPacketHeader, DataPacket>> buffers) {
    this.buffers = buffers;
  }

  @Override
  public void send(DataPacketProto request, StreamObserver<ResponseProto> responseObserver) {
    int senderId = request.getHeaderProto().getSenderId();
    DataPacket packet = DataPacket.fromProto(request);
    LOG.debug("Pipe get {}", packet);
    ConcurrentBuffer<DataPacketHeader, DataPacket> buffer = buffers.get(senderId);
    ResponseProto resp = OK;
    if (buffer == null) {
      LOG.error("No buffer for Party[{}]", senderId);
      resp = ResponseProto.newBuilder().setStatus(1)
          .setMsg(String.format("No buffer for Party[%d]", senderId)).build();
    } else {
      boolean ok = buffer.put(packet.getHeader(), packet);
      if (!ok) {
        resp = ResponseProto.newBuilder().setStatus(1)
            .setMsg(String.format("Buffer of Party[%d] is full", senderId)).build();
      }
    }
    responseObserver.onNext(resp);
    responseObserver.onCompleted();
  }
}

package com.hufudb.openhufu.owner.implementor.join;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import com.google.common.collect.ImmutableList;
import com.google.protobuf.InvalidProtocolBufferException;
import com.hufudb.openhufu.data.storage.DataSet;
import com.hufudb.openhufu.data.storage.EmptyDataSet;
import com.hufudb.openhufu.data.storage.HorizontalDataSet;
import com.hufudb.openhufu.data.storage.MaterializedDataSet;
import com.hufudb.openhufu.data.storage.ProtoDataSet;
import com.hufudb.openhufu.data.storage.ProtoRowDataSet;
import com.hufudb.openhufu.data.storage.VerticalDataSet;
import com.hufudb.openhufu.mpc.ProtocolException;
import com.hufudb.openhufu.mpc.codec.HashFunction;
import com.hufudb.openhufu.mpc.codec.OpenHuFuCodec;
import com.hufudb.openhufu.mpc.psi.HashPSI;
import com.hufudb.openhufu.mpc.utils.Stream;
import com.hufudb.openhufu.proto.OpenHuFuData.DataSetProto;
import com.hufudb.openhufu.proto.OpenHuFuPlan.JoinCondition;
import com.hufudb.openhufu.proto.OpenHuFuPlan.TaskInfo;
import com.hufudb.openhufu.rpc.Rpc;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HashEqualJoin implements OwnerJoin {
  static final int MAX_SIZE = 1000;
  static final Logger LOG = LoggerFactory.getLogger(HashEqualJoin.class);

  public HashEqualJoin() {
  }

  static List<byte[]> encode(List<Integer> keys, DataSet dataSet) {
    ProtoRowDataSet keySets = ProtoRowDataSet.project(dataSet, keys);
    return keySets.toBytes();
  }

  static List<byte[]> encode(DataSet source) {
    return ProtoDataSet.slice(source, MAX_SIZE).stream().map(proto -> proto.toByteArray())
        .collect(Collectors.toList());
  }

  MaterializedDataSet decode(List<byte[]> payload) {
    try {
      List<ProtoDataSet> dataSets = new ArrayList<>();
      for (byte[] b : payload) {
        dataSets.add(ProtoDataSet.create(DataSetProto.parseFrom(b)));
      }
      return new HorizontalDataSet(dataSets);
    } catch (InvalidProtocolBufferException e) {
      LOG.error("Fail to parse dataset in receiver: %d", e.getMessage());
      throw new RuntimeException("Fail to parse dataset in receiver");
    }
  }

  @Override
  public DataSet join(DataSet in, JoinCondition joinCond, boolean isLeft, Rpc rpc, TaskInfo taskInfo)
      throws ProtocolException {
    if (joinCond.hasCondition()) {
      LOG.error("HashEqualJoin not support theta join");
      throw new UnsupportedOperationException("HashEqualJoin not support theta join");
    }
    // note: require the party of left table precede the party of right table
    List<Integer> parties = taskInfo.getPartiesList();
    if (parties.size() != 2) {
      LOG.error("HashEqualJoin only support two parties");
      throw new UnsupportedOperationException("HashEqualJoin only support two parties");
    }
    HashPSI psi = new HashPSI(rpc);
    Stream st = new Stream(rpc);
    List<byte[]> joinKey;
    // At present, the left party collect result
    int receiverId = parties.get(0);
    int senderId = parties.get(1);
    MaterializedDataSet localSet = ProtoDataSet.materialize(in);
    // todo: choose collector by data size
    if (isLeft) {
      assert parties.get(0) == rpc.ownParty().getPartyId();
      long startTime = System.currentTimeMillis();
      joinKey = encode(joinCond.getLeftKeyList(), localSet);
      long endTime = System.currentTimeMillis();
      LOG.info("Left encode use {} ms", endTime - startTime);
    } else {
      assert parties.get(1) == rpc.ownParty().getPartyId();
      long startTime = System.currentTimeMillis();
      joinKey = encode(joinCond.getRightKeyList(), localSet);
      long endTime = System.currentTimeMillis();
      LOG.info("Right encode use {} ms", endTime - startTime);
    }
    List<byte[]> res = (List<byte[]>) psi.run(taskInfo.getTaskId(), parties, joinKey, HashFunction.SHA256.getId());
    LOG.debug("Get {} rows in HashPSI", res.size());
    if (res.size() == 0) {
      return EmptyDataSet.INSTANCE;
    }
    localSet = new JoinFilterDataSet(localSet,
        res.stream().map(b -> OpenHuFuCodec.decodeInt(b)).collect(Collectors.toList()));
    if (senderId == rpc.ownParty().getPartyId()) {
      return senderProcedure(localSet, taskInfo.getTaskId(), senderId, receiverId, st);
    } else if (receiverId == rpc.ownParty().getPartyId()) {
      return receiverProcedure(localSet, taskInfo.getTaskId(), senderId, receiverId, st);
    } else {
      LOG.error("{} not found in participants of HashEqualJoin", rpc.ownParty());
      throw new RuntimeException("Not participant of HashEqualJoin");
    }
  }

  DataSet senderProcedure(MaterializedDataSet in, long taskId, int senderId, int receiverId,
      Stream stream) throws ProtocolException {
    List<byte[]> inputs = encode(in);
    stream.run(taskId, ImmutableList.of(senderId, receiverId), inputs);
    return EmptyDataSet.INSTANCE;
  }

  DataSet receiverProcedure(MaterializedDataSet localDataSet, long taskId, int senderId, int receiverId,
      Stream stream) throws ProtocolException {
    List<byte[]> result = (List<byte[]>)
        stream.run(taskId, ImmutableList.of(senderId, receiverId), ImmutableList.of());
    MaterializedDataSet remoteDataSet = decode(result);
    if (remoteDataSet.rowCount() == 0) {
      return EmptyDataSet.INSTANCE;
    } else {
      return VerticalDataSet.create(localDataSet, remoteDataSet);
    }
  }
}

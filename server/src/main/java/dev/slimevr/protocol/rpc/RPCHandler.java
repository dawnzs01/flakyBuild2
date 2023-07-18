package dev.slimevr.protocol.rpc;

import com.google.flatbuffers.FlatBufferBuilder;
import dev.slimevr.autobone.AutoBone.Epoch;
import dev.slimevr.autobone.AutoBoneListener;
import dev.slimevr.autobone.AutoBoneProcessType;
import dev.slimevr.config.OverlayConfig;
import dev.slimevr.poseframeformat.PoseFrames;
import dev.slimevr.protocol.GenericConnection;
import dev.slimevr.protocol.ProtocolAPI;
import dev.slimevr.protocol.ProtocolHandler;
import dev.slimevr.protocol.rpc.reset.RPCResetHandler;
import dev.slimevr.protocol.rpc.serial.RPCProvisioningHandler;
import dev.slimevr.protocol.rpc.serial.RPCSerialHandler;
import dev.slimevr.protocol.rpc.settings.RPCSettingsHandler;
import dev.slimevr.protocol.rpc.setup.RPCTapSetupHandler;
import dev.slimevr.protocol.rpc.setup.RPCUtil;
import dev.slimevr.protocol.rpc.status.RPCStatusHandler;
import dev.slimevr.tracking.processor.config.SkeletonConfigOffsets;
import dev.slimevr.tracking.trackers.Tracker;
import dev.slimevr.tracking.trackers.TrackerPosition;
import dev.slimevr.tracking.trackers.TrackerUtils;
import io.eiren.util.logging.LogManager;
import io.github.axisangles.ktmath.Quaternion;
import solarxr_protocol.MessageBundle;
import solarxr_protocol.datatypes.TransactionId;
import solarxr_protocol.rpc.*;

import java.util.EnumMap;
import java.util.Map.Entry;
import java.util.function.BiConsumer;


public class RPCHandler extends ProtocolHandler<RpcMessageHeader>
	implements AutoBoneListener {

	private static final String resetSourceName = "WebSocketAPI";

	private final ProtocolAPI api;

	private long currTransactionId = 0;

	public RPCHandler(ProtocolAPI api) {
		super();
		this.api = api;

		new RPCResetHandler(this, api);
		new RPCSerialHandler(this, api);
		new RPCProvisioningHandler(this, api);
		new RPCSettingsHandler(this, api);
		new RPCTapSetupHandler(this, api);
		new RPCStatusHandler(this, api);

		registerPacketListener(RpcMessage.ResetRequest, this::onResetRequest);
		registerPacketListener(RpcMessage.AssignTrackerRequest, this::onAssignTrackerRequest);

		registerPacketListener(
			RpcMessage.ClearDriftCompensationRequest,
			this::onClearDriftCompensationRequest
		);

		registerPacketListener(RpcMessage.RecordBVHRequest, this::onRecordBVHRequest);

		registerPacketListener(RpcMessage.SkeletonResetAllRequest, this::onSkeletonResetAllRequest);
		registerPacketListener(RpcMessage.SkeletonConfigRequest, this::onSkeletonConfigRequest);
		registerPacketListener(
			RpcMessage.ChangeSkeletonConfigRequest,
			this::onChangeSkeletonConfigRequest
		);

		registerPacketListener(RpcMessage.AutoBoneProcessRequest, this::onAutoBoneProcessRequest);

		registerPacketListener(
			RpcMessage.OverlayDisplayModeChangeRequest,
			this::onOverlayDisplayModeChangeRequest
		);
		registerPacketListener(
			RpcMessage.OverlayDisplayModeRequest,
			this::onOverlayDisplayModeRequest
		);

		registerPacketListener(RpcMessage.ServerInfosRequest, this::onServerInfosRequest);

		registerPacketListener(RpcMessage.LegTweaksTmpChange, this::onLegTweaksTmpChange);

		registerPacketListener(RpcMessage.LegTweaksTmpClear, this::onLegTweaksTmpClear);

		registerPacketListener(RpcMessage.StatusSystemRequest, this::onStatusSystemRequest);

		registerPacketListener(RpcMessage.SetPauseTrackingRequest, this::onSetPauseTrackingRequest);

		this.api.server.getAutoBoneHandler().addListener(this);
	}

	private void onServerInfosRequest(
		GenericConnection conn,
		RpcMessageHeader messageHeader
	) {
		FlatBufferBuilder fbb = new FlatBufferBuilder(32);

		String localIp = RPCUtil.getLocalIp();
		int response = ServerInfosResponse
			.createServerInfosResponse(fbb, fbb.createString(localIp));
		int outbound = this.createRPCMessage(fbb, RpcMessage.ServerInfosResponse, response);
		fbb.finish(outbound);
		conn.send(fbb.dataBuffer());
	}

	private void onOverlayDisplayModeRequest(
		GenericConnection conn,
		RpcMessageHeader messageHeader
	) {
		FlatBufferBuilder fbb = new FlatBufferBuilder(32);
		OverlayConfig config = this.api.server.getConfigManager().getVrConfig().getOverlay();
		int response = OverlayDisplayModeResponse
			.createOverlayDisplayModeResponse(fbb, config.isVisible(), config.isMirrored());
		int outbound = this.createRPCMessage(fbb, RpcMessage.OverlayDisplayModeResponse, response);
		fbb.finish(outbound);
		conn.send(fbb.dataBuffer());
	}

	private void onOverlayDisplayModeChangeRequest(
		GenericConnection conn,
		RpcMessageHeader messageHeader
	) {
		OverlayDisplayModeChangeRequest req = (OverlayDisplayModeChangeRequest) messageHeader
			.message(new OverlayDisplayModeChangeRequest());
		if (req == null)
			return;
		OverlayConfig config = this.api.server.getConfigManager().getVrConfig().getOverlay();
		config.setMirrored(req.isMirrored());
		config.setVisible(req.isVisible());

		this.api.server.getConfigManager().saveConfig();
	}

	public void onSkeletonResetAllRequest(GenericConnection conn, RpcMessageHeader messageHeader) {
		SkeletonResetAllRequest req = (SkeletonResetAllRequest) messageHeader
			.message(new SkeletonResetAllRequest());
		if (req == null)
			return;

		this.api.server.humanPoseManager.resetOffsets();
		this.api.server.humanPoseManager.saveConfig();
		this.api.server.getConfigManager().saveConfig();

		// might not be a good idea maybe let the client ask again
		FlatBufferBuilder fbb = new FlatBufferBuilder(300);
		int config = RPCBuilder.createSkeletonConfig(fbb, this.api.server.humanPoseManager);
		int outbound = this.createRPCMessage(fbb, RpcMessage.SkeletonConfigResponse, config);
		fbb.finish(outbound);
		conn.send(fbb.dataBuffer());
	}

	public void onSkeletonConfigRequest(GenericConnection conn, RpcMessageHeader messageHeader) {
		SkeletonConfigRequest req = (SkeletonConfigRequest) messageHeader
			.message(new SkeletonConfigRequest());
		if (req == null)
			return;

		FlatBufferBuilder fbb = new FlatBufferBuilder(300);
		int config = RPCBuilder.createSkeletonConfig(fbb, this.api.server.humanPoseManager);
		int outbound = this.createRPCMessage(fbb, RpcMessage.SkeletonConfigResponse, config);
		fbb.finish(outbound);
		conn.send(fbb.dataBuffer());
	}

	public void onChangeSkeletonConfigRequest(
		GenericConnection conn,
		RpcMessageHeader messageHeader
	) {
		ChangeSkeletonConfigRequest req = (ChangeSkeletonConfigRequest) messageHeader
			.message(new ChangeSkeletonConfigRequest());
		if (req == null)
			return;

		SkeletonConfigOffsets joint = SkeletonConfigOffsets.getById(req.bone());

		this.api.server.humanPoseManager.setOffset(joint, req.value());
		this.api.server.humanPoseManager.saveConfig();
		this.api.server.getConfigManager().saveConfig();
	}

	public void onRecordBVHRequest(GenericConnection conn, RpcMessageHeader messageHeader) {
		RecordBVHRequest req = (RecordBVHRequest) messageHeader.message(new RecordBVHRequest());
		if (req == null)
			return;

		if (req.stop()) {
			if (this.api.server.getBvhRecorder().isRecording())
				this.api.server.getBvhRecorder().endRecording();
		} else {
			if (!this.api.server.getBvhRecorder().isRecording())
				this.api.server.getBvhRecorder().startRecording();
		}

		FlatBufferBuilder fbb = new FlatBufferBuilder(40);
		int status = RecordBVHStatus
			.createRecordBVHStatus(fbb, this.api.server.getBvhRecorder().isRecording());
		int outbound = this.createRPCMessage(fbb, RpcMessage.RecordBVHStatus, status);
		fbb.finish(outbound);
		conn.send(fbb.dataBuffer());
	}

	public void onResetRequest(GenericConnection conn, RpcMessageHeader messageHeader) {
		ResetRequest req = (ResetRequest) messageHeader.message(new ResetRequest());
		if (req == null)
			return;

		if (req.resetType() == ResetType.Yaw)
			this.api.server.resetTrackersYaw(resetSourceName);
		if (req.resetType() == ResetType.Full)
			this.api.server.resetTrackersFull(resetSourceName);
		if (req.resetType() == ResetType.Mounting)
			this.api.server.resetTrackersMounting(resetSourceName);
	}

	public void onAssignTrackerRequest(GenericConnection conn, RpcMessageHeader messageHeader) {
		AssignTrackerRequest req = (AssignTrackerRequest) messageHeader
			.message(new AssignTrackerRequest());
		if (req == null)
			return;

		Tracker tracker = this.api.server.getTrackerById(req.trackerId().unpack());
		if (tracker == null)
			return;


		TrackerPosition pos = TrackerPosition.getByBodyPart(req.bodyPosition());
		Tracker previousTracker = pos != null
			? TrackerUtils
				.getNonInternalTrackerForBodyPosition(this.api.server.getAllTrackers(), pos)
			: null;
		if (previousTracker != null) {
			previousTracker.setTrackerPosition(null);
			this.api.server.trackerUpdated(previousTracker);
		}
		tracker.setTrackerPosition(pos);

		if (req.mountingOrientation() != null) {
			if (tracker.getNeedsMounting()) {
				tracker
					.getResetsHandler()
					.setMountingOrientation(
						new Quaternion(
							req.mountingOrientation().w(),
							req.mountingOrientation().x(),
							req.mountingOrientation().y(),
							req.mountingOrientation().z()
						)
					);
			}
		}

		if (req.displayName() != null) {
			tracker.setCustomName(req.displayName());
		}

		if (tracker.isImu()) {
			tracker.getResetsHandler().setAllowDriftCompensation(req.allowDriftCompensation());
		}

		this.api.server.trackerUpdated(tracker);
	}

	public void onClearDriftCompensationRequest(
		GenericConnection conn,
		RpcMessageHeader messageHeader
	) {
		ClearDriftCompensationRequest req = (ClearDriftCompensationRequest) messageHeader
			.message(new ClearDriftCompensationRequest());
		if (req == null)
			return;

		this.api.server.clearTrackersDriftCompensation();
	}

	public void onLegTweaksTmpChange(
		GenericConnection conn,
		RpcMessageHeader messageHeader
	) {
		LegTweaksTmpChange req = (LegTweaksTmpChange) messageHeader
			.message(new LegTweaksTmpChange());
		if (req == null)
			return;

		this.api.server.humanPoseManager
			.setLegTweaksStateTemp(
				req.skatingCorrection(),
				req.floorClip(),
				req.toeSnap(),
				req.footPlant()
			);
	}

	public void onLegTweaksTmpClear(
		GenericConnection conn,
		RpcMessageHeader messageHeader
	) {
		LegTweaksTmpClear req = (LegTweaksTmpClear) messageHeader
			.message(new LegTweaksTmpClear());
		if (req == null)
			return;

		this.api.server.humanPoseManager
			.clearLegTweaksStateTemp(
				req.skatingCorrection(),
				req.floorClip(),
				req.toeSnap(),
				req.footPlant()
			);

	}

	@Override
	public void onMessage(GenericConnection conn, RpcMessageHeader message) {
		BiConsumer<GenericConnection, RpcMessageHeader> consumer = this.handlers[message
			.messageType()];
		if (consumer != null)
			consumer.accept(conn, message);
		else
			LogManager
				.info("[ProtocolAPI] Unhandled RPC packet received id: " + message.messageType());
	}

	public int createRPCMessage(FlatBufferBuilder fbb, byte messageType, int messageOffset) {
		int[] data = new int[1];

		RpcMessageHeader.startRpcMessageHeader(fbb);
		RpcMessageHeader.addMessage(fbb, messageOffset);
		RpcMessageHeader.addMessageType(fbb, messageType);
		RpcMessageHeader.addTxId(fbb, TransactionId.createTransactionId(fbb, currTransactionId++));
		data[0] = RpcMessageHeader.endRpcMessageHeader(fbb);

		int messages = MessageBundle.createRpcMsgsVector(fbb, data);

		MessageBundle.startMessageBundle(fbb);
		MessageBundle.addRpcMsgs(fbb, messages);
		return MessageBundle.endMessageBundle(fbb);
	}

	@Override
	public int messagesCount() {
		return RpcMessage.names.length;
	}

	public void onAutoBoneProcessRequest(GenericConnection conn, RpcMessageHeader messageHeader) {
		AutoBoneProcessRequest req = (AutoBoneProcessRequest) messageHeader
			.message(new AutoBoneProcessRequest());
		if (req == null || conn.getContext().useAutoBone())
			return;

		conn.getContext().setUseAutoBone(true);
		this.api.server
			.getAutoBoneHandler()
			.startProcessByType(AutoBoneProcessType.Companion.getById(req.processType()));
	}

	@Override
	public void onAutoBoneProcessStatus(
		AutoBoneProcessType processType,
		String message,
		long current,
		long total,
		boolean completed,
		boolean success
	) {
		this.api
			.getAPIServers()
			.forEach(
				(server) -> server
					.getAPIConnections()
					.filter(conn -> conn.getContext().useAutoBone())
					.forEach((conn) -> {
						FlatBufferBuilder fbb = new FlatBufferBuilder(32);

						Integer messageOffset = message != null ? fbb.createString(message) : null;

						AutoBoneProcessStatusResponse.startAutoBoneProcessStatusResponse(fbb);
						AutoBoneProcessStatusResponse.addProcessType(fbb, processType.getId());
						if (messageOffset != null)
							AutoBoneProcessStatusResponse.addMessage(fbb, messageOffset);
						if (total > 0 && current >= 0) {
							AutoBoneProcessStatusResponse.addCurrent(fbb, current);
							AutoBoneProcessStatusResponse.addTotal(fbb, total);
						}
						AutoBoneProcessStatusResponse.addCompleted(fbb, completed);
						AutoBoneProcessStatusResponse.addSuccess(fbb, success);
						int update = AutoBoneProcessStatusResponse
							.endAutoBoneProcessStatusResponse(fbb);
						int outbound = this
							.createRPCMessage(
								fbb,
								RpcMessage.AutoBoneProcessStatusResponse,
								update
							);
						fbb.finish(outbound);

						conn.send(fbb.dataBuffer());
						if (completed) {
							conn.getContext().setUseAutoBone(false);
						}
					})
			);
	}

	@Override
	public void onAutoBoneRecordingEnd(PoseFrames recording) {
		// Do nothing, this is broadcasted by "onAutoBoneProcessStatus" uwu
	}

	@Override
	public void onAutoBoneEpoch(Epoch epoch) {
		this.api
			.getAPIServers()
			.forEach(
				(server) -> server
					.getAPIConnections()
					.filter(conn -> conn.getContext().useAutoBone())
					.forEach((conn) -> {
						FlatBufferBuilder fbb = new FlatBufferBuilder(32);

						int[] skeletonPartOffsets = new int[epoch.getConfigValues().size()];
						int i = 0;
						for (
							Entry<SkeletonConfigOffsets, Float> skeletonConfig : epoch
								.getConfigValues()
								.entrySet()
						) {
							skeletonPartOffsets[i++] = SkeletonPart
								.createSkeletonPart(
									fbb,
									skeletonConfig.getKey().id,
									skeletonConfig.getValue()
								);
						}

						int skeletonPartsOffset = AutoBoneEpochResponse
							.createAdjustedSkeletonPartsVector(fbb, skeletonPartOffsets);

						int update = AutoBoneEpochResponse
							.createAutoBoneEpochResponse(
								fbb,
								epoch.getEpoch(),
								epoch.getTotalEpochs(),
								epoch.getEpochError().getMean(),
								skeletonPartsOffset
							);
						int outbound = this
							.createRPCMessage(fbb, RpcMessage.AutoBoneEpochResponse, update);
						fbb.finish(outbound);

						conn.send(fbb.dataBuffer());
					})
			);
	}

	@Override
	public void onAutoBoneEnd(EnumMap<SkeletonConfigOffsets, Float> configValues) {
		// Do nothing, the last epoch from "onAutoBoneEpoch" should be all
		// that's needed
	}

	public void onStatusSystemRequest(GenericConnection conn, RpcMessageHeader messageHeader) {
		StatusSystemRequest req = (StatusSystemRequest) messageHeader
			.message(new StatusSystemRequest());
		if (req == null)
			return;

		var statuses = this.api.server.getStatusSystem().getStatuses();

		FlatBufferBuilder fbb = new FlatBufferBuilder(
			statuses.length * RPCStatusHandler.STATUS_EXPECTED_SIZE
		);
		var response = new StatusSystemResponseT();
		response.setCurrentStatuses(statuses);
		int offset = StatusSystemResponse.pack(fbb, response);
		int outbound = this.createRPCMessage(fbb, RpcMessage.StatusSystemResponse, offset);
		fbb.finish(outbound);
		conn.send(fbb.dataBuffer());
	}

	public void onSetPauseTrackingRequest(GenericConnection conn, RpcMessageHeader messageHeader) {
		SetPauseTrackingRequest req = (SetPauseTrackingRequest) messageHeader
			.message(new SetPauseTrackingRequest());
		if (req == null)
			return;

		this.api.server.humanPoseManager.setPauseTracking(req.pauseTracking());
	}
}

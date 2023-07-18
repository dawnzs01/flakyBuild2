package dev.slimevr.config;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.*;
import com.github.jonpeterson.jackson.module.versioning.VersionedModelConverter;
import dev.slimevr.tracking.processor.config.SkeletonConfigOffsets;
import io.eiren.util.logging.LogManager;

import java.util.Map;


public class CurrentVRConfigConverter implements VersionedModelConverter {

	@Override
	public ObjectNode convert(
		ObjectNode modelData,
		String modelVersion,
		String targetModelVersion,
		JsonNodeFactory nodeFactory
	) {
		try {
			int version = Integer.parseInt(modelVersion);

			// Configs with old versions need a migration to the latest config
			if (version < 2) {
				// Move zoom to the window config
				ObjectNode windowNode = (ObjectNode) modelData.get("window");
				DoubleNode zoomNode = (DoubleNode) modelData.get("zoom");
				if (windowNode != null && zoomNode != null) {
					windowNode.set("zoom", zoomNode);
					modelData.remove("zoom");
				}

				// Change trackers list to map
				ArrayNode oldTrackersNode = modelData.withArray("trackers");
				if (oldTrackersNode != null) {
					var trackersIter = oldTrackersNode.iterator();
					ObjectNode trackersNode = nodeFactory.objectNode();
					while (trackersIter.hasNext()) {
						JsonNode node = trackersIter.next();
						JsonNode resultNode = TrackerConfig.toV2(node, nodeFactory);
						trackersNode.set(node.get("name").asText(), resultNode);
					}
					modelData.set("trackers", trackersNode);
				}

				// Rename bridge to bridges
				ObjectNode bridgeNode = (ObjectNode) modelData.get("bridge");
				if (bridgeNode != null) {
					modelData.set("bridges", bridgeNode);
					modelData.remove("bridge");
				}

				// Move body to skeleton (and merge it to current skeleton)
				ObjectNode bodyNode = (ObjectNode) modelData.get("body");
				if (bodyNode != null) {
					var bodyIter = bodyNode.fields();
					ObjectNode skeletonNode = (ObjectNode) modelData.get("skeleton");
					if (skeletonNode == null) {
						skeletonNode = nodeFactory.objectNode();
					}

					ObjectNode offsetsNode = nodeFactory.objectNode();
					while (bodyIter.hasNext()) {
						Map.Entry<String, JsonNode> node = bodyIter.next();
						// Filter only number values because other types would
						// be stuff that didn't get migrated correctly before
						if (node.getValue().isNumber()) {
							offsetsNode.set(node.getKey(), node.getValue());
						}
					}

					// Fix calibration wolf typos
					offsetsNode.set("shouldersWidth", bodyNode.get("shoulersWidth"));
					offsetsNode.set("shouldersDistance", bodyNode.get("shoulersDistance"));
					offsetsNode.remove("shoulersWidth");
					offsetsNode.remove("shoulersDistance");
					skeletonNode.set("offsets", offsetsNode);
					modelData.set("skeleton", skeletonNode);
					modelData.remove("body");
				}
			}
			if (version < 3) {
				// Check for out-of-bound filtering amount
				ObjectNode filtersNode = (ObjectNode) modelData.get("filters");
				if (filtersNode != null && filtersNode.get("amount").floatValue() > 2f) {
					filtersNode.set("amount", new FloatNode(0.2f));
				}
			}
			if (version < 4) {
				// Change mountingRotation to mountingOrientation
				ObjectNode oldTrackersNode = (ObjectNode) modelData.get("trackers");
				if (oldTrackersNode != null) {
					var trackersIter = oldTrackersNode.iterator();
					var fieldNamesIter = oldTrackersNode.fieldNames();
					ObjectNode trackersNode = nodeFactory.objectNode();
					String fieldName;
					while (trackersIter.hasNext()) {
						ObjectNode node = (ObjectNode) trackersIter.next();
						fieldName = fieldNamesIter.next();
						node.set("mountingOrientation", node.get("mountingRotation"));
						node.remove("mountingRotation");
						trackersNode.set(fieldName, node);
					}
					modelData.set("trackers", trackersNode);
				}
			}
			if (version < 5) {
				// Migrate old skeleton offsets to new ones
				ObjectNode skeletonNode = (ObjectNode) modelData.get("skeleton");
				if (skeletonNode != null) {
					ObjectNode offsetsNode = (ObjectNode) skeletonNode.get("offsets");
					if (offsetsNode != null) {
						// torsoLength, chestDistance and waistDistance become
						// chestLength, waistLength and hipLength.
						float torsoLength = SkeletonConfigOffsets.CHEST.defaultValue
							+ SkeletonConfigOffsets.WAIST.defaultValue
							+ SkeletonConfigOffsets.HIP.defaultValue;
						float chestDistance = SkeletonConfigOffsets.CHEST.defaultValue;
						float waistDistance = SkeletonConfigOffsets.HIP.defaultValue;
						JsonNode torsoNode = offsetsNode.get("torsoLength");
						if (torsoNode != null)
							torsoLength = torsoNode.floatValue();
						JsonNode chestNode = offsetsNode.get("chestDistance");
						if (chestNode != null)
							chestDistance = chestNode.floatValue();
						JsonNode waistNode = offsetsNode.get("waistDistance");
						if (waistNode != null)
							waistDistance = waistNode.floatValue();
						offsetsNode.set("chestLength", offsetsNode.get("chestDistance"));
						offsetsNode
							.set(
								"waistLength",
								new FloatNode(torsoLength - chestDistance - waistDistance)
							);
						offsetsNode.set("hipLength", offsetsNode.get("waistDistance"));
						offsetsNode.remove("torsoLength");
						offsetsNode.remove("chestDistance");
						offsetsNode.remove("waistDistance");

						// legsLength and kneeHeight become
						// upperLegLength and lowerLegLength
						float legsLength = SkeletonConfigOffsets.UPPER_LEG.defaultValue
							+ SkeletonConfigOffsets.LOWER_LEG.defaultValue;
						float kneeHeight = SkeletonConfigOffsets.LOWER_LEG.defaultValue;
						JsonNode legsNode = offsetsNode.get("legsLength");
						if (legsNode != null)
							legsLength = legsNode.floatValue();
						JsonNode kneesNode = offsetsNode.get("kneeHeight");
						if (kneesNode != null)
							kneeHeight = kneesNode.floatValue();
						offsetsNode.set("upperLegLength", new FloatNode(legsLength - kneeHeight));
						offsetsNode.set("lowerLegLength", new FloatNode(kneeHeight));
						offsetsNode.remove("legsLength");
						offsetsNode.remove("kneeHeight");

						skeletonNode.set("offsets", offsetsNode);
						modelData.set("skeleton", skeletonNode);
					}
				}
			}
			if (version < 6) {
				// Migrate controllers offsets to hands offsets
				ObjectNode skeletonNode = (ObjectNode) modelData.get("skeleton");
				if (skeletonNode != null) {
					ObjectNode offsetsNode = (ObjectNode) skeletonNode.get("offsets");
					if (offsetsNode != null) {
						offsetsNode.set("handDistanceY", offsetsNode.get("controllerDistanceY"));
						offsetsNode.set("handDistanceZ", offsetsNode.get("controllerDistanceZ"));
					}
				}
			}
			if (version < 7) {
				// Chest, hip, and elbow offsets now go the opposite direction
				ObjectNode skeletonNode = (ObjectNode) modelData.get("skeleton");
				if (skeletonNode != null) {
					ObjectNode offsetsNode = (ObjectNode) skeletonNode.get("offsets");
					if (offsetsNode != null) {
						JsonNode chestNode = offsetsNode.get("chestOffset");
						if (chestNode != null)
							offsetsNode.set("chestOffset", new FloatNode(-chestNode.floatValue()));
						JsonNode hipNode = offsetsNode.get("hipOffset");
						if (hipNode != null)
							offsetsNode.set("hipOffset", new FloatNode(-hipNode.floatValue()));
						JsonNode elbowNode = offsetsNode.get("elbowOffset");
						if (elbowNode != null)
							offsetsNode.set("elbowOffset", new FloatNode(-elbowNode.floatValue()));
					}
				}
			}
			if (version < 8) {
				// reset > fullReset, quickReset > yawReset
				ObjectNode keybindingsNode = (ObjectNode) modelData.get("keybindings");
				if (keybindingsNode != null) {
					JsonNode fullResetNode = keybindingsNode.get("resetBinding");
					if (fullResetNode != null)
						keybindingsNode.set("fullResetBinding", fullResetNode);
					JsonNode yawResetNode = keybindingsNode.get("quickResetBinding");
					if (yawResetNode != null)
						keybindingsNode.set("yawResetBinding", yawResetNode);
					JsonNode mountingResetNode = keybindingsNode.get("resetMountingBinding");
					if (mountingResetNode != null)
						keybindingsNode.set("mountingResetBinding", mountingResetNode);

					JsonNode fullDelayNode = keybindingsNode.get("resetDelay");
					if (fullDelayNode != null)
						keybindingsNode.set("fullResetDelay", fullDelayNode);
					JsonNode yawDelayNode = keybindingsNode.get("quickResetDelay");
					if (yawDelayNode != null)
						keybindingsNode.set("yawResetDelay", yawDelayNode);
					JsonNode mountingDelayNode = keybindingsNode.get("resetMountingDelay");
					if (mountingDelayNode != null)
						keybindingsNode.set("mountingResetDelay", mountingDelayNode);
				}

				ObjectNode tapDetectionNode = (ObjectNode) modelData.get("tapDetection");
				if (tapDetectionNode != null) {
					tapDetectionNode.set("yawResetDelay", tapDetectionNode.get("quickResetDelay"));
					tapDetectionNode.set("fullResetDelay", tapDetectionNode.get("resetDelay"));
					tapDetectionNode
						.set("yawResetEnabled", tapDetectionNode.get("quickResetEnabled"));
					tapDetectionNode.set("fullResetEnabled", tapDetectionNode.get("resetEnabled"));
					tapDetectionNode.set("yawResetTaps", tapDetectionNode.get("quickResetTaps"));
					tapDetectionNode.set("fullResetTaps", tapDetectionNode.get("resetTaps"));
				}
			}
		} catch (Exception e) {
			LogManager.severe("Error during config migration: " + e);
		}

		return modelData;
	}
}

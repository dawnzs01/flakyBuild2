package dev.slimevr.config.serializers;

import dev.slimevr.config.BridgeConfig;


/**
 * This class allows the use of the utility super class MapDeserializer that
 * takes the Value of a map as its Generic parameter. It is so you can use that
 * class in a @JsonDeserialize annotation on the Map field inside the config
 * instance
 *
 * @see dev.slimevr.config.VRConfig
 */
public class BridgeConfigMapDeserializer extends MapDeserializer<BridgeConfig> {
	public BridgeConfigMapDeserializer() {
		super(BridgeConfig.class);
	}
}

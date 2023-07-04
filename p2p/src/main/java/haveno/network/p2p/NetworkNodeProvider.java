/*
 * This file is part of Haveno.
 *
 * haveno is free software: you can redistribute it and/or modify it
 * under the terms of the GNU Affero General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or (at
 * your option) any later version.
 *
 * haveno is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
 * FITNESS FOR A PARTICULAR PURPOSE. See the GNU Affero General Public
 * License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with haveno. If not, see <http://www.gnu.org/licenses/>.
 */

package haveno.network.p2p;

import haveno.network.p2p.network.BridgeAddressProvider;
import haveno.network.p2p.network.LocalhostNetworkNode;
import haveno.network.p2p.network.BanFilter;
import haveno.network.p2p.network.NetworkNode;
import haveno.network.p2p.network.NewTor;
import haveno.network.p2p.network.RunningTor;
import haveno.network.p2p.network.TorMode;
import haveno.network.p2p.network.TorNetworkNode;

import haveno.common.config.Config;
import haveno.common.proto.network.NetworkProtoResolver;

import javax.inject.Inject;
import javax.inject.Named;
import javax.inject.Provider;

import java.io.File;

import javax.annotation.Nullable;

public class NetworkNodeProvider implements Provider<NetworkNode> {

    private final NetworkNode networkNode;

    @Inject
    public NetworkNodeProvider(NetworkProtoResolver networkProtoResolver,
            BridgeAddressProvider bridgeAddressProvider,
            @Nullable BanFilter banFilter,
            @Named(Config.MAX_CONNECTIONS) int maxConnections,
            @Named(Config.USE_LOCALHOST_FOR_P2P) boolean useLocalhostForP2P,
            @Named(Config.NODE_PORT) int port,
            @Named(Config.TOR_DIR) File torDir,
            @Nullable @Named(Config.TORRC_FILE) File torrcFile,
            @Named(Config.TORRC_OPTIONS) String torrcOptions,
            @Named(Config.TOR_CONTROL_PORT) int controlPort,
            @Named(Config.TOR_CONTROL_PASSWORD) String password,
            @Nullable @Named(Config.TOR_CONTROL_COOKIE_FILE) File cookieFile,
            @Named(Config.TOR_STREAM_ISOLATION) boolean streamIsolation,
            @Named(Config.TOR_CONTROL_USE_SAFE_COOKIE_AUTH) boolean useSafeCookieAuthentication) {
        if (useLocalhostForP2P) {
            networkNode = new LocalhostNetworkNode(port, networkProtoResolver, banFilter, maxConnections);
        } else {
            TorMode torMode = getTorMode(bridgeAddressProvider,
                    torDir,
                    torrcFile,
                    torrcOptions,
                    controlPort,
                    password,
                    cookieFile,
                    useSafeCookieAuthentication);
            networkNode = new TorNetworkNode(port, networkProtoResolver, streamIsolation, torMode, banFilter, maxConnections);
        }
    }

    private TorMode getTorMode(BridgeAddressProvider bridgeAddressProvider,
            File torDir,
            @Nullable File torrcFile,
            String torrcOptions,
            int controlPort,
            String password,
            @Nullable File cookieFile,
            boolean useSafeCookieAuthentication) {
        return controlPort != Config.UNSPECIFIED_PORT ?
                new RunningTor(torDir, controlPort, password, cookieFile, useSafeCookieAuthentication) :
                new NewTor(torDir, torrcFile, torrcOptions, bridgeAddressProvider);
    }

    @Override
    public NetworkNode get() {
        return networkNode;
    }
}

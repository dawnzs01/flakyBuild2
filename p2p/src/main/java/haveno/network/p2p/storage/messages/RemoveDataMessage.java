/*
 * This file is part of Haveno.
 *
 * Haveno is free software: you can redistribute it and/or modify it
 * under the terms of the GNU Affero General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or (at
 * your option) any later version.
 *
 * Haveno is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
 * FITNESS FOR A PARTICULAR PURPOSE. See the GNU Affero General Public
 * License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with Haveno. If not, see <http://www.gnu.org/licenses/>.
 */

package haveno.network.p2p.storage.messages;

import haveno.common.app.Version;
import haveno.common.proto.network.NetworkProtoResolver;
import haveno.network.p2p.storage.payload.ProtectedStorageEntry;
import lombok.EqualsAndHashCode;
import lombok.Value;

@EqualsAndHashCode(callSuper = true)
@Value
public final class RemoveDataMessage extends BroadcastMessage {
    private final ProtectedStorageEntry protectedStorageEntry;

    public RemoveDataMessage(ProtectedStorageEntry protectedStorageEntry) {
        this(protectedStorageEntry, Version.getP2PMessageVersion());
    }


    ///////////////////////////////////////////////////////////////////////////////////////////
    // PROTO BUFFER
    ///////////////////////////////////////////////////////////////////////////////////////////

    private RemoveDataMessage(ProtectedStorageEntry protectedStorageEntry,
                              String messageVersion) {
        super(messageVersion);
        this.protectedStorageEntry = protectedStorageEntry;
    }

    @Override
    public protobuf.NetworkEnvelope toProtoNetworkEnvelope() {
        return getNetworkEnvelopeBuilder()
                .setRemoveDataMessage(protobuf.RemoveDataMessage.newBuilder()
                        .setProtectedStorageEntry((protobuf.ProtectedStorageEntry) protectedStorageEntry.toProtoMessage()))
                .build();
    }

    public static RemoveDataMessage fromProto(protobuf.RemoveDataMessage proto, NetworkProtoResolver resolver, String messageVersion) {
        return new RemoveDataMessage(ProtectedStorageEntry.fromProto(proto.getProtectedStorageEntry(), resolver), messageVersion);
    }
}

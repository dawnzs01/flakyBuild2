package it.auties.whatsapp.model.setting;

import it.auties.protobuf.base.ProtobufMessage;
import it.auties.protobuf.base.ProtobufProperty;
import it.auties.whatsapp.model.chat.ChatMediaVisibility;
import it.auties.whatsapp.model.chat.ChatWallpaper;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.experimental.Accessors;
import lombok.extern.jackson.Jacksonized;

import static it.auties.protobuf.base.ProtobufType.*;

@AllArgsConstructor
@Data
@Builder
@Jacksonized
@Accessors(fluent = true)
public class GlobalSettings implements ProtobufMessage {
    @ProtobufProperty(index = 1, type = MESSAGE, implementation = ChatWallpaper.class)
    private ChatWallpaper lightThemeWallpaper;

    @ProtobufProperty(index = 2, type = MESSAGE, implementation = ChatMediaVisibility.class)
    private ChatMediaVisibility mediaVisibility;

    @ProtobufProperty(index = 3, type = MESSAGE, implementation = ChatWallpaper.class)
    private ChatWallpaper darkThemeWallpaper;

    @ProtobufProperty(index = 4, name = "autoDownloadWiFi", type = MESSAGE)
    private AutoDownloadSettings autoDownloadWiFi;

    @ProtobufProperty(index = 5, name = "autoDownloadCellular", type = MESSAGE)
    private AutoDownloadSettings autoDownloadCellular;

    @ProtobufProperty(index = 6, name = "autoDownloadRoaming", type = MESSAGE)
    private AutoDownloadSettings autoDownloadRoaming;

    @ProtobufProperty(index = 7, name = "showIndividualNotificationsPreview", type = BOOL)
    private boolean showIndividualNotificationsPreview;

    @ProtobufProperty(index = 8, name = "showGroupNotificationsPreview", type = BOOL)
    private boolean showGroupNotificationsPreview;

    @ProtobufProperty(index = 9, name = "disappearingModeDuration", type = INT32)
    private int disappearingModeDuration;

    @ProtobufProperty(index = 10, name = "disappearingModeTimestamp", type = INT64)
    private long disappearingModeTimestamp;

    @ProtobufProperty(index = 11, name = "avatarUserSettings", type = MESSAGE)
    private AvatarUserSettings avatarUserSettings;
}
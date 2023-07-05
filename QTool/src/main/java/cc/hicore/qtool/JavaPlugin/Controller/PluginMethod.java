package cc.hicore.qtool.JavaPlugin.Controller;

import android.app.Activity;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

import cc.hicore.LogUtils.LogUtils;
import cc.hicore.Utils.Utils;
import cc.hicore.qtool.QQManager.QQEnvUtils;
import cc.hicore.qtool.QQManager.QQGroupManager;
import cc.hicore.qtool.QQManager.QQTicketManager;
import cc.hicore.qtool.QQMessage.QQMessageUtils;
import cc.hicore.qtool.QQMessage.QQMsgBuilder;
import cc.hicore.qtool.QQMessage.QQMsgSendUtils;
import cc.hicore.qtool.QQMessage.QQMsgSender;
import cc.hicore.qtool.QQMessage.QQSessionUtils;
import cc.hicore.qtool.QQTools.QQServletHelper;

//插件Api直接导出方法
public class PluginMethod {

    private final PluginInfo info_;

    public PluginMethod(PluginInfo cacheInfo) {
        info_ = cacheInfo;
    }

    public void sendMsg(String GroupUin, String UserUin, String Content) {
        if (info_.IsAvailable(GroupUin)) {
            QQMsgSendUtils.decodeAndSendMsg(GroupUin, UserUin, Content);
        }
    }

    public void sendPic(String GroupUin, String UserUin, String Path) {
        if (info_.IsAvailable(GroupUin)) {
            if (!Path.startsWith("/") && !Path.toLowerCase(Locale.ROOT).startsWith("http"))
                Path = info_.LocalPath + "/" + Path;
            QQMsgSendUtils.decodeAndSendMsg(GroupUin, UserUin, "[PicUrl=" + Path + "]");
        }
    }

    public void sendCard(String GroupUin, String UserUin, String CardText) {
        if (info_.IsAvailable(GroupUin)) {
            QQMsgSendUtils.sendCard(GroupUin, UserUin, CardText);
        }
    }

    public void sendShake(String GroupUin) {
        if (info_.IsAvailable(GroupUin)) {
            QQMsgSender.sendShakeWindow(GroupUin);
        }
    }

    public void sendShow(String GroupUin, String Path, int type) {
        if (info_.IsAvailable(GroupUin)) {
            if (!Path.startsWith("/") && !Path.toLowerCase(Locale.ROOT).startsWith("http"))
                Path = info_.LocalPath + "/" + Path;
            QQMsgSendUtils.sendEffectShow(GroupUin, "", Path, type);
        }
    }

    public void sendTip(Object source, String text) {
        if (source instanceof PluginInfo.MessageData) {
            QQMsgSendUtils.addTip(((PluginInfo.MessageData) source).msg, text);
        } else {
            QQMsgSendUtils.addTip(source, text);
        }

    }

    public void sendVoice(String GroupUin, String UserUin, String Path) {
        if (info_.IsAvailable(GroupUin)) {
            if (!Path.startsWith("/") && !Path.toLowerCase(Locale.ROOT).startsWith("http"))
                Path = info_.LocalPath + "/" + Path;
            QQMsgSender.sendVoice(QQSessionUtils.Build_SessionInfo(GroupUin, UserUin), Path);
        }
    }

    public void sendReply(String GroupUin, Object target, String text) {
        if (info_.IsAvailable(GroupUin)) {
            if (target instanceof PluginInfo.MessageData) {
                QQMsgSendUtils.sendReply(GroupUin, ((PluginInfo.MessageData) target).msg, text);
            } else {
                QQMsgSendUtils.sendReply(GroupUin, target, text);
            }

        }
    }

    public ArrayList<PluginInfo.GroupInfo> getGroupList() {
        ArrayList<PluginInfo.GroupInfo> infos = new ArrayList<>();
        Iterator<PluginInfo.GroupInfo> it = infos.iterator();
        while (it.hasNext()) {
            PluginInfo.GroupInfo item = it.next();
            if (info_.IsBlackMode) {
                if (info_.ListStr.contains(item.GroupUin)) it.remove();
            } else {
                if (!info_.ListStr.contains(item.GroupUin)) it.remove();
            }
        }
        return PluginApiHelper.getGroupList();
    }

    public ArrayList<PluginInfo.GroupMemberInfo> getGroupMemberList(String GroupUin) {
        if (info_.IsAvailable(GroupUin)) {
            return PluginApiHelper.getMemberList(GroupUin);
        } else return new ArrayList<>();
    }

    public ArrayList<PluginInfo.GroupBanInfo> getForbiddenList(String GroupUin) {
        if (info_.IsAvailable(GroupUin)) {
            return PluginApiHelper.getMuteInfo(GroupUin);
        } else return new ArrayList<>();
    }

    public void setCard(String GroupUin, String UserUin, String Name) {
        if (info_.IsAvailable(GroupUin)) {
            QQGroupManager.Group_Change_Name(GroupUin, UserUin, Name);
        }
    }

    public void setTitle(String GroupUin, String UserUin, String title) {
        if (info_.IsAvailable(GroupUin)) {
            QQGroupManager.Group_Change_Title(GroupUin, UserUin, title);
        }
    }

    public String AddItem(String ItemName, String CallbackName, String PluginID) {
        LogUtils.debug("RemoveItem", PluginID + ":" + PluginID);
        return AddItem(ItemName, CallbackName);
    }

    public String AddItem(String ItemName, String CallbackName) {
        return PluginController.AddItem(info_.PluginVerifyID, ItemName, CallbackName, 1);
    }

    public void RemoveItem(String PluginID, String ItemID) {
        LogUtils.debug("RemoveItem", PluginID + ":" + ItemID);
        RemoveItem(ItemID);
    }

    public void RemoveItem(String ItemID) {
        PluginController.RemoveItem(info_.PluginVerifyID, ItemID,1);
    }
    public void RemoveItemByName(String Name){
        PluginController.RemoveItemByName(info_.PluginVerifyID,Name,1);
    }

    public String addMenuItem(String Name, String CallbackName){
        return PluginController.AddItem(info_.PluginVerifyID,Name,CallbackName,2);
    }
    public void removeMenuItemByName(String Name){
        PluginController.RemoveItemByName(info_.PluginVerifyID,Name,2);
    }
    public void removeMenu(String key){
        PluginController.RemoveItem(info_.PluginVerifyID,key,2);
    }

    public void Toast(Object obj) {
        Utils.ShowToast(obj);
    }

    public void revokeMsg(Object msg) {
        if (msg instanceof PluginInfo.MessageData) {
            QQMessageUtils.revokeMsg(((PluginInfo.MessageData) msg).msg);
        } else {
            QQMessageUtils.revokeMsg(msg);
        }

    }

    public void Forbidden(String GroupUin, String UserUin, int time) {
        if (info_.IsAvailable(GroupUin)) {
            QQGroupManager.Group_Mute(GroupUin, UserUin, time);
        }
    }

    public void Kick(String GroupUin, String UserUin, boolean isBlack) {
        if (info_.IsAvailable(GroupUin)) {
            QQGroupManager.Group_Kick(GroupUin, UserUin, isBlack);
        }
    }

    public Activity GetActivity() {
        return Utils.getTopActivity();
    }

    public void load(String Path) {
        String TruePath = Path;
        if (!TruePath.startsWith("/")) {
            TruePath = info_.LocalPath + "/" + TruePath;
        }
        PluginController.loadExtra(info_.PluginVerifyID, TruePath);
    }

    public String getSkey() {
        if (SecurityAccess.checkAccess(info_.PluginID, "当前加载的脚本:" + info_.PluginName + " 正在获取你当前登录QQ的Skey,使用该Key可以进行信息获取,状态修改等操作,请确认你的脚本来源正确且没有恶意代码再允许此操作\n\n脚本ID:" + info_.PluginName + "(" + info_.PluginID + ")")) {
            return QQTicketManager.getSkey();
        }
        return "";
    }

    public String getPskey(String Domain) {
        if (SecurityAccess.checkAccess(info_.PluginID, "当前加载的脚本:" + info_.PluginName + " 正在获取你当前登录QQ的Pskey(" + Domain + "),使用该Key可以进行信息获取,状态修改等操作,请确认你的脚本来源正确且没有恶意代码再允许此操作\n\n脚本ID:" + info_.PluginName + "(" + info_.PluginID + ")")) {
            return QQTicketManager.getPsKey(Domain);
        }
        return "";
    }

    public String getSuperkey() {
        if (SecurityAccess.checkAccess(info_.PluginID, "当前加载的脚本:" + info_.PluginName + " 正在获取你当前登录QQ的SuperKey,使用该Key可以进行信息获取,状态修改等操作,请确认你的脚本来源正确且没有恶意代码再允许此操作\n\n脚本ID:" + info_.PluginName + "(" + info_.PluginID + ")")) {
            return QQTicketManager.getSuperKey();
        }
        return "";
    }

    public String getPT4Token(String Domain) {
        if (SecurityAccess.checkAccess(info_.PluginID, "当前加载的脚本:" + info_.PluginName + " 正在获取你当前登录QQ的PT4Token,使用该Key可以进行信息获取,状态修改等操作,请确认你的脚本来源正确且没有恶意代码再允许此操作\n\n脚本ID:" + info_.PluginName + "(" + info_.PluginID + ")")) {
            return QQTicketManager.getPt4Token(Domain);
        }
        return "";
    }

    public String getBKN() {
        if (SecurityAccess.checkAccess(info_.PluginID, "当前加载的脚本:" + info_.PluginName + " 正在获取你当前登录QQ的BKN,使用该Key可以进行信息获取,状态修改等操作,请确认你的脚本来源正确且没有恶意代码再允许此操作\n\n脚本ID:" + info_.PluginName + "(" + info_.PluginID + ")")) {
            return QQTicketManager.getBKN();
        }
        return "";
    }

    public String getGTK(String Domain) {
        if (SecurityAccess.checkAccess(info_.PluginID, "当前加载的脚本:" + info_.PluginName + " 正在获取你当前登录QQ的G_TK,使用该Key可以进行信息获取,状态修改等操作,请确认你的脚本来源正确且没有恶意代码再允许此操作\n\n脚本ID:" + info_.AccessToken)) {
            return QQTicketManager.getG_TK(Domain);
        }
        return "";
    }

    public String getString(String ConfigName, String key) {
        return PluginStoreUtils.getString(info_.PluginID, ConfigName, key);
    }

    public void putString(String ConfigName, String key, String value) {
        PluginStoreUtils.putString(info_.PluginID, ConfigName, key, value);
    }

    public boolean getBoolean(String ConfigName, String key, boolean def) {
        return PluginStoreUtils.getBoolean(info_.PluginID, ConfigName, key, def);
    }

    public void putBoolean(String ConfigName, String key, boolean value) {
        PluginStoreUtils.putBoolean(info_.PluginID, ConfigName, key, value);
    }

    public int getInt(String ConfigName, String key, int def) {
        return PluginStoreUtils.getInt(info_.PluginID, ConfigName, key, def);
    }

    public void putInt(String ConfigName, String key, int value) {
        PluginStoreUtils.putInt(info_.PluginID, ConfigName, key, value);
    }

    public long getLong(String ConfigName, String key, long def) {
        return PluginStoreUtils.getLong(info_.PluginID, ConfigName, key, def);
    }

    public void putLong(String ConfigName, String key, long value) {
        PluginStoreUtils.putLong(info_.PluginID, ConfigName, key, value);
    }

    public void IncludeFile(String path) {
        LogUtils.debug("IncludeFile", path);
    }

    public void setFlag(String flag){
        //Do Nothing
        LogUtils.info("PluginSetFlag",info_.PluginName+"->"+flag);
    }

    public int getChatType() {
        return QQSessionUtils.getSessionID();
    }

    public String getGroupUin() {
        return QQSessionUtils.getGroupUin();
    }

    public String getFriendUin() {
        return QQSessionUtils.getFriendUin();
    }

    public void Pai(String GroupUin, String UserUin) {
        if (info_.IsAvailable(GroupUin)) {
            QQMsgSender.sendPaiyipai(GroupUin, UserUin);
        }
    }

    public void setItemCallback(String callbackName) {
        PluginController.setItemClickFunctionName(info_.PluginVerifyID, callbackName);
    }

    public void sendLike(String UserUin, int count) {
        QQEnvUtils.sendLike(UserUin, count);
    }

    public void sendAntEmo(String GroupUin, String UserUin, int servID) {
        QQMsgSender.sendAntEmo(QQSessionUtils.Build_SessionInfo(GroupUin, UserUin), servID);
    }

    public String getFileDirectUrl(Object msgData) {
        Object chatMsg;
        if (msgData == null) return null;
        if (msgData instanceof PluginInfo.MessageData) {
            chatMsg = ((PluginInfo.MessageData) msgData).msg;
        } else if (msgData.getClass().getName().contains("MessageForTroopFile")) {
            chatMsg = msgData;
        } else return null;
        return QQServletHelper.waitForGetDownUrl(chatMsg);
    }

    public void sendPackMsg(String GroupUin, String UserUin, String fakeGroup, String fakeUser, String msg, String ShowTag) {
        try {
            Object session = QQSessionUtils.Build_SessionInfo(GroupUin, UserUin);
            Object packMsg = QQMsgBuilder.Build_Fake_Mix(fakeGroup, fakeUser, msg);
            List l = new ArrayList();
            l.add(packMsg);
            QQMessageUtils.sendFakeMultiMsg(fakeGroup, fakeUser, l, session, ShowTag, "");
        } catch (Exception e) {
            LogUtils.warning("sendPackMsg", "" + e);
        }
    }

    public void sendPackMsg(String GroupUin, String UserUin, String fakeGroup, String fakeUser, String msg, String ShowTag, String fakeName) {
        try {
            Object session = QQSessionUtils.Build_SessionInfo(GroupUin, UserUin);
            Object packMsg = QQMsgBuilder.Build_Fake_Mix(fakeGroup, fakeUser, msg);
            List l = new ArrayList();
            l.add(packMsg);
            QQMessageUtils.sendFakeMultiMsg(fakeGroup, fakeUser, l, session, ShowTag, fakeName);
        } catch (Exception e) {
            LogUtils.warning("sendPackMsg", "" + e);
        }
    }

    public void sendPackMsg(String GroupUin, String UserUin, String fakeGroup, String fakeUser, List messageList, String ShowTag, String fakeName) {
        Object session = QQSessionUtils.Build_SessionInfo(GroupUin, UserUin);
        QQMessageUtils.sendFakeMultiMsg(fakeGroup, fakeUser, messageList, session, ShowTag, fakeName);
    }

    public ClassLoader loadJar(String JarPath) throws Exception {
        if (!JarPath.startsWith("/")) {
            JarPath = info_.LocalPath + "/" + JarPath;
        }
        return LoadJarHelper.loadJar(JarPath);
    }
}

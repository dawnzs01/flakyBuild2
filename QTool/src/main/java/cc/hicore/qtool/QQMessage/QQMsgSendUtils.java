package cc.hicore.qtool.QQMessage;

import android.text.TextUtils;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import cc.hicore.HookItemLoader.core.ApiHelper;
import cc.hicore.LogUtils.LogUtils;
import cc.hicore.ReflectUtils.MClass;
import cc.hicore.ReflectUtils.MField;
import cc.hicore.ReflectUtils.MMethod;
import cc.hicore.qtool.QQManager.QQEnvUtils;
import cc.hicore.qtool.QQManager.QQGroupUtils;
import cc.hicore.qtool.QQManager.QQGuildManager;
import cc.hicore.qtool.QQMessage.MessageBuilderImpl.Build_Common_Reply;

public class QQMsgSendUtils {
    private static final int TYPE_TEXT = 1;
    private static final int TYPE_PIC = 2;
    private static final int TYPE_AT = 3;
    private static final int TYPE_MUTE = 4;
    private static final int TYPE_UNMUTE = 4;
    private static final ExecutorService preSendExecutor = Executors.newSingleThreadExecutor();

    public static void sendText(String GroupUin, String UserUin, String Text, ArrayList atList) {
        QQMsgSender.sendText(QQSessionUtils.Build_SessionInfo(GroupUin, UserUin), Text, atList);
    }

    /*
    解析并发送结构化图文消息
    支持注入[PicUrl=图片地址]
    [AtQQ=QQ号] 0为全体成员
    [Mute=0]为全体禁言
    [UnMute=0]为全体解禁
     */
    public static void decodeAndSendMsg(String GroupUin, String UserUin, String Message) {
        decodeAndSendMsg(GroupUin, UserUin, Message, null);
    }

    public static void decodeAndSendMsg(String GroupUin, String UserUin, String Message, Object extraRecord) {
        try {
            ArrayList<DecodeResult> msgDec = decodeForResult(Message);
            if (msgDec.size() == 0) return;
            preSendExecutor.submit(() -> preSendMsg(QQSessionUtils.Build_SessionInfo(GroupUin, UserUin), msgDec, extraRecord));
        } catch (Exception e) {
            LogUtils.error("MessageTextDecoder", e);
        }

    }

    private static void preSendMsg(Object _Session, ArrayList<DecodeResult> msgList, Object extraRecord) {
        if (msgList.size() == 1 && extraRecord == null) {
            DecodeResult result = msgList.get(0);
            if (result.msgType == TYPE_PIC) {
                Object record = QQMsgBuilder.buildPic(_Session, result.content);
                QQMsgSender.sendPic(_Session, record);
                return;
            } else if (result.msgType == TYPE_TEXT) {
                QQMsgSender.sendText(_Session, result.content, new ArrayList());
                return;
            }
        }
        boolean HasPic = false;
        ArrayList records = new ArrayList();
        ArrayList atInfo = new ArrayList();
        int length = 0;
        StringBuilder summary = new StringBuilder();
        for (DecodeResult result : msgList) {
            if (result.msgType == TYPE_TEXT) {
                length += result.content.length();
                records.add(QQMsgBuilder.buildText(QQSessionUtils.getGroupUin(_Session), result.content));
                summary.append(result.content);
            } else if (result.msgType == TYPE_PIC) {
                records.add(QQMsgBuilder.buildPic(_Session, result.content));
                HasPic = true;
            } else if (result.msgType == TYPE_AT) {
                String atText;
                if (result.content.equals("0")) {
                    atText = "@全体成员 ";
                } else {
                    if (QQSessionUtils.getSessionID() == 10014) {
                        atText = "@" + QQGuildManager.Get_User_Name(QQSessionUtils.getGuildID(_Session), result.content) + " ";
                    } else {
                        atText = "@" + QQGroupUtils.Group_Get_Member_Name(QQSessionUtils.getGroupUin(_Session), result.content) + " ";
                    }
                }
                summary.append(atText);
                atInfo.add(QQMsgBuilder.buildAtInfo(result.content, atText, (short) length, Long.parseLong(QQSessionUtils.getChannelID(_Session))));
                length += atText.length();
                if (QQSessionUtils.getSessionID() == 10014) {
                    records.add(QQMsgBuilder.buildText(QQSessionUtils.getGuildID(_Session), atText));
                } else {
                    records.add(QQMsgBuilder.buildText(QQSessionUtils.getGroupUin(_Session), atText));
                }

            }
        }
        if (extraRecord != null) {
            records.add(0, extraRecord);
            sendMix(_Session, records);
        } else if (HasPic) {
            sendMix(_Session, records);
        } else {
            QQMsgSender.sendText(_Session, summary.toString(), atInfo);
        }
    }

    private static void sendMix(Object Session, ArrayList elems) {
        Object mixed = QQMsgBuilder.buildMix(Session, elems);
        QQMsgSender.sendMix(Session, mixed);
    }

    public static ArrayList<DecodeResult> decodeForResult(String msg) {
        //TODO 解析Mute和UnMute为个人QQ和全体禁言解禁
        int searchPos = 0;
        int searchNext = 0;
        int lastSearchEnd = -1;
        ArrayList<DecodeResult> elems = new ArrayList<>();
        searchPos = msg.indexOf("[");
        while (searchPos != -1) {
            searchNext = msg.indexOf("]", searchPos);
            if (searchNext != -1) {
                //把上一次搜索结尾到这次开始的内容作为文本消息
                DecodeResult NewResult = new DecodeResult();
                NewResult.msgType = TYPE_TEXT;
                NewResult.content = msg.substring(lastSearchEnd + 1, searchPos);
                elems.add(NewResult);

                //start
                {
                    String content = msg.substring(searchPos + 1, searchNext);
                    String[] cut = content.split("=");
                    if (cut.length < 2) {
                        NewResult = new DecodeResult();
                        NewResult.msgType = TYPE_TEXT;
                        NewResult.content = "[" + content + "]";
                        elems.add(NewResult);
                    } else {
                        String Command = cut[0].trim();
                        String Content = cut[1].trim();
                        if (Command.isEmpty() || Content.isEmpty()) {
                            NewResult = new DecodeResult();
                            NewResult.msgType = TYPE_TEXT;
                            NewResult.content = "[" + content + "]";
                            elems.add(NewResult);
                        } else {
                            if (Command.equals("PicUrl")) {
                                NewResult = new DecodeResult();
                                NewResult.msgType = TYPE_PIC;
                                NewResult.content = content.substring(7);
                                elems.add(NewResult);
                            } else if (Command.equals("AtQQ")) {
                                NewResult = new DecodeResult();
                                NewResult.msgType = TYPE_AT;
                                NewResult.content = cut[1];
                                elems.add(NewResult);
                            } else if (Command.equals("Mute")) {
                                NewResult = new DecodeResult();
                                NewResult.msgType = TYPE_MUTE;
                                NewResult.content = cut[1];
                                elems.add(NewResult);
                            } else {
                                NewResult = new DecodeResult();
                                NewResult.msgType = TYPE_TEXT;
                                NewResult.content = "[" + content + "]";
                                elems.add(NewResult);
                            }
                        }
                    }
                }
                lastSearchEnd = searchNext;
                searchPos = msg.indexOf("[", searchNext);
            } else {
                searchNext = searchPos;
                break;
            }
        }
        DecodeResult NewResult = new DecodeResult();
        NewResult.msgType = TYPE_TEXT;
        NewResult.content = msg.substring(searchNext == 0 ? searchNext : searchNext + 1);
        elems.add(NewResult);
        checkElement(elems);

        return elems;
    }

    private static void checkElement(ArrayList<DecodeResult> list) {
        Iterator<DecodeResult> it = list.iterator();
        while (it.hasNext()) {
            DecodeResult item = it.next();
            if (item.msgType == TYPE_TEXT && TextUtils.isEmpty(item.content)) {
                it.remove();
            }
        }

        int lastType = 0;
        it = list.iterator();
        DecodeResult lastResult = null;
        while (it.hasNext()) {
            DecodeResult item = it.next();
            if (item.msgType == TYPE_TEXT && lastType == TYPE_TEXT) {
                lastResult.content += item.content;
                it.remove();
                continue;
            }
            lastType = item.msgType;
            lastResult = item;
        }
    }

    public static void sendCard(String GroupUin, String UserUin, String card) {
        Object session = QQSessionUtils.Build_SessionInfo(GroupUin, UserUin);
        if (card.startsWith("{")) {
            QQMsgSender.sendArkApp(session, QQMsgBuilder.build_arkapp(card));
        } else {
            QQMsgSender.sendStruct(session, QQMsgBuilder.build_struct(card));
        }
    }

    public static void sendEffectShow(String GroupUin, String UserUin, String PicPath, int type) {
        try {
            Object MessagePicRecord = QQMsgBuilder.buildPic(QQSessionUtils.Build_SessionInfo(GroupUin, ""), PicPath);
            Object Resp1 = MClass.NewInstance(MClass.loadClass("localpb.richMsg.RichMsg$PicRec"));

            MMethod.CallMethodNoReturnSingle(Resp1, "mergeFrom", new Class[]{byte[].class}, new Object[]{MField.GetField(MessagePicRecord, "msgData", byte[].class)});

            Object RespType = MClass.NewInstance(MClass.loadClass("tencent.im.msg.hummer.resv3.CustomFaceExtPb$ResvAttr"));
            Object ShowType = MField.GetField(RespType, "msg_image_show", MClass.loadClass("tencent.im.msg.hummer.resv3.CustomFaceExtPb$AnimationImageShow"));
            Object Int32_ShowType = MField.GetField(ShowType, "int32_effect_id", MClass.loadClass("com.tencent.mobileqq.pb.PBInt32Field"));
            MMethod.CallMethod(Int32_ShowType, "set", void.class, new Class[]{int.class}, Integer.valueOf(type + 40000));
            MMethod.CallMethod(ShowType, ShowType.getClass(), "setHasFlag", void.class, new Class[]{boolean.class}, true);

            byte[] PICDatas = MMethod.CallMethodNoParam(RespType, "toByteArray", byte[].class);

            Object oobj = MClass.NewInstance(MClass.loadClass("com.tencent.mobileqq.pb.ByteStringMicro"), new Object[]{PICDatas});
            Object PBField = MField.GetField(Resp1, "bytes_pb_reserved", MClass.loadClass("com.tencent.mobileqq.pb.PBBytesField"));
            MMethod.CallMethod(PBField, "set", void.class, new Class[]{MClass.loadClass("com.tencent.mobileqq.pb.ByteStringMicro")}, oobj);


            PICDatas = MMethod.CallMethodNoParam(Resp1, "toByteArray", byte[].class);

            Object MessageRecord = MClass.NewInstance(MClass.loadClass("com.tencent.mobileqq.data.MessageForTroopEffectPic"));

            MMethod.CallMethod(MessageRecord, MessageRecord.getClass(), "init", void.class,
                    new Class[]{String.class, String.class, String.class, String.class, long.class, int.class, int.class, long.class},
                    QQEnvUtils.getCurrentUin(), GroupUin, QQEnvUtils.getCurrentUin(), "[秀图]", System.currentTimeMillis() / 1000, -5015,
                    1, System.currentTimeMillis() / 1000
            );
            MField.SetField(MessageRecord, "msgData", PICDatas);
            MField.SetField(MessageRecord, "msgUid", (long) (MField.GetField(MessagePicRecord, "msgUid", long.class)) + 1);
            MField.SetField(MessageRecord, "shmsgseq", MField.GetField(MessagePicRecord, "shmsgseq", long.class));
            MField.SetField(MessageRecord, "msgUid", MField.GetField(MessagePicRecord, "msgUid", long.class));
            MMethod.CallMethodNoParam(MessageRecord, "doParse", void.class);
            MField.SetField(MessageRecord, "msgtype", -5015);

            QQMsgSender.sendPic(QQSessionUtils.Build_SessionInfo(GroupUin, ""), MessageRecord);
        } catch (Exception e) {
            LogUtils.error("sendEffectShow", e);
        }
    }

    public static void addTip(Object clipTo, String text) {
        try {
            long shmsgseq = MField.GetField(clipTo, "shmsgseq", long.class);
            long msgUid = MField.GetField(clipTo, "msgUid", long.class);
            long MsgTime = MField.GetField(clipTo, "time", long.class);

            int istroop = MField.GetField(clipTo, "istroop", int.class);
            String friendUin = MField.GetField(clipTo, "frienduin", String.class);
            String senderUin = MField.GetField(clipTo, "senderuin", String.class);

            if (istroop == 1) {
                addTip0(text, MsgTime + 1, shmsgseq, msgUid, friendUin, "");
            } else if (istroop == 0) {
                addTip0(text, MsgTime + 1, shmsgseq, msgUid, "", friendUin);
            } else if (istroop == 1000) {
                addTip0(text, MsgTime + 1, shmsgseq, msgUid, senderUin, friendUin);
            }


        } catch (Exception e) {
            LogUtils.error("addTip", e);
        }
    }

    public static void addTip0(String TipText, long Time, long Seq, long msgUid, String Group, String UserUin) {
        try {

            Object MessageRecord = QQMsgBuilder.build_common_message_record(-2031);
            if (TextUtils.isEmpty(UserUin)) {
                MMethod.CallMethod(MessageRecord, MessageRecord.getClass(), "init", void.class,
                        new Class[]{String.class, String.class, String.class, String.class, long.class, int.class, int.class, long.class},
                        QQEnvUtils.getCurrentUin(), Group, QQEnvUtils.getCurrentUin(), TipText, Time, -2031,
                        1, Time
                );
            } else if (TextUtils.isEmpty(Group)) {
                MMethod.CallMethod(MessageRecord, MessageRecord.getClass(), "init", void.class,
                        new Class[]{String.class, String.class, String.class, String.class, long.class, int.class, int.class, long.class},
                        QQEnvUtils.getCurrentUin(), UserUin, QQEnvUtils.getCurrentUin(), TipText, Time, -2031,
                        0, Time
                );
            } else {
                MMethod.CallMethod(MessageRecord, MessageRecord.getClass(), "init", void.class,
                        new Class[]{String.class, String.class, String.class, String.class, long.class, int.class, int.class, long.class},
                        QQEnvUtils.getCurrentUin(), UserUin, Group, TipText, Time, -2031,
                        1000, Time
                );
            }
            MField.SetField(MessageRecord, "msgUid", msgUid);
            MField.SetField(MessageRecord, "shmsgseq", Seq);
            MField.SetField(MessageRecord, "isread", true);
            MField.SetField(MessageRecord, "senderuin", "10000");
            QQMessageUtils.AddMsg(MessageRecord);
        } catch (Throwable th) {

        }
    }

    public static void sendReply(String GroupUin, Object source, String mixText) {
        ApiHelper.invoke(Build_Common_Reply.class, GroupUin, source, mixText);
    }

    public static class DecodeResult {
        public int msgType;
        public String content;
        public String extra;

        public int atStart;
        public int atEnd;
    }

}

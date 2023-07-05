package cc.hicore.qtool.QQMessage;

import android.content.Context;
import android.os.Environment;
import android.text.TextUtils;

import java.io.File;
import java.lang.reflect.Method;
import java.util.ArrayList;

import cc.hicore.HookItemLoader.core.ApiHelper;
import cc.hicore.LogUtils.LogUtils;
import cc.hicore.ReflectUtils.Classes;
import cc.hicore.ReflectUtils.MClass;
import cc.hicore.ReflectUtils.MField;
import cc.hicore.ReflectUtils.MMethod;
import cc.hicore.Utils.FileUtils;
import cc.hicore.qtool.HookEnv;
import cc.hicore.qtool.QQManager.QQEnvUtils;
import cc.hicore.qtool.QQMessage.MessageImpl.MsgApi_sendMix;
import cc.hicore.qtool.QQMessage.MessageImpl.MsgApi_sendReply;
import cc.hicore.qtool.QQMessage.MessageImpl.MsgApi_sentAntEmo;

public class QQMsgSender {
    public static void sendFileByPath(String Path, String TroopUin) {
        try {
            Object Engine = MClass.NewInstance(MClass.loadClass("com.tencent.mobileqq.filemanager.app.FileManagerEngine"), HookEnv.AppInterface);
            MMethod.CallMethodParams(Engine, null, boolean.class, Path, TroopUin, (long) 0, 0);

        } catch (Exception e) {
            LogUtils.error("sendFileByPath", e);
        }
    }

    public static void sendText(Object _Session, String text, ArrayList atList) {
        try {
            Method CallMethod = MMethod.FindMethod("com.tencent.mobileqq.activity.ChatActivityFacade", null, void.class, new Class[]{
                    MClass.loadClass("com.tencent.mobileqq.app.QQAppInterface"),
                    Context.class,
                    MClass.loadClass("com.tencent.mobileqq.activity.aio.SessionInfo"),
                    String.class,
                    ArrayList.class
            });
            CallMethod.invoke(null, HookEnv.AppInterface, HookEnv.AppContext, _Session, text, atList);
        } catch (Exception e) {
            LogUtils.error("sendText", e);
        }
    }

    public static void sendPic(Object _Session, Object picRecord) {
        try {
            Method hookMethod = MMethod.FindMethod("com.tencent.mobileqq.activity.ChatActivityFacade", null, void.class, new Class[]{
                    MClass.loadClass("com.tencent.mobileqq.app.QQAppInterface"),
                    MClass.loadClass("com.tencent.mobileqq.activity.aio.SessionInfo"),
                    MClass.loadClass("com.tencent.mobileqq.data.MessageForPic"),
                    int.class
            });
            hookMethod.invoke(null,
                    HookEnv.AppInterface, _Session, picRecord, 0
            );
        } catch (Exception e) {
            LogUtils.error("sendPic", e);
        }
    }

    public static void sendStruct(Object _Session, Object structMsg) {
        try {
            Method CallMethod = MMethod.FindMethod("com.tencent.mobileqq.activity.ChatActivityFacade", null,
                    void.class, new Class[]{
                            MClass.loadClass("com.tencent.mobileqq.app.QQAppInterface"),
                            MClass.loadClass("com.tencent.mobileqq.activity.aio.SessionInfo"),
                            MClass.loadClass("com.tencent.mobileqq.structmsg.AbsStructMsg")
                    });
            CallMethod.invoke(null, HookEnv.AppInterface, _Session, structMsg);
        } catch (Throwable th) {
            LogUtils.error("sendStruct", th);
        }
    }

    public static void sendArkApp(Object _Session, Object arkAppMsg) {
        try {
            Method CallMethod = MMethod.FindMethod("com.tencent.mobileqq.activity.ChatActivityFacade", null,
                    boolean.class, new Class[]{
                            MClass.loadClass("com.tencent.mobileqq.app.QQAppInterface"),
                            MClass.loadClass("com.tencent.mobileqq.activity.aio.SessionInfo"),
                            MClass.loadClass("com.tencent.mobileqq.data.ArkAppMessage")
                    });
            CallMethod.invoke(null, HookEnv.AppInterface, _Session, arkAppMsg);
        } catch (Throwable th) {
            LogUtils.error("sendArkApp", th);
        }
    }

    public static void sendVoice(Object _Session, String path) {
        try {
            if (!path.contains("com.tencent.mobileqq/Tencent/MobileQQ/" + QQEnvUtils.getCurrentUin())) {
                String newPath = Environment.getExternalStorageDirectory() + "/Android/data/com.tencent.mobileqq/Tencent/MobileQQ/" + QQEnvUtils.getCurrentUin() + "/ptt/" + new File(path).getName();
                FileUtils.copy(path, newPath);
                path = newPath;
            }
            Method CallMethod =
                    MMethod.FindMethod("com.tencent.mobileqq.activity.ChatActivityFacade", null, long.class, new Class[]{Classes.QQAppinterFace(), Classes.SessionInfo(), String.class});
            CallMethod.invoke(null, HookEnv.AppInterface, _Session, path);
        } catch (Exception e) {
            LogUtils.error("sendVoice", e);
        }
    }

    public static void sendMix(Object _Session, Object mixRecord) {
        ApiHelper.invoke(MsgApi_sendMix.class, _Session, mixRecord);
    }

    public static void sendReply(Object _Session, Object replyRecord) {
        ApiHelper.invoke(MsgApi_sendReply.class, _Session, replyRecord);
    }

    public static void sendTuya(Object _Session, Object strikeMsg) {
        QQMessageUtils.AddAndSendMsg(strikeMsg);
    }

    public static void sendPaiyipai(String GroupUin, String UserUin) {
        try {
            Method m = MMethod.FindMethod("com.tencent.mobileqq.paiyipai.PaiYiPaiHandler", null, void.class, new Class[]{String.class, String.class, int.class});
            Object Handler = MClass.NewInstance(MClass.loadClass("com.tencent.mobileqq.paiyipai.PaiYiPaiHandler"), HookEnv.AppInterface);
            if (TextUtils.isEmpty(GroupUin)) {
                m.invoke(Handler, UserUin, UserUin, 0);
            } else {
                m.invoke(Handler, UserUin, GroupUin, 1);
            }
        } catch (Throwable th) {
            LogUtils.error("sendPaiyipai", th);
        }
    }

    public static void sendVideo(Object _Session, Object videoRecord) {
        try {
            MMethod.CallMethod(null, MClass.loadClass("com.tencent.mobileqq.activity.ChatActivityFacade"), null, void.class, new Class[]{
                    MClass.loadClass("com.tencent.mobileqq.app.QQAppInterface"),
                    MClass.loadClass("com.tencent.mobileqq.activity.aio.SessionInfo"),
                    MClass.loadClass("com.tencent.mobileqq.data.MessageForShortVideo")
            }, HookEnv.AppInterface, _Session, videoRecord);
        } catch (Exception e) {
            LogUtils.error("sendVideo", e);
        }
    }

    public static void repeatFile(Object _Session, Object fileRecord) {
        try {
            Object Instance = MMethod.CallStaticMethodNoParam(MClass.loadClass("com.tencent.mobileqq.multimsg.MultiMsgManager"), null, MClass.loadClass("com.tencent.mobileqq.multimsg.MultiMsgManager"));
            MMethod.CallMethodParams(Instance, null, void.class, fileRecord, HookEnv.AppInterface, 0, _Session);
        } catch (Exception e) {
            LogUtils.error("sendFile", e);
        }
    }

    public static void sendShakeWindow(String GroupUin) {
        try {
            Method CallMethod = MMethod.FindMethod("com.tencent.mobileqq.service.message.MessageRecordFactory", "a", MClass.loadClass("com.tencent.mobileqq.data.MessageRecord"), new Class[]{
                    int.class
            });
            Object MessageRecord = CallMethod.invoke(null, -2020);
            MField.SetField(MessageRecord, "msg", "窗口抖动");
            Object mShakeParam = MClass.NewInstance(MClass.loadClass("com.tencent.mobileqq.data.ShakeWindowMsg"));
            MField.SetField(mShakeParam, "mReserve", 0);
            MField.SetField(mShakeParam, "mType", 0);
            MField.SetField(MessageRecord, "mShakeWindowMsg", mShakeParam);
            MMethod.CallMethod(MessageRecord, MessageRecord.getClass(), "initInner", void.class,
                    new Class[]{String.class, String.class, String.class, String.class, long.class, int.class, int.class, long.class},
                    QQEnvUtils.getCurrentUin(), GroupUin, QQEnvUtils.getCurrentUin(), "[窗口抖动]", System.currentTimeMillis() / 1000, -2020,
                    1, System.currentTimeMillis() / 1000
            );
            MMethod.CallMethodNoParam(MessageRecord, "prewrite", void.class);
            QQMessageUtils.AddAndSendMsg(MessageRecord);
        } catch (Exception e) {
            LogUtils.error("sendShakeWindow", e);
        }
    }

    public static void sendAntEmo(Object _Session, int ID) {
        ApiHelper.invoke(MsgApi_sentAntEmo.class, _Session, ID);
    }

    public static void QQ_Forward_ShortVideo(Object _SessionInfo, Object ChatMessage) {
        try {
            MMethod.CallMethod(null, MClass.loadClass("com.tencent.mobileqq.activity.ChatActivityFacade"), null, void.class, new Class[]{
                    MClass.loadClass("com.tencent.mobileqq.app.QQAppInterface"),
                    MClass.loadClass("com.tencent.mobileqq.activity.aio.SessionInfo"),
                    MClass.loadClass("com.tencent.mobileqq.data.MessageForShortVideo")
            }, HookEnv.AppInterface, _SessionInfo, ChatMessage);
        } catch (Exception e) {
            LogUtils.error("QQ_Forward_ShortVideo", e);
        }
    }
}

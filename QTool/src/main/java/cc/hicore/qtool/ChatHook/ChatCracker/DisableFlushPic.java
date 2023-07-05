package cc.hicore.qtool.ChatHook.ChatCracker;

import android.text.TextUtils;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.List;

import cc.hicore.HookItemLoader.Annotations.MethodScanner;
import cc.hicore.HookItemLoader.Annotations.UIItem;
import cc.hicore.HookItemLoader.Annotations.VerController;
import cc.hicore.HookItemLoader.Annotations.XPExecutor;
import cc.hicore.HookItemLoader.Annotations.XPItem;
import cc.hicore.HookItemLoader.bridge.BaseXPExecutor;
import cc.hicore.HookItemLoader.bridge.MethodContainer;
import cc.hicore.HookItemLoader.bridge.MethodFinderBuilder;
import cc.hicore.HookItemLoader.bridge.QQVersion;
import cc.hicore.HookItemLoader.bridge.UIInfo;
import cc.hicore.ReflectUtils.Classes;
import cc.hicore.ReflectUtils.Finders;
import cc.hicore.ReflectUtils.MClass;
import cc.hicore.ReflectUtils.MField;
import cc.hicore.ReflectUtils.MMethod;
import cc.hicore.qtool.QQManager.QQEnvUtils;

@XPItem(itemType = XPItem.ITEM_Hook, name = "闪照破解")
public class DisableFlushPic {

    @UIItem
    @VerController
    public UIInfo getUIInfo() {
        UIInfo info = new UIInfo();
        info.name = "闪照破解";
        info.type = 1;
        info.targetID = 1;
        info.groupName = "聊天界面增强";
        return info;
    }

    @MethodScanner
    @VerController(max_targetVer = QQVersion.QQ_8_9_0)
    public void getAllMethod(MethodContainer container) {
        container.addMethod("replaceRecord", MMethod.FindMethod("com.tencent.mobileqq.app.FlashPicHelper", null, boolean.class, new Class[]{
                MClass.loadClass("com.tencent.mobileqq.data.MessageRecord")}));

        container.addMethod("replaceRecord2", MMethod.FindMethod("com.tencent.mobileqq.activity.aio.item.typesupplier.PicTypeSupplier", "get", int.class, new Class[]{
                MClass.loadClass("com.tencent.mobileqq.app.QQAppInterface"),
                MClass.loadClass("com.tencent.mobileqq.data.ChatMessage")
        }));

        Finders.AIOMessageListAdapter_getView(container);
    }

    @MethodScanner
    @VerController(targetVer = QQVersion.QQ_8_9_0)
    public void getAllMethod_890(MethodContainer container) {
        container.addMethod(MethodFinderBuilder.newFinderByString("replaceRecord", "FlashPicHelper", m ->
                MMethod.FindMethod(m.getDeclaringClass(), null, boolean.class, new Class[]{
                        MClass.loadClass("com.tencent.mobileqq.data.MessageRecord")})));

        container.addMethod(MethodFinderBuilder.newFinderWhichMethodInvoking("replaceRecord2", MMethod.FindMethod("com.tencent.mobileqq.pic.api.IPicFlash", "isFlashPicMsg", boolean.class, new Class[]{Classes.MessageRecord()}),
                m -> m.getDeclaringClass().getName().startsWith("com.tencent.mobileqq.activity.aio.item") && !m.getDeclaringClass().getName().contains("ItemBuilder")));

        Finders.AIOMessageListAdapter_getView_890(container);
    }

    @XPExecutor(methodID = "replaceRecord", period = XPExecutor.After)
    @VerController
    public BaseXPExecutor onReplaceRecord1() {
        return param -> {
            boolean result = (boolean) param.getResult();
            if (result) {
                Object MessageRecord = param.args[0];
                MMethod.CallMethod(MessageRecord, "saveExtInfoToExtStr", void.class, new Class[]{
                        String.class, String.class
                }, "flash_pic_flag", "1");
                String UserUin = MField.GetField(MessageRecord, "senderuin", String.class);
                if (!UserUin.equals(QQEnvUtils.getCurrentUin())) param.setResult(false);
            }
        };
    }

    @XPExecutor(methodID = "replaceRecord2", period = XPExecutor.After)
    @VerController
    public BaseXPExecutor onReplaceRecord2() {
        return param -> {
            int re = (int) param.getResult();
            if (re == 66) {
                Object MessageRecord = param.args[1];
                MMethod.CallMethod(MessageRecord, "saveExtInfoToExtStr", void.class, new Class[]{
                        String.class, String.class
                }, "flash_pic_flag", "1");
                param.setResult(1);
            }
        };
    }

    @XPExecutor(methodID = "onAIOGetView", period = XPExecutor.After)
    @VerController
    public BaseXPExecutor onReplaceRecord3() {
        return param -> {
            Object mGetView = param.getResult();
            RelativeLayout mLayout;
            if (mGetView instanceof RelativeLayout) mLayout = (RelativeLayout) mGetView;
            else return;
            List MessageRecoreList = MField.GetFirstField(param.thisObject, List.class);
            if (MessageRecoreList == null) return;
            Object ChatMsg = MessageRecoreList.get((int) param.args[0]);
            String Extstr = MField.GetField(ChatMsg, "extStr", String.class);
            if (!TextUtils.isEmpty(Extstr) && Extstr.contains("flash_pic_flag")) {
                MMethod.CallMethod(mLayout, "setTailMessage", void.class, new Class[]{boolean.class, CharSequence.class, MClass.loadClass("android.view.View$OnClickListener")}, true, "闪照", null);
            } else {
                TextView tailView = mLayout.findViewById(QQEnvUtils.getTargetID("chat_item_tail_message"));
                if (tailView != null) {
                    String text = tailView.getText().toString();
                    if (text.equals("闪照")) {
                        MMethod.CallMethod(mLayout, "setTailMessage", void.class, new Class[]{boolean.class, CharSequence.class, MClass.loadClass("android.view.View$OnClickListener")}, false, "", null);
                    }
                }
            }
        };
    }
}

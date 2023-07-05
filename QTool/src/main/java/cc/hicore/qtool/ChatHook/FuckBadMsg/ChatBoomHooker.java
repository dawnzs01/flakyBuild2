package cc.hicore.qtool.ChatHook.FuckBadMsg;

import android.app.AlertDialog;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;

import org.json.JSONObject;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import cc.hicore.HookItemLoader.Annotations.MethodScanner;
import cc.hicore.HookItemLoader.Annotations.UIClick;
import cc.hicore.HookItemLoader.Annotations.UIItem;
import cc.hicore.HookItemLoader.Annotations.VerController;
import cc.hicore.HookItemLoader.Annotations.XPExecutor;
import cc.hicore.HookItemLoader.Annotations.XPItem;
import cc.hicore.HookItemLoader.bridge.BaseXPExecutor;
import cc.hicore.HookItemLoader.bridge.MethodContainer;
import cc.hicore.HookItemLoader.bridge.MethodFinderBuilder;
import cc.hicore.HookItemLoader.bridge.QQVersion;
import cc.hicore.HookItemLoader.bridge.UIInfo;
import cc.hicore.ReflectUtils.Finders;
import cc.hicore.ReflectUtils.MClass;
import cc.hicore.ReflectUtils.MField;
import cc.hicore.ReflectUtils.MMethod;
import cc.hicore.ReflectUtils.ResUtils;
import cc.hicore.Utils.StringUtils;
import cc.hicore.Utils.Utils;
import cc.hicore.qtool.HookEnv;
import cc.hicore.qtool.QQManager.QQGroupUtils;
import cc.hicore.qtool.R;

@XPItem(name = "异常消息屏蔽", itemType = XPItem.ITEM_Hook)
public class ChatBoomHooker {
    private static final HashMap<String, String> forbidden_msg = new HashMap<>();

    private static boolean checkLongElement(String code) {
        int index1 = code.indexOf(">");
        while (index1 != 0) {
            int index2 = code.indexOf("<", index1);
            if (index2 == -1) return false;
            if (index2 - index1 > 312) return true;
            index1 = code.indexOf(">", index2);
        }
        return false;
    }

    private static void addMsgToBanList(Object chatMsg, String banTip) {
        try {
            long shmsg = MField.GetField(chatMsg, "shmsgseq", long.class);
            long msgTime = MField.GetField(chatMsg, "time", long.class);
            long msgUid = MField.GetField(chatMsg, "msgUid", long.class);
            String tag = shmsg + ":" + msgTime + ":" + msgUid;

            forbidden_msg.put(tag, banTip);
        } catch (Exception e) {

        }


    }

    private static View buildMsgPanel(Object chatMsg, String banTip) {
        Context context = Utils.getTopActivity();
        ResUtils.StartInject(context);
        LinearLayout mRoot = (LinearLayout) LayoutInflater.from(context).inflate(R.layout.chat_msg_panel, null);
        try {
            String senderUin = MField.GetField(chatMsg, "senderuin", String.class);
            String groupUin = MField.GetField(chatMsg, "frienduin", String.class);
            TextView panel_sender = mRoot.findViewById(R.id.msg_panel_sender);
            panel_sender.setText("发送者:" + QQGroupUtils.Group_Get_Member_Name(groupUin, senderUin) + "(" + senderUin + ")");

            TextView panel_type = mRoot.findViewById(R.id.msg_panel_type);
            panel_type.setText("消息类型:" + chatMsg.getClass().getSimpleName());

            TextView panel_ban_type = mRoot.findViewById(R.id.msg_panel_ban_type);
            panel_ban_type.setText("屏蔽类型:" + banTip);

            TextView button_click_show = mRoot.findViewById(R.id.msg_panel_click_show);
            button_click_show.setOnClickListener(v -> {
                EditText ed = new EditText(context);
                try {
                    if (chatMsg.getClass().getSimpleName().equals("MessageForStructing")) {
                        Object Structing = MField.GetField(chatMsg, "structingMsg", MClass.loadClass("com.tencent.mobileqq.structmsg.AbsStructMsg"));
                        String xml = MMethod.CallMethod(Structing, MClass.loadClass("com.tencent.mobileqq.structmsg.AbsStructMsg"), "getXml", String.class, new Class[0], new Object[0]);
                        ed.setText(xml);
                    } else {
                        ed.setText(MField.GetField(chatMsg, "msg", String.class));
                    }
                } catch (Exception e) {
                    ed.setText("发生错误:" + e);
                }
                ScrollView sc = new ScrollView(context);
                sc.addView(ed);

                new AlertDialog.Builder(context, 3)
                        .setTitle("消息内容")
                        .setView(sc)
                        .show();
            });


        } catch (Exception e) {

        }
        return mRoot;
    }

    @VerController
    @UIItem
    public UIInfo getUI() {
        UIInfo ui = new UIInfo();
        ui.groupName = "消息屏蔽";
        ui.type = 1;
        ui.targetID = 2;
        ui.name = "异常消息屏蔽";
        ui.desc = "点击进入设置";
        return ui;
    }

    @VerController
    @UIClick
    public void UIClick(Context context) {
        LinearLayout mRoot = new LinearLayout(context);
        mRoot.setOrientation(LinearLayout.VERTICAL);

        TextView allTip = new TextView(context);
        allTip.setText("该功能仅作为屏蔽消息作用,有一定误判几率,不应该作为判断用户违规的依据");
        mRoot.addView(allTip);

        CheckBox open_default = new CheckBox(context);
        open_default.setText("开启自带炸群屏蔽规则");
        open_default.setChecked(HookEnv.Config.getBoolean("Set", "Chat_Boom_Default", false));
        mRoot.addView(open_default);

        CheckBox open_text_length = new CheckBox(context);
        open_text_length.setText("开启按照消息长度拦截");
        open_text_length.setChecked(HookEnv.Config.getBoolean("Set", "Chat_Boom_Length", false));
        mRoot.addView(open_text_length);

        EditText ed_length = new EditText(context);
        ed_length.setText("" + HookEnv.Config.getInt("Set", "Chat_Boom_Length_Set", 8192));
        mRoot.addView(ed_length);

        CheckBox open_fake_length = new CheckBox(context);
        open_fake_length.setText("开启高压缩消息屏蔽");
        open_fake_length.setChecked(HookEnv.Config.getBoolean("Set", "Chat_Boom_Compress", false));
        mRoot.addView(open_fake_length);

        CheckBox open_too_long_open = new CheckBox(context);
        open_too_long_open.setText("开启过长消息拦截(px)");
        open_too_long_open.setChecked(HookEnv.Config.getBoolean("Set", "Chat_Too_Long", false));
        mRoot.addView(open_too_long_open);

        EditText ed_long_length = new EditText(context);
        ed_long_length.setText("" + HookEnv.Config.getInt("Set", "Chat_Too_Long_Length", 10240));
        mRoot.addView(ed_long_length);

        new AlertDialog.Builder(context)
                .setTitle("设置屏蔽规则")
                .setView(mRoot)
                .setNegativeButton("保存", (dialog, which) -> {
                    HookEnv.Config.setBoolean("Set", "Chat_Boom_Default", open_default.isChecked());
                    HookEnv.Config.setBoolean("Set", "Chat_Boom_Length", open_text_length.isChecked());
                    HookEnv.Config.setInt("Set", "Chat_Boom_Length_Set", Integer.parseInt(ed_length.getText().toString()));
                    HookEnv.Config.setBoolean("Set", "Chat_Boom_Compress", open_fake_length.isChecked());
                    HookEnv.Config.setBoolean("Set", "Chat_Too_Long", open_too_long_open.isChecked());
                    HookEnv.Config.setInt("Set", "Chat_Too_Long_Length", Integer.parseInt(ed_long_length.getText().toString()));
                }).show();
    }

    @VerController(max_targetVer = QQVersion.QQ_8_9_0)
    @MethodScanner
    public void getHookItem(MethodContainer container) {
        Finders.AIOMessageListAdapter_getView(container);
        container.addMethod("bugFix", MMethod.FindMethod(MClass.loadClass("com.tencent.mobileqq.structmsg.view.StructMsgItemLayout30"), null, View.class, new Class[]{
                Context.class, View.class, Bundle.class
        }));
    }

    @VerController(targetVer = QQVersion.QQ_8_9_0)
    @MethodScanner
    public void getHookItem_890(MethodContainer container) {
        Finders.AIOMessageListAdapter_getView_890(container);
        container.addMethod(MethodFinderBuilder.newFinderByString("bugFix", "Layout30", m -> MMethod.FindMethod(m.getDeclaringClass(), null, View.class, new Class[]{
                Context.class, View.class, Bundle.class
        })));
    }

    @VerController
    @XPExecutor(methodID = "onAIOGetView")
    public BaseXPExecutor worker() {
        return param -> {
            List list = MField.GetFirstField(param.thisObject, List.class);
            if (list == null) return;
            Object chatMsg = list.get((int) param.args[0]);

            long shmsg = MField.GetField(chatMsg, "shmsgseq", long.class);
            long msgTime = MField.GetField(chatMsg, "time", long.class);
            long msgUid = MField.GetField(chatMsg, "msgUid", long.class);
            String tag = shmsg + ":" + msgTime + ":" + msgUid;
            if (forbidden_msg.containsKey(tag)) {
                param.setResult(buildMsgPanel(chatMsg, forbidden_msg.get(tag)));
            }
            String clzName = chatMsg.getClass().getSimpleName();
            //检测第一类卡屏消息
            if (HookEnv.Config.getBoolean("Set", "Chat_Boom_Default", false)) {
                if (clzName.equals("MessageForStructing")) {
                    Object Structing = MField.GetField(chatMsg, "structingMsg", MClass.loadClass("com.tencent.mobileqq.structmsg.AbsStructMsg"));
                    String xml = MMethod.CallMethod(Structing, MClass.loadClass("com.tencent.mobileqq.structmsg.AbsStructMsg"), "getXml", String.class, new Class[0], new Object[0]);
                    if (StringUtils.Count(xml, "button") > 50) {
                        param.setResult(buildMsgPanel(chatMsg, "默认卡屏屏蔽->异常卡片代码"));
                    }
                    if (checkLongElement(xml)) {
                        param.setResult(buildMsgPanel(chatMsg, "默认卡屏屏蔽->异常卡片代码2"));
                    }
                } else if (clzName.equals("MessageForLongTextMsg")) {
                    JSONObject json = MField.GetField(chatMsg, "mExJsonObject", JSONObject.class);
                    if (json != null) {
                        if (json.optString("long_text_recv_state").equals("3")) {
                            param.setResult(buildMsgPanel(chatMsg, "默认卡屏屏蔽->未加载消息,加载后可显示"));
                        }
                    }
                }
            }

            if (HookEnv.Config.getBoolean("Set", "Chat_Boom_Length", false)) {
                if (clzName.equals("MessageForText") || clzName.equals("MessageForLongTextMsg")) {
                    String msg = MField.GetField(chatMsg, "msg", String.class);
                    int msgLength = HookEnv.Config.getInt("Set", "Chat_Boom_Length_Set", 8192);
                    if (msg.length() > msgLength) {
                        param.setResult(buildMsgPanel(chatMsg, "长度屏蔽,长度过长->" + msg.length()));
                    }
                } else if (clzName.equals("MessageForStructing")) {
                    Object Structing = MField.GetField(chatMsg, "structingMsg", MClass.loadClass("com.tencent.mobileqq.structmsg.AbsStructMsg"));
                    String xml = MMethod.CallMethod(Structing, MClass.loadClass("com.tencent.mobileqq.structmsg.AbsStructMsg"), "getXml", String.class, new Class[0], new Object[0]);
                    int msgLength = HookEnv.Config.getInt("Set", "Chat_Boom_Length_Set", 8192);
                    if (xml.length() > msgLength) {
                        param.setResult(buildMsgPanel(chatMsg, "长度屏蔽,长度过长->" + xml.length()));
                    }
                }
            }
        };
    }

    @VerController
    @XPExecutor(methodID = "onAIOGetView", period = XPExecutor.After)
    public BaseXPExecutor worker_after() {
        return param -> {
            Object mGetView = param.getResult();
            RelativeLayout mLayout;
            if (mGetView instanceof RelativeLayout) mLayout = (RelativeLayout) mGetView;
            else return;
            List MessageRecoreList = MField.GetFirstField(param.thisObject, List.class);
            if (MessageRecoreList == null) return;
            Object chatMsg = MessageRecoreList.get((int) param.args[0]);

            if (HookEnv.Config.getBoolean("Set", "Chat_Too_Long", false)) {
                int length = HookEnv.Config.getInt("Set", "Chat_Too_Long_Length", 10240);
                if (mLayout.getHeight() > length) {
                    addMsgToBanList(chatMsg, "消息长度大于设定长度");
                }
            }
            String clzName = chatMsg.getClass().getSimpleName();
            if (HookEnv.Config.getBoolean("Set", "Chat_Boom_Compress", false)) {
                if (clzName.equals("MessageForText") || clzName.equals("MessageForLongTextMsg")) {
                    String msg = MField.GetField(chatMsg, "msg", String.class);
                    int Height = mLayout.getHeight();
                    int Width = mLayout.getWidth();
                    if (Height == 0 || Width == 0) return;
                    int Length = msg.length();
                    if (Length > (Height / 300 + 1) * Width) {
                        addMsgToBanList(chatMsg, "消息压缩度过大");
                    }
                }

            }
        };
    }

    @VerController
    @XPExecutor(methodID = "bugFix")
    public BaseXPExecutor multi_msg_bug_fix() {
        return param -> {
            ArrayList list = MField.GetFirstField(param.thisObject, ArrayList.class);
            if (list.size() == 0)
                list.add(MClass.NewInstance(MClass.loadClass("com.tencent.mobileqq.structmsg.view.StructMsgItemContent")));
        };
    }
}

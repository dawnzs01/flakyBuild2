package cc.hicore.qtool.QQCleaner.ChatCleaner;

import android.app.AlertDialog;
import android.content.Context;

import java.lang.reflect.Method;
import java.util.ArrayList;
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
import cc.hicore.ReflectUtils.MClass;
import cc.hicore.ReflectUtils.MField;
import cc.hicore.ReflectUtils.MMethod;
import cc.hicore.qtool.HookEnv;

@XPItem(name = "消息长按菜单净化", itemType = XPItem.ITEM_Hook)
public class ChatLongClickCleaner {
    private static final ArrayList<String> defCheckItem = new ArrayList<>();

    static {
        defCheckItem.add("复制");
        defCheckItem.add("转发");
        defCheckItem.add("收藏");
        defCheckItem.add("回复");
        defCheckItem.add("多选");
        defCheckItem.add("撤回");
        defCheckItem.add("删除");
        defCheckItem.add("群待办");
        defCheckItem.add("一起写");
        defCheckItem.add("设为精华");
        defCheckItem.add("待办");
        defCheckItem.add("截图");
        defCheckItem.add("相关表情");
        defCheckItem.add("存表情");
        defCheckItem.add("静音播放");
        defCheckItem.add("免提播放");
        defCheckItem.add("2X");
        defCheckItem.add("复制链接");
        defCheckItem.add("存微云");
        defCheckItem.add("发给电脑");
    }

    @VerController
    @UIItem
    public UIInfo getUI() {
        UIInfo ui = new UIInfo();
        ui.name = "消息长按菜单净化";
        ui.targetID = 2;
        ui.type = 1;
        ui.groupName = "聊天界面净化";
        ui.desc = "点击设置净化的项目";
        return ui;
    }

    @VerController(max_targetVer = QQVersion.QQ_8_9_0)
    @MethodScanner
    public void getHookMethod(MethodContainer container) {
        container.addMethod("hook", MMethod.FindMethod(MClass.loadClass("com.tencent.mobileqq.utils.dialogutils.QQCustomMenu"), null, void.class, new Class[]{
                MClass.loadClass("com.tencent.mobileqq.utils.dialogutils.QQCustomMenuItem")
        }));
    }

    @VerController(targetVer = QQVersion.QQ_8_9_0)
    @MethodScanner
    public void getHookMethod_890(MethodContainer container) {
        container.addMethod(MethodFinderBuilder.newFinderByString("hook_before", "chatAdapter onLongClick message msgUid = ", m -> m.getDeclaringClass().getName().startsWith("com.tencent.mobileqq.activity")));
        container.addMethod(MethodFinderBuilder.newFinderByMethodInvokingLinked("hook", "hook_before", m -> {
            if (m instanceof Method) {
                Method cm = (Method) m;
                return cm.getReturnType().equals(void.class) && cm.getParameterCount() == 1 && m.getDeclaringClass().getName().startsWith("com.tencent.mobileqq.utils.dialogutils");
            }
            return false;
        }));
    }

    @VerController
    @XPExecutor(methodID = "hook")
    public BaseXPExecutor hook() {
        return param -> {
            List<String> savedList = HookEnv.Config.getList("Set", "ChatLongClickItemCleaner", true);
            if (savedList.isEmpty()) return;
            String Name = MField.GetField(param.args[0], "a", String.class);
            if (savedList.contains(Name)) param.setResult(null);
        };
    }

    @VerController
    @UIClick
    public void uiClick(Context context) {
        boolean[] b = new boolean[defCheckItem.size()];
        List<String> savedList = HookEnv.Config.getList("Set", "ChatLongClickItemCleaner", true);
        for (int i = 0; i < defCheckItem.size(); i++) {
            String name = defCheckItem.get(i);
            if (savedList.contains(name)) b[i] = true;
        }
        new AlertDialog.Builder(context)
                .setMultiChoiceItems(defCheckItem.toArray(new String[0]), b, (dialog, which, isChecked) -> {

                }).setTitle("请选择需要隐藏的项目")
                .setNegativeButton("保存", (dialog, which) -> {
                    ArrayList<String> saveList = new ArrayList<>();
                    for (int i = 0; i < b.length; i++) {
                        if (b[i]) {
                            saveList.add(defCheckItem.get(i));
                        }
                    }
                    HookEnv.Config.setList("Set", "ChatLongClickItemCleaner", saveList);
                }).show();
    }
}

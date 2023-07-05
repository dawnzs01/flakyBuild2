package cc.hicore.qtool.XPWork.LittleHook;

import android.app.AlertDialog;
import android.content.Context;
import android.os.Environment;
import android.text.TextUtils;
import android.widget.EditText;
import android.widget.LinearLayout;

import java.io.File;

import cc.hicore.HookItemLoader.Annotations.MethodScanner;
import cc.hicore.HookItemLoader.Annotations.UIClick;
import cc.hicore.HookItemLoader.Annotations.UIItem;
import cc.hicore.HookItemLoader.Annotations.VerController;
import cc.hicore.HookItemLoader.Annotations.XPExecutor;
import cc.hicore.HookItemLoader.Annotations.XPItem;
import cc.hicore.HookItemLoader.bridge.BaseXPExecutor;
import cc.hicore.HookItemLoader.bridge.MethodContainer;
import cc.hicore.HookItemLoader.bridge.QQVersion;
import cc.hicore.HookItemLoader.bridge.UIInfo;
import cc.hicore.ReflectUtils.MClass;
import cc.hicore.ReflectUtils.MMethod;
import cc.hicore.Utils.Utils;
import cc.hicore.qtool.HookEnv;

@XPItem(name = "下载重定向", itemType = XPItem.ITEM_Hook, proc = XPItem.PROC_ALL)
public class DownloadRedict {
    private static String oldPath;
    private static boolean checkMkDir(String Path) {
        File f = new File(Path);
        f.mkdirs();
        return f.exists() && f.isDirectory();
    }

    @VerController
    @UIItem
    public UIInfo getUI() {
        UIInfo ui = new UIInfo();
        ui.name = "下载重定向";
        ui.desc = "点击设置重定向路径";
        ui.groupName = "功能辅助";
        ui.targetID = 1;
        ui.type = 1;
        return ui;
    }

    @VerController
    @MethodScanner
    public void getHookMethod(MethodContainer container) {
        container.addMethod("hook", MMethod.FindMethod(MClass.loadClass("com.tencent.mobileqq.vfs.VFSAssistantUtils"), "getSDKPrivatePath", String.class, new Class[]{
                String.class
        }));
    }

    @VerController(targetVer = QQVersion.QQ_8_9_0)
    @MethodScanner
    public void replaceGuildTmpDataPath(MethodContainer container){
        container.addMethod("hookGuild",MMethod.FindMethod(MClass.loadClass("com.tencent.guild.api.msg.impl.GuildMsgApiImpl"),"getNTKernelExtDataPath",String.class,new Class[0]));
    }

    @VerController(targetVer = QQVersion.QQ_8_9_0)
    @XPExecutor(methodID = "hookGuild", period = XPExecutor.After)
    public BaseXPExecutor work_guild(){
        return param -> {
            String result = (String) param.getResult();
            param.setResult(oldPath);

        };
    }

    @VerController
    @XPExecutor(methodID = "hook", period = XPExecutor.After)
    public BaseXPExecutor worker() {
        return param -> {
            String Path = (String) param.args[0];
            String Result = (String) param.getResult();
            if (Result.contains("/Tencent/QQfile_recv/")) {
                if (new File(Result).exists() && new File(Result).isFile())
                    return;//如果下载的文件已经存在则不替换,防止与QQ文件数据库出错而导致无法下载的问题
                String End = Path.substring(Path.lastIndexOf("/Tencent/QQfile_recv/") + "/Tencent/QQfile_recv/".length());

                oldPath = Result.substring(0,Result.lastIndexOf("/Tencent/QQfile_recv/") + "/Tencent/QQfile_recv/".length());

                String Start = HookEnv.Config.getString("Set", "DownloadRedictPath", "");

                if (TextUtils.isEmpty(Start))
                    Start = Environment.getExternalStorageDirectory() + "/Download/MobileQQ/";
                if (!Start.endsWith("/")) Start = Start + "/";
                param.setResult(Start + End);
                return;
            }
        };
    }

    @VerController
    @UIClick
    public void uiClick(Context context) {
        LinearLayout mRoot = new LinearLayout(context);
        mRoot.setOrientation(LinearLayout.VERTICAL);

        EditText ed = new EditText(context);
        ed.setText(HookEnv.Config.getString("Set", "DownloadRedictPath", HookEnv.AppContext.getExternalCacheDir().getParent() + "/Tencent/QQfile_recv/"));
        mRoot.addView(ed);

        new AlertDialog.Builder(context)
                .setTitle("下载重定向设置")
                .setView(mRoot)
                .setNegativeButton("保存", (dialog, which) -> {
                    String path = ed.getText().toString();
                    if (!checkMkDir(path)) {
                        new AlertDialog.Builder(context)
                                .setTitle("警告")
                                .setMessage("设置的路径没有访问权限,请输入有访问权限的路径")
                                .setNegativeButton("确定", (dialog1, which1) -> {

                                }).show();
                        return;
                    }
                    HookEnv.Config.setBoolean("Set", "DownloadRedictOpen", true);
                    if (!path.endsWith("/")) path = path + "/";
                    HookEnv.Config.setString("Set", "DownloadRedictPath", path);
                    Utils.ShowToast("重启QQ生效");

                }).show();
    }
}

package cc.hicore.qtool.XposedInit;

import android.annotation.SuppressLint;
import android.app.Dialog;
import android.content.Context;
import android.graphics.Color;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;

import cc.hicore.ConfigUtils.GlobalConfig;
import cc.hicore.ReflectUtils.ResUtils;
import cc.hicore.Utils.DebugUtils;
import cc.hicore.qtool.QQManager.QQEnvUtils;

@SuppressLint("ResourceType")
public class DebugDialog {
    public static void startShow(Context context) {
        Dialog fullScreen = new Dialog(context, 3);
        ScrollView view = new ScrollView(context);
        view.setFillViewport(true);
        LinearLayout mRoot = new LinearLayout(context);
        view.addView(mRoot);
        mRoot.setOrientation(LinearLayout.VERTICAL);
        mRoot.setBackgroundColor(Color.WHITE);

        TextView titleBar = new TextView(context);
        titleBar.setTextColor(Color.parseColor("#6666ff"));
        titleBar.setText("状态信息");
        titleBar.setTextSize(24);
        mRoot.addView(titleBar, getMarginParam());

        TextView statusResInject = new TextView(context);
        statusResInject.setText("资源注入状态:" + (ResUtils.CheckResInject(context) ? "注入成功" : "注入失败"));
        statusResInject.setTextSize(16);
        mRoot.addView(statusResInject, getMarginParam());

        TextView statusStoragePath = new TextView(context);
        statusStoragePath.setText("当前设置的存储路径:" + GlobalConfig.Get_String("StorePath"));
        statusStoragePath.setTextSize(16);
        mRoot.addView(statusStoragePath, getMarginParam());

        LinearLayout ll = new LinearLayout(context);
        mRoot.addView(ll);
        Button btnChangeDir = new Button(context);
        btnChangeDir.setText("更改存储目录");
        btnChangeDir.setOnClickListener(vx -> ExtraPathInit.ShowPathSetDialog(true));
        ll.addView(btnChangeDir);

        CheckBox check = new CheckBox(context);
        check.setChecked(GlobalConfig.Get_Boolean("Add_Menu_Button_to_Main", false));
        check.setTextColor(Color.BLACK);
        check.setText("在主界面加号添加入口");
        check.setOnCheckedChangeListener((v, isCheck) -> GlobalConfig.Put_Boolean("Add_Menu_Button_to_Main", isCheck));
        mRoot.addView(check);

        check = new CheckBox(context);
        check.setChecked(GlobalConfig.Get_Boolean("Prevent_Crash_In_Java", false));
        check.setTextColor(Color.BLACK);
        check.setText("阻止Java层的闪退(不一定总是有效)");
        check.setOnCheckedChangeListener((v, isCheck) -> GlobalConfig.Put_Boolean("Prevent_Crash_In_Java", isCheck));
        mRoot.addView(check);

        /*
        check = new CheckBox(context);
        check.setChecked(BeforeConfig.getBoolean("Enable_SubMode"));
        check.setTextColor(Color.BLACK);
        check.setText("启用内更新模式");
        check.setOnCheckedChangeListener((v,isCheck)->{
            BeforeConfig.putBoolean("Enable_SubMode",isCheck);
            if (v.isPressed() && isCheck){
                BeforeConfig.putInt("Enable_VerCode", BuildConfig.VERSION_CODE);
            }else {
                BeforeConfig.putInt("Enable_VerCode", 0);
            }

        });
        mRoot.addView(check);

         */


        LinearLayout crashBar = new LinearLayout(context);
        Button btnCrashMain = new Button(context);
        btnCrashMain.setText("主线程闪退测试");
        btnCrashMain.setOnClickListener(v -> {
            throw new RuntimeException("Java闪退测试");
        });
        crashBar.addView(btnCrashMain);

        Button btnCrashThread = new Button(context);
        btnCrashThread.setText("子线程闪退测试");
        btnCrashThread.setOnClickListener(v -> {
            Thread thread = new Thread(() -> {
                throw new RuntimeException("Java子线程闪退测试");
            });
            thread.setName("QTool_闪退测试");
            thread.start();
        });
        crashBar.addView(btnCrashThread);
        mRoot.addView(crashBar);

        Button btnCleanMethodCache = new Button(context);
        btnCleanMethodCache.setText("清除适配数据并重启");
        btnCleanMethodCache.setOnClickListener(v -> {
            GlobalConfig.Put_String("cacheVer", "");
            QQEnvUtils.ExitQQAnyWays();
        });
        mRoot.addView(btnCleanMethodCache);

        Button printStack = new Button(context);
        printStack.setText("输出所有线程调用栈");
        printStack.setOnClickListener(v -> DebugUtils.PrintAllThreadStack());
        mRoot.addView(printStack);

        fullScreen.setContentView(view);
        fullScreen.show();

    }

    public static ViewGroup.LayoutParams getMarginParam() {
        LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        params.setMargins(40, 0, 0, 0);
        params.setMarginEnd(30);
        return params;
    }
}

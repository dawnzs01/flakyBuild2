package cc.hicore.qtool.JavaPlugin.ListForm;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ProgressBar;

import org.json.JSONArray;
import org.json.JSONObject;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.Properties;
import java.util.concurrent.atomic.AtomicReference;

import cc.hicore.Utils.FileUtils;
import cc.hicore.Utils.HttpUtils;
import cc.hicore.Utils.NameUtils;
import cc.hicore.Utils.Utils;
import cc.hicore.qtool.ActProxy.BaseProxyAct;
import cc.hicore.qtool.HookEnv;
import cc.hicore.qtool.R;

/*
显示脚本项目的Activity
 */
public class JavaPluginAct {
    static AtomicReference<onNotify> notifyInstance = new AtomicReference<>();
    private LinearLayout itemLayout;
    private Context context;

    public static void startActivity(Activity host) {
        BaseProxyAct.createNewView("JavaPluginManager", host, context -> new JavaPluginAct().createView(context));
    }

    public static void NotifyLoadSuccess(String PluginID) {
        onNotify notify = notifyInstance.get();
        if (notify != null) {
            notify.onNotifyLoadSuccess(PluginID);
        }
    }

    private View createView(Context context) {
        this.context = context;
        LayoutInflater inflater = LayoutInflater.from(context);
        View root = inflater.inflate(R.layout.menu_javaplugin, null);
        itemLayout = root.findViewById(R.id.ContainLayout);
        searchForLocal();
        root.findViewById(R.id.selectLocal).setOnClickListener(v -> searchForLocal());
        root.findViewById(R.id.selectOnline).setOnClickListener(v -> searchForOnline());
        root.findViewById(R.id.createNewPlugin).setOnClickListener(v -> createNewPlugin());

        root.findViewById(R.id.openApiDesc)
                .setOnClickListener(v -> {
                    Uri u = Uri.parse("https://shimo.im/docs/913JVOpxNdiavN3E/");
                    Intent in = new Intent(Intent.ACTION_VIEW, u);
                    context.startActivity(in);
                });

        return root;
    }

    private void createNewPlugin(){
        ViewGroup root = (ViewGroup) LayoutInflater.from(context).inflate(R.layout.plugin_create_new, null);
        EditText ed_name = root.findViewById(R.id.ed_plugin_name_input);
        EditText ed_version = root.findViewById(R.id.ed_plugin_version_input);
        EditText ed_author = root.findViewById(R.id.ed_plugin_author_input);
        new AlertDialog.Builder(context,3)
                .setView(root)
                .setTitle("创建新插件")
                .setNeutralButton("创建",(v,x)->{
                    String name = ed_name.getText().toString();
                    String version = ed_version.getText().toString();
                    String author = ed_author.getText().toString();

                    String path = FileUtils.tryToCreatePath(new File(HookEnv.ExtraDataPath + "Plugin"),name);
                    try {
                        new File(path + "/desc.txt").createNewFile();
                        new File(path + "/main.java").createNewFile();
                        new File(path + "/ignore.txt").createNewFile();

                        Properties prop = new Properties();
                        prop.setProperty("id",name.replace("=","")+"_"+author+"_"+ NameUtils.getRandomString(8));
                        prop.setProperty("type","1");
                        prop.setProperty("author",author.replace("=",""));
                        prop.setProperty("version",version.replace("=",""));
                        prop.setProperty("name",name.replace("=",""));
                        OutputStream stream = new FileOutputStream(path + "/info.prop");
                        prop.store(stream,"AUTO_CREATE");
                        stream.close();

                        searchForLocal();

                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    Utils.ShowToast("已创建");
                }).show();
    }

    //扫描本地脚本并显示
    private void searchForLocal() {
        HashMap<String, String> saveIDCheck = new HashMap();
        StringBuilder saveAlarm = new StringBuilder();
        HashMap<String, LocalPluginItemController> controllers = new HashMap<>();
        itemLayout.removeAllViews();
        File searchPath = new File(HookEnv.ExtraDataPath + "/Plugin");
        File[] searchResult = searchPath.listFiles();
        if (searchResult != null) {
            for (File f : searchResult) {
                if (f.exists() && f.isDirectory()) {
                    LocalPluginItemController controller = LocalPluginItemController.create(context);
                    boolean loadResult = controller.checkAndLoadPluginInfo(f.getAbsolutePath());
                    if (loadResult) {
                        itemLayout.addView(controller.getRoot(), controller.getParams());
                        controllers.put(controller.getPluginID(), controller);

                        if (saveIDCheck.containsKey(controller.getPluginID())) {
                            String name = saveIDCheck.get(controller.getPluginID());
                            saveAlarm.append(name + "\nVVVVVVVVVVVVVVV\n" + controller.getPluginName() + "(" + controller.getPluginPath() + ")\n\n");
                        } else {
                            saveIDCheck.put(controller.getPluginID(), controller.getPluginName() + "(" + controller.getPluginPath() + ")");
                        }
                    }


                }
            }
        }
        if (saveAlarm.length() != 0) {
            new AlertDialog.Builder(context, R.style.Theme_QTool)
                    .setTitle("警告")
                    .setMessage("以下脚本ID冲突,请删除一个或者修改其中一个脚本ID为非冲突ID\n" + saveAlarm)
                    .setNeutralButton("关闭", (dialog, which) -> {

                    }).show();
        }
        notifyInstance.set(PluginID -> {
            LocalPluginItemController controller = controllers.get(PluginID);
            if (controller != null) {
                new Handler(Looper.getMainLooper())
                        .post(controller::notifyLoadSuccessOrDestroy);
            }
        });
    }

    //扫描在线脚本并显示
    private void searchForOnline() {
        ProgressBar bar = new ProgressBar(context);
        itemLayout.removeAllViews();
        itemLayout.addView(bar);

        new Thread(() -> {
            try {
                String OnlineData = HttpUtils.getContent("https://qtool.haonb.cc/getList");
                JSONArray newArray = new JSONArray(OnlineData);
                for (int i = 0; i < newArray.length(); i++) {
                    JSONObject item = newArray.getJSONObject(i);
                    OnlinePluginItemController.PluginInfo decInfo = new OnlinePluginItemController.PluginInfo(item.toString());
                    new Handler(Looper.getMainLooper())
                            .post(() -> {
                                LinearLayout.LayoutParams param = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
                                param.setMargins(20, 10, 20, 10);
                                View v = OnlinePluginItemController.getViewInstance(context, decInfo);
                                itemLayout.addView(v, param);
                            });
                }
            } catch (Exception e) {
                Utils.ShowToastL("无法获取列表:\n" + e);
            } finally {
                new Handler(Looper.getMainLooper()).post(() -> itemLayout.removeView(bar));
            }
        }).start();
    }

    interface onNotify {
        void onNotifyLoadSuccess(String PluginID);
    }
}

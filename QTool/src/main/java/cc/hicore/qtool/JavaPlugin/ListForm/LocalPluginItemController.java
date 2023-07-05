package cc.hicore.qtool.JavaPlugin.ListForm;

import android.app.AlertDialog;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.animation.Animation;
import android.view.animation.Transformation;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.io.File;
import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Properties;

import cc.hicore.LogUtils.LogUtils;
import cc.hicore.Utils.FileUtils;
import cc.hicore.Utils.Utils;
import cc.hicore.qtool.JavaPlugin.Controller.PluginController;
import cc.hicore.qtool.JavaPlugin.Controller.PluginInfo;
import cc.hicore.qtool.JavaPlugin.Controller.PluginSetController;
import cc.hicore.qtool.JavaPlugin.OnlinePluginController.PluginUploader;
import cc.hicore.qtool.QQTools.QQSelectHelper;
import cc.hicore.qtool.R;

public final class LocalPluginItemController {
    private static final String TAG = "LocalPluginController";
    private final RelativeLayout mRoot;
    private String PluginPath;
    private int MeasureHeight;

    private final View btn_load;
    private final View btn_loading;
    private final View btn_stop;


    private PluginInfo mInfo;
    private boolean IsChangeSize = false;
    private boolean IsExpand = false;
    private LocalPluginItemController(Context context) {
        LayoutInflater inflater = LayoutInflater.from(context);
        mRoot = (RelativeLayout) inflater.inflate(R.layout.plugin_item_local, null);
        mRoot.setOnClickListener(v -> ClickMain());
        btn_load = mRoot.findViewById(R.id.plugin_load);
        btn_loading = mRoot.findViewById(R.id.plugin_loading);
        btn_stop = mRoot.findViewById(R.id.plugin_stop);

        btn_load.setOnClickListener(v -> ClickLoad());
        btn_stop.setOnClickListener(v -> ClickStop());
        btn_loading.setOnClickListener(v -> ClickForceStop());
    }

    public static LocalPluginItemController create(Context context) {
        LocalPluginItemController controller = new LocalPluginItemController(context);
        return controller;
    }

    private void ClickForceStop() {
        new AlertDialog.Builder(mRoot.getContext())
                .setTitle("停止加载")
                .setMessage("是否停止加载脚本")
                .setPositiveButton("确定", (dialog, which) -> {
                    ClickStop();
                })
                .setNegativeButton("取消", null)
                .show();
    }

    private void ClickLoad() {
        btn_load.setVisibility(View.GONE);
        btn_loading.setVisibility(View.VISIBLE);
        Thread loadThread = new Thread(() -> {
            boolean loadResult = PluginController.LoadOnce(mInfo);
            if (loadResult) {
                new Handler(Looper.getMainLooper())
                        .post(() -> {
                            btn_loading.setVisibility(View.GONE);
                            btn_stop.setVisibility(View.VISIBLE);
                        });
            } else {
                new Handler(Looper.getMainLooper())
                        .post(() -> {
                            btn_loading.setVisibility(View.GONE);
                            btn_load.setVisibility(View.VISIBLE);
                        });
            }
        });
        loadThread.setName("QTool_Plugin_Loader");
        loadThread.start();

    }

    private void ClickStop() {
        btn_stop.setVisibility(View.GONE);
        btn_loading.setVisibility(View.VISIBLE);
        Thread endThread = new Thread(() -> {
            PluginController.endPlugin(mInfo.PluginID);
            new Handler(Looper.getMainLooper())
                    .post(() -> {
                        btn_loading.setVisibility(View.GONE);
                        btn_load.setVisibility(View.VISIBLE);
                    });
        });
        endThread.setName("QTool_Plugin_Terminate_thread");
        endThread.start();

    }

    private void ClickMain() {
        if (IsChangeSize) return;
        IsChangeSize = true;
        if (IsExpand) {
            LinearLayout lExpand = mRoot.findViewById(R.id.HideBar);
            lExpand.getLayoutParams().height = MeasureHeight;
            lExpand.requestLayout();
            int targetHeight = 0;
            Animation scale = new Animation() {
                int initialHeight;

                @Override
                protected void applyTransformation(float interpolatedTime, Transformation t) {
                    lExpand.getLayoutParams().height = initialHeight + (int) ((targetHeight - initialHeight) * interpolatedTime);
                    lExpand.requestLayout();
                }

                @Override
                public void initialize(int width, int height, int parentWidth, int parentHeight) {
                    initialHeight = height;
                    super.initialize(width, height, parentWidth, parentHeight);
                }

                @Override
                public boolean willChangeBounds() {
                    return true;
                }
            };
            scale.setDuration(400);
            scale.setFillAfter(true);
            lExpand.startAnimation(scale);
            lExpand.setVisibility(View.INVISIBLE);

            new Handler(Looper.getMainLooper())
                    .postDelayed(() -> {
                        lExpand.setVisibility(View.GONE);
                        IsChangeSize = false;
                        IsExpand = false;
                        lExpand.clearAnimation();
                    }, 500);
        } else {
            LinearLayout lExpand = mRoot.findViewById(R.id.HideBar);
            lExpand.getLayoutParams().height = 0;
            lExpand.requestLayout();
            int targetHeight = MeasureHeight;
            Animation scale = new Animation() {
                int initialHeight = 0;

                @Override
                protected void applyTransformation(float interpolatedTime, Transformation t) {
                    lExpand.getLayoutParams().height = initialHeight + (int) ((targetHeight - initialHeight) * interpolatedTime);
                    lExpand.requestLayout();
                }

                @Override
                public void initialize(int width, int height, int parentWidth, int parentHeight) {
                    initialHeight = height;
                    super.initialize(width, height, parentWidth, parentHeight);
                }

                @Override
                public boolean willChangeBounds() {
                    return true;
                }
            };
            scale.setDuration(400);
            scale.setFillAfter(true);
            lExpand.startAnimation(scale);
            lExpand.setVisibility(View.INVISIBLE);

            new Handler(Looper.getMainLooper())
                    .postDelayed(() -> {
                        lExpand.setVisibility(View.VISIBLE);
                        IsChangeSize = false;
                        IsExpand = true;
                        lExpand.clearAnimation();
                    }, 500);
        }
    }

    public String getPluginName() {
        return mInfo.PluginName;
    }

    public boolean checkAndLoadPluginInfo(String PluginRootPath) {
        File propPath = new File(PluginRootPath, "info.prop");
        if (!propPath.exists()) return false;
        try {
            Properties props = new Properties();
            String propString = FileUtils.ReadFileString(propPath.getAbsolutePath());
            props.load(new StringReader(propString));
            setTitle(props.getProperty("name", "未设定名字"));
            setAuthor("作者:" + props.getProperty("author", "未设定作者"));
            setVersion("版本号:" + props.getProperty("version", "未设定版本号"));
            setDesc(FileUtils.ReadFileString(new File(PluginRootPath, "desc.txt")));
            String PluginID = props.getProperty("id", new File(PluginRootPath).getName());
            setBlackOrWhileMode(PluginSetController.IsBlackMode(PluginID));

            PluginInfo NewInfo = new PluginInfo();
            NewInfo.LocalPath = PluginRootPath;
            NewInfo.PluginID = PluginID;
            NewInfo.PluginName = props.getProperty("name", "未设定名字");
            NewInfo.PluginAuthor = props.getProperty("author", "未设定作者");
            NewInfo.PluginVersion = props.getProperty("version", "未设定版本号");
            NewInfo.IsRunning = PluginController.IsRunning(PluginID);
            NewInfo.IsLoading = PluginController.IsLoading(PluginID);

            mInfo = NewInfo;
            //如果插件已经加载则显示停止按钮
            if (NewInfo.IsRunning) {
                btn_load.setVisibility(View.GONE);
                btn_stop.setVisibility(View.VISIBLE);
            }

            if (NewInfo.IsLoading) {
                btn_load.setVisibility(View.GONE);
                btn_stop.setVisibility(View.GONE);
                btn_loading.setVisibility(View.VISIBLE);
            }

            InitMeasure();
            saveButtonEvent();

            mRoot.findViewById(R.id.plugin_upload).setOnClickListener(v -> {
                PluginUploader.RequestForUpload(mInfo.LocalPath);
            });

            mRoot.findViewById(R.id.plugin_remove).setOnClickListener(v -> {
                new AlertDialog.Builder(mRoot.getContext(), 3)
                        .setTitle("是否要删除 ?")
                        .setMessage("将要删除的路径如下:\n" + mInfo.LocalPath + "\n" +
                                "\n该脚本的文件,配置数据都将被删除,是否继续?")
                        .setNeutralButton("确定删除", (dialog, which) -> {
                            FileUtils.deleteFile(new File(mInfo.LocalPath));
                            Utils.ShowToastL("已删除");
                        }).setNegativeButton("关闭", (dialog, which) -> {

                        }).show();
            });
            return true;

        } catch (IOException e) {
            LogUtils.warning(TAG, "Can't decode plugin prop file:" + propPath.getAbsolutePath());
            return false;
        }
    }

    private void saveButtonEvent() {
        //设置黑白名单状态
        RadioButton boxWhite = mRoot.findViewById(R.id.plugin_message_while);
        boxWhite.setOnCheckedChangeListener((buttonView, isChecked) -> {
            if (buttonView.isPressed()) {
                PluginSetController.SetBlackMode(mInfo.PluginID, false);
                PluginController.reportToUpdateList(mInfo.PluginID, false, null);
            }
        });

        RadioButton boxBlack = mRoot.findViewById(R.id.plugin_message_black);
        boxBlack.setOnCheckedChangeListener((buttonView, isChecked) -> {
            if (buttonView.isPressed()) {
                PluginSetController.SetBlackMode(mInfo.PluginID, true);
                PluginController.reportToUpdateList(mInfo.PluginID, true, null);
            }
        });

        if (PluginSetController.IsBlackMode(mInfo.PluginID)) {
            boxBlack.setChecked(true);
            boxWhite.setChecked(false);
        } else {
            boxWhite.setChecked(true);
            boxBlack.setChecked(false);
        }

        //设置自动加载状态
        CheckBox autoLoad = mRoot.findViewById(R.id.plugin_autoload);
        autoLoad.setChecked(PluginSetController.IsAutoLoad(mInfo.PluginID));
        autoLoad.setOnCheckedChangeListener((buttonView, isChecked) -> PluginSetController.SetAutoLoad(mInfo.PluginID, isChecked));

        CheckBox refuse_private = mRoot.findViewById(R.id.plugin_refuse_private);
        refuse_private.setChecked(PluginSetController.IsRefusePrivate(mInfo.PluginID));
        refuse_private.setOnCheckedChangeListener((buttonView, isChecked) -> PluginSetController.SetRefusePrivate(mInfo.PluginID, isChecked));


        //设置设置名单列表回调
        TextView setListButton = mRoot.findViewById(R.id.plugin_message_list_set);


        setListButton.setOnClickListener(v -> {
            QQSelectHelper helper = new QQSelectHelper(mRoot.getContext(), true, false, true);

            ArrayList<String> list = (ArrayList<String>) PluginSetController.getModeList(mInfo.PluginID);
            HashMap<String, HashSet<String>> selectGuildList = new HashMap<>();
            ArrayList<String> GroupList = new ArrayList<>();

            for (String s : list) {
                if (s.contains("&")) {
                    String[] cut = s.split("&");
                    if (cut.length > 1) {
                        HashSet<String> set = selectGuildList.computeIfAbsent(cut[0], k -> new HashSet<>());
                        set.add(cut[1]);
                    }
                } else {
                    GroupList.add(s);
                }
            }


            helper.setSelectedGroup(GroupList);
            helper.setSelectedGuildChannel(selectGuildList);

            helper.startShow(new QQSelectHelper.onSelected() {
                final ArrayList<String> selected = new ArrayList<>();

                @Override
                public void onGroupSelect(ArrayList<String> uin) {
                    selected.addAll(uin);
                }

                @Override
                public void onFriendSelect(ArrayList<String> uin) {

                }

                @Override
                public void onGuildSelect(HashMap<String, HashSet<String>> guilds) {
                    for (String guildID : guilds.keySet()) {
                        HashSet<String> chs = guilds.get(guildID);
                        if (chs != null) {
                            for (String channelId : chs) {
                                selected.add(guildID + "&" + channelId);
                            }
                        }

                    }
                }

                @Override
                public void onAllSelected() {
                    PluginSetController.setModeList(mInfo.PluginID, selected);
                    PluginController.reportToUpdateList(mInfo.PluginID, null, selected);
                }
            }, 1);
        });


    }

    public String getPluginPath() {
        return mInfo.LocalPath;
    }

    public String getPluginID() {
        return mInfo.PluginID;
    }

    public LinearLayout.LayoutParams getParams() {
        LinearLayout.LayoutParams param = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        param.setMargins(Utils.dip2px(mRoot.getContext(), 16), Utils.dip2px(mRoot.getContext(), 5),
                Utils.dip2px(mRoot.getContext(), 16), Utils.dip2px(mRoot.getContext(), 5));
        return param;
    }

    public RelativeLayout getRoot() {
        return mRoot;
    }

    private void InitMeasure() {
        LinearLayout ll = mRoot.findViewById(R.id.HideBar);
        ll.setVisibility(View.VISIBLE);
        ll.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() {
            @Override
            public void onGlobalLayout() {
                ll.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                MeasureHeight = ll.getMeasuredHeight();
                ll.setVisibility(View.GONE);
            }
        });
    }

    public void setTitleColor(int color) {
        TextView titleView = mRoot.findViewById(R.id.plugin_title);
        titleView.setTextColor(color);
    }

    private void setTitle(String title) {
        TextView titleView = mRoot.findViewById(R.id.plugin_title);
        titleView.setText(title);

    }

    private void setVersion(String version) {
        TextView versionView = mRoot.findViewById(R.id.plugin_version);
        versionView.setText(version);
    }

    private void setAuthor(String author) {
        TextView authorView = mRoot.findViewById(R.id.plugin_author);
        authorView.setText(author);
    }

    private void setDesc(String desc) {
        TextView descView = mRoot.findViewById(R.id.plugin_desc);
        descView.setText(desc);
    }

    private void setAutoLoad(boolean isEnable) {
        CheckBox authLoad = mRoot.findViewById(R.id.plugin_autoload);
        authLoad.setChecked(isEnable);
    }

    private void setBlackOrWhileMode(boolean blackMode) {
        if (blackMode) {
            RadioButton button = mRoot.findViewById(R.id.plugin_message_black);
            button.setChecked(true);
        } else {
            RadioButton button = mRoot.findViewById(R.id.plugin_message_while);
            button.setChecked(true);
        }
    }

    public void notifyLoadSuccessOrDestroy() {
        btn_loading.setVisibility(View.GONE);
        btn_load.setVisibility(View.GONE);
        btn_stop.setVisibility(View.VISIBLE);
    }
}

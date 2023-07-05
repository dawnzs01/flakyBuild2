package cc.hicore.qtool.StickerPanelPlus;

import org.json.JSONArray;
import org.json.JSONObject;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import cc.hicore.Utils.FileUtils;
import cc.hicore.qtool.HookEnv;

public class RecentStickerHelper {
    public static List<RecentItemInfo> getAllRecentRecord() {
        try {
            String pathSetDir = HookEnv.ExtraDataPath + "本地表情包/recent.json";
            JSONObject pathJson = new JSONObject(FileUtils.ReadFileString(pathSetDir));
            List<RecentItemInfo> items = new ArrayList<>();
            JSONArray pathList = pathJson.getJSONArray("items");
            for (int i = 0; i < pathList.length(); i++) {
                JSONObject path = pathList.getJSONObject(i);
                RecentItemInfo localPath = new RecentItemInfo();
                localPath.MD5 = path.getString("MD5");
                localPath.fileName = path.getString("fileName");
                localPath.addTime = path.getLong("addTime");
                localPath.type = path.getInt("type");
                localPath.url = path.getString("url");
                localPath.pathName = path.getString("pathName");
                localPath.thumbName = path.optString("thumbName");
                localPath.thumbUrl = path.optString("thumbUrl");

                items.add(localPath);
            }
            return items;
        } catch (Exception e) {
            e.printStackTrace();
            return new ArrayList<>();
        }
    }

    public static void cleanAllRecentRecord() {
        try {
            String pathSetDir = HookEnv.ExtraDataPath + "本地表情包/recent.json";
            JSONObject pathJson = new JSONObject();
            JSONArray pathList = new JSONArray();
            pathJson.put("items", pathList);
            FileUtils.WriteToFile(pathSetDir, pathJson.toString());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void createIfFileNotContain() {
        try {
            String pathSetDir = HookEnv.ExtraDataPath + "本地表情包/recent.json";
            if (!new File(pathSetDir).exists()) {
                JSONObject pathJson = new JSONObject();
                JSONArray pathList = new JSONArray();
                pathJson.put("items", pathList);
                FileUtils.WriteToFile(pathSetDir, pathJson.toString());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void addPicItemToRecentRecord(LocalDataHelper.LocalPath bandPath, LocalDataHelper.LocalPicItems item) {
        try {
            createIfFileNotContain();
            removeContainOrLast(item);
            String pathSetDir = HookEnv.ExtraDataPath + "本地表情包/recent.json";
            JSONObject pathJson = new JSONObject(FileUtils.ReadFileString(pathSetDir));
            JSONArray pathList = pathJson.getJSONArray("items");

            JSONObject newItem = new JSONObject();
            newItem.put("MD5", item.MD5);
            newItem.put("fileName", item.fileName);
            newItem.put("addTime", item.addTime);
            newItem.put("type", item.type);
            newItem.put("url", item.url);
            newItem.put("pathName", bandPath.storePath);
            newItem.put("thumbName", item.thumbName);
            newItem.put("thumbUrl", item.thumbUrl);
            pathList.put(newItem);

            pathJson.put("items", pathList);
            FileUtils.WriteToFile(pathSetDir, pathJson.toString());

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void addPicItemToRecentRecord(RecentItemInfo itemInfo) {
        try {
            createIfFileNotContain();
            removeContainOrLast(itemInfo);
            String pathSetDir = HookEnv.ExtraDataPath + "本地表情包/recent.json";
            JSONObject pathJson = new JSONObject(FileUtils.ReadFileString(pathSetDir));
            JSONArray pathList = pathJson.getJSONArray("items");

            JSONObject newItem = new JSONObject();
            newItem.put("MD5", itemInfo.MD5);
            newItem.put("fileName", itemInfo.fileName);
            newItem.put("addTime", itemInfo.addTime);
            newItem.put("type", itemInfo.type);
            newItem.put("url", itemInfo.url);
            newItem.put("pathName", itemInfo.pathName);
            newItem.put("thumbName", itemInfo.thumbName);
            newItem.put("thumbUrl", itemInfo.thumbUrl);


            pathList.put(newItem);

            pathJson.put("items", pathList);
            FileUtils.WriteToFile(pathSetDir, pathJson.toString());

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void removeContainOrLast(LocalDataHelper.LocalPicItems item) {
        try {
            String pathSetDir = HookEnv.ExtraDataPath + "本地表情包/recent.json";
            JSONObject pathJson = new JSONObject(FileUtils.ReadFileString(pathSetDir));
            JSONArray pathList = pathJson.getJSONArray("items");
            for (int i = 0; i < pathList.length(); i++) {
                JSONObject path = pathList.getJSONObject(i);
                if (path.getString("MD5").equals(item.MD5)) {
                    pathList.remove(i);
                    pathJson.put("items", pathList);
                    FileUtils.WriteToFile(pathSetDir, pathJson.toString());
                    return;
                }
            }

            if (pathList.length() >= 30) {
                pathList.remove(0);
                pathJson.put("items", pathList);
                FileUtils.WriteToFile(pathSetDir, pathJson.toString());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void removeContainOrLast(RecentItemInfo item) {
        try {
            String pathSetDir = HookEnv.ExtraDataPath + "本地表情包/recent.json";
            JSONObject pathJson = new JSONObject(FileUtils.ReadFileString(pathSetDir));
            JSONArray pathList = pathJson.getJSONArray("items");
            for (int i = 0; i < pathList.length(); i++) {
                JSONObject path = pathList.getJSONObject(i);
                if (path.getString("MD5").equals(item.MD5)) {
                    pathList.remove(i);
                    pathJson.put("items", pathList);
                    FileUtils.WriteToFile(pathSetDir, pathJson.toString());
                    return;
                }
            }
            if (pathList.length() >= 30) {
                pathList.remove(0);
                pathJson.put("items", pathList);
                FileUtils.WriteToFile(pathSetDir, pathJson.toString());
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static class RecentItemInfo {
        public String MD5;
        public String fileName;
        public String url;
        public String thumbName;
        public String thumbUrl;


        public long addTime;
        public int type;
        public String pathName;
    }
}

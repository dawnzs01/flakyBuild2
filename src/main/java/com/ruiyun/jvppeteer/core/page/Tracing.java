package com.ruiyun.jvppeteer.core.page;

import com.fasterxml.jackson.databind.JsonNode;
import com.ruiyun.jvppeteer.core.Constant;
import com.ruiyun.jvppeteer.events.DefaultBrowserListener;
import com.ruiyun.jvppeteer.transport.CDPSession;
import com.ruiyun.jvppeteer.util.Helper;
import com.ruiyun.jvppeteer.util.ValidateUtil;

import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * You can use [`tracing.start`](#tracingstartoptions) and [`tracing.stop`](#tracingstop) to create a trace file which can be opened in Chrome DevTools or [timeline viewer](https://chromedevtools.github.io/timeline-viewer/)
 */
public class Tracing implements Constant {

    /**
     * 当前要trace的 chrome devtools protocol session
     */
    private  CDPSession client;

    /**
     * 判断是否已经在追踪中
     */
    private  boolean recording;

    /**
     * 追踪到的信息要保存的文件路径
     */
    private  String path;


    public  Tracing(CDPSession client) {
        this.client = client;
        this.recording = false;
        this.path = "";
    }

    public void  start(String path) {
       this.start(path,false,null);
    }

    /**
     * <p>start tracing</p>
     * 每个浏览器一次只能激活一条跟踪
     * @param path A path to write the trace file to. 跟踪文件写入的路径
     * @param screenshots captures screenshots in the trace 捕获跟踪中的屏幕截图
     * @param categories specify custom categories to use instead of default. 指定要使用的自定义类别替换默认值
     */
    public void  start(String path,boolean screenshots, Set<String> categories) {
        ValidateUtil.assertArg(!this.recording, "Cannot start recording trace while already recording trace.");
       if(categories == null)
           categories = new HashSet<>(DEFAULTCATEGORIES);
        if (screenshots)
            categories.add("disabled-by-default-devtools.screenshot");
        this.path = path;
        this.recording = true;
        Map<String, Object> params = new HashMap<>();
        params.put("transferMode","ReturnAsStream");
        params.put("categories",String.join(",",categories));
        this.client.send("Tracing.start", params,true);
    }


    /**
     * stop tracing
     */
    public void stop() {
        DefaultBrowserListener<JsonNode> traceListener = new DefaultBrowserListener<JsonNode>() {
            @Override
            public void onBrowserEvent(JsonNode event) {
                Tracing tracing;
                try {
                    tracing = (Tracing)this.getTarget();
                    Helper.readProtocolStream(tracing.getClient(),event.get(RECV_MESSAGE_STREAM_PROPERTY).asText(),tracing.getPath(),true);
                } catch (IOException ignored) {

                }
            }
        };
        traceListener.setTarget(this);
        traceListener.setMethod("Tracing.tracingComplete");
        this.client.addListener(traceListener.getMethod(),traceListener,true);
        this.client.send("Tracing.end",null,true);
        this.recording = false;
    }

    public CDPSession getClient() {
        return client;
    }

    public void setClient(CDPSession client) {
        this.client = client;
    }

    public boolean isRecording() {
        return recording;
    }

    public void setRecording(boolean recording) {
        this.recording = recording;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }
}

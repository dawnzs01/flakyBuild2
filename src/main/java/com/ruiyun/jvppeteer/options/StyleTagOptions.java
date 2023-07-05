package com.ruiyun.jvppeteer.options;

import com.ruiyun.jvppeteer.core.page.Frame;

/**
 * 在${@link Frame#addScriptTag(ScriptTagOptions)}用到
 */
public class StyleTagOptions {

    private String url;

    private String path;

    private String content;

    public StyleTagOptions() {
        super();
    }

    public StyleTagOptions(String url, String path, String content) {
        this.url = url;
        this.path = path;
        this.content = content;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}

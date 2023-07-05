package com.ruiyun.example;

import com.ruiyun.jvppeteer.core.Puppeteer;
import com.ruiyun.jvppeteer.core.browser.Browser;
import com.ruiyun.jvppeteer.core.browser.BrowserFetcher;
import com.ruiyun.jvppeteer.core.page.Page;
import com.ruiyun.jvppeteer.options.LaunchOptions;
import com.ruiyun.jvppeteer.options.LaunchOptionsBuilder;
import com.ruiyun.jvppeteer.options.PageNavigateOptions;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.ExecutionException;

public class PageMouseExample {

    public static void main(String[] args) throws IOException, ExecutionException, InterruptedException {
        //自动下载，第一次下载后不会再下载
        BrowserFetcher.downloadIfNotExist(null);

        ArrayList<String> arrayList = new ArrayList<>();
        LaunchOptions options = new LaunchOptionsBuilder().withArgs(arrayList).withHeadless(false)/*.withExecutablePath(path)*/.build();
        arrayList.add("--no-sandbox");
        arrayList.add("--disable-setuid-sandbox");

        Browser browser = Puppeteer.launch(options);

        Page page = browser.newPage();

        PageNavigateOptions navigateOptions = new PageNavigateOptions();
        //dom加载完毕就算导航完成
        navigateOptions.setWaitUntil(Collections.singletonList("domcontentloaded"));
        page.goTo("https://www.baidu.com/?tn=98012088_10_dg&ch=3", navigateOptions);

        // Using ‘page.mouse’ to trace a 100x100 square.
        page.mouse().move(0, 0);
        page.mouse().down();
        page.mouse().move(0, 100);
        page.mouse().move(100, 100);
        page.mouse().move(100, 0);
        page.mouse().move(0, 0);
        page.mouse().up();
        browser.close();
    }
}

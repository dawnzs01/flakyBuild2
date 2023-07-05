package com.ruiyun.example;

import com.ruiyun.jvppeteer.core.Puppeteer;
import com.ruiyun.jvppeteer.core.browser.Browser;
import com.ruiyun.jvppeteer.core.browser.BrowserFetcher;
import com.ruiyun.jvppeteer.core.page.ElementHandle;
import com.ruiyun.jvppeteer.core.page.Page;
import com.ruiyun.jvppeteer.options.LaunchOptions;
import com.ruiyun.jvppeteer.options.LaunchOptionsBuilder;

import java.util.ArrayList;

public class PageWaitForExample {
    public static void main(String[] args) throws Exception {
        //自动下载，第一次下载后不会再下载
        BrowserFetcher.downloadIfNotExist(null);

        ArrayList<String> arrayList = new ArrayList<>();

        LaunchOptions options = new LaunchOptionsBuilder().withArgs(arrayList).withHeadless(false)/*.withExecutablePath(path)*/.withDumpio(true).build();
        arrayList.add("--no-sandbox");
        arrayList.add("--disable-setuid-sandbox");
        Browser browser = Puppeteer.launch(options);
        Page page = browser.newPage();
        //waitForResponse 必须异步,false表示不阻塞
        page.goTo("https://www.baidu.com/?tn=98012088_10_dg&ch=3",false);

        //JSHandle jsHandle = page.waitFor("#su", PageEvaluateType.STRING);
       // System.out.println("page.waitFor:"+jsHandle.toString());

        //Response response = page.waitForResponse("https://www.baidu.com/img/PCtm_d9c8750bed0b3c7d089fa7d55720d6cf.png");
       // System.out.println("page.waitForResponse:"+response.status());

//        Request request = page.waitForRequest("https://www.baidu.com/img/PCtm_d9c8750bed0b3c7d089fa7d55720d6cf.png");
//        System.out.println(request.requestId()+":"+request.resourceType());
        ElementHandle elementHandle = page.waitForSelector("#s-top-left > div > a");
        System.out.println(elementHandle.toString());
    }
}

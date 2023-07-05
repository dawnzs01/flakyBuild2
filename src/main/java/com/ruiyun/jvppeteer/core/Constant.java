package com.ruiyun.jvppeteer.core;

import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.PropertyAccessor;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/**
 * 存放所用到的常量
 */
public interface Constant {

	/**
	 * 指定版本
	 */
	String VERSION = "722234";
	/**
	 * 临时文件夹前缀
	 */
	String PROFILE_PREFIX = "puppeteer_dev_chrome_profile-";
	/**
	 * 把产品存放到环境变量的所有可用字段
	 */
	String[] PRODUCT_ENV = {"PUPPETEER_PRODUCT","java_config_puppeteer_product","java_package_config_puppeteer_product"};

	/**
	 * 把浏览器执行路径存放到环境变量的所有可用字段
	 */
	String[] EXECUTABLE_ENV = {"PUPPETEER_EXECUTABLE_PATH","java_config_puppeteer_executable_path","java_package_config_puppeteer_executable_path"};

	/**
	 * 把浏览器版本存放到环境变量的字段
	 */
	String PUPPETEER_CHROMIUM_REVISION_ENV = "PUPPETEER_CHROMIUM_REVISION";

	/**
	 * 读取流中的数据的buffer size
	 */
	int DEFAULT_BUFFER_SIZE  = 8 * 1024;

	/**
	 * 启动浏览器时，如果没有指定路径，那么会从以下路径搜索可执行的路径
	 */
	String[] PROBABLE_CHROME_EXECUTABLE_PATH =
		      new String[] {
		        "/usr/bin/chromium",
		        "/usr/bin/chromium-browser",
		        "/usr/bin/google-chrome-stable",
		        "/usr/bin/google-chrome",
		        "/Applications/Chromium.app/Contents/MacOS/Chromium",
		        "/Applications/Google Chrome.app/Contents/MacOS/Google Chrome",
		        "/Applications/Google Chrome Canary.app/Contents/MacOS/Google Chrome Canary",
		        "C:/Program Files (x86)/Google/Chrome/Application/chrome.exe",
				"C:/Program Files/Google/Chrome/Application/chrome.exe"
		      };
	/**
	 * 谷歌浏览器默认启动参数
	 */
	List<String> DEFAULT_ARGS = Collections.unmodifiableList(new ArrayList<String>() {
		private static final long serialVersionUID = 1L;
		{addAll(Arrays.asList(
				"--disable-background-networking",
				"--disable-background-timer-throttling",
				"--disable-breakpad",
				"--disable-browser-side-navigation",
				"--disable-client-side-phishing-detection",
				"--disable-default-apps",
				"--disable-dev-shm-usage",
				"--disable-extensions",
				"--disable-features=site-per-process",
				"--disable-hang-monitor",
				"--disable-popup-blocking",
				"--disable-prompt-on-repost",
				"--disable-sync",
				"--disable-translate",
				"--metrics-recording-only",
				"--no-first-run",
				"--safebrowsing-disable-auto-update",
				"--enable-automation",
				"--password-store=basic",
				"--use-mock-keychain"));}
	});


	Set<String> supportedMetrics = new HashSet<String>(){

		private static final long serialVersionUID = -5224857570151968464L;
		{
			add("Timestamp");
			add("Documents");
			add("Frames");
			add("JSEventListeners");
			add("Nodes");
			add("LayoutCount");
			add("RecalcStyleCount");
			add("LayoutDuration");
			add("RecalcStyleDuration");
			add("ScriptDuration");
			add("TaskDuration");
			add("JSHeapUsedSize");
			add("JSHeapTotalSize");
		}
	};
	/**
	 * fastjson的一个实例
	 */
	ObjectMapper OBJECTMAPPER = new ObjectMapper().setVisibility(PropertyAccessor.FIELD, Visibility.ANY).configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false).setSerializationInclusion(JsonInclude.Include.NON_NULL);

	/**
	 * 从浏览器的websocket接受到消息中有以下这些字段，在处理消息用到这些字段
	 */
	String RECV_MESSAGE_METHOD_PROPERTY = "method";
	String RECV_MESSAGE_PARAMS_PROPERTY = "params";
	String RECV_MESSAGE_ID_PROPERTY = "id";
	String RECV_MESSAGE_RESULT_PROPERTY = "result";
	String RECV_MESSAGE_SESSION_ID_PROPERTY = "sessionId";
	String RECV_MESSAGE_TARGETINFO_PROPERTY = "targetInfo";
	String RECV_MESSAGE_TYPE_PROPERTY = "type";
	String RECV_MESSAGE_ERROR_PROPERTY = "error";
	String RECV_MESSAGE_ERROR_MESSAGE_PROPERTY = "message";
	String RECV_MESSAGE_ERROR_DATA_PROPERTY = "data";
	String RECV_MESSAGE_TARFETINFO_TARGETID_PROPERTY = "targetId";
	String RECV_MESSAGE_STREAM_PROPERTY = "stream";
	String RECV_MESSAGE_STREAM_EOF_PROPERTY = "eof";
	String RECV_MESSAGE_STREAM_DATA_PROPERTY = "data";
	String RECV_MESSAGE_BASE64ENCODED_PROPERTY = "base64Encoded";


	/**
	 * 默认的超时时间：启动浏览器实例超时，websocket接受消息超时等
	 */
	int DEFAULT_TIMEOUT = 30000;

	/**
	 * 追踪信息的默认分类
	 */
	Set<String> DEFAULTCATEGORIES = new LinkedHashSet<String>(){
		private static final long serialVersionUID = -5224857570151968464L;

		{
			add("-*");
			add("devtools.timeline");
			add("v8.execute");
			add("disabled-by-default-devtools.timeline");
			add("disabled-by-default-devtools.timeline.frame");
			add("toplevel");
			add("blink.console");
			add("blink.user_timing");
			add("latencyInfo");
			add("disabled-by-default-devtools.timeline.stack");
			add("disabled-by-default-v8.cpu_profiler");
			add("disabled-by-default-v8.cpu_profiler.hires");
		}
	};

	/**
	 * 内置线程池的数量
	 */
	String COMMONT_THREAD_POOL_NUM = "jvppeteer_common_thread_number";
}

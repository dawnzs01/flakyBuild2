package com.ruiyun.jvppeteer.launch;

import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonNode;
import com.ruiyun.jvppeteer.core.Constant;
import com.ruiyun.jvppeteer.core.browser.Browser;
import com.ruiyun.jvppeteer.core.browser.BrowserFetcher;
import com.ruiyun.jvppeteer.core.browser.BrowserRunner;
import com.ruiyun.jvppeteer.core.browser.RevisionInfo;
import com.ruiyun.jvppeteer.exception.LaunchException;
import com.ruiyun.jvppeteer.options.BrowserOptions;
import com.ruiyun.jvppeteer.options.ChromeArgOptions;
import com.ruiyun.jvppeteer.options.FetcherOptions;
import com.ruiyun.jvppeteer.options.LaunchOptions;
import com.ruiyun.jvppeteer.transport.Connection;
import com.ruiyun.jvppeteer.transport.ConnectionTransport;
import com.ruiyun.jvppeteer.transport.WebSocketTransport;
import com.ruiyun.jvppeteer.util.FileUtil;
import com.ruiyun.jvppeteer.util.StreamUtil;
import com.ruiyun.jvppeteer.util.StringUtil;
import com.ruiyun.jvppeteer.util.ValidateUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;

public class ChromeLauncher implements Launcher {

    private static final Logger LOGGER = LoggerFactory.getLogger(ChromeLauncher.class);

    private boolean isPuppeteerCore;

    private String projectRoot;

    private String preferredRevision;

    public ChromeLauncher(String projectRoot, String preferredRevision, boolean isPuppeteerCore) {
        super();
        this.projectRoot = projectRoot;
        this.preferredRevision = preferredRevision;
        this.isPuppeteerCore = isPuppeteerCore;
    }

    public ChromeLauncher() {
    }

    @Override
    public Browser launch(LaunchOptions options) throws IOException {
        String temporaryUserDataDir = null;
        List<String> chromeArguments = defaultArgs(options);

        List<String> ignoreDefaultArgs;
        if (ValidateUtil.isNotEmpty(ignoreDefaultArgs = options.getIgnoreDefaultArgs())) {
            chromeArguments.removeAll(ignoreDefaultArgs);
        }
        boolean isCustomUserDir = false;
        boolean isCustomRemoteDebugger = false;
        for (String arg : chromeArguments) {
            if (arg.startsWith("--remote-debugging-")) {
                isCustomRemoteDebugger = true;
            } else if (arg.startsWith("--user-data-dir")) {
                isCustomUserDir = true;
            }
        }
        if (!isCustomUserDir) {
            temporaryUserDataDir = FileUtil.createProfileDir(Constant.PROFILE_PREFIX);
            chromeArguments.add("--user-data-dir=" + temporaryUserDataDir);
        }
        if (!isCustomRemoteDebugger) {
            chromeArguments.add(options.getPipe() ? "--remote-debugging-pipe" : "--remote-debugging-port=0");
        }

        String chromeExecutable = resolveExecutablePath(options.getExecutablePath());
        boolean usePipe = chromeArguments.contains("--remote-debugging-pipe");

        LOGGER.trace("Calling " + chromeExecutable + String.join(" ", chromeArguments));
        BrowserRunner runner = new BrowserRunner(chromeExecutable, chromeArguments, temporaryUserDataDir);//
        try {
            runner.start(options);
            Connection connection = runner.setUpConnection(usePipe, options.getTimeout(), options.getSlowMo(), options.getDumpio());
            Function<Object,Object> closeCallback = (s) -> {
                runner.closeQuietly();
                return null;
            };
            Browser browser = Browser.create(connection, null, options.getIgnoreHTTPSErrors(), options.getViewport(), runner.getProcess(), closeCallback);
            browser.waitForTarget(t -> "page".equals(t.type()), options);
            return browser;
        } catch (IOException | InterruptedException e) {
            runner.kill();
            throw new LaunchException("Failed to launch the browser process:" + e.getMessage(), e);
        }
    }

    /**
     * 返回默认的启动参数
     * @param options 自定义的参数
     * @return 默认的启动参数
     */
    @Override
    public List<String> defaultArgs(ChromeArgOptions options) {
        List<String> chromeArguments = new ArrayList<>();
        LaunchOptions launchOptions;
        if(StringUtil.isNotEmpty(options.getUserDataDir())){
            chromeArguments.add("--user-data-dir="+options.getUserDataDir());
        }
        boolean devtools = options.getDevtools();
        boolean headless = options.getHeadless();
        if (devtools) {
            chromeArguments.add("--auto-open-devtools-for-tabs");
            headless = false;
        }
        if (headless) {
            chromeArguments.add("--headless");
            chromeArguments.add("--hide-scrollbars");
            chromeArguments.add("--mute-audio");
        }
        List<String> args;
        if (ValidateUtil.isNotEmpty(args = options.getArgs())) {
            chromeArguments.add("about:blank");
            chromeArguments.addAll(args);
        }
        if (options instanceof LaunchOptions) {
            launchOptions = (LaunchOptions) options;
            if (!launchOptions.getIgnoreAllDefaultArgs()) {
                chromeArguments.addAll(Constant.DEFAULT_ARGS);
            }
        }
        return chromeArguments;
    }

    /**
     * 解析可执行的chrome路径
     *
     * @param chromeExecutable 指定的可执行路径
     * @return 返回解析后的可执行路径
     */
    @Override
    public String resolveExecutablePath(String chromeExecutable) throws IOException {
        boolean puppeteerCore = getIsPuppeteerCore();
        FetcherOptions fetcherOptions = new FetcherOptions();
        fetcherOptions.setProduct(this.product());
        BrowserFetcher browserFetcher = new BrowserFetcher(this.projectRoot, fetcherOptions);
        if (!puppeteerCore) {
            /*指定了启动路径，则启动指定路径的chrome*/
            if (StringUtil.isNotEmpty(chromeExecutable)) {
                boolean assertDir = FileUtil.assertExecutable(Paths.get(chromeExecutable).normalize().toAbsolutePath().toString());
                if (!assertDir) {
                    throw new IllegalArgumentException("given chromeExecutable \"" + chromeExecutable + "\" is not executable");
                }
                return chromeExecutable;
            }
            /*环境变量中配置了chromeExecutable，就使用环境变量中的路径*/
            for (int i = 0; i < Constant.EXECUTABLE_ENV.length; i++) {
                chromeExecutable = env.getEnv(Constant.EXECUTABLE_ENV[i]);
                if (StringUtil.isNotEmpty(chromeExecutable)) {
                    boolean assertDir = FileUtil.assertExecutable(chromeExecutable);
                    if (!assertDir) {
                        throw new IllegalArgumentException("given chromeExecutable is not is not executable");
                    }
                    return chromeExecutable;
                }
            }

            /*环境变量中配置了chrome版本，就用环境变量中的版本*/
            String revision = env.getEnv(Constant.PUPPETEER_CHROMIUM_REVISION_ENV);
            if (StringUtil.isNotEmpty(revision)) {
                RevisionInfo revisionInfo = browserFetcher.revisionInfo(revision);
                if (!revisionInfo.getLocal()) {
                    throw new LaunchException(
                            "Tried to use PUPPETEER_CHROMIUM_REVISION env variable to launch browser but did not find executable at: "
                                    + revisionInfo.getExecutablePath());
                }
                return revisionInfo.getExecutablePath();
            }
            /*如果下载了chrome，就使用下载的chrome*/
            List<String> localRevisions = browserFetcher.localRevisions();
            if (ValidateUtil.isNotEmpty(localRevisions)) {
                localRevisions.sort(Comparator.reverseOrder());
                RevisionInfo revisionInfo = browserFetcher.revisionInfo(localRevisions.get(0));
                if (!revisionInfo.getLocal()) {
                    throw new LaunchException(
                            "Tried to use PUPPETEER_CHROMIUM_REVISION env variable to launch browser but did not find executable at: "
                                    + revisionInfo.getExecutablePath());
                }
                return revisionInfo.getExecutablePath();
            }

            /*寻找可能存在的启动路径*/
            for (int i = 0; i < Constant.PROBABLE_CHROME_EXECUTABLE_PATH.length; i++) {
                chromeExecutable = Constant.PROBABLE_CHROME_EXECUTABLE_PATH[i];
                if (StringUtil.isNotEmpty(chromeExecutable)) {
                    boolean assertDir = FileUtil.assertExecutable(chromeExecutable);
                    if (assertDir) {
                        return chromeExecutable;
                    }
                }
            }
        }

        RevisionInfo revisionInfo = browserFetcher.revisionInfo(this.preferredRevision);
        if (!revisionInfo.getLocal())
            throw new LaunchException(MessageFormat.format("Could not find browser revision {0}. Pleaze download a browser binary.", this.preferredRevision));
        return revisionInfo.getExecutablePath();
    }

    @Override
    public Browser connect(BrowserOptions options, String browserWSEndpoint, String browserURL, ConnectionTransport transport) {
        final Connection connection;
        try {
            if (transport != null) {
                connection = new Connection("", transport, options.getSlowMo());
            } else if (StringUtil.isNotEmpty(browserWSEndpoint)) {
                WebSocketTransport connectionTransport = WebSocketTransport.create(browserWSEndpoint);
                connection = new Connection(browserWSEndpoint, connectionTransport, options.getSlowMo());
            } else if (StringUtil.isNotEmpty(browserURL)) {
                String connectionURL = getWSEndpoint(browserURL);
                WebSocketTransport connectionTransport = WebSocketTransport.create(connectionURL);
                connection = new Connection(connectionURL, connectionTransport, options.getSlowMo());
            } else {
                throw new IllegalArgumentException("Exactly one of browserWSEndpoint, browserURL or transport must be passed to puppeteer.connect");
            }
            JsonNode result = connection.send("Target.getBrowserContexts", null, true);

            JavaType javaType = Constant.OBJECTMAPPER.getTypeFactory().constructParametricType(ArrayList.class, String.class);
            List<String> browserContextIds;
            Function<Object,Object> closeFunction = (t) -> {
                connection.send("Browser.close", null, false);
                return null;
            };

            browserContextIds = Constant.OBJECTMAPPER.readerFor(javaType).readValue(result.get("browserContextIds"));
            return Browser.create(connection, browserContextIds, options.getIgnoreHTTPSErrors(), options.getViewport(), null, closeFunction);
        } catch (IOException | InterruptedException e) {
            throw new RuntimeException(e);
        }

    }

    /**
     * 通过格式为 http://${host}:${port} 的地址发送 GET 请求获取浏览器的 WebSocket 连接端点
     *
     * @param browserURL 浏览器地址
     * @return WebSocket 连接端点
     * @throws IOException 请求出错
     */
    private String getWSEndpoint(String browserURL) throws IOException {
        URI uri = URI.create(browserURL).resolve("/json/version");
        URL url = uri.toURL();

        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.setRequestMethod("GET");
        conn.connect();
        int responseCode = conn.getResponseCode();
        if (responseCode != HttpURLConnection.HTTP_OK) {
            throw new RuntimeException("browserURL: " + browserURL + ",HTTP " + responseCode);
        }
        String result = StreamUtil.toString(conn.getInputStream());
        JsonNode jsonNode = Constant.OBJECTMAPPER.readTree(result);

        return jsonNode.get("webSocketDebuggerUrl").asText();
    }

    public boolean getIsPuppeteerCore() {
        return isPuppeteerCore;
    }

    public void setIsPuppeteerCore(boolean isPuppeteerCore) {
        this.isPuppeteerCore = isPuppeteerCore;
    }


    @Override
    public String executablePath() throws IOException {
        return resolveExecutablePath(null);
    }

    public String product() {
        return "chrome";
    }


}

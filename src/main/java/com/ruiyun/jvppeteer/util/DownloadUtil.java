package com.ruiyun.jvppeteer.util;

import com.ruiyun.jvppeteer.core.Constant;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.ByteBuffer;
import java.nio.channels.Channels;
import java.nio.channels.FileChannel;
import java.nio.channels.ReadableByteChannel;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.CompletionService;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorCompletionService;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.function.BiConsumer;

public class DownloadUtil {

    private static final Logger LOGGER = LoggerFactory.getLogger(DownloadUtil.class);

    /**
     * 线程池数量
     */
    private static final int THREAD_COUNT = 5;

    /**
     * 每条线程下载的文件块大小 5M
     */
    private static final int CHUNK_SIZE = 5 << 20;

    /**
     * 重试次数
     */
    private static final int RETRY_TIMES = 5;

    /**
     * 读取数据超时
     */
    public static final int READ_TIME_OUT = 10000;

    /**
     * 连接超时设置
     */
    public static final int CONNECT_TIME_OUT = 10000;

    private static final String FAIL_RESULT = "-1";


    /**
     * 下载
     * @param url 载的资源定位路径
     * @param filePath 文件路径
     * @param progressCallback 下载回调
     * @throws IOException 异常
     * @throws ExecutionException 异常
     * @throws InterruptedException 异常
     */
    public static void download(String url, String filePath, BiConsumer<Integer, Integer> progressCallback) throws IOException, ExecutionException, InterruptedException {
        long contentLength = getContentLength(url);

        long taskCount = contentLength % CHUNK_SIZE == 0 ? contentLength / CHUNK_SIZE : contentLength / CHUNK_SIZE + 1;
        DownloadUtil.createFile(filePath, contentLength);

        ThreadPoolExecutor executor = DownloadUtil.getExecutor();
        CompletionService<String> completionService = new ExecutorCompletionService<>(executor);
        List<Future<String>> futureList = new ArrayList<>();
        int downloadCount = 0;
        if (contentLength <= CHUNK_SIZE) {
            Future<String> future = completionService.submit(new DownloadCallable(0, contentLength, filePath, url));
            futureList.add(future);
        } else {
            for (int i = 0; i < taskCount; i++) {
                if (i == taskCount - 1) {
                    Future<String> future = completionService.submit(new DownloadCallable(i * CHUNK_SIZE, contentLength, filePath, url));
                    futureList.add(future);
                } else {
                    Future<String> future = completionService.submit(new DownloadCallable(i * CHUNK_SIZE, (i + 1) * CHUNK_SIZE, filePath, url));
                    futureList.add(future);
                }
            }
        }
        executor.shutdown();
        for (Future<String> future : futureList) {
            String result = future.get();
            if (FAIL_RESULT.equals(result)) {
                LOGGER.error("download fail,url:"+url);
                Files.delete(Paths.get(filePath));
                executor.shutdownNow();
            } else {
                try {
                    downloadCount +=Integer.parseInt(result);
                    if (progressCallback != null){
                        progressCallback.accept(downloadCount,(int) (contentLength >> 20));
                    }
                }catch (Exception e){
                    LOGGER.error("ProgressCallback has some problem",e);
                }
            }
        }

    }

    /**
     * 获取下载得文件长度
     * @param url 资源定位路径
     * @throws IOException 连接异常
     * @return 长度
     */
    public static final long getContentLength(String url) throws IOException {
        URL uuuRl = new URL(url);
        HttpURLConnection conn = null;
        try {
            conn = (HttpURLConnection) uuuRl.openConnection();
            conn.setRequestMethod("HEAD");
            conn.setConnectTimeout(READ_TIME_OUT);
            conn.setReadTimeout(CONNECT_TIME_OUT);
            conn.connect();
            int responseCode = conn.getResponseCode();
            if (responseCode >= 200 && responseCode <= 204) {
                return conn.getContentLengthLong();
            } else {
                throw new RuntimeException(url + " responseCode: " + responseCode);
            }
        } finally {
            if (conn != null) {
                conn.disconnect();
            }
        }
    }

    /**
     * 创建一个用于下载chrome的线程池
     * @return 线程池
     */
    public static ThreadPoolExecutor getExecutor() {
        return new ThreadPoolExecutor(THREAD_COUNT, THREAD_COUNT, 30000, TimeUnit.MILLISECONDS, new LinkedBlockingQueue<>());

    }

    /**
     * 创建固定大小的文件
     *
     * @param path 文件路径
     * @param length 文件大小
     * @throws IOException 操作文件异常
     */
    public static void createFile(String path, long length) throws IOException {
        File file = new File(path);
        if (file.exists()) {
            FileUtil.createNewFile(file);
        }
        RandomAccessFile randomAccessFile = new RandomAccessFile(path, "rw");
        randomAccessFile.setLength(length);
        randomAccessFile.close();
    }


    static class DownloadCallable implements Callable<String> {

        private long startPosition;

        private long endPosition;

        private String filePath;

        private String url;

        public DownloadCallable(long startPosition, long endPosition, String filePath, String url) {
            this.startPosition = startPosition;
            this.endPosition = endPosition;
            this.filePath = filePath;
            this.url = url;
        }

        @Override
        public String call() {
            RandomAccessFile file = null;
            HttpURLConnection conn = null;
            try {
                file = new RandomAccessFile(this.filePath, "rw");
                file.seek(this.startPosition);
                URL uRL = new URL(this.url);
                conn = (HttpURLConnection) uRL.openConnection();
                conn.setConnectTimeout(CONNECT_TIME_OUT);
                conn.setReadTimeout(READ_TIME_OUT);
                conn.setRequestMethod("GET");
                String range = "bytes=" + startPosition + "-" + endPosition;
                conn.addRequestProperty("Range", range);
                conn.addRequestProperty("accept-encoding", "gzip, deflate, br");
                ByteBuffer buffer = ByteBuffer.allocate(Constant.DEFAULT_BUFFER_SIZE);
                FileChannel channel = file.getChannel();
                for (int j = 0; j < RETRY_TIMES; j++) {
                    try {
                        conn.connect();
                        InputStream inputStream = conn.getInputStream();
                        ReadableByteChannel readableByteChannel = Channels.newChannel(inputStream);
                        while (readableByteChannel.read(buffer) != -1) {
                            buffer.flip();
                            while (buffer.hasRemaining()) {
                                channel.write(buffer);
                            }
                            buffer.clear();
                        }
                        return String.valueOf((endPosition - startPosition) >> 20);
                    } catch (Exception e) {
                        if (j == RETRY_TIMES - 1) {
                            LOGGER.error("download url[{}] bytes[{}] fail.",url,range);
                        }
                    }
                }
                return FAIL_RESULT;
            } catch (Exception e) {
                LOGGER.error("download url[{}] bytes[{}] fail.",url,startPosition+"-"+endPosition);
                return FAIL_RESULT;
            } finally {
                StreamUtil.closeQuietly(file);
                if (conn != null) {
                    conn.disconnect();
                }

            }
        }
    }

}





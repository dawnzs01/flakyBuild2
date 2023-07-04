package net.xdow.aliyundrive.net.interceptor;

import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okhttp3.internal.Util;

import java.io.IOException;

public class AccessTokenInvalidInterceptor implements Interceptor {

    private Runnable mAccessTokenInvalidListener;

    @Override
    public Response intercept(Chain chain) throws IOException {
        Request request = chain.request();
        Response response = chain.proceed(request);
        Runnable listener = this.mAccessTokenInvalidListener;
        try {
            if (listener == null) {
                return response;
            }
            int code = response.code();
            if (code == 401 || code == 400) {
                ResponseBody body = response.peekBody(40960);
                try {
                    String res = body.string();
                    if (res.contains("AccessTokenInvalid") || res.contains("TokenExpired")) {
                        listener.run();
                    }
                } finally {
                    Util.closeQuietly(body);
                }
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return response;
    }

    public void setAccessTokenInvalidListener(Runnable listener) {
        this.mAccessTokenInvalidListener = listener;
    }
}

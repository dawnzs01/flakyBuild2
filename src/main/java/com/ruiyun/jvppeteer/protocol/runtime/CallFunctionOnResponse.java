package com.ruiyun.jvppeteer.protocol.runtime;

public class CallFunctionOnResponse {

    private RemoteObject result;

    private ExceptionDetails exceptionDetails;

    public RemoteObject getResult() {
        return result;
    }

    public void setResult(RemoteObject result) {
        this.result = result;
    }

    public ExceptionDetails getExceptionDetails() {
        return exceptionDetails;
    }

    public void setExceptionDetails(ExceptionDetails exceptionDetails) {
        this.exceptionDetails = exceptionDetails;
    }
}

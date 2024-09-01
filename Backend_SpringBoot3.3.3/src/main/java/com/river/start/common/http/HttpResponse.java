package com.river.start.common.http;

public class HttpResponse<T> {

    private int status;
    private String message;
    private T data;

    public HttpResponse(int status, String message, T data) {
        this.status = status;
        this.message = message;
        this.data = data;
    }

    public int getStatus() {
        return status;
    }

    public String getMessage() {
        return message;
    }

    public T getData() {
        return data;
    }
}
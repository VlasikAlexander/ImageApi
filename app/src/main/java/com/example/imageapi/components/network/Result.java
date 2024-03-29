package com.example.imageapi.components.network;

public class Result<T> {

    public final T data;
    public final Throwable error;
    public final boolean isFail;

    public Result(T data) {
        this.data = data;
        error = null;
        isFail = false;
    }

    public Result(Throwable error) {
        this.error = error;
        data = null;
        isFail = true;
    }

    public boolean isFail() {
        return isFail;
    }

    public boolean isSuccess() {
        return !isFail;
    }
}

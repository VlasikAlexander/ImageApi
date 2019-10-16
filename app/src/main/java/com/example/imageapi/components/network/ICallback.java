package com.example.imageapi.components.network;


public interface ICallback<T> {
    void onResult(Result<T> result);
}

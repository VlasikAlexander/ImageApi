package com.example.imageapi.ui;

public class MainActivityPresenter implements MainActivityContract.IPresenter {

    private final MainActivityContract.IView view;

    public MainActivityPresenter(MainActivityContract.IView view) {
        this.view = view;
    }
}

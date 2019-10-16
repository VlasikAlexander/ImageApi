package com.example.imageapi.ui.fr.search;

import com.example.imageapi.components.network.INetworkManager;

public class SearchScreenPresenter implements SearchScreenContract.IPresenter {

    private final SearchScreenContract.IView view;
    private final INetworkManager networkManager;

    public SearchScreenPresenter(SearchScreenContract.IView view, INetworkManager networkManager) {
        this.networkManager = networkManager;
        this.view = view;
    }

    @Override
    public void getData(String query, int page) {
        networkManager.getImages(query, page,  result -> view.setAdapter(result.data));
    }
}

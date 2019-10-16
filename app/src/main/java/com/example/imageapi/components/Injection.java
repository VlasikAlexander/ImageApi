package com.example.imageapi.components;

import com.example.imageapi.components.network.NetworkManager;
import com.example.imageapi.ui.MainActivityContract;
import com.example.imageapi.ui.MainActivityPresenter;
import com.example.imageapi.ui.fr.search.SearchScreenContract;
import com.example.imageapi.ui.fr.search.SearchScreenFragment;
import com.example.imageapi.ui.fr.search.SearchScreenPresenter;

public class Injection {

    private static IComponentProvider provider;

    public static void setProvider(ComponentProvider provider) {
        Injection.provider = provider;
    }

    public static IComponentProvider getProvider() {
        return provider;
    }

    public static MainActivityContract.IPresenter getMainActivityPresenter(MainActivityContract.IView view) {
        return new MainActivityPresenter(view);
    }

    public static SearchScreenContract.IPresenter getSearchScreenPresenter(SearchScreenContract.IView view) {
        return new SearchScreenPresenter(view, new NetworkManager());
    }
}

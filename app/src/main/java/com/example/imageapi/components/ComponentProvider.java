package com.example.imageapi.components;

import android.content.Context;

import com.example.imageapi.components.network.INetworkManager;
import com.example.imageapi.components.network.NetworkManager;


public class ComponentProvider implements IComponentProvider {

    private  INetworkManager networkManager;

    public ComponentProvider(Context contex) {

    }


    @Override
    public INetworkManager getNetwork() {
        return new NetworkManager();
    }
}

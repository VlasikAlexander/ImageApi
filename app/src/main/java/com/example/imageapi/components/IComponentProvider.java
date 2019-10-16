package com.example.imageapi.components;

import com.example.imageapi.components.network.INetworkManager;

public interface IComponentProvider {

    INetworkManager getNetwork();
}

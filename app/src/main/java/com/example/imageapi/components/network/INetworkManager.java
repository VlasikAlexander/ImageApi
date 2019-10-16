package com.example.imageapi.components.network;

import com.example.imageapi.dto.Hit;
import com.example.imageapi.dto.Images;

import java.util.List;

public interface INetworkManager {

     void getImages(String query, int page,  ICallback<List<Hit>> callback);
}

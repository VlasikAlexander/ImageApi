package com.example.imageapi.ui.fr.search;

import com.example.imageapi.dto.Hit;

import java.util.List;

public class SearchScreenContract {


    public interface IView {
        void setAdapter(List<Hit> data);
    }

    public interface IPresenter {

        void getData(String query, int page);
    }
}

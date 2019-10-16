package com.example.imageapi.ui.fr.search;

import android.util.Log;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class ScrollListener extends RecyclerView.OnScrollListener {

    private final LinearLayoutManager layoutManager;

    public ScrollListener(LinearLayoutManager layoutManager) {
        super();
        this.layoutManager = layoutManager;
    }

    @Override
    public void onScrolled(@NonNull RecyclerView recyclerView, int dx, int dy) {
        super.onScrolled(recyclerView, dx, dy);

    }
}

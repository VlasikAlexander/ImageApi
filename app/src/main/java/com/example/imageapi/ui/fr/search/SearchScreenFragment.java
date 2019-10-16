package com.example.imageapi.ui.fr.search;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import com.example.imageapi.R;
import com.example.imageapi.components.Injection;
import com.example.imageapi.dto.Hit;

import java.util.List;

public class SearchScreenFragment extends Fragment implements SearchScreenContract.IView {

    private static  int PAGE = 1;
    private final SearchScreenContract.IPresenter presenter;
    private RecyclerView recyclerView;
    private EditText searchField;
    private String query = "";

    public SearchScreenFragment() {
        presenter = Injection.getSearchScreenPresenter(this);
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        final View v = inflater.inflate(R.layout.fragment_search_screen, null, false);
        initViews(v);
        return v;
    }

    private void initViews(View v) {
        searchField = v.findViewById(R.id.editText);
        v.findViewById(R.id.search).setOnClickListener((view) -> {
            if (TextUtils.isEmpty(searchField.getText())) return;
            query = searchField.getText().toString();
            presenter.getData(query, PAGE);
        });
        recyclerView = v.findViewById(R.id.recycler);
        recyclerView.setLayoutManager(new StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL));
        recyclerView.addItemDecoration(new SpaceItemDecoration(5));
        recyclerView.setOnScrollChangeListener((view, i, i1, i2, i3) -> {
            System.out.println("onScrollListener" + view);
            System.out.println("onScrollListener " + i);
            System.out.println("onScrollListener " + i1);
            System.out.println("onScrollListener " + i2);
            System.out.println("onScrollListener " + i3);
                });

        presenter.getData(query, PAGE);
    }

    @Override
    public void setAdapter(List<Hit> data) {
        recyclerView.setAdapter(new ImageAdapter(getContext(), data));
    }
}

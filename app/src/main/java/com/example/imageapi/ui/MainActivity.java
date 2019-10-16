
package com.example.imageapi.ui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.imageapi.R;
import com.example.imageapi.components.Injection;
import com.example.imageapi.ui.fr.search.SearchScreenFragment;

public class MainActivity extends AppCompatActivity implements MainActivityContract.IView {

    private MainActivityContract.IPresenter presenter;

    public MainActivity() {
        this.presenter = Injection.getMainActivityPresenter(this);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setFirstFragment(new SearchScreenFragment());
        setRecycler();
    }

    private void setRecycler() {

    }

    private void setFirstFragment(SearchScreenFragment searchScreenFragment) {
        final FragmentManager fm = getSupportFragmentManager();
        fm.beginTransaction().add(R.id.container, searchScreenFragment, "searchFragment").commit();
    }
}

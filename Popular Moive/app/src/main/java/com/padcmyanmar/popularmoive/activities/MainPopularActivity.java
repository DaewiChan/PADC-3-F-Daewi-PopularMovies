package com.padcmyanmar.popularmoive.activities;

import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;

import com.padcmyanmar.popularmoive.R;
import com.padcmyanmar.popularmoive.adapter.MoviesAdapter;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainPopularActivity extends AppCompatActivity {
    @BindView(R.id.rv_movie)
    RecyclerView rvMovie;

    @BindView(R.id.toolbar)
    Toolbar toolbar;

    @BindView(R.id.fab)
    FloatingActionButton fab;


    private MoviesAdapter mMoviesAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_popular);

        ButterKnife.bind(this);

        setSupportActionBar(toolbar);

        mMoviesAdapter=new MoviesAdapter();

        LinearLayoutManager linearLayoutManager=new LinearLayoutManager(getApplicationContext(),LinearLayoutManager.VERTICAL,false);

        rvMovie.setLayoutManager(linearLayoutManager);

        rvMovie.setAdapter(mMoviesAdapter);
    }

}

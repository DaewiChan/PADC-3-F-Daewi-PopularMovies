package com.padcmyanmar.popularmoive.activities;

import android.content.Intent;
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
import delegates.MoviesActionDelegate;

public class MainPopularActivity extends AppCompatActivity implements MoviesActionDelegate {
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


        mMoviesAdapter=new MoviesAdapter(this);

        LinearLayoutManager linearLayoutManager=new LinearLayoutManager(getApplicationContext(),LinearLayoutManager.VERTICAL,false);

        rvMovie.setLayoutManager(linearLayoutManager);

        rvMovie.setAdapter(mMoviesAdapter);
    }

    @Override
    public void onTapMoviesItem() {
        Intent intent=new Intent(getApplicationContext(),MoviesDetailsItem.class);
        startActivity(intent);

    }

    @Override
    public void onTapOverviewButton() {

    }

    @Override
    public void onTapFavoriteButton() {

    }
}

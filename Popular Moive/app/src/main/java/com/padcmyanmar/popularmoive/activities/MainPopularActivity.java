package com.padcmyanmar.popularmoive.activities;

import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.util.Log;

import com.padcmyanmar.popularmoive.MoviesApp;
import com.padcmyanmar.popularmoive.R;
import com.padcmyanmar.popularmoive.adapter.MoviesAdapter;

import butterknife.BindView;
import butterknife.ButterKnife;

import com.padcmyanmar.popularmoive.data.vo.model.MoviesModel;
import com.padcmyanmar.popularmoive.delegates.MoviesActionDelegate;
import com.padcmyanmar.popularmoive.events.LoadedMoviesEvent;

import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;

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

        MoviesModel.getsObjectInstance().loadMovies();
    }

    @Override
    protected void onStart() {
        super.onStart();
        EventBus.getDefault().register(this);
    }

    @Override
    protected void onStop() {
        super.onStop();
        EventBus.getDefault().unregister(this);
    }


    @Override
    public void onTapMoviesItem() {
        Intent intent=new Intent(getApplicationContext(),MoviesDetailsActivity.class);
        startActivity(intent);

    }

    @Override
    public void onTapOverviewButton() {

    }

    @Override
    public void onTapFavoriteButton() {

    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onMoviesLoaded(LoadedMoviesEvent event){
        Log.d(MoviesApp.LOG_TAG,"onMoviesLoaded :"+event.getMoviesList().size());
        mMoviesAdapter.setMovies(event.getMoviesList());
    }
}

package com.padcmyanmar.popularmoive.activities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.padcmyanmar.popularmoive.R;
import com.padcmyanmar.popularmoive.adapter.TrailerAdapter;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by Daewi on 12/13/2017.
 */

public class MoviesDetailsItem extends AppCompatActivity {

    @BindView(R.id.rec_trailer)
    RecyclerView recTrailer;

    /*@BindView(R.id.toolbar)
    android.support.v7.widget.Toolbar toolbar;

    @BindView(R.id.fab)
    FloatingActionButton fab;*/


    private TrailerAdapter mTrailerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.item_movies_details);

        ButterKnife.bind(this);

        //setSupportActionBar(toolbar);

        mTrailerAdapter = new TrailerAdapter();

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getApplicationContext(), LinearLayoutManager.HORIZONTAL, false);
        recTrailer.setLayoutManager(linearLayoutManager);

        recTrailer.setAdapter(mTrailerAdapter);
    }

}

package com.padcmyanmar.popularmoive.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.padcmyanmar.popularmoive.R;
import com.padcmyanmar.popularmoive.viewholder.ItemMoviesViewHolder;

import delegates.MoviesActionDelegate;

/**
 * Created by Daewi on 12/3/2017.
 */

public class MoviesAdapter extends RecyclerView.Adapter {
    private MoviesActionDelegate mMoviesActionDelegate;

    public MoviesAdapter(MoviesActionDelegate moviesActionDelegate) {

        mMoviesActionDelegate=moviesActionDelegate;
    }


    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        Context context= parent.getContext();

        LayoutInflater inflater=LayoutInflater.from(context);

        View moviesItemView=inflater.inflate(R.layout.item_moive, parent, false);

        ItemMoviesViewHolder itemMoviesViewHolder=new ItemMoviesViewHolder(moviesItemView,mMoviesActionDelegate);

        return itemMoviesViewHolder;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {

        return 10;
    }

}

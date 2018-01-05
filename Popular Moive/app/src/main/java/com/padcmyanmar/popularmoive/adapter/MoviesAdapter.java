package com.padcmyanmar.popularmoive.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.padcmyanmar.popularmoive.R;
import com.padcmyanmar.popularmoive.data.vo.MovieItemVO;
import com.padcmyanmar.popularmoive.viewholder.ItemMoviesViewHolder;

import com.padcmyanmar.popularmoive.delegates.MoviesActionDelegate;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Daewi on 12/3/2017.
 */

public class MoviesAdapter extends RecyclerView.Adapter<ItemMoviesViewHolder>{
    private MoviesActionDelegate mMoviesActionDelegate;

    private List<MovieItemVO> mMoviesList;

    public MoviesAdapter(MoviesActionDelegate moviesActionDelegate) {

        mMoviesActionDelegate=moviesActionDelegate;

        mMoviesList=new ArrayList<>();
    }


    @Override
    public ItemMoviesViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        Context context= parent.getContext();

        LayoutInflater inflater=LayoutInflater.from(context);

        View moviesItemView=inflater.inflate(R.layout.item_moive, parent, false);

        ItemMoviesViewHolder itemMoviesViewHolder=new ItemMoviesViewHolder(moviesItemView,mMoviesActionDelegate);

        return itemMoviesViewHolder;
    }



    @Override
    public void onBindViewHolder(ItemMoviesViewHolder holder, int position) {
      holder.setMovies(mMoviesList.get(position));
    }

    @Override
    public int getItemCount() {
        return mMoviesList.size();
    }

    public void setMovies(List<MovieItemVO> moviesList){
        mMoviesList=moviesList;
        notifyDataSetChanged();//refresh adapter
    }

}

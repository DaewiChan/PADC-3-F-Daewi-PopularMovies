package com.padcmyanmar.popularmoive.viewholder;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewStructure;

import com.padcmyanmar.popularmoive.R;

import butterknife.ButterKnife;
import butterknife.OnClick;
import delegates.MoviesActionDelegate;

/**
 * Created by Daewi on 12/6/2017.
 */

public class ItemMoviesViewHolder extends RecyclerView.ViewHolder {

    private MoviesActionDelegate mMoviesActionDelegate;

    public ItemMoviesViewHolder(View ItemView,MoviesActionDelegate moviesActionDelegate){

        super(ItemView);

        ButterKnife.bind(this,itemView);

        mMoviesActionDelegate=moviesActionDelegate;
    }

    @OnClick(R.id.cv_movies_item_root)
    public void onMoviesItemTap(View view){
        mMoviesActionDelegate.onTapMoviesItem();
    }
}

package com.padcmyanmar.popularmoive.viewholder;

import android.provider.ContactsContract;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.padcmyanmar.popularmoive.R;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

import com.padcmyanmar.popularmoive.data.vo.MovieItemVO;
import com.padcmyanmar.popularmoive.delegates.MoviesActionDelegate;

/**
 * Created by Daewi on 12/6/2017.
 */

public class ItemMoviesViewHolder extends RecyclerView.ViewHolder {

    @BindView(R.id.img_movie_photo)
    ImageView ivMoviePhoto;

    @BindView(R.id.tv_movie_title)
    TextView tvMovieTitle;

    @BindView(R.id.tv_movie_type)
    TextView tvMovieType;

    @BindView(R.id.tv_rating)
    TextView tvMovieRating;

    @BindView(R.id.rb_star)
    RatingBar ratingBar;


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

    public void setMovies(MovieItemVO movies) {

        tvMovieTitle.setText(movies.getTitle());

        tvMovieType.setText(movies.getOriginalLanguage());

        tvMovieRating.setText(String.valueOf(movies.getVoteAverage()));

        ratingBar.setRating(Float.parseFloat(String.valueOf(movies.getVoteAverage())));

        Glide.with(ivMoviePhoto.getContext())
                .load(movies.getPosterPath())
                .into(ivMoviePhoto);

        if (movies.getPosterPath() != null) {
         ivMoviePhoto.setVisibility(View.VISIBLE);
         Glide.with(ivMoviePhoto.getContext())
         .load(movies.getPosterPath())
         .into(ivMoviePhoto);
         }else {
         ivMoviePhoto.setVisibility(View.GONE);
         }


    }
}

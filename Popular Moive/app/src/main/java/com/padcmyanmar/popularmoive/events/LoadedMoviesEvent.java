package com.padcmyanmar.popularmoive.events;

import com.padcmyanmar.popularmoive.data.vo.MovieItemVO;

import java.util.List;

/**
 * Created by daewichan on 12/26/17.
 */

public class LoadedMoviesEvent {

    private List<MovieItemVO> moviesList;

    public LoadedMoviesEvent(List<MovieItemVO> moviesList) {
        this.moviesList = moviesList;
    }

    public List<MovieItemVO> getMoviesList() {
        return moviesList;
    }
}

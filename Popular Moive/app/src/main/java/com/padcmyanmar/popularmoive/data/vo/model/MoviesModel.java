package com.padcmyanmar.popularmoive.data.vo.model;

import com.padcmyanmar.popularmoive.network.HttpUrlConnectionDataAgent;
import com.padcmyanmar.popularmoive.network.MoviesDataAgent;

/**
 * Created by daewichan on 12/24/17.
 */

public class MoviesModel {

    private static MoviesModel sObjectInstance;
    private MoviesDataAgent mMoviesDataAgent;

    private MoviesModel() {

        mMoviesDataAgent= HttpUrlConnectionDataAgent.getsObjectInstance();
    }

    public static MoviesModel getsObjectInstance(){
        if (sObjectInstance==null){
            sObjectInstance=new MoviesModel();
        }
        return sObjectInstance;
    }

    public void loadMovies(){

        mMoviesDataAgent.loadMovies();
    }

}

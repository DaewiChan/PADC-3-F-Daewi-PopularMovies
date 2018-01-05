package com.padcmyanmar.popularmoive.network.responses;

import com.google.gson.annotations.SerializedName;
import com.padcmyanmar.popularmoive.data.vo.MovieItemVO;

import java.util.List;

/**
 * Created by daewichan on 12/26/17.
 */

public class GetMoviesResponse {

    private int code;
    private String message;
    private String apiVersion;
    private String page;


    @SerializedName("popular-movies")
    private List<MovieItemVO> mmMovies;

    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

    public String getApiVersion() {
        return apiVersion;
    }

    public String getPage() {
        return page;
    }

    public List<MovieItemVO> getMmMovies() {
        return mmMovies;
    }
}

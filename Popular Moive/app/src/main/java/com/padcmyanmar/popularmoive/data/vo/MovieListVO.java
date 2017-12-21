package com.padcmyanmar.popularmoive.data.vo;

import java.util.List;

/**
 * Created by daewichan on 12/21/17.
 */

public class MovieListVO {

    private Integer code;
    private String message;
    private String apiVersion;
    private String page;
    private List<MovieItemVO> popularMovies;

    private MovieItemVO movieItemVO;

    public Integer getCode() {
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

    public List<MovieItemVO> getPopularMovies() {
        return popularMovies;
    }
}

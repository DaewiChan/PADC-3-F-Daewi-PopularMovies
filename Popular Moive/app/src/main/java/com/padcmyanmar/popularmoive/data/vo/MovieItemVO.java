package com.padcmyanmar.popularmoive.data.vo;

import java.util.List;

/**
 * Created by daewichan on 12/21/17.
 */

public class MovieItemVO {

    private Integer voteCount;
    private Integer id;
    private Boolean video;
    private Double voteAverage;
    private String title;
    private Double  pupularity;
    private String posterPath;
    private String originalLanguage;
    private String originalTitle;
    private List<Integer>  genreIds;
    private String backdropPath;
    private Boolean adult;
    private String overview;
    private String releaseDate;

    public Integer getVoteCount() {
        return voteCount;
    }

    public Integer getId() {
        return id;
    }

    public Boolean getVideo() {
        return video;
    }

    public Double getVoteAverage() {
        return voteAverage;
    }

    public String getTitle() {
        return title;
    }

    public Double getPupularity() {
        return pupularity;
    }

    public String getPosterPath() {
        return posterPath;
    }

    public String getOriginalLanguage() {
        return originalLanguage;
    }

    public String getOriginalTitle() {
        return originalTitle;
    }

    public List<Integer> getGenreIds() {
        return genreIds;
    }

    public String getBackdropPath() {
        return backdropPath;
    }

    public Boolean getAdult() {
        return adult;
    }

    public String getOverview() {
        return overview;
    }

    public String getReleaseDate() {
        return releaseDate;
    }
}

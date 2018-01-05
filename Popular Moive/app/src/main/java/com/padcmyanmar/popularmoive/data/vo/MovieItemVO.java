package com.padcmyanmar.popularmoive.data.vo;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by daewichan on 12/21/17.
 */

public class MovieItemVO {

    @SerializedName("vote_count")
    private Integer voteCount;
    private Integer id;
    private Boolean video;

    @SerializedName("vote_average")
    private Double voteAverage;

    private String title;
    private Double  pupularity;

    @SerializedName("poster_path")
    private String posterPath;

    @SerializedName("original_language")
    private String originalLanguage;

    @SerializedName("original_title")
    private String originalTitle;

    @SerializedName("genre_ids")
    private List<Integer>  genreIds;

    @SerializedName("backdrop_path")
    private String backdropPath;
    private Boolean adult;
    private String overview;

    @SerializedName("release_date")
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

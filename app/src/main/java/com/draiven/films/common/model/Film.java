package com.draiven.films.common.model;

/**
 * Created by Lisandro Gómez on 11/7/17.
 */

public class Film {
    private String name;
    private String genre;
    private String description;
    private String releaseDate;
    private int trackTimeMillis;
    private String country;
    private String contentAdvisoryRating;
    private Double rating;
    private String urlImgSmall;

    public Film() {
    }

    public Film(String name, String genre, Double rating, String urlImgSmall) {
        this.name = name;
        this.genre = genre;
        this.rating = rating;
        this.urlImgSmall = urlImgSmall;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    public int getTrackTimeMillis() {
        return trackTimeMillis;
    }

    public void setTrackTimeMillis(int trackTimeMillis) {
        this.trackTimeMillis = trackTimeMillis;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getContentAdvisoryRating() {
        return contentAdvisoryRating;
    }

    public void setContentAdvisoryRating(String contentAdvisoryRating) {
        this.contentAdvisoryRating = contentAdvisoryRating;
    }

    public Double getRating() {
        return rating;
    }

    public void setRating(Double rating) {
        this.rating = rating;
    }

    public String getUrlImgSmall() {
        return urlImgSmall;
    }

    public void setUrlImgSmall(String urlImgSmall) {
        this.urlImgSmall = urlImgSmall;
    }
}

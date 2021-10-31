package com.Amit.MovieBookingApp.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Objects;

/**
 *I want table name should be table cinema
 */
//@Table(name="Cinema")
@Entity
public class Movie {
    @Id
    public int movieId;
//    @Column(name="Movie_id")
    @Column(length = 50,nullable = false)
    private String movieName;

    @Column(nullable = false)
    private String movieDescription;
    @Column(nullable = false)
    private double duration;
    private String coverPhotoUrl;
    private String trailerUrl;
    public int getMovieId() {
        return movieId;
    }
    public String getMovieName() {
        return movieName;
    }
    public String getMovieDescription() {
        return movieDescription;
    }

    public double getDuration() {
        return duration;
    }

    public String getCoverPhotoUrl() {
        return coverPhotoUrl;
    }

    public String getTrailerUrl() {
        return trailerUrl;
    }

    public void setMovieId(int movieId) {
        this.movieId = movieId;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public void setMovieDescription(String movieDescription) {
        this.movieDescription = movieDescription;
    }

    public void setDuration(double duration) {
        this.duration = duration;
    }

    public void setCoverPhotoUrl(String coverPhotoUrl) {
        this.coverPhotoUrl = coverPhotoUrl;
    }

    public void setTrailerUrl(String trailerUrl) {
        this.trailerUrl = trailerUrl;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "movieId=" + movieId +
                ", movieName='" + movieName + '\'' +
                ", movieDescription='" + movieDescription + '\'' +
                ", duration='" + duration + '\'' +
                ", coverPhotoUrl='" + coverPhotoUrl + '\'' +
                ", trailerUrl='" + trailerUrl + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Movie movie = (Movie) o;
        return movieId == movie.movieId && Objects.equals(movieName, movie.movieName) && Objects.equals(movieDescription, movie.movieDescription) && Objects.equals(duration, movie.duration) && Objects.equals(coverPhotoUrl, movie.coverPhotoUrl) && Objects.equals(trailerUrl, movie.trailerUrl);
    }
    @Override
    public int hashCode() {
        return Objects.hash(movieId, movieName, movieDescription, duration, coverPhotoUrl, trailerUrl);
    }
}

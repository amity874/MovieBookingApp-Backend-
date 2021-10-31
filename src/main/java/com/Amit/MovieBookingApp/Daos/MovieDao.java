package com.Amit.MovieBookingApp.Daos;
import com.Amit.MovieBookingApp.Entity.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Dao-> data access layer
 * all the crud op will be available now
 */
public interface MovieDao extends JpaRepository<Movie,Integer>{
//we can define the signature of the methods in this interface
//Follow some naming conventions
//Find movie by name
//find<EntityName>By<ColumnName>
// I want to provide support to search by anme
    public Movie findMovieByMovieName(String movieName);
//search Based on both name and duration
public Movie findMovieByNameAndDuration(String movieName,int duration);
//search based on conditions
    public List<Movie>findByDurationGreaterThanEqual(int duration);
    public List<Movie>findByMovieNameContaining(String movieString);
    public List<Movie>findByMovieNameIgnoreCase(String movieName);
}

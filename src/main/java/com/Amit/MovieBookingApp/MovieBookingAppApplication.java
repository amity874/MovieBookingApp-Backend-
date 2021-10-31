package com.Amit.MovieBookingApp;

import com.Amit.MovieBookingApp.Daos.MovieDao;
import com.Amit.MovieBookingApp.Entity.Movie;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.http.converter.json.GsonBuilderUtils;

/**
 * Main class of the springBoot
 */
@SpringBootApplication
public class MovieBookingAppApplication {
	public static void main(String[] args) {
		ApplicationContext ctx= SpringApplication.run(MovieBookingAppApplication.class, args);
		MovieDao movieDao=ctx.getBean(MovieDao.class);
		System.out.println(movieDao);
		/**
		 * Add a movie to Db
		 *
		 */
		Movie movie=new Movie();
		movie.setMovieId(124);
		movie.setMovieName("shaanchi");
		movie.setMovieDescription("Its a great movie");
		movie.setDuration(150);
		movie.setCoverPhotoUrl("www.shanchi/cover-photo-url");
		movie.setTrailerUrl("www.trailer");
		System.out.println("<------Before movie is stored--------->");
		System.out.println(movie);
		System.out.println("<----------After movie is stored------------->");
		Movie saved= movieDao.save(movie);
		System.out.println(saved);
		System.out.println("<-------lets Search movie based on id ");
		Movie searchMovie=movieDao.findById(saved.getMovieId()).get();
		System.out.println(searchMovie);
		System.out.println("<--------update the movie record---------->");
		System.out.println("Actual movie duration: "+searchMovie.getDuration());
		searchMovie.setDuration(250);
		Movie updatedMovie=movieDao.save(searchMovie);
		System.out.println("<-------Search by the movie name ----------->");
		Movie foundByName=movieDao.findMovieByMovieName(updatedMovie.getMovieName());
		System.out.println(foundByName);
		System.out.println("<--------- lets delete the the record ------------>");
//		movieDao.deleteById(updatedMovie.getMovieId());
	}
}

package com.stackroute.movie.services;

import com.stackroute.movie.exceptions.MovieAlreadyExistsException;
import com.stackroute.movie.exceptions.MovieNotFoundException;
import com.stackroute.movie.exceptions.NullDetailsException;
import com.stackroute.movie.domain.Movie;
import org.springframework.beans.factory.annotation.Qualifier;

import java.util.List;
@Qualifier("2")
public class MovieServicesImpl2 implements MovieServices {
    @Override
    public Movie addMovie(Movie movie) throws MovieAlreadyExistsException {
        System.out.println("inside Add Movie");
        return null;
    }

    @Override
    public List<Movie> getAllMovies() throws NullDetailsException {
        System.out.println("inside Get All Movies");
        return null;
    }

    @Override
    public Movie updateMovie(String string, int id) throws MovieNotFoundException {
        System.out.println("inside Update movie");
        return null;
    }

    @Override
    public boolean deleteMovie(int id) throws MovieNotFoundException {
        System.out.println("Inside delete Movie");
        return false;
    }

    @Override
    public Movie getByMovieId(int id) throws MovieNotFoundException {
        System.out.println("Inside Get By Id");
        return null;
    }

    @Override
    public List<Movie> getMovieByName(String string) throws MovieNotFoundException {
        System.out.println("Inside Get Movie By Name");
        return null;
    }
}

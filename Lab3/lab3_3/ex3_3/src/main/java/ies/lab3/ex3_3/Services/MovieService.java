package ies.lab3.ex3_3.Services;

import ies.lab3.ex3_3.Model.Movie;

import java.util.List;

public interface MovieService {
    Movie createMovie(Movie movie);
    Movie getMovie(Long id);

    List<Movie> getAllMovies();

    Movie updateMovie(Movie movie);

    void deleteMovie(Long id);

    Movie saveMovie(Movie m);
}

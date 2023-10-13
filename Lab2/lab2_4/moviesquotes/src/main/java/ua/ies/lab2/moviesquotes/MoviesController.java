package ua.ies.lab2.moviesquotes;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.io.*;
import java.util.*;


@RestController
public class MoviesController {

	private static final String template = "Hello, %s!";
	private final AtomicLong counter = new AtomicLong();


	@GetMapping("/quote")
	public Quote quote() {
		ArrayList<Movie> movies = new ArrayList<Movie>();
		List<Quote> quotes_1 = new ArrayList<Quote>();
		List<Quote> quotes_2 = new ArrayList<Quote>();
		List<Quote> quotes_3 = new ArrayList<Quote>();
		List<Quote> quotes_4 = new ArrayList<Quote>();

		quotes_1.add(new Quote(1, "I'm gonna make him an offer he can't refuse."));
		quotes_1.add(new Quote(2, "You talkin' to me?"));
		quotes_2.add(new Quote(3, "Get busy living, or get busy dying."));
		quotes_2.add(new Quote(4, "Hope is a good thing, maybe the best of things, and no good thing ever dies."));
		quotes_3.add(new Quote(5, "Why so serious?"));
		quotes_3.add(new Quote(6, "You either die a hero or live long enough to see yourself become the villain."));

		movies.add(new Movie(1, "The Godfather", quotes_1));
		movies.add(new Movie(2, "The Shawshank Redemption", quotes_2));
		movies.add(new Movie(3, "The Dark Knight", quotes_3));
		movies.add(new Movie(4, "The Godfather: Part II", quotes_4));

		Collections.shuffle(movies);

		List<Quote> quotes = movies.get(0).quotes();

		if (!quotes.isEmpty()) {
			Collections.shuffle(quotes);
			return quotes.get(0);
		} else {
			while (quotes.isEmpty()) {
				Collections.shuffle(movies);
				quotes = movies.get(0).quotes();
			}
			return quotes.get(0);
		}
	}

	@GetMapping("/shows")
	public Shows shows(@RequestParam(value = "name", defaultValue = "") String name) {
		ArrayList<Movie> movies = new ArrayList<Movie>();
		List<Quote> quotes_1 = new ArrayList<Quote>();
		List<Quote> quotes_2 = new ArrayList<Quote>();
		List<Quote> quotes_3 = new ArrayList<Quote>();
		List<Quote> quotes_4 = new ArrayList<Quote>();

		quotes_1.add(new Quote(1, "I'm gonna make him an offer he can't refuse."));
		quotes_1.add(new Quote(2, "You talkin' to me?"));
		quotes_2.add(new Quote(3, "Get busy living, or get busy dying."));
		quotes_2.add(new Quote(4, "Hope is a good thing, maybe the best of things, and no good thing ever dies."));
		quotes_3.add(new Quote(5, "Why so serious?"));
		quotes_3.add(new Quote(6, "You either die a hero or live long enough to see yourself become the villain."));

		movies.add(new Movie(1, "The Godfather", quotes_1));
		movies.add(new Movie(2, "The Shawshank Redemption", quotes_2));
		movies.add(new Movie(3, "The Dark Knight", quotes_3));
		movies.add(new Movie(4, "The Godfather: Part II", quotes_4));

		List<Movie> moviesWithQuotes = new ArrayList<>();
		for (Movie movie : movies) {
			if (!movie.quotes().isEmpty()) {
				moviesWithQuotes.add(movie);
			}
		}

		Shows All_shows = new Shows(1, moviesWithQuotes.toArray(new Movie[0]));
		return All_shows;
	}

	@GetMapping("/quotes")
	public Quotes quote(@RequestParam(value = "movie_name", defaultValue = "World") String movieName) {
		ArrayList<Movie> movies = new ArrayList<Movie>();
		List<Quote> quotes_1 = new ArrayList<Quote>();
		List<Quote> quotes_2 = new ArrayList<Quote>();
		List<Quote> quotes_3 = new ArrayList<Quote>();
		List<Quote> quotes_4 = new ArrayList<Quote>();

		quotes_1.add(new Quote(1, "I'm gonna make him an offer he can't refuse."));
		quotes_1.add(new Quote(2, "You talkin' to me?"));
		quotes_2.add(new Quote(3, "Get busy living, or get busy dying."));
		quotes_2.add(new Quote(4, "Hope is a good thing, maybe the best of things, and no good thing ever dies."));
		quotes_3.add(new Quote(5, "Why so serious?"));
		quotes_3.add(new Quote(6, "You either die a hero or live long enough to see yourself become the villain."));

		movies.add(new Movie(1, "The Godfather", quotes_1));
		movies.add(new Movie(2, "The Shawshank Redemption", quotes_2));
		movies.add(new Movie(3, "The Dark Knight", quotes_3));
		movies.add(new Movie(4, "The Godfather: Part II", quotes_4));

		for (Movie movie : movies) {
			if (movie.name().equals(movieName)) {
				List<Quote> quotes = movie.quotes();
				return new Quotes(1, quotes);
			}
		}
		return null;
	}
}



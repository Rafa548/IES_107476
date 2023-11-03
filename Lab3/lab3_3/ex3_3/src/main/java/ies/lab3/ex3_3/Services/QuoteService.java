package ies.lab3.ex3_3.Services;

import java.util.List;

import ies.lab3.ex3_3.Model.Quote;

public interface QuoteService {
    Quote createQuote(Quote quote);
    Quote getQuote(Long id);

    List<Quote> getAllQuotes();

    Quote updateQuote(Quote quote);

    void deleteQuote(Long id);

    Quote saveQuote(Quote q);

}

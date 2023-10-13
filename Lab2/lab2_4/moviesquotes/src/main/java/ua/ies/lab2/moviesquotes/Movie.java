package ua.ies.lab2.moviesquotes;

import java.util.List;

public record Movie(long id, String name, List<Quote> quotes) { }

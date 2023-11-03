package ies.lab3.ex3_3.Services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import lombok.AllArgsConstructor;
import org.apache.logging.log4j.util.Strings;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.List;

import ies.lab3.ex3_3.Repository.QuoteRepository;
import ies.lab3.ex3_3.Services.QuoteService;
import ies.lab3.ex3_3.Model.Quote;

@Service
@AllArgsConstructor
public class QuoteServiceImpl implements QuoteService {

    private final QuoteRepository quoteRepository;

    @Override
    public Quote createQuote(Quote quote) {
        return quoteRepository.save(quote);
    }

    @Override
    public Quote getQuote(Long id) {
        return quoteRepository.findById(id).orElse(null);
    }

    @Override
    public Quote saveQuote(Quote q) {
        return quoteRepository.save(q);
    }

    @Override
    public List<Quote> getAllQuotes() {
        return quoteRepository.findAll();
    }

    @Override
    public Quote updateQuote(Quote quote) {
        return quoteRepository.save(quote);
    }

    @Override
    public void deleteQuote(Long id) {
        quoteRepository.deleteById(id);
    }
}

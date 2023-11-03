package ies.lab3.ex3_3.Controller;

import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import ies.lab3.ex3_3.Model.Quote;
import ies.lab3.ex3_3.Services.QuoteService;

@RestController
@AllArgsConstructor
@RequestMapping("quotes")
public class QuoteController {
    private final QuoteService quoteService;

    @PostMapping
    public ResponseEntity<Quote> createQuote(@RequestBody Quote quote){
        Quote createdQuote = quoteService.createQuote(quote);
        return new ResponseEntity<>(createdQuote, HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<Quote>> getAllQuotes(){
        List<Quote> quotes = quoteService.getAllQuotes();
        return new ResponseEntity<>(quotes, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Quote> getQuote(@PathVariable("id") Long quoteId){
        Quote quote = quoteService.getQuote(quoteId);
        return new ResponseEntity<>(quote, HttpStatus.OK);
    }

    @PutMapping
    public ResponseEntity<Quote> updateQuote(@RequestBody Quote quote){
        Quote updatedQuote = quoteService.updateQuote(quote);
        return new ResponseEntity<>(updatedQuote, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteQuote(@PathVariable("id") Long quoteId){
        quoteService.deleteQuote(quoteId);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @PostMapping("/add_quote")
    public Quote addQuote(@RequestBody Quote q) {
        return quoteService.saveQuote(q);
    }
}

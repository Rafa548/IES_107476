package ies.lab3.ex3_3.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ies.lab3.ex3_3.Model.Quote;

public interface QuoteRepository  extends JpaRepository<Quote,Long>{
}

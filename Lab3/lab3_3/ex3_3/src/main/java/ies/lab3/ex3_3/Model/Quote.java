package ies.lab3.ex3_3.Model;

import jakarta.persistence.*;

import java.util.Set;

@lombok.Getter
@lombok.Setter
@lombok.NoArgsConstructor
@lombok.AllArgsConstructor
@Table(name = "quote")

@Entity
public class Quote {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long quoteId;

    @Column(nullable = false)
    private String quote;

    @Column(nullable = false)
    private Long movieId;

    @ManyToOne
    @JoinColumn(name = "movieId",insertable=false, updatable=false)
    private Movie movie;

}

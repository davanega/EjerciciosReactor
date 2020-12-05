package com.co.bancolombia;

import lombok.extern.slf4j.Slf4j;
import reactor.core.publisher.Flux;
import org.junit.jupiter.api.Test;
import reactor.util.function.Tuple2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Slf4j
public class Exercise {

    @Test
    public void Merge(){
        List<Movie> movies1 = new ArrayList<Movie>();
        List<Movie> movies2 = new ArrayList<Movie>();

        Movie movie1 = Movie.builder()
                .name("Titanic")
                .durationInMin(160)
                .score(9.5)
                .director("James Cameron")
                .build();

        Movie movie2 = Movie.builder()
                .name("Anabelle")
                .durationInMin(98)
                .score(6.9)
                .director("Jhon R. Leonetti")
                .build();

        Movie movie3 = Movie.builder()
                .name("BraveHeart")
                .durationInMin(177)
                .score(9.3)
                .director("Mel Gibson")
                .build();

        Movie movie4 = Movie.builder()
                .name("The Purge: La noche de la expiación")
                .durationInMin(85)
                .score(7.5)
                .director("James DeMonaco")
                .build();

        Movie movie5 = Movie.builder()
                .name("Avengers: End Game")
                .durationInMin(181)
                .score(8.4)
                .director("Anthony y Joe Russo")
                .build();

        movies1.add(movie1);
        movies1.add(movie2);
        movies1.add(movie3);
        movies2.add(movie4);
        movies2.add(movie5);

        Flux<Movie> moviesFlux1 = Flux.just(movie1, movie2, movie3);
        Flux<Movie> moviesFlux2 = Flux.just(movie4, movie5);

        moviesFlux1.zipWith(moviesFlux2)
                .subscribe(System.out::println);

        //Flux<Tuple2<Movie, Movie>> moviesFlux = Flux.zip(moviesFlux1, moviesFlux2);
        //moviesFlux.subscribe(System.out::println);

    }

    @Test
    public void filterByScore(){
        List<Movie> movies1 = new ArrayList<Movie>();
        List<Movie> movies2 = new ArrayList<Movie>();

        Movie movie1 = Movie.builder()
                .name("Titanic")
                .durationInMin(160)
                .score(9.5)
                .director("James Cameron")
                .build();

        Movie movie2 = Movie.builder()
                .name("Anabelle")
                .durationInMin(98)
                .score(6.9)
                .director("Jhon R. Leonetti")
                .build();

        Movie movie3 = Movie.builder()
                .name("BraveHeart")
                .durationInMin(177)
                .score(9.3)
                .director("Mel Gibson")
                .build();

        Movie movie4 = Movie.builder()
                .name("The Purge: La noche de la expiación")
                .durationInMin(85)
                .score(7.5)
                .director("James DeMonaco")
                .build();

        Movie movie5 = Movie.builder()
                .name("Avengers: End Game")
                .durationInMin(181)
                .score(8.4)
                .director("Anthony y Joe Russo")
                .build();

        movies1.add(movie1);
        movies1.add(movie2);
        movies1.add(movie3);
        movies1.add(movie4);
        movies1.add(movie5);

        Flux.fromIterable(movies1)
                .filter(movie -> movie.getScore()>8)
                .subscribe(System.out::println);
    }

    @Test
    public void filterByDuration(){
        List<Movie> movies1 = new ArrayList<Movie>();
        List<Movie> movies2 = new ArrayList<Movie>();

        Movie movie1 = Movie.builder()
                .name("Titanic")
                .durationInMin(160)
                .score(9.5)
                .director("James Cameron")
                .build();

        Movie movie2 = Movie.builder()
                .name("Anabelle")
                .durationInMin(98)
                .score(6.9)
                .director("Jhon R. Leonetti")
                .build();

        Movie movie3 = Movie.builder()
                .name("BraveHeart")
                .durationInMin(177)
                .score(9.3)
                .director("Mel Gibson")
                .build();

        Movie movie4 = Movie.builder()
                .name("The Purge: La noche de la expiación")
                .durationInMin(85)
                .score(7.5)
                .director("James DeMonaco")
                .build();

        Movie movie5 = Movie.builder()
                .name("Avengers: End Game")
                .durationInMin(181)
                .score(8.4)
                .director("Anthony y Joe Russo")
                .build();

        movies1.add(movie1);
        movies1.add(movie2);
        movies1.add(movie3);
        movies1.add(movie4);
        movies1.add(movie5);

        Flux.fromIterable(movies1)
                .filter(movie -> movie.getDurationInMin()>120)
                .subscribe(System.out::println);
    }

    @Test
    public void filterByDirector(){
        List<Movie> movies1 = new ArrayList<Movie>();
        List<Movie> movies2 = new ArrayList<Movie>();

        Movie movie1 = Movie.builder()
                .name("Titanic")
                .durationInMin(160)
                .score(9.5)
                .director("James Cameron")
                .build();

        Movie movie2 = Movie.builder()
                .name("Anabelle")
                .durationInMin(98)
                .score(6.9)
                .director("Jhon R. Leonetti")
                .build();

        Movie movie3 = Movie.builder()
                .name("BraveHeart")
                .durationInMin(177)
                .score(9.3)
                .director("Mel Gibson")
                .build();

        Movie movie4 = Movie.builder()
                .name("The Purge: La noche de la expiación")
                .durationInMin(85)
                .score(7.5)
                .director("James DeMonaco")
                .build();

        Movie movie5 = Movie.builder()
                .name("Avengers: End Game")
                .durationInMin(181)
                .score(8.4)
                .director("Anthony y Joe Russo")
                .build();

        movies1.add(movie1);
        movies1.add(movie2);
        movies1.add(movie3);
        movies1.add(movie4);
        movies1.add(movie5);

        Flux.fromIterable(movies1)
                .filter(movie -> movie.getDirector().equals("Mel Gibson"))
                .subscribe(System.out::println);
    }

}

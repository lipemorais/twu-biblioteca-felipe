package com.twu.biblioteca;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by fmorais on 8/4/15.
 */
public class MovieTest {
    @Test
    public void showDetails_ShouldReturnMovieNameDirectorYearAndRating_WhenMovieIsLordOfTheRings() throws Exception {
        Movie movie = new Movie("The Lord of The Rings", "Peter Jackson", 2001, 10);
        String expected = "The Lord of The Rings - Peter Jackson - 2001 - 10";
        assertEquals(expected, movie.showDetails());
    }

    @Test
    public void showDetails_ShouldReturnMovieNameDirectorYearAndRating_WhenMovieIsToyStory() throws Exception {
        Movie movie = new Movie("Toy Story", "John Lasseter", 1995, 10);
        String expected = "Toy Story - John Lasseter - 1995 - 10";
        assertEquals(expected, movie.showDetails());
    }
}

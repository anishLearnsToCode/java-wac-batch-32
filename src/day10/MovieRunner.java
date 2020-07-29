package day10;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class MovieRunner {
    public static void main(String[] args) {
        List<Movie> movies = new ArrayList<>();
        movies.add(new Movie("iron man", 2008, 8));
        movies.add(new Movie("breakfast at tiffany", 1960, 7));
        movies.add(new Movie("die hard", 1990, 10));
        movies.add(new Movie("die hard", 1990, 6.5));
        movies.add(new Movie("die hard", 2000, 6.5));

        System.out.println(movies);
        movies.sort(
                Comparator
                        .comparing(Movie::getName)
                        .thenComparing(Movie::getImdbRating)
                        .thenComparing(Movie::getYear)
                        .reversed()
        );
        System.out.println(movies);
    }
}

import java.util.*;
import java.util.stream.Collectors;

public class Top5TrendingMovies {

    // Movie class
    static class Movie {
        private String name;
        private double rating;
        private int releaseYear;

        public Movie(String name, double rating, int releaseYear) {
            this.name = name;
            this.rating = rating;
            this.releaseYear = releaseYear;
        }

        public String getName() {
            return name;
        }

        public double getRating() {
            return rating;
        }

        public int getReleaseYear() {
            return releaseYear;
        }
    }

    public static void main(String[] args) {

        // Source: List of movies
        List<Movie> movies = Arrays.asList(
            new Movie("Movie A", 8.5, 2023),
            new Movie("Movie B", 9.0, 2024),
            new Movie("Movie C", 7.8, 2022),
            new Movie("Movie D", 9.2, 2024),
            new Movie("Movie E", 8.9, 2023),
            new Movie("Movie F", 9.1, 2024),
            new Movie("Movie G", 8.0, 2021)
        );

        // Stream pipeline to find top 5 movies
        List<Movie> top5Movies = movies.stream()

            // Filter movies released in or after 2023
            .filter(movie -> movie.getReleaseYear() >= 2023)

            // Sort by rating (descending order)
            .sorted((m1, m2) -> Double.compare(m2.getRating(), m1.getRating()))

            // Limit result to top 5 movies
            .limit(5)

            // Collect result into a list
            .collect(Collectors.toList());

        // Print output
        System.out.println("Top 5 Trending Movies:");
        top5Movies.forEach(movie ->
            System.out.println(
                movie.getName() + " | Rating: " +
                movie.getRating() + " | Year: " +
                movie.getReleaseYear()
            )
        );
    }
}

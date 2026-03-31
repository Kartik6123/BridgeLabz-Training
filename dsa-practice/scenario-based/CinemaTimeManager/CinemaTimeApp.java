public class CinemaTimeApp {

    public static void main(String[] args) {

        CinemaManager cm = new CinemaManager();

        try {
            cm.addMovie("Inception", "18:30");
            cm.addMovie("Interstellar", "21:15");
            cm.addMovie("Avatar", "25:99"); // invalid
        } catch (InvalidTimeFormatException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("\nAll Movies:");
        cm.displayAllMovies();

        System.out.println("\nSearch Result:");
        cm.searchMovie("inter");

        cm.generateReport();
    }
}


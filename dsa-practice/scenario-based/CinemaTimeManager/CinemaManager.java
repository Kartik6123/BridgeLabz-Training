import java.util.*;

public class CinemaManager{

    List<String> titles = new ArrayList<>();
    List<String> times = new ArrayList<>();

    public void addMovie(String title, String time) throws InvalidTimeFormatException {
        if (!isValidTime(time)) {
            throw new InvalidTimeFormatException("Invalid time format: " + time);
        }
        titles.add(title);
        times.add(time);
    }

    public void searchMovie(String keyword) {
        boolean found = false;

        for (int i = 0; i < titles.size(); i++) {
            if (titles.get(i).toLowerCase().contains(keyword.toLowerCase())) {
                try {
                    System.out.println(
                        String.format("Movie: %s | Time: %s",
                            titles.get(i), times.get(i))
                    );
                    found = true;
                } catch (IndexOutOfBoundsException e) {
                    System.out.println("Index error while searching");
                }
            }
        }

        if (!found) {
            System.out.println("No movie found with keyword: " + keyword);
        }
    }

    public void displayAllMovies() {
        for (int i = 0; i < titles.size(); i++) {
            try {
                System.out.println(titles.get(i) + " -> " + times.get(i));
            } catch (IndexOutOfBoundsException e) {
                System.out.println("Index error while displaying movies");
            }
        }
    }

    public void generateReport() {
        String[] titleArr = titles.toArray(new String[0]);
        String[] timeArr = times.toArray(new String[0]);

        System.out.println("\n--- Movie Schedule Report ---");
        for (int i = 0; i < titleArr.length; i++) {
            System.out.println(titleArr[i] + " at " + timeArr[i]);
        }
    }

    private boolean isValidTime(String time) {
        if (!time.matches("\\d{2}:\\d{2}")) return false;

        String[] p = time.split(":");
        int h = Integer.parseInt(p[0]);
        int m = Integer.parseInt(p[1]);

        return h >= 0 && h <= 23 && m >= 0 && m <= 59;
    }
}


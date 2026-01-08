public class MovieManagement {
    // Inner Node class representing each movie record
    class Node {
        String movieTitle;
        String director;
        int releaseYear;
        double rating;
        Node next;
        Node prev;
        // Constructor to initialize movie details
        Node(String movieTitle, String director, int releaseYear, double rating) {
            this.movieTitle = movieTitle;
            this.director = director;
            this.releaseYear = releaseYear;
            this.rating = rating;
            this.next = null;
            this.prev = null;
        }
    }

    // Head pointer of the doubly linked list
    Node head;
    // Add a movie record at the beginning of the list
    void addAtBeginning(String movieTitle, String director, int releaseYear, double rating) {
        Node newNode = new Node(movieTitle, director, releaseYear, rating);
        if (head != null) {
            newNode.next = head;
            head.prev = newNode;
        }
        head = newNode;
    }
    // Add a movie record at the end of the list
    void addAtEnd(String movieTitle, String director, int releaseYear, double rating) {
        Node newNode = new Node(movieTitle, director, releaseYear, rating);
        if (head == null) {
            head = newNode;
            return;
        }
        Node temp = head;
        while (temp.next != null)
            temp = temp.next;

        temp.next = newNode;
        newNode.prev = temp;
    }

    // Add a movie record at a specific position
    void addAtPosition(int position, String movieTitle, String director, int releaseYear, double rating) {
        if (position == 1) {
            addAtBeginning(movieTitle, director, releaseYear, rating);
            return;
        }
        Node temp = head;
        for (int i = 1; i < position - 1 && temp != null; i++)
            temp = temp.next;

        if (temp == null)
            return;

        Node newNode = new Node(movieTitle, director, releaseYear, rating);
        newNode.next = temp.next;
        newNode.prev = temp;

        if (temp.next != null)
            temp.next.prev = newNode;

        temp.next = newNode;
    }

    // Delete a movie record using movie title
    void deleteByMovieTitle(String movieTitle) {
        if (head == null)
            return;

        if (head.movieTitle.equals(movieTitle)) {
            head = head.next;
            if (head != null)
                head.prev = null;
            return;
        }

        Node temp = head;
        while (temp != null && !temp.movieTitle.equals(movieTitle))
            temp = temp.next;

        if (temp == null)
            return;

        if (temp.next != null)
            temp.next.prev = temp.prev;

        temp.prev.next = temp.next;
    }

    // Search and display movies by director name
    void searchByDirector(String director) {
        Node temp = head;
        boolean found = false;
        while (temp != null) {
            if (temp.director.equalsIgnoreCase(director)) {
                System.out.println(temp.movieTitle + " " + temp.director + " " +
                        temp.releaseYear + " " + temp.rating);
                found = true;
            }
            temp = temp.next;
        }
        if (!found)
            System.out.println("No movies found for director " + director);
    }

    // Search and display movies by rating
    void searchByRating(double rating) {
        Node temp = head;
        boolean found = false;
        while (temp != null) {
            if (temp.rating == rating) {
                System.out.println(temp.movieTitle + " " + temp.director + " " +
                        temp.releaseYear + " " + temp.rating);
                found = true;
            }
            temp = temp.next;
        }
        if (!found)
            System.out.println("No movies found with rating " + rating);
    }

    // Display all movie records
    void display() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.movieTitle + " " + temp.director + " " +
                    temp.releaseYear + " " + temp.rating);
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        MovieManagement mm = new MovieManagement();

        mm.addAtEnd("Inception", "Christopher Nolan", 2010, 8.8);
        mm.addAtBeginning("The Matrix", "The Wachowskis", 1999, 8.7);
        mm.addAtPosition(2, "Interstellar", "Christopher Nolan", 2014, 8.6);

        mm.searchByDirector("Christopher Nolan");
        mm.searchByRating(8.7);

        mm.deleteByMovieTitle("The Matrix");
        mm.display();
    }
}

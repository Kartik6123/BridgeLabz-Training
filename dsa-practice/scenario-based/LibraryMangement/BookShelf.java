import java.util.*;

public class BookShelf {

    private Map<String, LinkedList<Book>> catalog = new HashMap<>();
    private Set<String> uniqueBooks = new HashSet<>();

    public void addBook(String genre, String title, String author) {

        if (uniqueBooks.contains(title)) {
            System.out.println("Duplicate book ignored: " + title);
            return;
        }

        catalog.putIfAbsent(genre, new LinkedList<>());
        catalog.get(genre).add(new Book(title, author));
        uniqueBooks.add(title);

        System.out.println("Added: " + title);
    }

    public void removeBook(String genre, String title) {

        LinkedList<Book> list = catalog.get(genre);
        if (list == null) {
            System.out.println("Genre not found");
            return;
        }

        Iterator<Book> it = list.iterator();
        while (it.hasNext()) {
            Book b = it.next();
            if (b.title.equals(title)) {
                it.remove();
                uniqueBooks.remove(title);
                System.out.println("Removed: " + title);
                return;
            }
        }

        System.out.println("Book not found");
    }

    public void displayCatalog() {

        for (String genre : catalog.keySet()) {
            System.out.println("\nGenre: " + genre);
            for (Book b : catalog.get(genre)) {
                System.out.println("  " + b);
            }
        }
    }
}

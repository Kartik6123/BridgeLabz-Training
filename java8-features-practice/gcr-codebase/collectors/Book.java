import java.util.*;
import java.util.stream.*;

public class Book {
    String g;
    int p;
    Book(String g, int p) { this.g = g; this.p = p; }
    String getGenre() { return g; }
    int getPages() { return p; }
}

  class Main {
    public static void main(String[] args) {

        List<Book> l = Arrays.asList(
            new Book("Fiction", 300),
            new Book("Fiction", 450),
            new Book("Drama", 200)
        );

        Map<String, IntSummaryStatistics> m =
            l.stream().collect(
                Collectors.groupingBy(
                    Book::getGenre,
                    Collectors.summarizingInt(Book::getPages)
                )
            );

        System.out.println(m);
    }
}

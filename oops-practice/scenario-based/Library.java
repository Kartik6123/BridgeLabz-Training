import java.util.*;

class BookNotAvailableException extends Exception {
    BookNotAvailableException(String msg) {
        super(msg);
    }
}

class Book {
    String title;
    String author;
    boolean isAvailable;

    Book(String title, String author, boolean isAvailable) {
        this.title = title;
        this.author = author;
        this.isAvailable = isAvailable;
    }
}

class LibrarySystem {

    static void displayBooks(List<Book> books) {
        for (Book b : books) {
            System.out.println(
                b.title + " | " + b.author + " | " +
                (b.isAvailable ? "Available" : "Checked Out")
            );
        }
    }

    static void searchByTitle(List<Book> books, String keyword) {
        boolean found = false;

        for (Book b : books) {
            // partial title search using contains()
            if (b.title.toLowerCase().contains(keyword.toLowerCase())) {
                System.out.println(b.title + " by " + b.author);
                found = true;
            }
        }

        if (!found) {
            System.out.println("No matching books found");
        }
    }

    static void checkoutBook(List<Book> books, String title)
            throws BookNotAvailableException {

        for (Book b : books) {
            if (b.title.equalsIgnoreCase(title)) {
                if (!b.isAvailable) {
                    throw new BookNotAvailableException("Book already checked out");
                }
                b.isAvailable = false;
                System.out.println("Book checked out successfully");
                return;
            }
        }
        System.out.println("Book not found");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // storing book data in array
        Book[] bookArray = {
            new Book("Java Basics", "James", true),
            new Book("Data Structures", "Mark", true),
            new Book("Operating Systems", "Andrew", false),
            new Book("Clean Code", "Robert", true)
        };

        List<Book> books = new ArrayList<>(Arrays.asList(bookArray));

        while (true) {
            System.out.println("\n1.Display  2.Search  3.Checkout  4.Exit");
            int choice = sc.nextInt();
            sc.nextLine();

            try {
                if (choice == 1) {
                    displayBooks(books);
                } else if (choice == 2) {
                    System.out.print("Enter title keyword: ");
                    searchByTitle(books, sc.nextLine());
                } else if (choice == 3) {
                    System.out.print("Enter book title: ");
                    checkoutBook(books, sc.nextLine());
                } else {
                    break;
                }
            } catch (BookNotAvailableException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}

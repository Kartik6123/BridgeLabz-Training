import java.util.Scanner;

public class LibraryManagement {

    static String[] titles = {
        // Sample book titles
            "Java Programming",
            "Data Structures",
            "Operating Systems",
            "Clean Code",
            "Computer Networks"
    };

    static String[] authors = {
        // Corresponding authors
            "James Gosling",
            "Mark Allen Weiss",
            "Silberschatz",
            "Robert Martin",
            "Andrew Tanenbaum"
    };

    static boolean[] isAvailable = {
        // Availability status
            true, true, true, true, true
    };

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        displayBooks();

        System.out.print("Enter partial book title to search: ");
        String keyword = sc.nextLine();

        int index = searchBook(keyword);

        if (index != -1) {
            checkoutBook(index);
        } else {
            System.out.println("Book not found.");
        }
    }

    static void displayBooks() {
        System.out.println(" Library Books:");
        for (int i = 0; i < titles.length; i++) {
            System.out.println(
                (i + 1) + ". " + titles[i] + " by " + authors[i] +
                " [" + (isAvailable[i] ? "Available" : "Checked Out") + "]"
            );
        }
    }

    static int searchBook(String keyword) {// searching for book by partial title
        for (int i = 0; i < titles.length; i++) {
            if (titles[i].toLowerCase().contains(keyword.toLowerCase())) {
                System.out.println("\nBook Found: " + titles[i]);
                return i;
            }
        }
        return -1;
    }

    static void checkoutBook(int index) {// checking out the book if available
        if (isAvailable[index]) {
            isAvailable[index] = false;
            System.out.println(" Book checked out successfully.");
        } else {
            System.out.println(" Book already checked out.");
        }
    }
}


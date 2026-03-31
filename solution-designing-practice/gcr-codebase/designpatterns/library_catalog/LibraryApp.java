package library_catalog;

public class LibraryApp {

    public static void main(String[] args) {

        LibraryCatalog catalog = LibraryCatalog.getInstance();

        LibraryUser student = UserFactory.createUser("student", "Abhinav");
        LibraryUser faculty = UserFactory.createUser("faculty", "Dr. Sharma");

        catalog.registerObserver(student);
        catalog.registerObserver(faculty);

        Book book = new Book.BookBuilder("Data Structures by Cormen")
                .addAuthor("Thomas H. Cormen")
                .edition("4th Edition")
                .genre("Computer Science")
                .publisher("MIT Press")
                .build();

        catalog.addBook(book);
    }
}
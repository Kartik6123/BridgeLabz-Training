package javakeywords;
class Book{
    static String libraryName;
    String title;
    String author;
    final String isbn;

    static void displayLibraryName() {
        // static method
        System.out.println("Library: " + libraryName);
    }
    Book(String title, String author, String isbn) {
        // constructor
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }
    void displayDetails() {
        // instance method
        if(this instanceof Book){
            // using 'this' keyword
            System.out.println("Title: " + title + ", Author: " + author + ", ISBN: " + isbn);
        }
    }
    public static void main(String[] args) {
        Book.libraryName = "City Library";
        Book.displayLibraryName();

        Book book1 = new Book("1984", "George Orwell", "123-4567890123");
        Book book2 = new Book("To Kill a Mockingbird", "Harper Lee", "987-6543210987");

        book1.displayDetails();
        book2.displayDetails();
    }
}
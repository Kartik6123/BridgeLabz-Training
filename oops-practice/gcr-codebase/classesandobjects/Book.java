package classesandobjects;
public class Book {
    String title;
    String author;
     double price;
    Book(String title, String author, double price){
        //constructor to initialize book details
        this.title = title;
        this.author = author;
        this.price = price; 
    }
    void display(){
        //method to display book details
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
    }
    public static void main(String[] args) {
        Book book = new Book("2 States", "Chetan Bhagat", 500.0);
        book.display();
    }
}

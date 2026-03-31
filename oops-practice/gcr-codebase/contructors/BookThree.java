package contructors;
public class BookThree {
    public String Isbn;
    protected String title;
    private String author;
    BookThree() {
        // default constructor
        this.Isbn = "";
        this.title = "";
        this.author = "";
    }
    BookThree(String Isbn, String title, String author) {
        // parameterized constructor
        this.Isbn = Isbn;
        this.title = title;
        this.author = author;
    }
    String getAuthor() {
        // getter method
        return this.author;
    }
    String setAuthor(String newAuthor) {
        //  setter method
        this.author = newAuthor;
        return this.author;
    }
}
 class Ebook extends BookThree{
    // subclass
    Ebook(){
        super();
        // default constructor pointing to parent class
    }
    Ebook(String Isbn, String title, String author){
        super(Isbn, title, author);
        // parameterized constructor pointing to parent class
    }
    void display(){
        System.out.println("Isbn: " + this.Isbn);
        System.out.println("Title: " + this.title);
        System.out.println("Author: " + this.getAuthor());
    }
 }
    class Main{
        public static void main(String[] args) {
            Ebook ebook = new Ebook("978-3-16-148410-0", "Java Programming", "Jane Smith");
            ebook.display();
        }
    }

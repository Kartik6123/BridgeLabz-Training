package inheritance;

public class Book {
    //parent class
    String title;
    String publicationYear;
    Book(String title, String publicationYear){
        this.title=title;
        this.publicationYear=publicationYear;
    }
    void displayDetails(){
     System.out.println("Title :"+title);
     System.out.println("Publication Year :"+publicationYear);
    }
}
class Author extends Book{
    //subclass
    String name;
    String bio;
    Author(String title, String publicationYear, String name, String bio){
        //constructor
        super(title, publicationYear);
        this.name=name;
        this.bio=bio;
    }
    void display(){
     System.out.println("Title :"+title);
     System.out.println("Publication Year :"+publicationYear);
     System.out.println("Author Name :"+name);
     System.out.println("Author Bio :"+bio);
    }
}


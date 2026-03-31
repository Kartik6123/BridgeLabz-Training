package library_catalog;

public abstract class LibraryUser implements Observer {

    protected String name;

    public LibraryUser(String name) {
        this.name = name;
    }

    @Override
    public void update(String bookTitle) {
        System.out.println(name + " notified: Book available -> " + bookTitle);
    }
}
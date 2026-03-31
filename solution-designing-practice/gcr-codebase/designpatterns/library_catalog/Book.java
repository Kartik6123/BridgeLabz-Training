package library_catalog;

import java.util.*;

public class Book {

    private String title;
    private List<String> authors;
    private String edition;
    private String genre;
    private String publisher;

    private Book(BookBuilder builder) {
        this.title = builder.title;
        this.authors = builder.authors;
        this.edition = builder.edition;
        this.genre = builder.genre;
        this.publisher = builder.publisher;
    }

    public String getTitle() {
        return title;
    }

    public static class BookBuilder {

        private String title;
        private List<String> authors = new ArrayList<>();
        private String edition;
        private String genre;
        private String publisher;

        public BookBuilder(String title) {
            this.title = title;
        }

        public BookBuilder addAuthor(String author) {
            authors.add(author);
            return this;
        }

        public BookBuilder edition(String edition) {
            this.edition = edition;
            return this;
        }

        public BookBuilder genre(String genre) {
            this.genre = genre;
            return this;
        }

        public BookBuilder publisher(String publisher) {
            this.publisher = publisher;
            return this;
        }

        public Book build() {
            return new Book(this);
        }
    }
}
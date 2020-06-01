package rpis81.fedorov.oop.model;

public class Book extends AbstractWork {
    public Book(String name, Author[] authors, Genre genre) {
        super(name, authors, genre);
    }

    public Book(String name, Author[] authors) {
        super(name, authors);
    }
}

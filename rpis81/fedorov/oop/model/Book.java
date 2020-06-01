package rpis81.fedorov.oop.model;

public class Book extends AbstractWork {
    public Book(String name, Author[] authors, Genre genre) {
        super(name, authors, genre);
    }

    public Book(String name, Author[] authors) {
        super(name, authors);
    }

    @Override
    public String toString() {
        return String.format("Book: %s",super.toString());
    }

    @Override
    public int hashCode() {
        return super.hashCode()*71;
    }
}

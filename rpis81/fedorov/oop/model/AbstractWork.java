package rpis81.fedorov.oop.model;

public abstract class AbstractWork implements Work, Printing {
    String name;
    Author[] authors;

    protected AbstractWork(String name, Author[] authors)
    {
        this.name=name;
        this.authors=authors.clone();
    }

    protected AbstractWork(String name, Author[] authors,Genre genre)
    {
        this.name=name;
        this.authors=authors.clone();
        this.genre=genre;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Author[] getAuthors() {
        return authors.clone();
    }

    public void setAuthors(Author[] authors) {
        this.authors = authors.clone();
    }

    public boolean isAuthor(Author author)
    {
        for (Author a:authors) {
            if(a.equals(author))return true;
        }
        return false;
    }

    public boolean isFolk()
    {
        return name.equals("")&&authors.length==0;
    }

    Genre genre;

    @Override
    public Genre getGenre() {
        return genre;
    }

    @Override
    public void setGenre(Genre genre) {
        this.genre=genre;
    }
}

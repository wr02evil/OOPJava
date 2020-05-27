package rpis81.fedorov.oop.model;

public class Article implements Work{
    String name;
    Author[] authors;

    public Article(String name, Author[] authors)
    {
        this.name=name;
        this.authors=authors.clone();
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
}

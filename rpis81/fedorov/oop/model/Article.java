package rpis81.fedorov.oop.model;

public class Article extends AbstractWork implements Work{
    String name;
    Author[] authors;

    public Article(String name, Author[] authors)
    {
        super(name, authors);
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
    @Override
    public final void setGenre(Genre genre) {

    }

    @Override
    public String toString() {
        String s= String.format("Article: %s, authors:\n",name);
        for (Author a:authors) {
            s=String.format("%s%s\n",s,a.toString());
        }
        return s;
    }

    @Override
    public int hashCode() {
        return super.hashCode()*53;
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}

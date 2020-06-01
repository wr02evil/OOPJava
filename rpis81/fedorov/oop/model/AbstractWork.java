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

    @Override
    public String toString() {
        String s= String.format("%s, authors:\n",name);
        for (Author a:authors) {
            s=String.format("%s%s\n",s,a.toString());
        }
        return s;
    }

    @Override
    public int hashCode() {
        int hash=name.hashCode();
        for (Author a:authors) {
            hash^=a.hashCode();
        }
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if(!obj.getClass().equals(AbstractWork.class))
            return false;
        AbstractWork work= (AbstractWork) obj;
        if(work.getAuthors().length!=authors.length)return false;
        for (Author a:authors)
            if(!work.isAuthor(a))return false;
            return true;
    }
}

package rpis81.fedorov.oop.model;

import java.util.ArrayList;

public class Magazine implements WorkCompilation,Printing{
    Article[] articles;

    public Magazine(){
        articles=new Article[16];
        genre=Genre.OTHER;
    }

    public Magazine(int capacity,Genre genre){
        articles=new Article[capacity];
        this.genre=genre;
    }

    public Magazine(Work[] articles,Genre genre){
        this.articles= (Article[]) articles.clone();
        this.genre=genre;
    }

    public boolean add(Work article)
    {
        for(int i=0;i<articles.length;i++)
        {
            if(articles[i]==null)
            {
                articles[i]= (Article) article;
                return true;
            }
        }
        doubleCapacity();
        add(article);
        return true;
    }

    protected void doubleCapacity()
    {
        Work[] articles1=new Work[articles.length*2];
        for(int i=0;i<articles.length;i++)
        {
            articles1[i]=articles[i];
        }
        articles= (Article[]) articles1;
    }

    public boolean add(Work article, int index)
    {
        if(index<articles.length&&articles[articles.length-1]==null) {
            for (int i = articles.length - 2; i > index; i--) {
                articles[i+1] = articles[i];
            }
            articles[index]= (Article) article;
            return true;
        }


        doubleCapacity();
        add(article,index);
        return true;
    }

    public Work getWork(int index) {
        return articles[index];
    }

    @Override
    public Work setWork(Work work) {
        return null;
    }


    public Work setWork(Work article,int index) {
        Work a=articles[index];
        articles[index] = (Article) article;
        return a;
    }

    public Work remove(int index)
    {
        Work a=articles[index];

        for (int i = index; i < articles.length; i++) {
            articles[i+1] = articles[i];
        }
        return a;
    }

    public int removeAll(String name)
    {
        int quantity=0;
        for(int i=0;i<articles.length;i++)
        {
            if(articles[i].name.equals(name)) {
                remove(i--);
                quantity++;
            }
        }
        return quantity;
    }

    public int count()
    {
        int quantity=0;
        for(int i=0;i<articles.length;i++)
        {
            if(articles[i]!=null) {
                quantity++;
            }
        }
        return quantity;
    }

    public Article[] getWorks() {
        ArrayList<Article> arrayList=new ArrayList<>();
        for(int i=0;i<articles.length;i++)
        {
            if(articles[i]!=null)arrayList.add(articles[i]);
        }
        return (Article[]) arrayList.toArray();
    }

    public Article[] getWorks(Author author) {
        ArrayList<Article> arrayList=new ArrayList<>();
        for(int i=0;i<articles.length;i++)
        {
            if(articles[i]!=null&& articles[i].isAuthor(author))arrayList.add(articles[i]);
        }
        return (Article[]) arrayList.toArray();
    }

    @Override
    public Work[] getWorks(String name) {
        return new Work[0];
    }


    @Override
    public String getName() {
        return null;
    }

    @Override
    public void setName(String name) {

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
        StringBuilder s= new StringBuilder();
        s.append("Magazine '").append(getName()).append("', ").append(genre);
        s.append("\nWorks:\n");
        for (Article a:articles) {
            s.append(a.toString()).append('\n');
        }
        return s.toString();
    }

    @Override
    public int hashCode() {
        return 31*getName().hashCode()*genre.hashCode()*articles.length;
    }

    @Override
    public boolean equals(Object obj) {
        return obj.getClass().equals(Magazine.class)&&
                ((Magazine)obj).getName().equals(getName())&&
                ((Magazine)obj).articles.length==articles.length;
    }
}

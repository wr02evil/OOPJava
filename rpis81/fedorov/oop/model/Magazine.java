package rpis81.fedorov.oop.model;

import java.util.ArrayList;
import java.util.Arrays;

public class Magazine {
    Article[] articles;

    public Magazine(){
        articles=new Article[16];
    }

    public Magazine(int capacity){
        articles=new Article[capacity];
    }

    public Magazine(Article[] articles){
        this.articles=articles.clone();
    }

    public boolean add(Article article)
    {
        for(int i=0;i<articles.length;i++)
        {
            if(articles[i]==null)
            {
                articles[i]=article;
                return true;
            }
        }
        doubleCapacity();
        add(article);
        return true;
    }

    protected void doubleCapacity()
    {
        Article[] articles1=new Article[articles.length*2];
        for(int i=0;i<articles.length;i++)
        {
            articles1[i]=articles[i];
        }
        articles=articles1;
    }

    public boolean add(Article article, int index)
    {
        if(index<articles.length&&articles[articles.length-1]==null) {
            for (int i = articles.length - 2; i > index; i--) {
                articles[i+1] = articles[i];
            }
            articles[index]=article;
            return true;
        }


        doubleCapacity();
        add(article,index);
        return true;
    }

    public Article getArticle(int index) {
        return articles[index];
    }

    public Article setArticle(Article article,int index) {
        Article a=articles[index];
        articles[index] = article;
        return a;
    }

    public Article remove(int index)
    {
        Article a=articles[index];

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

    public Article[] getArticles() {
        ArrayList<Article> arrayList=new ArrayList<>();
        for(int i=0;i<articles.length;i++)
        {
            if(articles[i]!=null)arrayList.add(articles[i]);
        }
        return (Article[]) arrayList.toArray();
    }

    public Article[] getArticles(Author author) {
        ArrayList<Article> arrayList=new ArrayList<>();
        for(int i=0;i<articles.length;i++)
        {
            if(articles[i]!=null&& articles[i].isAuthor(author))arrayList.add(articles[i]);
        }
        return (Article[]) arrayList.toArray();
    }

}

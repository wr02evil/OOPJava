package rpis81.fedorov.oop;

import rpis81.fedorov.oop.model.Article;
import rpis81.fedorov.oop.model.Author;
import rpis81.fedorov.oop.model.Magazine;

public class Test {
    public static void lab1test(){
        Author author=new Author("Иван","Иванов","Иванович");
        Author[] authors={author,new Author()};
        Article article=new Article("Как кодить?",authors);
        Article[] articles={article, new Article("",authors)};
        Magazine magazine=new Magazine(articles);
        magazine.getArticle(0);
        magazine.removeAll("Как кодить");
    }
}

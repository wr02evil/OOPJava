package rpis81.fedorov.oop;

import rpis81.fedorov.oop.model.*;

public class Test {
    public static void lab1test(){
    /*    Author author=new Author("Иван","Иванов","Иванович");
        Author[] authors={author,new Author()};
        Article article=new Article("Как кодить?",authors);
        Article[] articles={article, new Article("",authors)};
        Magazine magazine=new Magazine(articles);
        magazine.getWork(0);
        magazine.removeAll("Как кодить");*/
    }

    public static void lab2test(){
        /*lab1test();

        Catalogue catalogue=new Catalogue();
        catalogue.add(new Printing() {
            @Override
            public String getName() {
                return "1";
            }

            @Override
            public void setName(String name) {

            }
        });
        catalogue.removeAll("1");*/
    }

    public static void lab3test(){
        Author[] authors={new Author("Вася","Пупкин","Лентяивич"),
                new Author("Иван","Криворуков","Иванович")};
        Book book=new Book("Искуство кода", authors, Genre.FANTASY);
        System.out.println(book.getAuthors());
        System.out.println(book.getGenre());
    }
}


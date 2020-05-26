package rpis81.fedorov.oop.model;

public class Author {
    String name;
    String surname;
    String secondName;

    public Author(){
        this.name="";
        this.surname="";
        this.secondName="";
    }

    public Author(String name,
            String surname,
            String secondName){
        this.name=name;
        this.surname=surname;
        this.secondName=secondName;
    }

    public String getSurname(){
        return surname;
    }

    public String getName(){
        return name;
    }

    public String getSecondName(){
        return secondName;
    }

    @Override
    public boolean equals(Object obj) {
        Author author=(Author)obj;
        return name.equals(author.name)&&secondName.equals(author.secondName)&&
                surname.equals(author.surname);
    }
}

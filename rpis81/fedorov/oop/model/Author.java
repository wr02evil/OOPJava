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
    public String toString() {
        return String.format("%s %s %s",surname,name,secondName);
    }

    @Override
    public int hashCode() {
        return name.hashCode()^surname.hashCode()^secondName.hashCode();
    }
    @Override
    public boolean equals(Object obj) {
        return obj.getClass().equals(Author.class) &&
                ((Author) obj).secondName.equals(secondName) &&
                ((Author) obj).surname.equals(surname) &&
                ((Author) obj).name.equals(name);
    }
}

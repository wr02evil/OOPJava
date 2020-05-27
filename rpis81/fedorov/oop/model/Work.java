package rpis81.fedorov.oop.model;

public interface Work {
    public Author[] getAuthors();
    public void setAuthors(Author[] authors);
    public boolean isAuthor(Author author);
    public boolean isFolk();
}

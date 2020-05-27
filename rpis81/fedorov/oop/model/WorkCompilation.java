package rpis81.fedorov.oop.model;

public interface WorkCompilation {
    public boolean add(Work work);
    public boolean add(Work work,int index);
    public Work getWork(int index);
    public Work setWork(Work work);
    public Work remove(int index);
    public int removeAll(String name);
    public int count();
    public Work[] getWorks();
    public Work[] getWorks(Author author);
    public Work[] getWorks(String name);
}

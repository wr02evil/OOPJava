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
    public boolean delete(Work work);
    public int firstIndex(Work work);
    public int lastIndex(Work work);
    public boolean delete(Printing printing);
    public int firstIndex(Printing printing);
    public int lastIndex(Printing printing);
}

package rpis81.fedorov.oop.model;

import java.util.ArrayList;

public class Catalogue {
    Node head;
    Node tail;
    int quantity;

    public Catalogue()
    {
        tail=new Node();
        head=new Node();
        head.next=tail;
    }

    public Catalogue(Printing[] printings)
    {
        head=new Node();
        head.current=printings[0];
        head.next=new Node();
        Node node=head.next;
        for(int i=1;i<printings.length-1;i++)
        {
            node.current=printings[i];
            node.next=new Node();
            node=node.next;
        }
        tail=node;
        tail.current=printings[printings.length-1];
    }

    public boolean add(Printing printing)
    {
        tail.next=new Node();
        tail=tail.next;
        tail.current=printing;
        return true;
    }

    public boolean add(Printing printing,int index)
    {
        Node node=head;
        for(int i=0;i<index;i++)
        {
            node=node.next;
        }
        Node node1=node.next;
        node.next=new Node();
        node.next.current=printing;
        node.next.next=node1;
        return true;
    }

    public Printing get(int index)
    {
        Node node=head;
        for(int i=0;i<index;i++)
        {
            node=node.next;
        }
        return node.current;
    }

    public Printing remove(int index)
    {
        Node node=head;
        for(int i=0;i<index;i++)
        {
            node=node.next;
        }

        Node deleted=node.next;
        node.next=node.next.next;
        return deleted.current;
    }

    public Printing set(Printing printing,int index)
    {
        Node node=head;
        for(int i=0;i<index;i++)
        {
            node=node.next;
        }
        Printing printing1=node.current;
        node.current=printing;
        return printing1;
    }

    public int removeAll(String name)
    {
        Node node=head;
        int quantity=0;
        while (node!=tail)
        {
            if(node.next.current.getName().equals(name))
            {
                node.next=node.next.next;
                quantity++;
            }
            else node=node.next;
        }
        return quantity;
    }

    public int count(){
        Node node=head;
        int quantity=0;
        while (node!=tail)
        {quantity++;
        node=node.next;}
        return quantity;
    }

    public Printing[] getAll()
    {
        Node node=head;
        ArrayList<Printing> printings=new ArrayList<>();
        while (node!=tail)
        {
            printings.add(node.current);
            node=node.next;
        }
        return (Printing[]) printings.toArray();
    }

    public Printing[] getAll(String name)
    {
        Node node=head;
        ArrayList<Printing> printings=new ArrayList<>();
        while (node!=tail)
        {
            if(node.current.getName().equals(name))
            printings.add(node.current);
            node=node.next;
        }
        return (Printing[]) printings.toArray();
    }

    public int getQuantity()
    {
        return quantity;
    }

    public Printing[] getAll(Genre genre)
    {
        Node node=head;
        ArrayList<Printing> printings=new ArrayList<>();
        while (node!=tail)
        {
            if(node.current.getGenre().equals(genre))
                printings.add(node.current);
            node=node.next;
        }
        return (Printing[]) printings.toArray();
    }

    @Override
    public String toString() {
        return String.format("Catalogue has %d works",quantity);
    }


}

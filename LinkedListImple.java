

public class LinkedListImple {
    Node head;

    static class Node{
        int data;
        Node next;

        Node(int d)
        {
            data = d;
            next = null;
        }
    }

    public static LinkedListImple insert(LinkedListImple l, int data)
    {
        Node new_node = new Node(data);
        new_node.next = null;

        if(l.head == null)
            l.head = new_node;
        else
        {
            Node temp = l.head;
            while (temp.next!=null)
            {
                temp = temp.next;
            }
            temp.next = new_node;
        }
        return l;
    }
    public static LinkedListImple delete(LinkedListImple l,int k)
    {
        Node start = l.head;
        Node prev = null;

        if(start!=null && start.data == k)
        {
            l.head = start.next;
            System.out.println("Deleted");
            return l;
        }
        while(start!=null && start.data!=k)
        {
            prev = start;
            start = start.next;
        }
        if(start!=null)
        {
            prev.next = start.next;
            System.out.println("Deleted");
        }
        if(start == null)
        {
            System.out.println("NOt found");
        }
        return l;
    }
    public static void print(LinkedListImple l)
    {
        Node start = l.head;
        while (start!=null)
        {
            System.out.println(start.data);
            start = start.next;
        }
    }

    public static void main(String[] args) {
        LinkedListImple li = new LinkedListImple();
        li = insert(li, 1);
        li = insert(li, 2);
        li = insert(li,3);
        li = insert(li,4);
        li = insert(li,5);

        print(li);

        delete(li,1);
        print(li);

        delete(li,4);

        print(li);

        delete(li,5);

        print(li);
    }

}

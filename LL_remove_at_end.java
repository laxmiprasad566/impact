//wac to remove nth element from a linked list
class Node
{
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}
class LinkedList
{
    Node head;
    void append(int data)
    {
        Node newNode= new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next=newNode;
    }

    void remove_head()
    {
        if (head == null)
        {
            System.out.println("List is empty");
        }
        head = head.next;
    }

    void RemoveAtPos(int pos)
    {
        Node temp=head;
        if (pos == 0)
        {
            head = head.next;
        }
        for(int i = 0;temp != null && i <pos-1;i++) {
            temp=temp.next;
        }
        temp.next=temp.next.next;
    }
    void remove_at_end()
    {
        Node temp = head;
        while (temp.next.next != null) {
            temp = temp.next;
        }
        temp.next = null;
    }
    void printList() 
    {
        Node temp = head;
        while (temp != null) 
        {
            System.out.print(temp.data + " >> ");
            temp = temp.next;
        }
        System.out.println("Null");
    }
}

public class LL_remove_at_end {
    public static void main(String[] args) 
    {
        LinkedList Bucket = new LinkedList();
        Bucket.append(18);
        Bucket.append(45);
        Bucket.append(7);
        Bucket.append(10);  
        Bucket.printList();
        Bucket.remove_at_end();
        Bucket.printList();
    }
}
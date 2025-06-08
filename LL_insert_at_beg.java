class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList {
    Node head;
    void append(int data) {
        Node newNode = new Node(data);
        if (head == null) 
        {
            head = newNode;
            return;
        }
        
        Node temp = head;
        while (temp.next != null) 
        {
            temp = temp.next;
        }
        temp.next = newNode;
    }
    void insert_at_begg(int data) {
        Node node = new Node(data);
        node.next = head;
        head = node;

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

public class LL_insert_at_beg {
    public static void main(String[] args) 
    {
        LinkedList Bucket = new LinkedList();
        Bucket.append(18);
        Bucket.append(45);
        Bucket.append(7);
        Bucket.append(10);
        Bucket.insert_at_begg(1);
        Bucket.printList();
    }
}
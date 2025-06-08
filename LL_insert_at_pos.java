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
    void insertAtPosition(int data, int position) {
    Node newNode = new Node(data);

    if (position < 0) {
        System.out.println("Invalid position");
        return;
    }

    if (position == 0) {
        newNode.next = head;
        head = newNode;
        return;
    }

    Node temp = head;
    for (int i = 0; i < position - 1 && temp != null; i++) {
        temp = temp.next;
    }

    if (temp == null) {
        System.out.println("Position out of bounds");
        return;
    }

    newNode.next = temp.next;
    temp.next = newNode;
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

public class LL_insert_at_pos {
    public static void main(String[] args) 
    {
        LinkedList Bucket = new LinkedList();
        Bucket.append(18);
        Bucket.append(45);
        Bucket.append(7);
        Bucket.append(10);
        Bucket.insertAtPosition(2,2);   
        Bucket.printList();
    }
}
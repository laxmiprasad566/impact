//wac 
//wac to count even and odd elemnets in the linkedlist
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
    void append(int data)
    {
        Node newNode = new Node(data);
        if (head == null)
        {
            head = newNode;
            return;
        }
        Node temp = head;
        while(temp.next != null) {
            temp = temp.next;
        }
        temp.next=newNode;
    }
    void Reverse()
    {
        Node current=head;
        Node pre = null;
        Node next=null;
        while (current != null) {
            next = current.next;
            current.next = pre;
            pre = current;
            current = next;
        }
        head = pre;
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

class LL_reverse
{
    public static void main(String[] args) 
    {
        LinkedList Bucket = new LinkedList();
        Bucket.append(18);
        Bucket.append(45);
        Bucket.append(7);
        Bucket.append(10);  
        Bucket.printList();
        Bucket.Reverse();
        Bucket.printList();
    }
}
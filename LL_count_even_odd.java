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

    void count()
    {
        Node temp=head;
        int e = 0, o=0;
        while(temp != null) {
        if(temp.data % 2 == 0)
            e++;
        else
            o++;
        temp=temp.next;
        }
        System.out.println("Even numbers: "+e);
        System.out.println("Odd numbers: "+o);
    }
}

class LL_count_even_odd
{
    public static void main(String[] args) 
    {
        LinkedList Bucket = new LinkedList();
        Bucket.append(18);
        Bucket.append(45);
        Bucket.append(7);
        Bucket.append(10);  
        Bucket.count();
    }
}
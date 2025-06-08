//doubly linked list
class Node{
    Node prev;
    int data;
    Node next;

    Node(int data)
    {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}
class DoublyLinkedList
{
    Node head;
    void append(int data)
    {
        Node newNode= new Node(data);
        if(head == null)
        {
            head=newNode;
            return;
        }
        Node temp = head;
        while(temp.next != null)
        {
            temp = temp.next;
        }
        temp.next = newNode;
        newNode.prev = temp;
    }

    void appendAtBeg(int data)
    {
       Node newNode= new Node(data);
        if(head == null)
        {
            head=newNode;
            return;
        } 
        Node temp = head;
        temp.prev=newNode;
        newNode.next=temp;
        head = newNode;
    }
    void appendAtPos(int data,int pos)
    {
        Node newNode= new Node(data);
        if(pos == 0)
        {
            appendAtBeg(data);
            return;
        } 
        int i =0;
        Node temp = head;
        while(i < pos - 1 && temp != null)
        {
            temp = temp.next;
            i++;
        }
        newNode.next=temp.next;
        newNode.prev=temp;
        temp.next.prev=newNode;
        temp.next=newNode;
    }

    void printListFront()
    {
        Node temp = head;
        System.out.println("From front");
        while(temp != null)
        {
            System.out.print(temp.data + " >> ");
            temp=temp.next;
        }
        System.out.print("null");
    }

    void printListBackward()
    {
        Node temp = head;
        System.out.println("From back");
        if (head == null)
            System.out.print("List is empty");
        while(temp.next != null)
        {
            temp=temp.next;
        }
        while(temp != null)
        {
            System.out.print(temp.data+" << ");
            temp=temp.prev;
        }
        System.err.print("Null");
    }

}

class DLL
{
    public static void main(String[] args)
    {
        DoublyLinkedList Bucket = new DoublyLinkedList();
        Bucket.append(10);
        Bucket.append(20);
        Bucket.append(30);
        Bucket.append(40);
        Bucket.append(50);
        //Bucket.printListFront();
        Bucket.appendAtBeg(5);
        Bucket.printListFront();
        //Bucket.printListBackward();
        Bucket.appendAtPos(25,3);
        Bucket.printListFront();
    }
}
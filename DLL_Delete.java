//wac to remove a node from end of the doubly linked list
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

    void delAtEnd()
    {
        Node temp = head;
        while(temp.next.next != null)
        {
            temp = temp.next;
        }
        temp.next.prev = null;
        temp.next = null;
    }
    void delHead()
    {
        if(head == null)
        {
            System.out.println("List is empty");
        }
        head = head.next;
        head.prev=null;
    }

    void delAtPos(int pos)
    {
        Node temp = head;
        if(pos == 0)
            delHead();
        int i = 0;
        while(i < pos -1 && temp != null)
        {
            temp=temp.next;
            i++;
        }
        temp.next = temp.next.next;
        temp.next.prev = temp;
    }

    void searchInDll(int data)
    {
        Node temp = head;
        while(temp.next != null)
        {
            if(temp.data == data)
                System.out.print("Key is present");
            temp= temp.next;
        }
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

}

class DLL_Delete
{
    public static void main(String[] args)
    {
        DoublyLinkedList Bucket = new DoublyLinkedList();
        Bucket.append(10);
        Bucket.append(20);
        Bucket.append(30);
        Bucket.append(40);
        Bucket.append(50);
        Bucket.append(60);
        Bucket.append(70);
        Bucket.printListFront();
        // Bucket.delAtEnd();
        // Bucket.printListFront();
        // Bucket.delHead();
        // Bucket.printListFront();
        // Bucket.delAtPos(2);
        // Bucket.printListFront();
        Bucket.searchInDll(50);
    }
}
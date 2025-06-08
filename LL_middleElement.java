//wac to find middle element in the linked list
class Node
{
    int data;
    Node next;

    Node(int data)
    {
        this.data = data;
        this.next = null;
    }
}
class LinkedList 
{
    Node head;
    void append(int data)
    {
        Node newNode = new Node(data);
        if(head == null)
        {
            head = newNode;
            return;
        }
        Node temp= head;
        while(temp.next!=null) {
            temp = temp.next;
        }
        temp.next=newNode;
    }
    void middleElement()
    {
        Node slow = head;
        Node fast = head;
        while(fast != null && fast.next != null)
        {
            slow = slow.next;
            fast = fast.next.next;
        }
        System.out.println("Middle element is: "+slow.data);
    }

    void printList()
    {
        Node temp = head;
        while(temp != null)
        {
            System.out.print(temp + " >> ");
            temp = temp.next;
        }
        System.out.print("Null");
    }
    }
class LL_middleElement
{
    public static void main(String[] args) {
    LinkedList Bucket = new LinkedList();
    Bucket.append(18);
    Bucket.append(45);
    Bucket.append(7);
    Bucket.append(10);  
    Bucket.append(50);  
    Bucket.middleElement();
    }
}

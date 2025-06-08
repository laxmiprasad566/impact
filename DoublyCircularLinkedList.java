//double circuklar linked list
class Node {
    int data;
    Node prev;
    Node next;

    Node(int data) {
        this.data = data;
        this.prev = null;
        this.next = null;
    }
}

class LinkedList {
    Node head = null;

    // Append a node at the end
    void append(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            newNode.next = newNode;
            newNode.prev = newNode;
            return;
        }

        Node tail = head.prev;

        tail.next = newNode;
        newNode.prev = tail;
        newNode.next = head;
        head.prev = newNode;
    }

    // Display list in forward direction
    void displayForward() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        Node temp = head;
        do {
            System.out.print(temp.data + " >> ");
            temp = temp.next;
        } while (temp != head);
        System.out.println();
    }

    // Display list in reverse direction
    void displayBackward() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        Node tail = head.prev;
        Node temp = tail;
        do {
            System.out.print(temp.data + " >> ");
            temp = temp.prev;
        } while (temp != tail);
        System.out.println();
    }
}

public class DoublyCircularLinkedList {
    public static void main(String[] args) {
        LinkedList dcll = new LinkedList();
        dcll.append(10);
        dcll.append(20);
        dcll.append(30);
        dcll.append(40);

        System.out.println("Forward traversal:");
        dcll.displayForward();

        System.out.println("Backward traversal:");
        dcll.displayBackward();
    }
}

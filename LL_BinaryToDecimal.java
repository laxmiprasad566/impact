//wac to converts the nodes of linkedlist to decimal if they given inbinary
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
        if(head == null) {
            head = newNode;
            return;
        }
        Node temp = head;
        while(temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    int toDecimal() {
        Node temp = head;
        int decimal = 0;
        while(temp != null) {
            decimal = (decimal << 1) | temp.data; // Left shift and OR with current bit
            temp = temp.next;
        }
        return decimal;
    }
}

public class LL_BinaryToDecimal {
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.append(1);
        ll.append(0);
        ll.append(1);

        int decimalValue = ll.toDecimal();
        System.out.println("Decimal value: " + decimalValue);
    }
}

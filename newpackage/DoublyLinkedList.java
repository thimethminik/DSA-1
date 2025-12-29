
package newpackage;


public class DoublyLinkedList {
    class Node {
        int data;
        Node prev, next;

        Node(int d) {
            data = d;
        }
    }

    Node head;

    // Insert at beginning
    void insert(int data) {
        Node newNode = new Node(data);
        newNode.next = head;

        if (head != null) {
            head.prev = newNode;
        }

        head = newNode;
    }

    // Display list
    void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " <-> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList();
        list.insert(10);
        list.insert(20);
        list.insert(30);

        list.display();
    }
}

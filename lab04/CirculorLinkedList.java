public class CirculorLinkedList {
    private class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            next = null;
        }
    }

    Node head, tail;

    public void addToFront(int val) {
        if (head == null) {
            head = tail = new Node(val);
        } else {
            Node n = new Node(val);
            n.next = head;
            head = n;
            tail.next = head;
        }
    }

    public void addToBack(int val) {
        if (head == null) {
            head = tail = new Node(val);
        } else {
            tail.next = new Node(val);
            tail = tail.next;
            tail.next = head;
        }
    }

    public void removeFront() {
        if (head == null)
            return;
        else if (head == tail)
            head = tail = null;
        else {
            head = head.next;
            tail.next = head;
        }
    }

    public void removeBack() {
        if (head == null)
            return;
        else if (head == tail)
            head = tail = null;
        else {
            Node c = head;
            while (c.next != tail) c = c.next;
            c.next = null;
            tail = c;
            tail.next = head;
        }
    }

    public void displayList() {
        if (head == null)
            return;
        else {
            Node c = head;
            System.out.print("[");
            while (c != tail) {
                System.out.print(c.data + ", ");
                c = c.next;
            }
            System.out.println(tail.data+"]");
        }

    }

    public static void main(String[] args) {
        CirculorLinkedList list = new CirculorLinkedList();
        list.addToFront(3);
        list.addToFront(2);
        list.addToBack(4);
        list.addToBack(5);
        list.displayList();
        list.removeFront();
        list.removeBack();
        System.out.println("front and back deleted...");
        list.displayList();
    }
}
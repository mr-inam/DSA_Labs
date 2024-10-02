
public class CheckIfCycleQ4 {

    public static void main(String[] args) {
        CheckIfCycleQ4 list = new CheckIfCycleQ4();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(6);
        System.out.println("has cycle: "+list.hasCycle());
    }

    private class Node {
        Node(int val) {
            this.val = val;
            this.next = null;
        }

        int val;
        Node next;
    }

    Node head, tail;
    int size = 0;

    public void add(int val) {
        Node newNode = new Node(val);
        tail = newNode;
        if (head == null) {
            head = newNode;
        } else {
            Node c = head;
            while (c.next != null && c.next != head.next)
                c = c.next;
            c.next = newNode;
            tail.next = head.next;
        }
        size++;
    }

    public void remove(int val) {
        Node c = head;
        while (c != null) {
            if (c.next.val == val) {
                c.next = c.next.next;
                size--;
                return;
            }
        }
    }

    public boolean hasCycle() {
        return tail.next != null;
    }
}

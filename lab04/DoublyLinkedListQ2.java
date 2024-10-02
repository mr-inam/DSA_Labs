public class DoublyLinkedListQ2 extends DoublyLinkedList {
    Node tail;
    public void addToFront(int val) {
        if (head == null) {
            head = tail = new Node(val);
        } else {
            Node newNode = new Node(val);
            newNode.next = head;
            head.pre = newNode;
            head = newNode;
        }
        size++;
    }

    public void addToBack(int val) {
        if (head == null)
            head = tail = new Node(val);
        else {
            tail.next = new Node(val);
            tail.next.pre = tail;
            tail = tail.next;
        }
        size++;
    }

    public int getBackItem() throws Exception {
        if (head == null)
            throw new Exception("List is empty");
        else {
            return tail.val;
        }
    }

    public void removeBackItem() throws Exception {
        if (head == null)
            throw new Exception("List is empty...");
        else {
            tail = tail.pre;
            tail.next = null;
        }
        size--;
    }

    public void printInReverse(){
        if (head != null) {
            Node c = tail;
            System.out.print("[");
            while (c.pre != null) {
                System.out.print(c.val+", ");
                c = c.pre;
            }
            System.out.println(head.val+"]");
        }
    }
}
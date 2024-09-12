public class DoublyLinkedList {
    private class Node {
        Node (int val) {
            this.val = val;
            this.next = this.pre = null;
        }
        int val;
        Node next, pre;
    }
    Node head;
    int size = 0;
    public void addToFront (int val){
        if (head == null) {
            head = new Node(val);
        } else {
            Node newNode = new Node(val);
            newNode.next = head;
            head.pre = newNode;
            head = newNode;
        }
        size++;
    }
    public int getFrontItem() throws Exception {
        if (head == null) throw new Exception("List is empty");
        else return head.val;
    }
    public void removeFrontItem () throws Exception {
        if (head == null) throw new Exception("List is empty..."); 
        else {
            head = head.next;
            head.pre = null;
        }
        size--;
    }
    public void printAll () {
        Node currNode = head;
        System.out.print("[");
        while (currNode != null) {
            System.out.print(currNode.val + ", ");
            currNode = currNode.next;
        }
        System.out.println("]");
    }
    public void addToBack(int val){
        if (head == null) head = new Node(val);
        else {
            Node currNode = head;
            while (currNode.next != null) currNode = currNode.next;
            Node newNode = new Node(val);
            currNode.next = newNode;
            newNode.pre = currNode;
        }
        size++;
    }
    public int getBackItem(int val) throws Exception {
        if (head == null) throw new Exception("List is empty");
        else {
            Node currNode = head;
            while (currNode.next != null) currNode = currNode.next;
            return currNode.val;
        }
    }
    public void removeBackItem () throws Exception {
        if (head == null) throw new Exception("List is empty..."); 
        else {
            Node currNode = head;
            while (currNode.next != null) currNode = currNode.next;
            currNode = currNode.pre;
            currNode.next = null;
        }
        size--;
    }
    public boolean find(int val) {
        if (head == null) return false;
        else {
            Node currNode = head;
            while (currNode != null) {
                if (currNode.val == val) return true;
                currNode = currNode.next;
            }
            return false;
        }
    }
}
public class LinkedList {
    private class Node {
        public Node(int val) {
            this.val = val;
            this.next = null;
        }
        int val;
        Node next;
    }
    private Node head;
    private Node tail;
    int size=0;

    public void addToFront(int val) {
        if (head == null) {
            head = tail = new Node(val);
        } else { 
            Node newNode = new Node(val);
            newNode.next = head;
            head = newNode;
        }
        size++;
    }
    public int getFrontItem() throws Exception{
        if (head == null) throw new Exception("List is empty");
        return head.val;
    }
    public void removeFromFront() throws Exception {
        if (head == null) throw new Exception("List is empty");
        else if (head == tail) head = tail = null;
        else head = head.next;
        size--;
    }
    public void addToBack(int val) {
        if (head == null) {
            head = tail = new Node(val);
        } else {
            Node newNode = new Node(val);
            tail.next = newNode;
            tail = tail.next;
        }
        size++;
    }
    public int getBackItem() throws Exception {
        if (head == null) throw new Exception("List is empty");
        return tail.val;
    }
    public void removeBackItem() throws Exception {
        if (head == null) throw new Exception("List is empty");
        if (head == tail) { // Only one node in the list
            head = tail = null;
            size--;
            return;
        }
        Node currNode = head;
        while (currNode.next != tail) {
            if (currNode.next == tail) {
                currNode.next = null;
                tail = currNode;
                size--;
                return;
            }
            currNode = currNode.next;
        }
    }
    public boolean find(int val) {
        if (head.val == val || tail.val == val) return true;
        Node currNode = head.next;
        while (currNode != tail) {
            if (currNode.val == val) return true;
            currNode = currNode.next;
        }
        return false;
    }
    public void remove(int val) {
        if (head == null) return;
        if(find(val)){
            if (head.val == val) {
                try {
                    removeFromFront();
                } catch (Exception e) {
                    return;
                }
            } else if (tail.val == val) {
                try {
                    removeBackItem();
                } catch (Exception e) {
                    return;
                }
            } else {
                Node currNode = head.next, preOfCurrNode = head;
                while (currNode != tail) {
                    if (currNode.val == val) {
                        preOfCurrNode.next = currNode.next;
                        size--;
                        return;
                    }
                    preOfCurrNode = currNode;
                    currNode = currNode.next;
                }
            }
        }
    }
    public int size() {
        return size;
    }
    public boolean isListEmpty() {
        return head == null;
    }
    public void addKeyAfterNode(int key, int val) throws Exception {
        if (find(key)) {
            if (tail.val == key){
                addToBack(val);
            } else if (head.val == key){
                addToFront(val);
            }
            Node currNode = head.next;
            while (currNode != tail) {
                if (currNode.val == key) {
                    Node newNode = new Node(val);
                    newNode.next = currNode.next;
                    currNode.next = newNode;
                    size++;
                    return;
                }
                currNode = currNode.next;
            }
        } else {
            throw new Exception("Key not found: " + key);
        }
    }
    public void addKeyBeforeNode(int key, int val) throws Exception {
        if (find(key)) {
            if (tail.val == key){
                addToBack(val);
            } else if (head.val == key){
                addToFront(val);
            }
            Node currNode = head;
            while (currNode != tail) {
                if (currNode.next.val == key) {
                    Node newNode = new Node(val);
                    newNode.next = currNode.next;
                    currNode.next = newNode;
                    size++;
                    return;
                }
                currNode = currNode.next;
            }
        } else {
            throw new Exception("Key not found: " + key);
        }
    }
    public void printAll() {
        Node currNode = head;
        System.out.print("[");
        for (int i = 1; i <= size; i++) {
            System.out.print(currNode.val+", ");
            currNode = currNode.next;
        }
        System.out.println("]");
    }
    public int get(int index) throws Exception{
        if (head == null || index > size-1) throw new ArrayIndexOutOfBoundsException();
        Node currNode = head;
        for (int i = 0; i < size; i++) {
            if (index == i) break;
            currNode = currNode.next;
        }
        return currNode.val;
    }
    public void insertAt(int index, int val) {
        if (head == null || index > size || index < 0) throw new ArrayIndexOutOfBoundsException();
        Node currNode = head;
        int i;
        for (i = 0; i < size; i++) {
            if (index == i) break;
            currNode = currNode.next;
        }
        try {
            addKeyBeforeNode(currNode.val, val);
        } catch (Exception e) {}
    }
    public void removeFrom (int index) {
        if (head == null || index > size || index < 0) throw new ArrayIndexOutOfBoundsException();
        Node currNode = head;
        int i;
        for (i = 0; i < size; i++) {
            if (index == i) break;
            currNode = currNode.next;
        }
        remove(currNode.val);
    }
    public void reverse(){
        if (head == tail) return;
        else if (head == null) return;
        int mid = size/2;
        Node first = head, second = tail;
        for (int i = 0; i < mid; i++) {
            int temp = first.val;
            first.val = second.val;
            second.val = temp;
            first = first.next;
            Node currNode = head;
            while (currNode.next != second) {
                currNode = currNode.next;
            }
            second = currNode;
        }
    }
}
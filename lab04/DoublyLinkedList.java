public class DoublyLinkedList {
    protected class Node {
        Node(int val) {
            this.val = val;
            this.next = this.pre = null;
        }

        int val;
        Node next, pre;
    }

    protected Node head;
    int size = 0;

    public void addToFront(int val) {
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
        if (head == null)
            throw new Exception("List is empty");
        else
            return head.val;
    }

    public void removeFrontItem() throws Exception {
        if (head == null)
            throw new Exception("List is empty...");
        else {
            head = head.next;
            head.pre = null;
        }
        size--;
    }

    public void printAll() {
        Node currNode = head;
        System.out.print("[");
        while (currNode != null) {
            System.out.print(currNode.val + ", ");
            currNode = currNode.next;
        }
        System.out.println("]");
    }

    public void addToBack(int val) {
        if (head == null)
            head = new Node(val);
        else {
            Node currNode = head;
            while (currNode.next != null)
                currNode = currNode.next;
            Node newNode = new Node(val);
            currNode.next = newNode;
            newNode.pre = currNode;
        }
        size++;
    }

    public int getBackItem() throws Exception {
        if (head == null)
            throw new Exception("List is empty");
        else {
            Node currNode = head;
            while (currNode.next != null)
                currNode = currNode.next;
            return currNode.val;
        }
    }

    public void removeBackItem() throws Exception {
        if (head == null)
            throw new Exception("List is empty...");
        else if (head.next == null) { // Single element
            head = null;
        } else {
            Node currNode = head;
            while (currNode.next != null)
                currNode = currNode.next;
            currNode.pre.next = null;
        }
        size--;
    }

    public boolean find(int val) {
        if (head == null)
            return false;
        else {
            Node currNode = head;
            while (currNode != null) {
                if (currNode.val == val)
                    return true;
                currNode = currNode.next;
            }
            return false;
        }
    }

    public void remove(int val) {
        Node currNode = head;
        while (currNode != null) {
            if (currNode.val == val) {
                if (currNode.pre == null) {
                    head = head.next;
                    head.pre = null;
                    break;
                }
                if (currNode.next == null) {
                    currNode.pre.next = null;
                    break;
                }
                currNode.pre.next = currNode.next;
                currNode.next.pre = currNode.pre;
                // currNode.pre = currNode.next;
                // currNode = currNode.pre;
                // Node n = currNode.next;
                // n.pre = currNode;
                return;
            }
            currNode = currNode.next;
        }
        size--;
    }

    public boolean isListEmpty() {
        return head == null;
    }

    public void addKeyBeforeNode(int key, int val) {
        if (head == null) {
            head = new Node(key);
        } else {
            Node currNode = head;
            while (currNode != null) {
                if (currNode.val == key) {
                    Node newNode = new Node(val);
                    if (currNode.pre == null) {
                        head.pre = newNode;
                        newNode.next = head;
                        head = newNode;
                        break;
                    }
                    newNode.next = currNode;
                    newNode.pre = currNode.pre;
                    currNode.pre = newNode;
                    (newNode.pre).next = newNode;
                    break;
                }
                currNode = currNode.next;
            }
        }
        size++;
    }

    public void addKeyAfterNode(int key, int val) {
        if (head == null) {
            head = new Node(val);
        } else {
            Node currNode = head;
            while (currNode != null) {
                if (currNode.val == key) {
                    Node newNode = new Node(val);
                    if (currNode.next == null) {
                        currNode.next = newNode;
                        newNode.pre = currNode;
                        break;
                    }
                    newNode.next = currNode.next;
                    currNode.next = newNode;
                    newNode.pre = currNode;
                    newNode.next.pre = newNode;
                    break;
                }
                currNode = currNode.next;
            }
        }
        size++;
    }

}
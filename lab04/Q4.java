class Q4{
    Node head;
    Node tail;

    class Node {
    int data;
    Node next;
        Node (int data){
        this.data  = data;
        this.next = null;
        }
    }

    public void addFrontItem(int data){
        Node newnode = new Node(data);

        if (head == null){
            head = newnode;
            tail = newnode;
            tail.next = head;
            return;
        }

        newnode.next = head;
        head = newnode;
        tail.next = head;
    }


    public void hasCycle(){
        if (tail.next!=null){
            System.out.println("list has cycle");
        }
        System.out.println("List does not have cycle");
    }
 
    public static void main (String args[]){
        Q4 list = new Q4();
        list.addFrontItem(3);
        list.addFrontItem(2);
        list.addFrontItem(1);

        list.hasCycle();
        
    }
}

public class FindMidQ5 extends DoublyLinkedList{
    public int midValue() {
        int count = size/2;
        Node c = head;
        while (count != 0) {
            c = c.next;
            count--;
        }
        return c.val;
    }

    public static void main(String[] args) {
        FindMidQ5 list = new FindMidQ5();
        list.addToBack(1);
        list.addToBack(2);
        list.addToBack(3);
        list.addToBack(4);
        list.addToBack(5);
        list.printAll();
        System.out.println("Middle value is "+list.midValue());
    }
}

public class Main {
    public static void main(String[] args) throws Exception {
        DoublyLinkedList list = new DoublyLinkedList();
        list.printAll();
        list.addToFront(5);
        list.addToFront(7);
        list.addToFront(8);
        list.printAll();
        list.removeFrontItem();
        list.printAll();
        System.out.println("Front item is: "+list.getFrontItem());
    }
}

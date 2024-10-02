public class Main {
    public static void main(String[] args) throws Exception {
        DoublyLinkedListQ2 list = new DoublyLinkedListQ2();
        list.printAll();
        list.addToFront(5);
        list.addToFront(7);
        list.addToFront(8);
        list.printAll();
        list.removeFrontItem();
        list.printAll();
        System.out.println("Front item is: "+list.getFrontItem());
        list.addToBack(6);
        System.out.println("Back Item is "+list.getBackItem());
        list.removeBackItem();
        list.printAll();
        if (!list.isListEmpty()) {
            if (list.find(7)) {
                list.remove(7);
            }
        }
        for (int i = 0; i < 5; i++) {
            list.addToFront(i*10+1);
        }
        list.printAll();
        list.addKeyAfterNode(8,9);
        list.addKeyBeforeNode(8,7);
        list.printAll();

        list.addToBack(17);
        System.out.println("Num added at back");
        list.printAll();
        list.removeBackItem();
        System.out.println("back num deleted...");
        list.printAll();
        System.out.println("Last item is "+list.getBackItem());
        System.out.println("Reverse: ");
        list.printInReverse();
    }
}

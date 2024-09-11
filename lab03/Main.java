public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.addToFront(5);
        list.addToFront(3);
        list.addToBack(7);
        list.addToFront(2);
        list.addToBack(9);
        list.addToBack(8);
        try {
            list.addKeyBeforeNode(3, 4);
        } catch (Exception e) {
            
        }
        try {
            list.removeBackItem();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
        try {
            System.out.println(list.getBackItem());
        } catch (Exception e) {
            
        }
        System.out.println("Is List Empty: "+list.isListEmpty());
        System.out.println("11 exist in list: "+list.find(11));
        list.remove(4);
        try {
            System.out.println(list.get(2));
        } catch (Exception e) {
        }
        list.insertAt(2, 13);
        list.printAll(); 
        list.removeFrom(3);
        list.printAll(); 
        System.out.println(list.size() +" size");
        list.reverse();
        list.printAll();
    }
}

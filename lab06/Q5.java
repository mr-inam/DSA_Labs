import java.util.LinkedList;

public class Q5 {
    public static void print(LinkedList list){
        if(list.isEmpty()) return;
        System.out.print(list.remove()+" ");
        print(list);
    }
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        print(list);
        System.out.println();
    }
}

import java.util.LinkedList;

public class Q6 {
    public static void reversePrint(LinkedList<Integer> list){
        if(list.isEmpty()) return;
        var n = list.remove();
        reversePrint(list);
        System.out.print(n+" ");
    }

    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        reversePrint(list);
        System.out.println();
    }
}

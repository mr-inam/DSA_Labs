import java.util.Stack;

public class Q4 {
    public static void reverseStack(Stack<Integer> list){
        if(list.isEmpty()) return;
        Integer n = list.pop();
        reverseStack(list);
        list.addFirst(n);
    }

    public static void main(String[] args) {
        Stack<Integer> list = new Stack<>();
        list.push(10);
        list.push(20);
        list.push(30);
        System.out.println(list);
        reverseStack(list);
        System.out.println(list);
    }
}

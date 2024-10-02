import java.util.*;
public class SortStackQ7 {

  static  Stack sortStack(Stack<Integer> s){
        Stack<Integer> t = new Stack<>();
        t.push(s.pop());
        int size = s.size();
        while (!s.isEmpty()) {
            int temp = s.pop();
            while (!t.isEmpty() && t.peek() < temp) {
                s.push(t.pop());
            }
            t.push(temp);
        }
        return t;
    }


    public static void main(String[] args) {
        Stack<Integer> s= new Stack<>();
        
        s.push(3);
        s.push(4);
        s.push(41);
        s.push(42);
        s.push(44);
        s.push(14);
        s.push(0);
        s.push(19);
        s.push(1);
        System.out.println("stack before sort: "+s);
        var sta= sortStack(s);
        System.out.println("stack after sort: "+sta);
    }
    
}

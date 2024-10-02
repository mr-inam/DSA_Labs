import java.util.*;

public class GetMinFromStackQ9 {
    Stack<Integer> stack;
    int min;
    GetMinFromStackQ9(){stack = new Stack<>();}
    void push(int n){
        if(stack.isEmpty() || n<stack.peek()){
            min = n;
        }
        stack.push(n);
    }
    int pop(){
        return stack.pop();
    }
    void printAll(){
        System.out.println(stack);
    }
    int getMin(){
        return min;
    }

    public static void main(String[] args) {
        GetMinFromStackQ9 list = new GetMinFromStackQ9();
        list.push(10);
        list.push(20);
        list.push(30);
        list.push(9);
        list.push(70);
        list.printAll();
        System.out.println("Minimum num: "+list.getMin());
    }
}

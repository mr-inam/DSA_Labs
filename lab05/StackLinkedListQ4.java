import java.util.LinkedList;

public class StackLinkedListQ4 {
    LinkedList<Integer> stack;
    StackLinkedListQ4(){
        stack = new LinkedList<>();
    }
    void push(int n){
        stack.addFirst(n);
    }
    Integer pop(){
        return stack.removeFirst();
    }
    Integer peek(){
        return stack.getFirst();
    }
    boolean isEmpty(){
        return stack.size() == 0;
    }
    Integer getSize(){
        return stack.size();
    }
    void printAll(){
        System.out.println(stack);
    }

    public static void main(String[] args) {
        StackLinkedListQ4 list = new StackLinkedListQ4();
        System.out.println("Empty: "+list.isEmpty());
        list.push(10);
        list.push(20);
        list.push(30);
        list.printAll();
        System.out.println("Peek: "+list.peek());
        System.out.println("Pop: "+list.pop());
        list.printAll();
        System.out.println("Size: "+list.getSize());
    }
}

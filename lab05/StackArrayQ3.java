public class StackArrayQ3 {
    private int stack[], top=-1;
    StackArrayQ3(int capacity){
        stack = new int[capacity];
    }
    void push(int n){
        if (top < stack.length-1) {
            stack[++top] = n;
        } else {
            System.out.println("Stack is full...");
        }
    }
    int pop(){
        if(top != -1){
            return stack[top--];
        } else {
            return -1;
        }
    }
    int peek(){
        if(top != -1){
            return stack[top];
        } else {
            return -1;
        }
    }
    void printAll(){
        System.out.print("[");
        for (int i = 0; i <= top; i++) {
            System.out.print(stack[i]+", ");
        }
        System.out.println("]");
    }
    int getSize(){
        return top+1;
    }
    boolean isEmpty(){
        return top == -1;
    }
    boolean isFull(){
        return (top+1) == stack.length;
    }
    public static void main(String[] args) {
        StackArrayQ3 list = new StackArrayQ3(5);
        System.out.println("isEmpty: "+list.isEmpty());
        list.printAll();
        list.push(10);
        list.push(20);
        list.push(30);
        list.push(40);
        list.push(50);
        list.push(60);
        System.out.println("isFull: "+list.isFull());
        list.printAll();
        System.out.println("pop: "+list.pop());
        System.out.println("pop: "+list.pop());
        list.printAll();
        System.out.println("peek: "+list.peek());
        System.out.println("size: "+list.getSize());
    }
}

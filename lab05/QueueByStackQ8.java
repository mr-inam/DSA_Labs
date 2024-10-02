import java.util.*;
public class QueueByStackQ8 {
    private Stack<Integer> in, out;
    QueueByStackQ8(){
        in = new Stack<>();
        out = new Stack<>();
    }

    void enQueue(int n){
        in.push(n);
    }
    int deQueue(){
        if(in.isEmpty() && out.isEmpty()){
            return -1;
        } else if(out.isEmpty()){
            while (!in.isEmpty()) {
                out.push(in.pop());
            }
        }
        return out.pop();
    }
    void printAll(){
        System.out.print("[");
        for (int i = out.size()-1 ; i >= 0; i--) {
            System.out.print(out.get(i)+", ");
        }
        for (int i = 0; i<in.size(); i++) {
            System.out.print(in.get(i)+", ");
        }
        System.out.println("]");
    }

    public static void main(String[] args) {
        QueueByStackQ8 list = new QueueByStackQ8();
        list.enQueue(10);
        list.enQueue(20);
        list.enQueue(30);
        list.printAll();
        System.out.println("deQueue: "+list.deQueue());
        list.printAll();
        list.enQueue(40);
        list.enQueue(50);
        list.printAll();
    }
}

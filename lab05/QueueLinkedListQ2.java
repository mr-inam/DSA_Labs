import java.util.LinkedList;

public class QueueLinkedListQ2 {
    private LinkedList<Integer> q;
    QueueLinkedListQ2(){
        q = new LinkedList<>();
    }
    void enQueue(Integer i){
        q.addLast(i);
    }
    Integer deQueue(){
        if(!q.isEmpty())
            return q.removeFirst();
        else return -1;
    }
    Integer getFront(){
        if(!q.isEmpty())
            return q.getFirst();
        else return -1;
    }
    int getSize(){
        return q.size();
    }
    boolean isEmpty(){
        return q.isEmpty();
    }
    void printAll(){
        System.out.println(q);
    }

    public static void main(String[] args) {
        QueueLinkedListQ2 list = new QueueLinkedListQ2();
        list.enQueue(10);
        list.enQueue(20);
        list.enQueue(30);
        list.printAll();
        System.out.println(list.deQueue());
        list.printAll();
        System.out.println("Front: "+list.getFront());
        System.out.println("Size: "+list.getSize());
        System.out.println("Empty: "+list.isEmpty());
    }
}

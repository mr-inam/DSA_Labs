public class QueueArrayQ1 {
    private int size = 0, arr[], front, rear;

    QueueArrayQ1(int capacity) {
        arr = new int[capacity];
        front = 0;
    }

    void enqueue(int n){
        if (size<arr.length) {
            arr[rear] = n;
            rear = (rear + 1) % arr.length;
            size++;
        } else {
            System.out.println("full...");
        }
    }

    int deQueue(){
        if(size != 0){
            int ans = arr[front];
            front = (front+1)%arr.length;
            size--;
            return ans;
        } else {
            return -1;
        }
    }

    int getFront(){
        if(size != 0){
            return arr[front];
        } else return -1;
    }

    int getSize(){
        return size;
    }

    boolean isEmpty(){
        return size == 0;
    }

    boolean isFull(){
        return size == arr.length;
    }

    void printAll() {
        System.out.print("[");
        int idx = front;
        for (int i=0; i<size; i++) {
            System.out.print(arr[idx]+", ");
            idx = (idx+1)%arr.length;
        }
        System.out.println("]");
    }

    public static void main(String[] args){
        QueueArrayQ1 queue = new QueueArrayQ1(5);
        System.out.println("empty: "+queue.isEmpty());
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.printAll();
        System.out.println(queue.deQueue());
        queue.printAll();
        queue.enqueue(40);
        queue.printAll();
        queue.enqueue(50);
        queue.enqueue(60);
        queue.enqueue(70);
        queue.printAll();
        System.out.println(queue.getFront());
        System.out.println("Full: "+queue.isFull());
        queue.printAll();
        System.out.println(queue.deQueue());
        queue.printAll();
        System.out.println(queue.getSize());
        System.out.println( queue.deQueue());
        System.out.println(queue.deQueue());
        System.out.println( queue.deQueue());
        System.out.println( queue.deQueue());
        System.out.println( queue.deQueue());
    }
}
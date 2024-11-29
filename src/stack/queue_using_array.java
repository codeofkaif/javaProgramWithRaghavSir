package stack;
class Queue{
    private int[] queue;
    private int front;
    private int rear;
    private int capacity;
    Queue(int size){
        queue=new int[size];
        front=-1;
        rear=-1;
        capacity=size;
    }
    //insertion element in queue
    //(rear)---------------------(front)
    public void enqueue(int value){
        if(isFull()){
            System.out.println("Queue is full! you cann't add "+value);
            return;
        }
        if(rear==-1) rear++;
        queue[++front]=value;
    }
    public int  dequeue(){
        if(isEmpty()){
            System.out.println("Queue is Empty! you cann't remove");
            return rear;
        }
        return queue[rear++];

    }
    public int peak(){
        return queue[front];
    }
    public boolean isFull(){
        return front==capacity-1;
    }
    public boolean isEmpty(){
        return rear==-1;
    }
    public void display(){
        if(isEmpty()){
            System.out.println("Queue is empty!");
            return;
        }
        for (int i=0;i<=front;i++){
            System.out.println(queue[i]);
        }
    }

}

public class queue_using_array {
    public static void main(String[] args) {
        Queue queue = new Queue(5);
        queue.enqueue(10);
        queue.enqueue(15);
        queue.enqueue(34);
        queue.enqueue(23);
        queue.enqueue(53);
        queue.display();
        queue.peak();
    }
}

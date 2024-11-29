package stack;
class Stack{
    private final int[] stack;
    private int top;
    private final int capacity;
    // constructor
    Stack(int size){
        stack=new int[size];
        capacity = size;
        top=-1;
    }
    // push element in stack
    public void push(int n){
        if(isFull()){
            System.out.println("stack is overflow! cann't add"+n);
            return;
        }
        stack[++top]=n;

    }
    public int pop(){
        if(isEmpty()){
            System.out.println("stack is underflow!");
            return top;

        }
        return stack[top--];
    }
    public int peek(){
        if(isEmpty()){
            System.out.println("stack is underflow!");
            return -1;
        }
        return stack[top];
    }
    public boolean isFull(){
        return top==capacity-1;
    }
    public boolean isEmpty(){
        return top==-1;
    }
    public void display(){
        if(isEmpty()){
            System.out.println("stack is Empty!");
            return;
        }
        for (int i = 0; i <=top; i++) {
            System.out.println(stack[i]+"");

        }
        System.out.println();

    }
}

public class stack_imp_using_array {
    public static void main(String[] args) {
        Stack stack=new Stack(5);
        stack.push(10);
        stack.push(30);
        stack.push(40);
        System.out.println(stack.peek());
        stack.display();
        System.out.println(stack.isFull());
        System.out.println(stack.pop());
        System.out.println(stack.isEmpty());
        stack.display();

    }
}

package stack;
class Node{
    int value;
    Node next;
    Node(int value){
        this.value=value;
        this.next=null;

    }
}
class Stack2{
    private Node top;
    //constructor
    public Stack2(){
        this.top=null;
    }
    public void push(int value){
        Node newNode=new Node(value);
        //change
        newNode.next=top;
        top=newNode;
    }
    //check empty or not
    public boolean empty(){
        return top==null;
    }
    public int pop(){
        if(empty()){
            System.out.println("stack is Empty! you cann't remove");
            return -1;
        }
        int value=top.value;
        top=top.next;
        return value;
    }
    public void display(){
        Node temp=top;
        if(empty()){
            System.out.println("Stack is Empty! you cann't remove.");
            return;
        }
        while(temp!=null){
            int value=temp.value;
            temp=temp.next;
            System.out.println(value);

        }
    }
    public int top(){
        return top.value;
    }
}


public class stack_using_linkedLi {
    public static void main(String[] args) {
        Stack2 st=new Stack2();
        st.push(32);
        st.push(43);
        st.push(41);
        st.push(98);
        st.display();
        System.out.println("pop "+st.pop());
        st.push(100);
        st.display();
        System.out.println("pop "+st.pop());
        System.out.println("Top is"+st.top());



    }
}

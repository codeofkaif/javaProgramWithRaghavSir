package LinkList;


public class implimentation {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }
    public static class linklist{
        Node head=null;
        Node tail=null;
        void insertAtEnd(int val){
            Node temp=new Node(val);
            if (head==null){
                head = temp;

            }
            else{
                tail.next = temp;

            }
            tail = temp;
        }
        void Display(){
            Node temp=head;
            while (temp!=null) {
                System.out.println(temp.data + " ");
                temp = temp.next;
            }
        }
        void size(){
            Node temp=head;
            int count=0;
            while(temp!=null){
                count++;
                temp=temp.next;

            }
            System.out.println("size of linklist "+count);
        }
        void inserAtBeginning(int val){
            Node temp=new Node(val);
            if (head==null){
                head=temp;
                tail=temp;
            }
            temp.next=head;
            head=temp;
        }
    }
    public static void main(String[] args){
        linklist obj=new linklist();
        obj.insertAtEnd(3);
        obj.insertAtEnd(9);
        obj.insertAtEnd(2);
        obj.insertAtEnd(8);
        obj.Display();
        obj.size();
        obj.inserAtBeginning(100);
        obj.Display();
        obj.size();
    }

}

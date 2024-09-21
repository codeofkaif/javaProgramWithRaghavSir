package LinkList;

public class getValueOfAnyIndex {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }

    public static class linklist {
        Node head=null;
        Node tail=null;
        void insertval(int val){
            Node value=new Node(val);

            if(head==null){
                head=value;
            }
            else{
                tail.next=value;
            }
            tail=value;
        }
        int getIndex(int index){
            Node temp=head;
            for (int i = 0; i < index; i++) {
                temp=temp.next;


            }
            return  temp.data;
        }

    }

    public static void main(String[] args) {
        linklist obj=new linklist();
        obj.insertval(5);
        obj.insertval(8);
        obj.insertval(7);
        obj.insertval(8);
        obj.insertval(11);
        System.out.println(obj.getIndex(3));
    }

}
package LinkList;
// finding Nth node from the end of link list
/* first of all, we should find size of node (m) ,
* and the  make another loop for getting node and the range of that node should be
* "Nth from last = (m-n+1)nt node from start" */

public class gettingFromLast {
    public static class Node{
        int data;
        Node next;

        Node(int data){
            this.data=data;
        }


    }
    public static Node NthNode(Node head , int n){
//            int length=0;
//            Node temp=head;
//            while (temp!=null){
//                length++;
//                temp=temp.next;
//            }
//            int m=length-n+1;
//        System.out.println(m);
            // Mth node from start
        //without  two time travelling node
        Node fast=head;
        Node slow=head;
        for (int i = 0; i < n; i++) {
            fast=fast.next;
        }
        while (fast!=null) {
            slow=slow.next;
            fast=fast.next;
        }
        return slow;
    }
    // Deleting any element from last

    public static Node deleteFromLast(Node head,int n){
        Node fast=head;
        Node slow=head;
        for (int i = 0; i < n; i++) {
            fast=fast.next;

        }
        // delete from at last node from last(means start node)
        if(fast==null){
            head= head.next;
            return head;
        }


        while(fast.next!=null){
            fast=fast.next;
            slow=slow.next;
        }

        slow.next=slow.next.next;
        return head;
    }
    public static void Display(Node head){
        Node temp=head;

        while (temp!=null){
            System.out.print(" "+temp.data);
            temp=temp.next;
        }
    }

    public static void main(String[] args) {
        Node a=new Node(12);
        Node b=new Node(3);
        Node c=new Node(2);
        Node e=new Node(11);
        Node f=new Node(15);
        Node g=new Node(4);
        Node h=new Node(8);
        a.next=b;
        b.next=c;
        c.next=e;
        e.next=f;
        f.next=g;
        g.next=h;
        Node temp=NthNode(a, 4);
        System.out.println(temp.data);
        Display(a);
        System.out.println();
        a = deleteFromLast(a,7);
        Display(a);


    }
}

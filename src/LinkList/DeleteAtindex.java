package LinkList;

public class DeleteAtindex {
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
        int size=-1;
        void insertval(int val){
            Node temp=new Node(val);
            if(head==null){
                head=temp;

            }
            else{
                tail.next=temp;
            }
            tail=temp;
            size++;

        }
        void deleteAt(int index){
            Node temp=head;
            Node previous=null;
            int count=0;
            while(temp!=null){
                if(count==index){
                    System.out.println("\n"+size);
                    if(index==size){// deletion at last
                        previous.next=null;
                        tail=previous;


                        size--;
                        return;
                    } else if (index==0) {
                        head=head.next;
                        size--;
                        return;

                    } else  {
                        previous.next=temp.next;
                        size--;
                        return;

                    }

                }
                previous=temp;
                temp=temp.next;
                count++;

            }
        }
        void Display() {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
        }

    }

    public static void main(String[] args) {
        linklist obj=new linklist();
        obj.insertval(5);
        obj.insertval(8);
        obj.insertval(7);
        obj.insertval(8);
        obj.insertval(11);
        obj.Display();
        obj.deleteAt(0);
        System.out.println();

        obj.Display();
        System.out.println("\n"+obj.tail.data);
        System.out.println("\n"+obj.size);
    }

}

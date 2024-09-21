package LinkList;

public class insertAtAnyIndex {
    public static class Node{
        int data;
        Node next;
         //when  class of Nose has given then we don't need to declare any method of size
        Node(int data){
            this.data=data;
        }
    }
    public static class  linklist {
        Node head = null;
        Node tail = null;
        int size=0;
        void insertval(int val) {
            Node temp = new Node(val);
            if (head == null) {
                head = temp;

            } else {

                tail.next = temp;

            }
            tail = temp;
            size++;

        }

        void Display() {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
        }

//        int size() {
//            Node temp = head;
//            int count = 0;
//            while (temp != null) {
//                temp = temp.next;
//                count++;
//            }
//            return count;
//        }

        void insertAtHead(int val) {
            Node temp = new Node(val);
            temp.next = head;
            head = temp;
            size++;
        }
        // another way of inserting element
//        void insertAt(int index,int val){
//            Node temp=new Node(val);
//            Node search=head;
//            for(int i =0;i<index-1;i++){
//                    search=search.next;
//                }
//                temp.next=search.next;
//                search.next=temp;
//
//
//
//        }

        void insertAt(int index, int val) {
            Node temp = new Node(val);
            int count = -1;
            Node previous = null;
            Node serch = head;
            if (index == size) {
                insertval(val);
                return;
            } else if (index == 0) {
                insertAtHead(val);
                return;

            }

             else if (index>size|| index<0) {
                System.out.println("Wrong index! Out of bound");
                return;

            } else {
                while (serch != null) {


                    count++;
                    if (count == index) {
                        previous.next = temp;
                        temp.next = serch;
                        break;
                    }
                    previous = serch;
                    serch = serch.next;
                }
                size++;



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
        System.out.println("\n");
        obj.insertAt(0,12);
        obj.Display();
        obj.insertAt(6,100);
        System.out.println();
        obj.Display();

        System.out.println("\n" +obj.size);


    }
}


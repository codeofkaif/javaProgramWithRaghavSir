
    /* Type of Link list
    1 -> singly link list
    2 -> doubly link list
    3 -> circular link list

    1 -> singly link list
    in this list we can find all data by help of head node

     */
    package LinkList;
// List Node

    public class LinkList {
        //LENGHT METHOD
        public static int lenght(Node head){
            int count=0;
            while(head!=null) {
                count++;
                head = head.next;
            }
            return count;
        }

        //CAN WE DO IT RECURSIVELY
        public static void recursiveDisplay(Node head) {
            if(head==null) return;
//            System.out.print(head.data +" ");
            recursiveDisplay(head.next);
            System.out.print(head.data +" ");// for reverse printing

        }


        // there is a class that print tha value of all list items
        public static void display(Node head){
            Node temp=head;
            while(temp!=null){
                System.out.print(temp.data+" ");
                temp=temp.next;
            }
        }

        // this is the Node data type
        public static class Node{
            int data;
            Node next;
            Node(int data){
                this.data=data;
            }


        }


        public static void main(String[] args) {
            Node obj=new Node(4);
            Node obj1=new Node(45);
            Node obj2=new Node(42);
            Node obj3=new Node(5);
            // This all data is not connected to each other now

            // Output like this LinkList$Node@6acbcfc0
//            System.out.println(obj.next);
//            System.out.println(obj.next.data);

            //now connect to all node to each other
            obj.next = obj1;
            obj1.next=obj2;
            obj2.next=obj3;


          //  Node temp=obj;//now we can print all data of node using by loop like this ->
//            for (int i =0; i <4; i++) {
//                System.out.print(temp.data+" ");
//                temp=temp.next;

            //using while loop
//            while (temp!=null){// printing the list
//                System.out.print(temp.data+" ");
//                temp = temp.next;
//            }

            //colling methods
            display(obj);// display is method that will print the element of list
            System.out.println("\nrecursive call");
            recursiveDisplay(obj);
            System.out.println("\n Total number of nodes ");
            int sum=lenght(obj);
            System.out.println(sum);



            }
            
        }



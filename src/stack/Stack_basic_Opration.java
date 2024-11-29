//package stack;
//
//import java.util.*;
//
//
//public class Stack_basic_Opration {
//
//    //Method for insertion
//    public static void insertion(Stack<Integer> stack){
//        System.out.println("How many element are you want to insert? ");
//
//        Scanner input = new Scanner(System.in);
//        int n= input.nextInt();
//        System.out.println("Enter the element in stack");
//        for (int i=0;i<n;i++){
//            stack.push(input.nextInt());
//
//        }
//
//
//
//    }
//
//
//    //Method for insertion element at any index
//    public static void insrtAt( Stack<Integer> stack ){
//        Stack<Integer> stack1 =new Stack<>();
//        System.out.println("Enter the element and index");
//        Scanner input=new Scanner(System.in);
//        int element=input.nextInt();
//        int index = input.nextInt();
//
//
//        for (int i = 0; i <stack.size()-index ; i++) {
//            stack1.push(stack.pop());
//        }
//        stack.push(element);
//        for (int i = 0; i <stack1.size() ; i++) {
//            stack.push(stack1.pop());
//
//        }
//    }
//    //Method for finding element
//    public static void find(Stack<Integer> stack,int element){
//        Stack<Integer> stack1=new Stack<>();
//        int ind=stack.size()-1;
//        while(!stack.isEmpty()){
//            int n=stack.pop();
//            stack1.push(n);
//            if(element == n){
//                System.out.println("Element found at index " +ind);
//                break;
//            }
//            ind--;
//
//
//        }
//
//        while(!stack1.isEmpty()){
//            stack.push(stack1.pop());
//        }
//    }
//    //Method for copy one stack element into another stack in same order
//    public static void copyFrom(Stack<Integer> stack,Stack<Integer> stack2){
//        Stack<Integer> stack3=new Stack<>();
//        // free from original to empty stack
//        while(!stack.isEmpty()){
//            stack3.push(stack.pop());
//        }
//        // again copy stack into original and also according to question
//        while(!stack3.isEmpty()){
//            int n=stack3.pop();
//            stack2.push(n);
//            stack.push(n);
//        }
//
//
//    }
//    //Method for deleting element from stack
//    //main method
//    public static void main(String[] args){
//        Stack<Integer> stack= new Stack<>();
//        insertion(stack);
//        System.out.println(stack);
//      /* insrtAt(stack);
//       System.out.println(stack);
//
//       */
//        System.out.println("Enter the element that you want find!");
//        Scanner input=new Scanner(System.in);
//        int k=input.nextInt();
//        find(stack,k);
//
//
//       System.out.println(stack);
//
//       Stack<Integer> stack2=new Stack<>(); // empty stack
//       copyFrom(stack,stack2);
//        System.out.println("Original stack");
//        System.out.println();
//        System.out.println(stack2);
//
//    }
//
//}

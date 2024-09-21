package Arrays;

import java.util.Scanner;

public class RepeatingElement {
    public static int Repeatation(int[] array){
        int k=0;
        for(int i=0; i<array.length;i++){
            for(int j=i+1; j<array.length;j++){
                if(array[i]==array[j]){
                    return array[i];

                }

            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n=input.nextInt();
        int[] array=new int[n];
        System.out.println("Enter the element in array");
        for (int i=0; i<array.length;i++){
            array[i]=input.nextInt();
        }
        int k=Repeatation(array);
        System.out.println("number is "+k);
    }
}


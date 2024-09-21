package DSAjava;

import java.util.Scanner;
public class simple{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of row ");
        int n = sc.nextInt();
        // for pattern printing code , here  pattern is rectangle
        for (int i = 0; i <n; i++) {
            for (int j = 0; j < n; j++) {
                if (i==0 || j==0||i==n-1||j==n-1){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }

            }
            System.out.println();
        }
    }
}
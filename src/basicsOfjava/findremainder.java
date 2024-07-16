package basicsOfjava;

import java.util.Scanner;

public class findremainder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter dividend");
        int a = sc.nextInt();
        System.out.println("Enter divisor :");
        int b = sc.nextInt();
        int p = a / b;
        int remainder = a -(b*p);
        System.out.println("the remainder when "+a+"is divided by"+b+"is : "+ remainder);
    }
}

package basicsOfjava;
import java.util.Scanner;


public class input {
    public static void main(String[] args) {
        System.out.println("Enter the value of radius");
        Scanner sc = new Scanner(System.in);
        double radius;
        radius=sc.nextDouble();
        double pi =3.1415;
        double area= pi*radius*radius;
        System.out.println("the area of circle is : "+area);
    }

}

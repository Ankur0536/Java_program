import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter length of triangle:");
        int len=sc.nextInt();
        System.out.print("Enter height of triangle:");
        int hei=sc.nextInt();
        System.out.println("Area of triangle:"+(0.5*hei*len));

    }
}

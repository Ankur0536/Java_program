import java.util.Scanner;

public class Triangle1
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter length1 of triangle:");
        int len1=sc.nextInt();
        System.out.print("Enter length2 of triangle:");
        int len2=sc.nextInt();
        System.out.print("Enter length3 of triangle:");
        int len3=sc.nextInt();

        int s=(len1+len2+len3)/2;
        int area=s*(s-len1)*(s-len2)*(s-len3);
        System.out.println("Area of triangle:"+Math.sqrt(area));
    }
}

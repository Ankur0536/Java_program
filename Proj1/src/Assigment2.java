import java.util.Scanner;

public class Assigment2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
         System.out.println("Enter the age:");
        int num=sc.nextInt();
        if(num<=40)
        {
            System.out.println("Child");
        }
        else if(num>40 && num<55)
        {
            System.out.println("Young");
        }
        else
        {
            System.out.println("Old");
        }
    }
}

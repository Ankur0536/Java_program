import java.util.Scanner;

public class Assignment4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter marks of subject 1:");
        int sub1= sc.nextInt();
        System.out.println("Enter marks of subject 2:");
        int sub2= sc.nextInt();
        System.out.println("Enter marks of subject 3:");
        int sub3= sc.nextInt();

        double avg=(sub1+sub2+sub3)/3;
        if(avg>=70)
        {
            System.out.println("A");
        }
        else if(avg>=60) {
            System.out.println("B");
        }
        else if(avg>=50) {
            System.out.println("C");
        }
        else if (avg>=40) {
            System.out.println("D");
        }
        else {
            System.out.println("E");
        }
        System.out.println("Enter skip:");
        int num1=sc.nextInt();
        System.out.println("Enter break:");
        int num2=sc.nextInt();
        for(int i=1;i<=100;i++)
        {
            if(i==num1)
            {
                continue;
            }
            if (i==num2)
            {
                break;
            }
            System.out.println(i);
        }
        System.out.println("Enter number");
        int num=sc.nextInt();
        for(int i=1;i<=10;i++){
            System.out.println(num+" * "+i+" = "+num*i);
        }

    }
}

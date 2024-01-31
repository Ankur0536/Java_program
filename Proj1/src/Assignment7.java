import java.util.Scanner;

public class Assignment7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int sum=0;
        System.out.print("Enter number:");
        int num= sc.nextInt();
        int rnum=0;
        while(num!=0)
        {
            sum+=num%10;
            rnum=rnum*10+num%10;
            num/=10;
        }
        System.out.println("Reverse number:"+rnum);
        System.out.println("Sum of digit: "+sum);
    }
}


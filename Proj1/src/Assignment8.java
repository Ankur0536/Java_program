import java.util.Scanner;

public class Assignment8 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String[] ans={"zero","one","two","three","four","five","six","seven","eight","nine"};
        int num1=2335;
        while(num1!=0)
        {
            int i=num1%10;
            System.out.println(ans[i]);
            num1=num1/10;
        }
    }
}

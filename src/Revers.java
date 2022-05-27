import java.util.Scanner;

public class Revers
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,rev=0;
        System.out.println("Enter number");
        n=sc.nextInt();
        while(n>0)
        {
            rev=(rev*10)+(n%10);
            n=n/10;
        }
        System.out.println("Revers number"+rev);
    }
}

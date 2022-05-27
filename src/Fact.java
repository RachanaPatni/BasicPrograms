import java.util.Scanner;
public class Fact
{
    public static void main(String args[])
    {
        int n,fact=1;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any number");
        n=sc.nextInt();
        while(n>0)
        {
            fact=fact*n;
            n=n-1;
        }
        System.out.println("Factorial "+fact);
    }

}

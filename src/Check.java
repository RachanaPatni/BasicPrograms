import java.util.Scanner;

public class Check
{
    public static void main(String args[])
    {
        int a;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no");
        a=sc.nextInt();
        if(a>0)
        {
            System.out.println("positive");
        }
        else if(a<0)
        {
            System.out.println("negative");
        }
        else
        {
            System.out.println("number is zero");
        }
    }
}

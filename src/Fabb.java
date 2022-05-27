import java.util.Scanner;

public class Fabb
{
    public static void main(String args[])
    {
        int n,x=0,y=1,z=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any numbers");
        n=sc.nextInt();
        while(z<=n)
        {
            System.out.println(z);
            x=y;
            y=z;
            z=x+y;
        }
    }
}

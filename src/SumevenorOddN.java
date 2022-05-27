import java.util.Scanner;

public class SumevenorOddN
{
    public static void main(String args[])
    {
        int n,pro=1,sum=0,digit;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter numbers");
        n=sc.nextInt();
        while(n>0)
        {
            digit=n%10;
            if(digit %2==0)
                sum=sum+digit;
            else
                pro=pro*digit;
            n=n/10;
        }
        System.out.println("sum of even numbers:" +sum+" product of odd numbers: "+pro);
    }

}

import java.util.Scanner;

public class CalSwitch
{
    public static void main(String args[])
    {
        int a,b,ch;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter First number");
        a=sc.nextInt();
        System.out.println("Enter Second number");
        b=sc.nextInt();
        System.out.println("Enter your choice \n1-> Addition\n2->Subraction\n3->Multipliction\n4->Division");
        ch=sc.nextInt();
        if(ch==1)
        {
            System.out.println("ADD="+(a+b));
        }
        else if(ch==2)
        {
            System.out.println("sub="+(a-b));
        }
        else if(ch==3)
        {
            System.out.println("multi="+(a*b));
        }
        else if(ch==4)
        {
            System.out.println("division="+(a/b));
        }
        else{
            System.out.println("your choice invalid");
        }
    }
}

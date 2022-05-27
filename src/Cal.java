import java.util.Scanner;

public class Cal
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
        switch(ch)
        {
            case 1:
                System.out.println("Add="+(a+b));
                break;
            case 2:
                System.out.println("sub="+(a-b));
                break;
            case 3:
                System.out.println("multi="+(a*b));
                break;
            case 4:
                System.out.println("division="+(a/b));
                break;
            default:
                System.out.println("Your choice is invalid");
        }
    }
}

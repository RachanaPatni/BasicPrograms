import java.util.Scanner;

public class StringComp
{
    public static void main(String args[])
    {
        String s1=new String ();
        String s2=new String ();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first String ");
        s1=sc.nextLine();
        System.out.println("Enter Second String");
        s2=sc.nextLine();
        if(s1.compareTo(s2)==0)
            System.out.println("Sam hai");
        else if(s1.compareTo(s2)>0)
            System.out.println("String first is greater than second String");
        else
            System.out.println("String second is greater than first String");
    }

}

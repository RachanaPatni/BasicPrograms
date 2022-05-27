import java.util.Scanner;

public class Equality
{
    public static void main(String args[])
    {
        String str1=new String ();
        String str2=new String ();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 1st string");
        str1=sc.nextLine();
        System.out.println("Enter 2st string");
        str2=sc.nextLine();
        if(str1.equalsIgnoreCase(str2))
            System.out.println("EqualString");
        else
            System.out.println("Not equal");
    }
}



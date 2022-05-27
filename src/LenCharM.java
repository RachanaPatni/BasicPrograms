import java.util.Scanner;

public class LenCharM
{
    public static void main(String args[])
    {
        int len;
        String sr=new String();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your name");
        sr=sc.nextLine();
        len=sr.length();
        for(int i=0;i<len;i++)
            System.out.println(sr.charAt(i));
    }
}

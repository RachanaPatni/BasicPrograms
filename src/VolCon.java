import java.util.Scanner;

public class VolCon
{
    public static <Char> void main(String args[])
    {
        String s=new String ();
        int i,vol=0,con=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter String");
        s=sc.nextLine();

        for(i=0;i<s.length();i++)
        {
            Char ch=s.CharAt(i);
            if(ch!=' ' && ch!=' ')
            {
                if(ch=='A'|| ch=='E'||ch=='I'||ch=='O'||ch=='U')
                    vol++;
                else
                    con++;
            }
        }
        System.out.println("vowels: "+vol+" consonant: "+con);
    }
}

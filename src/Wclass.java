import java.util.Scanner;

public class Wclass
{
    public static void main(String args[])
    {
        int a,i,add=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        a=sc.nextInt();
        i=1;
        while(i<=a){
            add=add+i;
            i=i+1;
        }
        System.out.println("addition="+add);
    }

}

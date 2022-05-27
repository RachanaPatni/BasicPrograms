import java.util.Scanner;

public class PrimeN
{
    int n;
    void getdata()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter to check");
        n=sc.nextInt();
    }

    void putdata(){
        int i=1,count=0;
        while(i<=n)
        {
            if(n%i==0)
                count=count+1;
            i++;
        }
        if(count==2)
            System.out.println("Prime");
        else
            System.out.println("Not prime");

    }

    public static void main(String args[])
    {
        PrimeN aa=new PrimeN();
        aa.getdata();
        aa.putdata();
    }
}

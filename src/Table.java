import java.util.Scanner;

public class Table
{
    public static void main(String args[]) {
        int a;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        a = sc.nextInt();
        for (int i = 1; i <= 10; i++) {

            System.out.println(i * a);
        }

    }
    }

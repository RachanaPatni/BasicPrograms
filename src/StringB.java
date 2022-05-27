import java.util.Scanner;

public class StringB
{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        StringBuffer str = new StringBuffer();
        System.out.println("Enter String:");

        str.append(sc.nextLine());
        str.setCharAt(3, 'u');
        System.out.println(str);
        str.insert(3, "ABCD");
        System.out.println(str);
        str.setLength(5);
        System.out.println(str);
    }
    }

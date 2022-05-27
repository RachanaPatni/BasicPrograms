class Student
{
    int roll;
    String name;
    static String Cname= "Azad College";
    Student(int x, String y)
    {
        roll=x;
        Cname=y;
    }
    void display()
    {
        System.out.println("Roll :"+roll+" Name: "+name +" College: "+Cname);
    }
}

public class Demo {
    public static void main(String args[]) {
        Student aa = new Student(101, "Rachana");
        Student bb = new Student(102, "Patni");
        aa.display();
        bb.display();
    }
}


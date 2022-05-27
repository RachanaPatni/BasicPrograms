public class Vector
{
    public static void main(String args[]) {

        java.util.Vector<String> vec = new java.util.Vector<String>(4);

        vec.add("Tiger");
        vec.add("Lion");
        vec.add("Dog");
        vec.add("Elephant");

        System.out.println(vec);

        vec.insertElementAt("Rabbit",2);
        vec.forEach(System.out::println);

    }


}

// java method parameter
public class parameter
{
    static void myMethod(String fname)
    {
        System.out.println(fname + " Tamang");
    }
    static void nextMethod(String fname , int age)
    {
        System.out.println(fname + " Tamang "+ " is " + age + " years old");
    }
    public static void main(String[] args)
    {
        myMethod("Hawana");
        nextMethod("Hawana",19);
    }
}
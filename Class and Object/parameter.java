// java method parameter
public class parameter
{
    static void myMethod(String fname)
    {
        System.out.println(fname + " Tamang");
    }
    // multiple parameter code
    static void nextMethod(String fname , int age)
    {
        System.out.println(fname + " Tamang "+ " is " + age + " years old");
    }
    //return value method
    static int retMethod(int x)
    {
        return 5 + x;
    }
    public static void main(String[] args)
    {
        myMethod("Hawana");
        nextMethod("Hawana",19);
        System.out.println("Ans = " + retMethod(3));
    }
}
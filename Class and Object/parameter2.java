//if...else parameter
public class parameter2{
    static void checkAge(int age)
    {
        if(age < 18)
        {
            System.out.println("Access denied - You are not old enough");
            System.out.println("Underage");
        }
        else
        {
            System.out.println("Access granted - You are old enough");
        }
    }
    public static void main(String[] args)
    {
        checkAge(20);
    }
}

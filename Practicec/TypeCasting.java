//type casting in java
//Widening Casting(Automatic casting/Implicit casting)
//Naroowing Casting(Manual Casting/Explicit Casting)
//converting a smaller type to a larger type size
public class TypeCasting
{
    public static void main(String[] args)
    {
        int myInt = 9;
        double myDouble = myInt;        //Automatic casting: int to double
        System.out.println(myInt);
        System.out.println(myDouble);
        main1();
    }
    public static void main1()
    {
        double myDouble = 9.4563;
        int myInt;
        myInt = (int) myDouble;         //Manual Casting: double to int
        System.out.println(myDouble);
        System.out.println(myInt);
    }
}

public class overloading {
    static void add(int x ,int y)
    {
        int z;
        z = x+y;
        System.out.println("Add = " + z);
    }
    static void mul(int x ,int y)
    {
        System.out.println(x*y);
    }
    static double plusMethodDouble(double x , double y , double z)
    {
        return x+y+z;
    }
    public static void main(String[] args)
    {
        int a,b;
        a = 10;
        b = 20;
        add(a,b);
        mul(a,b);
        double myNum = plusMethodDouble(4.03, 6.26, 1.5);
        System.out.println("double = " + myNum);
    }
}

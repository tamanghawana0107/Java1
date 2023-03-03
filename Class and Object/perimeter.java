public class perimeter{
    static int triangle(int a, int b, int c , int d, int e )
    {
        int result = 0;
        result = a+b+c+d+e;
        return result;


    }
    public static void main(String[] args)
    {
        System.out.println("Perimeter of 3 side triangle : " + triangle(10,20,30,0,0));
        System.out.println("Perimeter of 4 side triangle : " + triangle(10,20,30,40,0));
        System.out.println("Perimeter of 5 side triangle : " +triangle(10,20,30,40,50) );
    }
}
import java.util.Scanner;
public class Average{
    public static double calcu(int x, int y , int z){
        int ans;
        double ans2;
        ans = x+y+z;
        ans2 = ans/3;
        return ans2;
    }
    public static void main(String[] args)
    {
        int a,b,c;
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter 3 number for the average output: ");
        a = obj.nextInt();
        b = obj.nextInt();
        c = obj.nextInt();
        System.out.println("Average of the given number is : " + calcu(a,b,c));
        obj.close();
    }
}
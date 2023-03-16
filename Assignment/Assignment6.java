// fibonacci series
import java.util.Scanner;
public class Assignment6{
    static void calc(int x)
    {
        int n1 =0, n2 =1, i =0, c =0;
        for(i=0; i<=x; i++)
        {
            System.out.print(" " + c);
            n1 = n2;
            n2 = c;
            c = n1+n2;
        }
    }
    public static void main(String[] args)
    {
        int num=0;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the no of series: ");
        num = input.nextInt();
        calc(num);
        input.close();
    }
}
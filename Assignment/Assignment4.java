// Multiplication table
import java.util.Scanner;
public class Assignment4 {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int num = 0;
        System.out.print("Enter the number for multiplication table :");
        num = input.nextInt();
        for(int i =0; i<10;i++)
        {
            
            System.out.println(num + "*" + (i+1) + "=" + (num*(i+1)) );
        }
        input.close();
    }
}

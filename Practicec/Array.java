import java.util.Scanner;
public class Array
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int x[] = new int[5];
        System.out.print("Enter elements of an array:");
        for(int i = 0;i<5;i++)
        {
            x[i]= input.nextInt();
        }
        System.out.println("The entered elements of array are:");
        for(int i = 0;i<5;i++)
        {
             System.out.print(x[i]);
        }
        // String[] college = {"Kist College"};
        // System.out.println("\n" +college[0]);
        // String[] cars = {"kwid","BMW"};
        // for(int i = 0; i<2;i++)
        // {
        //         System.out.println(cars[i]);
        // }
        // System.out.println("\nUsing for each loop");
        // for( String i : cars)
        // {
        //     System.out.println(i);
        // }    
            input.close();
    }
}
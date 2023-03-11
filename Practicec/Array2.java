// multidimensional array
import java.util.Scanner;
public class Array2{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int [] x ={10,20,30};
        for ( int i : x)
        {
            System.out.println(i);
        }
        System.out.println("Multidimesional array");
        int[][] y ={{10,20,30},{30,200,100},{1,2,3}};
        for(int i =0;i<3;i++)
        {
            for(int j =0;j<3;j++)
            {
                System.out.print("\n"+y[i][j]);
            }
        }
        int[][] arr = new int[2][2];
        System.out.println("Enter the elements in the array :");
        for(int i =0;i<2;i++)
        {
            for(int j=0;j<2;j++)
            {
                arr[i][j] = input.nextInt();
            }
        }
        System.out.println("The entered element is :");
        for(int i =0;i<2;i++)
        {
            for (int j =0 ;j<2;j++)
            {
                System.out.println(arr[i][j]);
            }
        }
        System.out.println("Length of the string");
        for (int[] i :y)
        {
            for(int j:i)
            {
                System.out.println(j);
            }
        }

        
    }
}
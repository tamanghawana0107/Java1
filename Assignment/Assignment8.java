//printing array
import java.util.Scanner;
public class Assignment8 {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter how many element you want to enter: ");
        int n = input.nextInt();
        int[] nums = new int[n];
        int ans[] = new int[n];
        System.out.println("Enter the element inside the array: ");
        for(int a=0;a<n;a++)
        {
            nums[a] = input.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            ans[i] = nums[nums[i]];
        }
        System.out.println("The output of the given array is :");
        for(int i=0; i<n;i++)
        {
            System.out.print(ans[i] + " ");
        }
        input.close();
    }
}

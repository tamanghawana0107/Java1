//pattern printing
public class Question3 {
    public static void main(String[] args)
    {
        int i =0, j=0;
        for(i =5;i>=0;i--)
        {
            for(j=5;j>i-1;j--)
            {
                System.out.print(" ");
            }
            for(int k=0;k<=2*i;k++)
            {
                System.out.print("*");
            }
            System.out.print("\n");
        }

    }
}

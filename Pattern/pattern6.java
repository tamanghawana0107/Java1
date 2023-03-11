public class pattern6 {
    public static void main(String[] args)
    {
        for(int a=0; a<=5; a++)
        {
            
            for(int b=a; b<=4; b++)
            {
                System.out.print(" ");
            }
            for(int c = 1 ; c<=a; c++)
            {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}

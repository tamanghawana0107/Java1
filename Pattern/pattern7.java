public class pattern7 {
    public static void main(String[] args)
    {
        for(int a=0; a<=5; a++)
        {
            
            for(int b=a; b<=5; b++)
            {
                System.out.print(" ");
            }
            for(int c = 0 ; c<=2*a; c++)
            {
                System.out.print("*");
            }
            System.out.print("\n");
        }
        
    }
}

public class pattern5 {
    static void output(int x, int y)
    {
        for(x=0;x<5;x++)
        {
            for(y=1;y<x+2;y++)
            {
                System.out.print("*");
            }
            System.out.print("\n");
        }
        for(x=0;x<5;x++)
        {
            for(y=5;y>x;y--)
            {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
    public static void main(String[] args)
    {
        output(0,0);
    }
}

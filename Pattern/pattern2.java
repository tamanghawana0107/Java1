public class pattern2 {
    static void output(int x, int y)
    {
        for(x=1;x<=5;x++)
        {
            for(y=5;y>x-1;y--)
            {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
    public static void main(String[] args)
    {
        output(1,0);
    }
}


public class triangle {
    public int result1 , result2, result3;
    public int a = 10;
    public int b = 20;
    public int c = 30;
    public int d = 40;
    public int e = 50;
    public triangle peri = new triangle();
    triangle()
    {
        // area 
    }
    triangle()
    {
        peri.result1 = peri.a+ peri.b + peri.c;
        peri.result2 = peri.a + peri.b + peri.c + peri.d;
        peri.result3 = peri.a + peri.b + peri.c + peri.d + peri.e;
    }
    public static void main(String[] args)
    {
        
        
        System.out.println("Perimeter of 3 side triangle = " + peri.result1);
        System.out.println("Perimeter of 4 side triangle = " + peri.result2);
        System.out.println("Perimeter of 5 side triangle = " + peri.result3);
        
    }

}

public class Triangle {
    private int a,b,c,d,e;
    public Triangle()
    {
        a = 10;
        b = 20;
        c = 30;
    }
    public Triangle (int x , int y, int z, int w)
    {
        a = x;
        b = y;
        c = z;
        d = w;
    }
    public Triangle (int x , int y, int z, int w, int r)
    {

        a = x;
        b = y;
        c = z;
        d = w;
        e = r;
    }
    public void area()
    {
        double result, result2;
        result = b * c;
        result2 =result/2;
        System.out.println("Area of the triangle is " + result2);
    }
    public void peri()
    {
        int ans;
        ans = a+b+c+d+e;
        System.out.println("Perimeter of triangle is :" + ans);
    }
    public static void main(String[] args)
    {
        Triangle obj = new Triangle();
        Triangle obj2 = new Triangle(10,20,30,40);
        Triangle obj3 = new Triangle(7,5,3,2,1);
        obj.area();
        obj.peri();
        obj2.area();
        obj2.peri();
        obj3.area();
        obj3.peri();
        
    }

}

public class Shape {
    int width = 10;
    int height = 20;
    public void area(){
        System.out.println("Calling from area");
    }
    public void calc()
    {
        System.out.println(width* height);
    }
    Shape()
    {
        width = 2;
        height = 3;
    }
    Shape(int w, int h){
        // default constructor created
        width = w;
        height = h;
    }
}

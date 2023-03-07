public class Main {
    public static void main(String[] args) {
        Shape object = new Shape(100,200);
        Shape object2 = new Shape(200,300);
        System.out.println("Width of the shape" + object.width);
        System.out.println("Height of the shape" + object.height);
        System.out.println("New width" + object2.width);
        System.out.println("New height" + object2.height);
        object.area();
        object.calc();
        object2.calc();
    }
}
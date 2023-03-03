public class attribute {
    int x = 10;
    int x1 = 10;
    final int x2 = 20;
    public static void main(String[] args)
    {
        attribute obj = new attribute();
        obj.x1 = 40;
        System.out.println(obj.x);
        System.out.println(obj.x1);
        System.out.println(obj.x2);
    }
}

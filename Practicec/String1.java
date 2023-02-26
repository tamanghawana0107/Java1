public class String1{
    public static void main(String[] args)
    {
        String name = "Hawana"; // stays in string pool
        name = name + "Tamang";
        System.out.println(name);
        // this will create the new instance for the string
        String nam = new String("Hawana");
        nam = nam + "Tamang";
        System.out.println(nam);
        //String buffer
        StringBuffer s = new StringBuffer("Hello");
        s.append("Hello");
        System.out.println(s);
    }
}
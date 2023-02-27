// vector datatype in java
// size of array is fixed and size of vector is dynamic
/*Arrays are like boxes of a fixed size, while Vectors are like expandable boxes that can grow or shrink as needed */
import java.util.Vector;
public class Vector1{
    public static void main(String[] args)
    {
        int[] age = {15,25,35};
        Vector age1 = new Vector(3,10);
        age1.add(2);
        age1.add(3);
        age1.add(4);
        age1.add(5);
        age1.add(6);
        age1.add(7);
        age1.add(8);
        age1.add(9);
        age1.add(10);
        age1.add(1);
        age1.add(36);
        age1.add(40);
        age1.add(56);
        age1.add(100);
        System.out.println(age1);
        System.out.println("length: " + age.length);
        System.out.println("Length: "+ age1.capacity());
    }
}
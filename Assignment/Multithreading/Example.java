/* Build a program that reads a file containing serialized java objects and deserializes them to recreate the original objects */
import java.io.*;
import java.io.ObjectInputStream;

class Student implements Serializable{
    String name;
    String id;
    Student(String name, String id){
        this.name = name;
        this.id = id;
    }
}
class Test1
{
    public void objectSerialization(Student stu)
    {
        try{
            FileOutputStream fos = new FileOutputStream("D:\\Java1\\Assignment\\Multithreading\\Student.ser");
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            oos.writeObject(stu);
            oos.close();
            fos.close();
            System.out.println("Serialized data saved in file");
        }
        catch (IOException e)
        {
            System.out.println(e);
        }
    }
   
}
class Test2{
    public void objectDeserialization(){
        try{
            Student stu = null;
            FileInputStream fis = new FileInputStream("D:\\Java1\\Assignment\\Multithreading\\Student.ser");
            ObjectInputStream ois = new ObjectInputStream(fis);

            stu = (Student) ois.readObject();

            ois.close();
            fis.close();

            System.out.println("Name = " + stu.name);
            System.out.println("ID No = " + stu.id);
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}


public class Example {
    public static void main(String[] args)
    {
        Student stu = new Student("Hawana Tamang","5413");
        Test1 obj1 = new Test1();
        Test2 obj2 = new Test2();
        obj1.objectSerialization(stu);
        obj2.objectDeserialization();
    }
}

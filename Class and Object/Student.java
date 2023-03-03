import java.util.Scanner;
public class Student{
    public String name;
    public int roll_no;
    public static void main(String[] args)
    {
        Student obj = new Student();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the name :");
        obj.name =input.nextLine();
        System.out.println("Enter the roll no:");
        obj.roll_no = input.nextInt();
        System.out.println("The name entered is :" + obj.name);
        System.out.println("The roll no entered is :" + obj.roll_no);
        input.close();
    }
}
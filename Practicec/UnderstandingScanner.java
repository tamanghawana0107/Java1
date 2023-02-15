import java.util.Scanner;           //importing Scanner from java
public class UnderstandingScanner
{
    public static void main(String[] args)
    {
        System.out.println("Enter your name:");
        Scanner obj = new Scanner(System.in);            //Scanner is a class , obj is a object
        String name = obj.nextLine();         // nextLine will wait for the user
        // System.out.println("Hello world");
        // System.out.println("New code to be written");
        // System.out.println("Enter your name:");
        System.out.println("Your name is " + name);
        // "+" adds two string
    }
}
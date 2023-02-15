import java.io.*;
import java.util.Scanner;
public class Assignment2{
    public static void main(String[] args)
    {
        Scanner obj = new Scanner(System.in);
        String name;
        int num, waste;
        boolean check;
        double tempK,tempC,weight;
        char a;
        System.out.println("Enter the name of supervisor:");
        name = obj.nextLine();
        System.out.println("The name of the supervisor is :" + name);

        System.out.println("\n");
        System.out.println("Enter the total number of employees:");
        num = obj.nextInt();
        System.out.println("The total number of employees are : " + num);
        
        System.out.println("\n");
        System.out.println("Enter how many times the Nuclear waste is removed from the core:");
        waste = obj.nextInt();
        System.out.println("The Nuclear waste was removed from the core " + waste + " times");

        System.out.println("\nEnter the total weight of the waste produced every 1 week:");
        weight = obj.nextDouble();
        System.out.println("The total weight of the waste produced in every 1 week is: " + weight + " kg");

        // label:
        System.out.println("\n");
        System.out.println("Is the Electric Motor being replaced every 18 days?");
        System.out.println("Press 'y' for yes");
        System.out.println("Press 'n' for no");
        a = obj.next().charAt(0);
        if(a == 'y')
        {
            System.out.println("\n");
            System.out.println("Yes.The electric motor is being replaced every 18 days");
            System.out.println("!!! Keep up the good work !!!\n");
        }
        else if(a == 'n')
        {
            System.out.println("\n");
            System.out.println("No. The electric motor is not being replaced every 18 days");
            System.out.println("!!! Replace the motor for better funcionality !!!\n");
        }
        else
        {
            System.out.println("\n");
            System.out.println("!!! Invalid input given !!!\n");
            // continue label;
        }
        System.out.println("Enter the core average temperature (Celsius) of the Nuclear Reactor :");
        tempC = obj.nextDouble();
        System.out.println("\nThe core average temperature of the Nuclear Reactor (Celsius) is: " + tempC + "C");
        tempK = tempC + 273.15;
        System.out.println("\nThe core average temperature of the Nulcear Reactor (Kelvin) is: " + tempK + "K\n");
    }
}
//Currency Converter
import java.util.Scanner;
public class Assignment5 {
    public static double result;
    public static double usdNum = 135.03;
    static void calcu(double x)
    {
        result = x/usdNum;
        System.out.println("The converted amount is :" + result);
    }
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        double nepNum = 0;
        System.out.print("Enter the nepali rupees to convert into USD: ");
        nepNum = input.nextDouble();
        calcu(nepNum);
        input.close();
    }
}

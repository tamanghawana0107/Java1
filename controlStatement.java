import java.util.Scanner;
//conditional statement
//looping statement
//branching statement

public class controlStatement
{
    public static void main(String[] args)
    {
        Scanner obj = new Scanner(System.in);
        /*int age;
        System.out.println("Enter your age:");
        age = obj.nextInt();
        switch(age)
        {
            case 40:
                System.out.println("Your age is 40");
                break;
            case 60:
                System.out.println("You are retired");
                break;
            default:
                System.out.println("You are young");
                break;
        }
         if(age == 40 )
        {
                System.out.println("Your age is 40");
        }
        else if(age == 60)
        {
            System.out.println("Your are retired");
        }
        else{
            System.out.println("You are young");
        }
        while(age == 40)
        {
            System.out.println("Age is 40");
            break;
        }
        do
        {
            System.out.println("age is 60");
            break;
        }while(age == 60);
        
        [foreach loop]
        String[] cars = {"Volvo,BMW,SCODA"};
        for (String i : cars)
        {
            System.out.println("I wanna buy" + i);
        }*/
        int money = 1;
        int i=1;
        /*for(int i = 1; i<=10; i++)
        {
            money = money * i;  //money *= i
            System.out.println(money); 
        }
        System.out.println("Total result =" + money);*/
        while(i <=10)
        {
            money *= i;
            System.out.println(money);
            i++;
        }
        System.out.println("Total result " + money);
    }
}
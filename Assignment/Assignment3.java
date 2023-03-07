// Guessing Game
import java.util.Scanner;
import java.util.Random;
import java.lang.*;
public class Assignment3{
    public static void main(String[] args)
    {
        int result;
        Scanner input = new Scanner(System.in);
        System.out.println("**********Welcome to the guessing game**********");
        System.out.println("1. Enter the game");
        System.out.println("2. Exit the game");
        System.out.print("Enter the choice: ");
        result = input.nextInt();
        switch(result)
        {
            case 1:
                int ans;
                int[] numGuess = {1,2,3,4,5,6,7,8,9,10};
                Random r = new Random();
                int number = r.nextInt(10);
                int computerGuess = numGuess[number];
                System.out.println("\n\n**********Rules to play the game**********");
                System.out.println("\n--> You will be given 5 chance to guess the number from 1 to 10");
                System.out.println("\n--> You will also be provided hint for playing the game");
                System.out.println("\n--> System will pick a random number and you have to guess the number");
                System.out.println("\n\n**********Best of Luck**********");
                for(int i =0;i<5;i++)
                {
                    System.out.print("\nPick a number between 1 to 10");
                    System.out.print("\nEnter the guess number: ");
                    ans = input.nextInt();
                    if(ans <= 10)
                    {
                        System.out.println("Your Guess is --> " + ans);
                    }
                    for(int j : numGuess)
                    {
                        if(ans == computerGuess)
                        {
                            System.out.println("!!! Congratulation for winning the Game !!!");
                            System.exit(0);
                        }
                        else if(ans > computerGuess)
                        {
                            System.out.println(ans + " is higher than the number to be guessed");
                            System.out.println("!!! Try again next time !!! ");
                            break;
                        }
                        else if(ans < computerGuess)
                        {
                            System.out.println(ans + " is lower than the number to be guessed");
                            System.out.println("!!! Try again next time !!! ");
                            break;
                        }
                        else
                        {
                            break;
                        }
                    }
                    
                }
                break;
            case 2:
            System.out.println("\n\n**********Exiting from the system*********\n");
            System.exit(0);

            default:
            System.out.println("\n\n!!! Invalid input given !!!\n");
            break;
        }
    }
}
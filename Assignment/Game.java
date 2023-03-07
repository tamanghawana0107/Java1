// Scissor , paper , rock game
import java.util.Scanner;
import java.util.Random;
public class Game{
    public static void main(String[] args)
    {
        int result;
        Scanner input = new Scanner(System.in);
        System.out.println("********************Welcome to the game********************");
        System.out.println("1. Enter the game");
        System.out.println("2. Exit the game");
        System.out.print("Enter the choice :");
        result = input.nextInt();
        switch(result)
        {
            case 1:
                char ans;
                System.out.println("********************Rules to play the game********************");
                System.out.println("'S' for Scissor");
                System.out.println("'P' for Paper");
                System.out.println("'R' for Rock");
                System.out.println("********************Best of Luck********************");
                System.out.print("Enter the option given above to play the game: ");
                ans = input.next().charAt(0);
                if(ans == 'S' || ans == 's')
                {
                    System.out.println("Your input is ---> " + ans);
                }
                else if(ans == 'P' || ans == 'p')
                {
                    System.out.println("Your input is ---> " + ans);
                }
                else if(ans == 'R' || ans == 'r')
                {
                    System.out.println("Your input is ---> " + ans);
                }
                else
                {
                    System.out.println("!!! Invalid input given !!!");
                }
                char[] maxMove = {'S','P','R'};
                // compare the moves
                Random random = new Random();
                int number = random.nextInt(3);
                char computerMove = maxMove[number];
                if(ans == 'S' || ans == 'P' || ans == 'R')
                {
                    System.out.println("Computer move: " + computerMove);
                }
                else{
                    System.out.println("!!! Invalid input given !!!");
                    System.exit(0);
                }
            
                if(computerMove == 'S' && ans == 'S')
                {
                    System.out.println("--> The match is draw!");
                    System.out.println("--> No one wins");
                }
                else if(computerMove == 'S' && ans == 'P')
                {
                    System.out.println("--> Computer wins the game");
                    System.out.println("--> Better luck next time");
                }
                else if(computerMove == 'S' && ans == 'R')
                {
                    System.out.println("--> You win the game");
                    System.out.println("--> Lucky");
                }
                else if(computerMove == 'R' && ans == 'S')
                {
                    System.out.println("--> Computer wins the game");
                    System.out.println("--> Better luck next time");
                }
                else if(computerMove == 'R' && ans == 'P')
                {
                    System.out.println("--> You win the game");
                    System.out.println("--> Lucky");
                }
                else if(computerMove == 'R' && ans == 'R')
                {
                    System.out.println("--> The match is draw!");
                    System.out.println("--> No one wins");
                }
                else if(computerMove == 'P' && ans == 'S')
                {
                    System.out.println("--> You win the game");
                    System.out.println("--> Lucky");
                }
                else if(computerMove == 'P' && ans == 'P')
                {
                    System.out.println("--> The match is draw!");
                    System.out.println("--> No one wins");
                }
                else if(computerMove == 'P' && ans == 'R')
                {
                    System.out.println("--> Computer wins the game");
                    System.out.println("--> Better luck next time");
                }
                else{
                    System.out.println("There is no computer move");
                }
                break;
            case 2:
                System.out.println("*******************Exiting the game*******************");
                System.exit(0);
            default:
                System.out.println("!!! Invalid input provided !!!");
                break;
                
        } 
        input.close();
    }
}
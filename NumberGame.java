import java.util.*;
import java.util.Random;
public class NumberGame
{
	public static void main(String[] args) {
        System.out.println("WELCOME !!!");
        game();
        return ;
        
    }
    public static void game(){
        Scanner sc = new Scanner(System.in);
		Random random = new Random();
		int num = random.nextInt(99) + 1;
		System.out.println("Guess a number between 1 and 100");
		System.out.println("You have 10 attempts to guess the number");
		for(int i=10;i>0;i--)
		{
		    int guess = sc.nextInt();
            sc.close();
		    if(guess == num)
		    {
		        System.out.println("Congrats !!! 🥳 .... You have won");
		        int score = 10*i;
		        System.out.println("Your score is "+score);
		        return;
		    }
		    if(guess > num)
		    {
		        System.out.println("The guessed number is greater");
		    }
		    if(guess < num)
		    {
		        System.out.println("The guessed number is smaller");
		    }
		    System.out.println("-----------------------------------------------------------------------------");
		    System.out.println("You have "+ (i-1)+ " more attempts to guess the number"); 
		}
		System.out.println("Better luck next time");
        return ;
	}
}
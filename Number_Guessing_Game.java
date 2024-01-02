import java.util.Scanner;
import java.Random;
class Number_Guessing_Game.java
  {
    public static void main(String args[])
    {
      Scanner sc = new Scanner(System.in);
      int randNum = sc.nextInt(100);
      int guess = -1;
      int tries = 0;
      while(guess!=randNum)
        {
          System.out.println("Guess a number b/w 1 to 100");
          guess = sc.nextInt();
          tries++;

          if(guess == randNum)
          {
            System.out.println("Hurrah!You guessed it correct");
            System.out.println("It only took you"+ tries + "guesses!");
            System.out.println("Would you like to play again!!!");
            play = sc.next().toLowerCase();
          }
          else if(guess>randNum)
          {
            System.out.println("Oops!Your Guess is too high,try again");
          }
          else
          {
            System.out.println("Oops!Your Guess is too low,try again");
          }
        
        }
        
    }

  }
//052 - Project - Console - Game - Guess the Number - 2004/2022 C. S. Germany

/*

Using what you've learned to make something fun: 
A Number Guessing Game

*/

//---------------------------------------------------------------------------------------------------------------------------

import java.io.*;
import java.util.Random;

//---------------------------------------------------------------------------------------------------------------------------

public class JAVA_052_PRJ_CONS_GAME_Guess_The_Number
{ 
       //Globals
       public static LineNumberReader INPUT = new LineNumberReader(new InputStreamReader(System.in));
       public static Random BANANA = new Random();
       public static int TheNumber = 5;
       public static int LowestNumber = 1;
       public static int HighestNumber = 10;
       public static int TheGuess = 0;
       public static int WRONG = 0;
       public static int RIGHT = 0;

       public static String IN()
       {
              String INFO = "0";
              try { INFO = INPUT.readLine(); }
              catch(IOException X) { System.out.print("\n\nIO Error...\n\n"); }
              return INFO;
       }

       public static void main(String args[])
       {
              
              String GUESS = "";
              System.out.print("\n\nGuess a Number 1.0\n");
              
              //outter for loop
              for(int x = 0; x < 5; x++)
              {
                  System.out.println("\n-----------------------------------------------");
                  System.out.print("\nGuessing for number: " + (x+1) + ".");
                  System.out.print("\nGuess a number from: " + LowestNumber
                                   + " to " + HighestNumber + ".\n");

                  TheNumber = BANANA.nextInt(HighestNumber) + 1;

                  //inner for loop
                  for(int y = 0; y < 3; y++)
                  {
                       System.out.print("\nGuess # " + (y+1) + " for number " + (x+1) + ".  ");
                       GUESS = IN();
                       try { TheGuess = Integer.parseInt(GUESS); }
                       catch(NumberFormatException KIWI)
                       { 
                            System.out.print("\nThat was not a number! Guess = " + LowestNumber + ".\n");
                            TheGuess = LowestNumber;
                       }

                       if(TheGuess < LowestNumber || TheGuess > HighestNumber)
                      {
                            System.out.print("\n\nOutside of valid range.\n\n");
                       }
                       else
                       {
                             if(TheGuess == TheNumber)
                             {
                                 System.out.print("\n\nYou guessed it!");
                                 RIGHT++;
                                 break;
                             }
                             else if(TheGuess > TheNumber)
                             {
                                 System.out.print("\n\nThe number is smaller.");
                                 WRONG++;
                             }
                             else
                             {
                                 System.out.print("\n\nThe number is larger.");
                                 WRONG++;
                             }//closes else

                       }//closes outer if

           }//closes inner for loop

          System.out.print("\nThe RANDOM number was: " + TheNumber + ".\n");
                  
       }//closes outter for loop

       //Determine winner       
       if(RIGHT > 2)
       {
           System.out.print("\nYou win!\n\n");
       }
       else
       {
           System.out.print("\nSorry - you lose.\n\n");
       }

       System.out.print("\nYou made " + WRONG + " wrong guess(es).");
       System.out.print("\nYou made " + RIGHT + " right guess(es).");
       System.out.println();

       }//closes main() function

 //--------------------------------------------------------------------------------------------  
     
}//close class def

//---------------------------------------------------------------------------------------------------------------------------


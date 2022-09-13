//015 - Repetitions - While True Loop- 2004/2022 C. S. Germany

/*

while/true loop - may never execute at all if the test condition is FALSE.
As a result, a while/true loop is called a "pre-test" loop, and a do/while loop is called a "post-test".

*/

//---------------------------------------------------------------------------------------------------------------------------

import java.io.*;

//---------------------------------------------------------------------------------------------------------------------------

public class JAVA_015_Repetitions_While_True_Loop
{  
       public static void main(String args[])
       { 
              int SecretNumber = 7;
              String PlayerGuess = "";
              int GUESS = 0;
              int WrongGuessCount = 0;
              final int NumGuesses = 3;

              LineNumberReader cin = new LineNumberReader(new InputStreamReader(System.in));
              
              while(WrongGuessCount < NumGuesses)
              {
                  System.out.println("Guess my number:    ");
                  try { PlayerGuess = cin.readLine(); }
                  catch(IOException e){ System.err.println("Error"); }
                 
                  try { GUESS = Integer.parseInt(PlayerGuess); }
                  catch(NumberFormatException e) { System.out.println("That was not a number!"); }                 
             
                  if(GUESS < SecretNumber)
                  {
                      System.out.println("You guessed lower.");
                  }
                  else if(GUESS > SecretNumber)
                  {
                      System.out.println("You guessed higher.");
                  }
                  else if(GUESS == SecretNumber)
                  {
                      System.out.println("You guessed it!.");
                      break;                
                  }

                  WrongGuessCount++;
              }

              System.exit(0);    
       }
}

//---------------------------------------------------------------------------------------------------------------------------


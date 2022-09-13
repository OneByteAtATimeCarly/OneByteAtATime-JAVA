//016 - Repetitions - While True Loop- 2004/2022 C. S. Germany

/*

do/while loop - similar to the while/true loop in terms of what it does. The difference is that it will perform the actions defined
within the block of code at least once before evaluating the expression. With a while/true loop, if the condition being tested for
is false, the contents of the loop may never be executed. With do/while, you can be sure the contents of the loop will execute at
least once when that is needed. As a result, a while/true loop is called a "pre-test" loop, and a do/while loop is called a "post-test".

*/

//---------------------------------------------------------------------------------------------------------------------------

import java.io.*;

//---------------------------------------------------------------------------------------------------------------------------

public class JAVA_016_Repetitions_Do_While
{  
       public static void main(String args[])
       { 
              int SecretNumber = 7;
              String PlayerGuess = "";
              int GUESS = 0;
              int WrongGuessCount = 0;
              final int NumGuesses = 3;

              LineNumberReader cin = new LineNumberReader(new InputStreamReader(System.in));
              
              do
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
                  
              } while(WrongGuessCount < NumGuesses);

              System.exit(0);    
       }
}

//---------------------------------------------------------------------------------------------------------------------------


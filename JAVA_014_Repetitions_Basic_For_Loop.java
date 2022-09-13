//014 - Repetitions - Basic For Loop - 2004/2022 C. S. Germany



//---------------------------------------------------------------------------------------------------------------------------

import java.io.*;

//---------------------------------------------------------------------------------------------------------------------------

public class JAVA_014_Repetitions_Basic_For_Loop
{  
       public static void main(String args[])
       { 
              int num = 7;
              int GUESS;
              final int NumGuesses = 3;
              String PlayerGuess = "";
              
              LineNumberReader cin = new LineNumberReader(new InputStreamReader(System.in));
 
              for(int z = 0; z < NumGuesses; z++)
              {
                  System.out.println("Guess my number:    ");
                  
                  try { PlayerGuess = cin.readLine(); }
                  catch(IOException e){ System.err.println("Error"); }
                 
                  GUESS = Integer.parseInt(PlayerGuess);
             
                  if(GUESS < num)
                  {
                      System.out.println("You guessed lower.");
                  }
                  else if(GUESS > num)
                  {
                      System.out.println("You guessed higher.");
                  }
                  else if(GUESS == num)
                  {
                      System.out.println("You guessed it!.");
                      break;                
                  }
              }

              System.exit(0);    
       }
}

//---------------------------------------------------------------------------------------------------------------------------


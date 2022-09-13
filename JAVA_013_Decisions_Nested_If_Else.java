//012 - Decision Structures - If/Else - LineNumberReader - 2004/2022 C. S. Germany



//---------------------------------------------------------------------------------------------------------------------------

import java.io.*;

//---------------------------------------------------------------------------------------------------------------------------

public class JAVA_013_Decisions_Nested_If_Else
{  
       public static void main(String args[])
       { 
              int Number = 0;
              int SecretNumber = 7;
              String choice = "";

              LineNumberReader cin = new LineNumberReader(new InputStreamReader(System.in));
 
              System.out.println("\nEnter a number from 1-10: ");
             
              try { choice = cin.readLine(); }
              catch(IOException e) { System.err.println("Error."); }
 
              try { Number = Integer.parseInt(choice); }
              catch(NumberFormatException e) { System.out.println("That was not a number!"); }
             
              if(Number > 0 && Number < 11)
              {
                 System.out.println("The number is within the valid RANGE.");

                 if(Number > SecretNumber) { System.out.println("My number was smaller."); }
                 else if(Number < SecretNumber) { System.out.println("My number was bigger."); }
                 else if(Number == SecretNumber) { System.out.println("You guessed my number!"); }
              }
              else
              {
                 System.out.println("The number is outside the valid RANGE. Invalid number.");  
              }

              System.exit(0);   
       }
}

//---------------------------------------------------------------------------------------------------------------------------


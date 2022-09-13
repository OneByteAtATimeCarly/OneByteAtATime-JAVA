//011 - Decision Structures - If/Else - LineNumberReader - 2004/2022 C. S. Germany



//---------------------------------------------------------------------------------------------------------------------------

import java.io.*;

//---------------------------------------------------------------------------------------------------------------------------

public class JAVA_011_Decisions_Switch_Statement_2_Rule_Switch
{  
       public static void main(String args[])
       { 
              int Number = 0;
              String choice = "";

              LineNumberReader cin = new LineNumberReader
              (new InputStreamReader(System.in));
 
              System.out.println("\nEnter a number from 1 - 7: ");
             
              try { choice = cin.readLine(); }
              catch(IOException e) { System.err.println("Error."); }
 
              try { Number = Integer.parseInt(choice); }
              catch(NumberFormatException e) { System.out.println("That was not a number!"); }
             
              switch(Number)
              {
                   case 1 -> System.out.println("You chose 1");
                   case 2 -> System.out.println("You chose 2");
                   case 3 -> System.out.println("You chose 3");
                   case 4 -> System.out.println("You chose 4");
                   case 5 -> System.out.println("You chose 5");
                   case 6 -> System.out.println("You chose 6");
                   case 7 -> System.out.println("You chose 7");
                   default -> System.out.println("Your choice is invalid.");

              } //close switch statement

             System.exit(0);     
       }
}

//---------------------------------------------------------------------------------------------------------------------------


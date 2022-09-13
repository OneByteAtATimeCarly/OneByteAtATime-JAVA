//010 - Decision Structures - If/Else - LineNumberReader - 2004/2022 C. S. Germany

/*

switch(case) statement - A switch statement is a decision structure possessing a default and several cases.  Switch structures allow you to
branch off on any of a number of different values.  "if" and "else...if" combinations can become confusing when nested too deeply. The switch
statement evaluates "expression" and compares the result to each of the case values.  The evaluation is ONLY for equality.  

Relational operators (<>) and Boolean expressions can not be used here. If one of the case values matches the expression, execution jumps to
those statements and continues to the end of the switch block unless a break statement is encountered.  If nothing at all matches, execution
branches to the "default" statement.  If there is no default statement and there is no matching value, execution falls through the switch
statement and the statement ends.  You should always include a default case in switch statements, if only to render an error message.

Note: If there is no break statement at the end of a case statement, execution will fall through to the next case. This is sometimes
necessary or what you want, but many times it is an error.  If you do decide to let execution fall through, you might
consider placing a comment indicating your intention and that you simply didn't just forget the "break" statement.

The switch statement is easier to follow than a bunch of nested if/else statements. Still, there are some situations that demand if/else
statements. You can not switch on a string for each case, but you may compare string with "equals" and if/else. In a similar fashion, you
can not use complex operational expressions and comparisons with switch statements  the way you can with if/else. You may pass a char
into a switch statement.

*/

//---------------------------------------------------------------------------------------------------------------------------

import java.io.*;

//---------------------------------------------------------------------------------------------------------------------------

public class JAVA_010_Decisions_Switch_Statement_1_numbers
{  
       public static void main(String args[])
       { 
              int Number = 0;
              String choice = "";

              LineNumberReader cin = new LineNumberReader(new InputStreamReader(System.in));
 
              System.out.println("\nEnter a number from 1 - 7: ");
             
              try { choice = cin.readLine(); }
              catch(IOException e) { System.err.println("Error."); }
 
              try { Number = Integer.parseInt(choice); }
              catch(NumberFormatException e) { System.out.println("That was not a number!"); }
             
              switch(Number)
              {
                   case 1 : System.out.println("You chose 1"); break;
                   case 2 : System.out.println("You chose 2"); break;
                   case 3 : System.out.println("You chose 3"); break;
                   case 4 : System.out.println("You chose 4"); break;
                   case 5 : System.out.println("You chose 5"); break;
                   case 6 : System.out.println("You chose 6"); break;
                   case 7 : System.out.println("You chose 7"); break;
                   default : System.out.println("Your choice is invalid.");

              } //close switch statement

             System.exit(0);     
       }
}

//---------------------------------------------------------------------------------------------------------------------------


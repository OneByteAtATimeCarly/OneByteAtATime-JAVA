//008 - Decision Structures - If/Else - JOPtionPane - 2004/2022 C. S. Germany

/*

Decision structures allow your programs to make decisions based upon user input or the results of a process. Java contains
if/else and switch structures, as in C++. They follow the general principles of logic, and in addition to employing relational
and mathematical operators, they also employ logical operators.  Logical operators allow more than one relational expression to
be evaluated at a time, allowing for a greater complexity of decisions as bits can be "AND'd" and "OR'd" together :)

if statement - enable testing for a condition and branching to different parts of code depending on the result.   The syntax is as following:

if(expression)
     statement;

else clause - makes code more easily readable, program follows one branch of code if the condition is true and another branch of code if it is false.  Syntax is as follows:

if(expression)
    statement;
else

*/

//---------------------------------------------------------------------------------------------------------------------------

import javax.swing.*;

//---------------------------------------------------------------------------------------------------------------------------

public class JAVA_008_Decisions_If_Else_JOPtionPane
{  
       public static void main(String args[])
       { 
              System.out.println("\n---------------------------------------------------------------------------");

              int FirstNumber = 0;
              int SecondNumber = 0;
 
              FirstNumber = Integer.parseInt
              (JOptionPane.showInputDialog(null, "Enter a larger number:"));
 
              SecondNumber = Integer.parseInt
             (JOptionPane.showInputDialog(null, "Enter a smaller number:"));
 
             if(FirstNumber > SecondNumber)
             {  
                JOptionPane.showMessageDialog(null, "The 1st number is greater.");                
             }
             else
             {
                JOptionPane.showMessageDialog(null, "The 2nd number is greater.");
             }

             System.exit(0);              
              
              System.out.println("---------------------------------------------------------------------------\n");
       }
}

//---------------------------------------------------------------------------------------------------------------------------


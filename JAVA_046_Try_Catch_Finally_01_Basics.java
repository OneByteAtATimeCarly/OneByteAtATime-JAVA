//044 - Try Catch Finally - The Basics - 2004/2022 C. S. Germany

/*

JAVA Exception Handling:
Try - block of code that might give rise to the exception in a special block with a “Try” keyword.
Catch - when the exception is raised it needs to be caught by the program. A catch block follows the try block that raises an exception.
Finally	- when important code in our program that needs to be executed irrespective of whether or not the exception is thrown. 
Throw -	keyword “throw” is used to throw the exception explicitly.
Throws - keyword “Throws” does not throw an exception but used to declare exceptions. Used to indicate that an exception might occur in the method.

*/


//---------------------------------------------------------------------------------------------------------------------------

import java.io.*;

//---------------------------------------------------------------------------------------------------------------------------

public class JAVA_046_Try_Catch_Finally_01_Basics
{    

public static void main(String args[]) 
{
       int Num1;
       int Num2;
      
       try 
       {
            System.out.println("\nTry Block: START");
            Num1 = 0;
            Num2 = 444 / Num1;
            System.out.println(Num2);
            System.out.println("Try Block: END");
       }
       catch (ArithmeticException e) 
       { 
            System.out.println("CATCH: ArithmeticException: Divide by Zero!");
       }
      
       System.out.println("Outside try-catch blocks now.\n");  
       System.exit(0);
}

}//close class def

//---------------------------------------------------------------------------------------------------------------------------


//048 - Try Catch Finally - Exception Not Thrown - 2004/2022 C. S. Germany

/*

Try Catch Finally - Exception Not Thrown

*/


//---------------------------------------------------------------------------------------------------------------------------

import java.io.*;

//---------------------------------------------------------------------------------------------------------------------------

public class JAVA_048_Try_Catch_Finally_05_Finally_Exception_Thrown
{ 
//----------------------------------------------------------------------------
   
       public static void main(String[] args)
       {
              try
              {
                   System.out.println("Inside TRY Block");
                   int data = 500 / 0;
                   System.out.println("Result: " + data);
              } 
              catch(ArithmeticException e) 
              {
                   System.out.println("Inside Catch Block: ArithmeticException. Divided by 0!");
                   System.out.println(e);
              } 
              finally 
              {
                   System.out.println("Inside Finally Block");
                   System.out.println("No Exception: The finally block will be executed!");
              } 
              
              System.out.println ("Outside TRY/CATCH/FINALLY");

              System.exit(0);

       }//close main()

//----------------------------------------------------------------------------

}//close class def

//---------------------------------------------------------------------------------------------------------------------------


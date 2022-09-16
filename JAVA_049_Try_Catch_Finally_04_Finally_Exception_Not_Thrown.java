//047 - Try Catch Finally - Exception Not Thrown - 2004/2022 C. S. Germany

/*

Try Catch Finally - Exception Not Thrown

*/


//---------------------------------------------------------------------------------------------------------------------------

import java.io.*;

//---------------------------------------------------------------------------------------------------------------------------

public class JAVA_049_Try_Catch_Finally_04_Finally_Exception_Not_Thrown
{ 
//----------------------------------------------------------------------------
   
       public static void main(String[] args)
       {
              try
              {
                   System.out.println("Inside TRY Block");
                   int data = 500 / 10;
                   System.out.println("Result: " + data);
              } 
              catch(NullPointerException e) 
              {
                   System.out.println("Inside Catch Block");
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


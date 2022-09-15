//046 - Try Catch Finally - Nested - 2004/2022 C. S. Germany

/*

Try Catch Finally - Nested With Multiple Exceptions

*/


//---------------------------------------------------------------------------------------------------------------------------

import java.io.*;

//---------------------------------------------------------------------------------------------------------------------------

public class JAVA_046_Try_Catch_Finally_03_Nested
{ 
//----------------------------------------------------------------------------
   
       public static void main(String[] args)
       {
              //outer try block
              try
              {
                  System.out.println("Outer TRY block 1 here.");

                  //inner try blocks
                  try
                  {
                     System.out.println("Inner TRY block 1 here.");
                     int num =15/0;
                     System.out.println(num);
                  }
                  catch(ArithmeticException e1)
                  {
                     System.out.println("Inner TRY: Arithmetic Exception");
                  }
                  try
                  {
                     System.out.println("Inner TRY block 2 here.");
                     int num =100/0;
                     System.out.println(num);
                  }
                  catch(ArrayIndexOutOfBoundsException e2)
                  {
                     System.out.println("Inner TRY: ArrayIndexOutOfBoundsException");
                  }
               
                  System.out.println("Some code after Block1 and Block2");
              }
              catch(ArithmeticException e3)
              {
                   System.out.println("Outer TRY: ArithmeticException");
              }
              catch(ArrayIndexOutOfBoundsException e4)
              {
                  System.out.println("Outer TRY:ArrayIndexOutOfBoundsException");
              }
              catch(Exception e5)
              {
                  System.out.println("Outer TRY: Generic Exception");
              }
           
              System.out.println("Outside all TRY/CATCH blocks.");

              System.exit(0);

       }//close main()

//----------------------------------------------------------------------------

}//close class def

//---------------------------------------------------------------------------------------------------------------------------


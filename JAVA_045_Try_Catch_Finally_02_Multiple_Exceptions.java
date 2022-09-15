//045 - Try Catch Finally - Multiple Exceptions - 2004/2022 C. S. Germany

/*

Try Catch Finally - Multiple Exceptions

*/


//---------------------------------------------------------------------------------------------------------------------------

import java.io.*;

//---------------------------------------------------------------------------------------------------------------------------

public class JAVA_045_Try_Catch_Finally_02_Multiple_Exceptions
{ 
//----------------------------------------------------------------------------
   
       public static void main(String[] args)
       {
              try
              {    
                   System.out.println("\nTry Block: START");  
                   int Bad_Array[] = new int[5];    
                   System.out.println("Array element 10 : " + Bad_Array[10]);
                   Bad_Array[5] = 10/0;     
              } 
           
              //multiple catch blocks
              catch(ArithmeticException e)  
              {  
                  System.out.println("Arithmetic Exception: Divide by zero! Noooo!");  
              }
              catch(ArrayIndexOutOfBoundsException e)  
              {  
                  System.out.println("ArrayIndexOutOfBounds: Accessed index out of bounds");  
              } 
              catch(Exception e)  
              {  
                  System.out.println("Other Exception: " + e.getMessage ());  
              }      
           
              System.out.println("Outside TRY/CATCH");  
           
              System.exit(0);

       }//close main()

//----------------------------------------------------------------------------

}//close class def

//---------------------------------------------------------------------------------------------------------------------------


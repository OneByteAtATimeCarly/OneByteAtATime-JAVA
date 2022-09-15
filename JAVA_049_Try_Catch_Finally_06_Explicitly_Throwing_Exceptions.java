//049 - Try Catch Finally - Exception Not Thrown - 2004/2022 C. S. Germany

/*

Try Catch Finally - Exception Not Thrown

*/


//---------------------------------------------------------------------------------------------------------------------------

import java.io.*;

//---------------------------------------------------------------------------------------------------------------------------

public class JAVA_049_Try_Catch_Finally_06_Explicitly_Throwing_Exceptions
{ 
   
//--------------------------------------------------------------------------------------------              
       public static void main(String[] args) 
       {
              int Age = 14;
             
              Check_Age(Age);
              
              System.exit(0);
              
       }//close main() function
       
//--------------------------------------------------------------------------------------------              
       
       public static void Check_Age(int AGE) throws ArithmeticException
       {
              if(AGE < 16)
              {
                  throw new ArithmeticException("Too young to drive in Florida.");  
              }
       }
 //-------------------------------------------------------------------------------------------- 


}//close class def

//---------------------------------------------------------------------------------------------------------------------------


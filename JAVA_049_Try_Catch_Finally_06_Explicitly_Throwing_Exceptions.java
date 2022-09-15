//049 - Try Catch Finally - Explicitly throwing exceptions with throws and throw - 2004/2022 C. S. Germany

/*

Try Catch Finally - Explicitly throwing exceptions with throws and throw

*/


//---------------------------------------------------------------------------------------------------------------------------

import java.io.*;

//---------------------------------------------------------------------------------------------------------------------------

public class JAVA_049_Try_Catch_Finally_06_Explicitly_Throwing_Exceptions
{ 
       public static void Check_Driving_Age(int AGE) throws IllegalAccessException
       {
           System.out.println("Check_Driving_Age fun(). ");
        
           if(AGE < 16) 
           {
                throw new IllegalAccessException("Below legal limit for Florida!");
           }

       }//close Check_Driving_Age() function
    
 //--------------------------------------------------------------------------------------------      
       public static void main(String args[])
       {
           try
           {
                Check_Driving_Age(14);
           }
           catch(IllegalAccessException e)
           {
               System.out.println("Caught exception in main() function.");
               System.out.println("Exception: " + e);
           }

    }//close main() function

 //--------------------------------------------------------------------------------------------  
     
}//close class def

//---------------------------------------------------------------------------------------------------------------------------


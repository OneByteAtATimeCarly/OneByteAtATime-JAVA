//020- Functions - Returning Values and Taking Arguments- 2004/2022 C. S. Germany

/*

Returns a value and takes 2 arguments

*/

//---------------------------------------------------------------------------------------------------------------------------

import java.io.*;

//---------------------------------------------------------------------------------------------------------------------------

public class JAVA_020_Functions_Returning_Values_AND_Taking_Arguments
{  
//-----------------------------------------------------------------------------------
    
       //Now we define the function to take 2 arguments and return a value

       public static String Do_Stuff(String x, int y)
       {
              String MESSAGE = "My name is " + x + " and " +
                               "I am " + y + " years old." ;
              
              return MESSAGE;

       }//close Do_Stuff() function   
 
//-----------------------------------------------------------------------------------
       
       public static void main(String[] args) 
       {
              System.out.println("\n----------------------------------------------------------------");
              System.out.println("Inside the class's main() function.");
              System.out.println("Calling the Do_Stuff() function from main().");
              
              String The_Message = Do_Stuff("Twilight Sparkle",10);
              
              System.out.println("\nBack inside the class's main() function.");
              
              System.out.println("\nValue returned: " + The_Message);
              
              System.out.println("----------------------------------------------------------------\n");
              
              System.exit(0);      
       }      
//-----------------------------------------------------------------------------------    
}

//---------------------------------------------------------------------------------------------------------------------------


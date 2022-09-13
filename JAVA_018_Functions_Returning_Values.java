//018 - Functions - Returning Values - 2004/2022 C. S. Germany

/*

Returns a value, takes no arguments

*/

//---------------------------------------------------------------------------------------------------------------------------

import java.io.*;

//---------------------------------------------------------------------------------------------------------------------------

public class JAVA_018_Functions_Returning_Values
{  
//-----------------------------------------------------------------------------------
    
       //Notice now when defining we have to declar the return type in the fucntion header = String
       public static String Do_Stuff()
       {
              return "Doing stuff...";

       }//close Do_Stuff() function     
//-----------------------------------------------------------------------------------
       
       public static void main(String[] args) 
       {
              System.out.println("\n----------------------------------------------------------------");
              System.out.println("Inside the class's main() function.");
              System.out.println("Calling the Do_Stuff() function from main().");
              
              String WhatWasSaid = Do_Stuff(); //invoking function

              System.out.println("\nBack inside the class's main() function.");
              
              System.out.println("\nThe RETURN value from DoStuff() was: " + WhatWasSaid);
              
              System.out.println("----------------------------------------------------------------\n");
              
              System.exit(0);      
       }      
//-----------------------------------------------------------------------------------    
}

//---------------------------------------------------------------------------------------------------------------------------


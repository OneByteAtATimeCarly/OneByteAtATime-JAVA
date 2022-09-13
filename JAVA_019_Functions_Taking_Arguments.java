//019 - Functions - Taking Arguments - 2004/2022 C. S. Germany

/*

Takes an argument, returns no values

*/

//---------------------------------------------------------------------------------------------------------------------------

import java.io.*;

//---------------------------------------------------------------------------------------------------------------------------

public class JAVA_019_Functions_Taking_Arguments
{  
//-----------------------------------------------------------------------------------
    
       //Notice return type is void but the argument is defined in ()
       public static void Do_Stuff(String WhatToSay)
       {
              System.out.println("\nInside Do_Stuff() function.");
              System.out.println("Argument Received as WhatToSay = \"" + WhatToSay + "\"");

       }//close Do_Stuff() function     
//-----------------------------------------------------------------------------------
       
       public static void main(String[] args) 
       {
              System.out.println("\n----------------------------------------------------------------");
              System.out.println("Inside the class's main() function.");
              System.out.println("Calling the Do_Stuff() function from main().");
              
              Do_Stuff("Hi everypony! Friendship is magic."); //invoking function

              System.out.println("\nBack inside the class's main() function.");
              
              System.out.println("----------------------------------------------------------------\n");
              
              System.exit(0);      
       }      
//-----------------------------------------------------------------------------------    
}

//---------------------------------------------------------------------------------------------------------------------------


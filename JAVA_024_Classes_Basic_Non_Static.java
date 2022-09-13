//024 - Classes - Inheritance - Static - 2004/2022 C. S. Germany

/*

Note: If you aren't using an IDE like NetBeans or Visual Studio Code, and you are compiling from a command prompt
using the JDK, you will need to do THIS:

1. compile the driver class with the main method from the command prompt with "javac". 
   Example: javac JAVA_024_Classes_Basic_Non_Static.java

   This should compile the driver class as well as all the classes it's instantiating into bytecode .class files.

2. After compiling to byte code, then run it by typing "java" + the driver class name. 
   Example: java JAVA_024_Classes_Basic_Non_Static

*/


//---------------------------------------------------------------------------------------------------------------------------

import java.io.*;

//---------------------------------------------------------------------------------------------------------------------------

public class JAVA_024_Classes_Basic_Non_Static
{      
       public static void main(String[] args) 
       {
              System.out.println("\n----------------------------------------------------------------");
              System.out.println("Inside the class's main() function.\n");
        
              JAVA_023_Classes_CLASS_Monster GODZILLA = new JAVA_023_Classes_CLASS_Monster();

              GODZILLA.Display_Monster();
              GODZILLA.Rampage();
              
              System.out.println("----------------------------------------------------------------\n");
              
              System.exit(0);      
       }                

//-----------------------------------------------------------------------------------    

}

//---------------------------------------------------------------------------------------------------------------------------


//017 - Functions - 2004/2022 C. S. Germany

/*

FUNCTIONS - provide a way to modularize code. How do you eat an elephant? One bite at a time. If you write your Java code
in concise and neat functions and classes, you will maximize the amount of code you can reuse and minimize your work load. You
will also be able to deal with complex programming tasks by using recursive functions and breaking larger tasks into a series
of functions that, as a sum total, will solve a much larger problem. It is common after pseudo-coding a project out to "stub out"
its functions. That is to say, after thinking about how you want to modularize it and break it apart, you create the project by coding
all all of its functions as empty functions. Although there is no code to do anything at this stage, it will help you organize your
project and give you a starting point. You then go back and code out each function one by one, debugging as you go.

The biggest mistake people make in programming (C++, Java or any other kind) is that they try to debug too much code at one time.
They will type in a hundred, or some even a thousand lines of code before they debug. Then they are overwhelmed by the enormous
list of errors returned when they build and compile their project. This is compounded by the fact that compilers (both C++, Java
and otherwise) don't always get it right. The compiler makes an educated guess, but many times may tell you one thing is wrong when
it's really another. Missing or extraneous braces and semicolons are notorious for this - causing the compiler to tell you your
bugs are one thing when really they are another. You have to learn to "desk check", that is, to step through the code in your head.
You also have to learn to write and debug small parts of your program as you go. This is where the usefulness of functions comes in.

Functions have return types and take arguments. They may also return "void" and take no arguments. They begin and end with a curly
brace. It is a good practice then defining a function to add a closing brace every time you add an opening brace. If you forget,
you will have issues. Once you define a function, you must "call" it or invoke it from elsewhere in the program to get it to execute.

*/

//---------------------------------------------------------------------------------------------------------------------------

import java.io.*;

//---------------------------------------------------------------------------------------------------------------------------

public class JAVA_017_Functions_Basic
{  
//-----------------------------------------------------------------------------------
    
       //Defining a function outside main()
       public static void Do_Stuff()
       {
              System.out.println("\nInside the DoStuff() function. Doing stuff...");

       }//close Do_Stuff() function    
//-----------------------------------------------------------------------------------
       
       public static void main(String[] args) 
       {
              System.out.println("\n----------------------------------------------------------------");
              System.out.println("Inside the class's main() function.");
              System.out.println("Calling the Do_Stuff() function from main().");
              
              Do_Stuff(); //invoking (calling) the function
              
              System.out.println("\nBack inside the class's main() function.");
              System.out.println("----------------------------------------------------------------\n");
              
              System.exit(0);      
       }      
//-----------------------------------------------------------------------------------    
}

//---------------------------------------------------------------------------------------------------------------------------


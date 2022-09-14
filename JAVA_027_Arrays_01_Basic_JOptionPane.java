//027 - Arrays - BAsics JOptionPane - 2004/2022 C. S. Germany

/*

Arrays in Java function in a similar fashion to arrays in C++, but the way you declare and initialize them differ considerably. Any array in Java is treated as an object. When you create an array in Java, it is equivalent to instantiating an array on the heap in C++. Example:

One Dimensional Arrays
Java:   String[] MyArray = new String[5];
C++:   CString * MyArray = new CString[5];

One Dimensional Arrays
Java:   String[][] MyArray = new String[8][8];
C++:   CString * MyArray = new CString[8][8];

Java will automatically size multi-dimensional arrays according to the number of elements. example:

Java:   String[][] MyArray = {   {"Question1", "Answer 1"},  {"Question 2","Answer 2" }   };

Explicit assignment in 2 dimensional array:

MyArray[0][0] = "test";

You can see by the example above that Java is hiding some pointer magic beneath its hood.

*/


//---------------------------------------------------------------------------------------------------------------------------

import javax.swing.*;

//---------------------------------------------------------------------------------------------------------------------------

public class JAVA_026_Classes_Inheritance_Non_Static
{      
       public static void main(String[] args) 
       {
              System.out.println("\n----------------------------------------------------------------");
              System.out.println("Inside the class's main() function.");
        
              String[] MyArray = new String[5];

              for(int x = 0; x < 5; x++)
              {
                    MyArray[x] = JOptionPane.showInputDialog(null,"Input value " + x + ": ");
              }           

             System.out.println("Here are the values you typed: ");

              for(int x = 0; x < 5; x++)
              {
                  System.out.print("Element " + x + " contains: " + MyArray[x] + "\n");
              }             

              System.out.println("----------------------------------------------------------------\n");

              System.exit(0);      
       }                

//-----------------------------------------------------------------------------------    

}

//---------------------------------------------------------------------------------------------------------------------------


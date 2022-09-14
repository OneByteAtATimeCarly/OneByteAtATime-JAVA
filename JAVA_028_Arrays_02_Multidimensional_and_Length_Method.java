//028 - Arrays - Multidimensional - length() method - 2004/2022 C. S. Germany

/*

length() method - very useful when looping with arrays. Can call on any array in JAVA. Returns the number of elements in an array.

Multidimensional array - Declated below using nested curly braces and commas. Can be used to code rows and columns when creating 2-D arrays.

*/


//---------------------------------------------------------------------------------------------------------------------------

import javax.swing.*;

//---------------------------------------------------------------------------------------------------------------------------

public class JAVA_028_Arrays_02_Multidimensional_and_Length_Method
{      
       public static void main(String[] args) 
       {
              System.out.println("\n----------------------------------------------------------------");
              System.out.println("Inside the class's main() function.");
        
              String[][] PonyArray = {  
                                       {"Name", "Twilight Sparkle"}, 
                                       {"Health", "100"},
                                       {"ATK", "10"},
                                       {"DEF", "22"} 
                                   };

              System.out.println("\n--------------Pony Stats--------------");
              for(int x = 0; x < PonyArray.length; x++)
              {
                  System.out.print(PonyArray[x][0] + ": " + PonyArray[x][1] + "\n");
              }        

              System.out.println("----------------------------------------------------------------\n");

              System.exit(0);      
       }                

//-----------------------------------------------------------------------------------    

}

//---------------------------------------------------------------------------------------------------------------------------


//029 - Arrays - Manipulating and Searching - 2004/2022 C. S. Germany

/*

Manipulating and Searching Arrays

*/


//---------------------------------------------------------------------------------------------------------------------------

import java.io.*;
import java.util.*;

//---------------------------------------------------------------------------------------------------------------------------

public class JAVA_029_Arrays_03_Manipulating_And_Searching
{      
       public static void main(String[] args) 
       {
              System.out.println("\n----------------------------------------------------------------");

              int Num_Elements = 0;
              String Player_Choice = "";
              String Search_For = "";
              
              LineNumberReader cin = new LineNumberReader(new InputStreamReader(System.in));
              
              System.out.println("\n********************************************************************************"); 
              System.out.println("A. Create Array and Populate its Elements With Values Using While True Loop\n");
              
              System.out.println("How many elements shall I create in the array?");
              
              try { Player_Choice = cin.readLine(); }
              catch(IOException e) { System.err.println("Input Error."); }
              
              try { Num_Elements = Integer.parseInt(Player_Choice); }
              catch(NumberFormatException e) { System.out.println("That was not a number!"); }              
        
              String[] The_Choices = new String[Num_Elements];
              
              Arrays.fill(The_Choices, "Supercalalfrajalistic");
              
              System.out.println("\nNumber of elements in Array = " + The_Choices.length + "\n");

              //Example 1: Using a while true loop and counter variable to index an Array
              //You can see that in this instance using a while true loop is A LOT MORE WORK and cludgy
              int Choice_Counter = 0;
              System.out.println("Enter items to add to the array. Enter \"quit\"  to  quit.\n");
              
              while(!The_Choices[Choice_Counter].equals("quit") && Choice_Counter <  The_Choices.length)
              { 
                        //Accumulate the choices from the array and add a line
                        System.out.print("Enter element " + (Choice_Counter+1) + " (index " + Choice_Counter + "): ");
                        
                        try { The_Choices[Choice_Counter]  = cin.readLine(); }
                        catch(IOException e) { System.err.println("Input Error."); }
                        
                        if(!The_Choices[Choice_Counter].equals("quit")) 
                        { Choice_Counter++; }
                        
                        //To prevent index out of bounds error. CLUDGY.
                        if(Choice_Counter == The_Choices.length) { break; }
                              
              }//close while true loop              
        
              System.out.println("\n********************************************************************************"); 
              System.out.println("B. Display Values Stored in Elements After Added to Array Using For Loop\n");  
              
              for(int x = 0; x < The_Choices.length; x++)
              {
                  System.out.println("Element " + x + " = " + The_Choices[x]);
              }

              System.out.println("\n********************************************************************************"); 
              System.out.println("C. Search For An Item in the Array Using a For Loop\n");                
              
              System.out.println("Search for WHAT in the array?");
              
              try { Search_For = cin.readLine(); }
              catch(IOException e) { System.err.println("Input Error."); }

              boolean Found_a_Match = false;
              
              for(int y = 0; y < The_Choices.length; y++)
              {
                  if(The_Choices[y].equals(Search_For))
                  {  
                     System.out.println("\nI found that item in the Array in element: " + y + ".");
                     Found_a_Match = true;
                     break;
                  } 
              }
              
              if(Found_a_Match == false)
              { System.out.println("\nI did not find that item in the Array."); }    
              
              System.out.println("\n----------------------------------------------------------------\n\n");

              System.exit(0);      
       }                

//-----------------------------------------------------------------------------------    

}

//---------------------------------------------------------------------------------------------------------------------------


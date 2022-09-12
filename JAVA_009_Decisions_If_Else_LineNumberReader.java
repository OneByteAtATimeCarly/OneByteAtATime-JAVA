//009 - Decision Structures - If/Else - LineNumberReader - 2004/2022 C. S. Germany



//---------------------------------------------------------------------------------------------------------------------------

import javax.swing.*;
import java.io.*;

//---------------------------------------------------------------------------------------------------------------------------

public class JAVA_009_Decisions_If_Else_LineNumberReader
{  
       public static void main(String args[])
       { 
              System.out.println("\n---------------------------------------------------------------------------");

              int FirstNumber = 0;
              int SecondNumber = 0;
              String choice = "";

              LineNumberReader cin = new LineNumberReader(new InputStreamReader(System.in));
 
              System.out.print("\nEnter a larger number: ");

              try { choice = cin.readLine(); }
              catch(IOException e) 
              { System.err.println("Error."); }
              
              FirstNumber = Integer.parseInt(choice);
 
              System.out.print("Enter a smaller number: ");
              
              try { choice = cin.readLine(); }
              catch(IOException e) 
              { System.err.println("Error."); }

              SecondNumber = Integer.parseInt(choice);
 
              if(FirstNumber >= SecondNumber)
              {  
                 System.out.println("\nThe 1st number is greater."); 
               
                 if(FirstNumber == SecondNumber)
                 {
                    System.out.println("They are equal.");
                 }
                 else
                 {
                    System.out.println("They are not equal.");
                 }  
             }
             else
             {
                 System.out.println("\nThe 2nd number is greater.");
             }

             System.out.println("---------------------------------------------------------------------------\n");

             System.exit(0);          
       }

}

//---------------------------------------------------------------------------------------------------------------------------


//012 - Decision Structures - If/Else - LineNumberReader - 2004/2022 C. S. Germany



//---------------------------------------------------------------------------------------------------------------------------

import java.io.*;

//---------------------------------------------------------------------------------------------------------------------------

public class JAVA_012_Decisions_Switch_Statement_3_chars
{  
       public static void main(String args[])
       { 
              String choice = "";
              char OPTION;

              LineNumberReader cin = new LineNumberReader(new InputStreamReader(System.in));
 
              System.out.println("\nEnter a letter from a-g: ");
             
              try { choice = cin.readLine(); }
              catch(IOException e) { System.err.println("Error."); }
 
              //Get single character from String. Strigns are arrays of type char
              OPTION = choice.charAt(0);  //0 = index value of 1st char in String
             
              switch(OPTION)
              {
                   case 'a' : System.out.println("You chose a"); break;
                   case 'b' : System.out.println("You chose b"); break;
                   case 'c' :  System.out.println("You chose c"); break;
                   case 'd' : System.out.println("You chose d"); break;
                   case 'e' :  System.out.println("You chose e"); break;
                   case 'f' : System.out.println("You chose f"); break;
                   case 'g' : System.out.println("You chose g"); break;
                   default : System.out.println("Your choice is invalid."); break;

             } //close switch statement

             System.exit(0);     
       }
}

//---------------------------------------------------------------------------------------------------------------------------


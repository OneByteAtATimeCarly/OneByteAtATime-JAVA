//004 - String Variables :-) - 2004 C. S. Germany

/*
Note: String object receives text input. The JOptionPane.showInputDialog() function displays a
pop up window allowing user input and returns that value to the String "DaName".
*/

//---------------------------------------------------------------------------------------------------------------------------

import javax.swing.JOptionPane;

//---------------------------------------------------------------------------------------------------------------------------

public class JAVA_004_String_Variables
{  
       public static void main(String args[])
       { 
              String DaName = "";    
              DaName = JOptionPane.showInputDialog(null, "Your name?");
              System.out.println("\nHello, " + DaName + "!\n");
       }
}

//---------------------------------------------------------------------------------------------------------------------------


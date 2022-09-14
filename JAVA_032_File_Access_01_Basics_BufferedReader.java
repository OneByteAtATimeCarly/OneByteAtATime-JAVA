//032 - File Access - BufferedReader - 2004/2022 C. S. Germany

/*

Reading data from a file using BufferedReader.

*/


//---------------------------------------------------------------------------------------------------------------------------

import java.io.*;

//---------------------------------------------------------------------------------------------------------------------------

public class JAVA_032_File_Access_01_Basics_BufferedReader
{      
       public static void main(String[] args) 
       {
              System.out.println("\n----------------------------------------------------------------\n");

              // Create an array of characters
              char[] ARRAY = new char[100];
              
              System.out.println("\nReading DATA from file now.");
              
              try 
              {
                 //1. Create a FileReader
                 FileReader The_File = new FileReader("The_Message.txt"); 

                 //2. Create a BufferedReader
                 BufferedReader The_Input = new BufferedReader(The_File);

                 //3. Read DATA from the file into an ARRAY
                 The_Input.read(ARRAY);
                 
                 //4. Display the DATA read into the ARRAY
                 System.out.print(ARRAY);

                 //5. Close the reader
                 The_Input.close();
              }
              catch(Exception e) 
              {
                  System.out.println("There was a problem reading DATA from the file.");
                  e.getStackTrace();
              }
              
              System.out.println("\n----------------------------------------------------------------\n\n");

              System.exit(0);      
       }                

//-----------------------------------------------------------------------------------    

}

//---------------------------------------------------------------------------------------------------------------------------


//034 - File Access - PrintWriter - 2004/2022 C. S. Germany

/*

Writing data to a file using PrintWriter.
One of best ways to append content to a file.
it provides additional functioanlity over BufferedWriter.

*/


//---------------------------------------------------------------------------------------------------------------------------

import java.io.Reader;
import java.io.FileReader;
import java.io.IOException;

//---------------------------------------------------------------------------------------------------------------------------

public class JAVA_034_File_Access_04_Reader
{      
       public static void main(String[] args) 
       {
              System.out.println("\n----------------------------------------------------------------\n");

              //1. Create an array of character
              char[] The_Array = new char[100];

              try 
              {
                   //2. Create a reader using the FileReader
                   Reader The_Input = new FileReader("Top_Secret.txt");

                   //3. Checks if reader is ready 
                   System.out.println("Is there data in the stream?  " + The_Input.ready());

                   //4. Reads characters fom file
                   The_Input.read(The_Array);
                      
                   //5. Display chars
                   System.out.println("\nData in the stream:");
                   System.out.println(The_Array);

                   //6. Close reader
                   The_Input.close();
              }
              catch(IOException e) 
              {
                   System.out.print("Error opening file and reading.");
                   e.getStackTrace();
              }
              
              System.out.println("\n----------------------------------------------------------------\n\n");

              System.exit(0);      
       }                

//-----------------------------------------------------------------------------------    

}

//---------------------------------------------------------------------------------------------------------------------------


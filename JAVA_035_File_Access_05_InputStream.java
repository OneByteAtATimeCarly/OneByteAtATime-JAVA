//035 - File Access - InputStream - 2004/2022 C. S. Germany

/*

Reading data from a file using InputStream 

*/


//---------------------------------------------------------------------------------------------------------------------------

import java.io.*;

//---------------------------------------------------------------------------------------------------------------------------

public class JAVA_035_File_Access_05_InputStream
{      
       public static void main(String[] args) 
       {
              System.out.println("\n----------------------------------------------------------------\n");
              
              //1. Create an array of characters
              byte[] The_Array_Bytes = new byte[100];

              try 
              {
                   //2. Create InputStream
                   InputStream INPUT = new FileInputStream("Top_Secret.txt");
                   System.out.println("Available bytes in the file: " + INPUT.available());
                  
                   //3. Read bytes from input stream
                  INPUT.read(The_Array_Bytes);
                  
                  //4. Convert bytes Array into  String
                  String DATA = new String(The_Array_Bytes);
                  
                  //5. Display String data
                  System.out.println("\nData read from the file: ");
                  System.out.println(DATA);

                   //6. Close InputStream
                   INPUT.close();
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


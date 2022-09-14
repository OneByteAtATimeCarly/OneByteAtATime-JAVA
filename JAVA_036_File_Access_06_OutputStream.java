//036 - File Access - InputStream - 2004/2022 C. S. Germany

/*

Reading data from a file using InputStream 

*/


//---------------------------------------------------------------------------------------------------------------------------

import static java.nio.file.StandardOpenOption.*;
import java.nio.file.*;
import java.io.*;

//---------------------------------------------------------------------------------------------------------------------------

public class JAVA_036_File_Access_06_OutputStream
{      
       public static void main(String[] args) 
       {
              System.out.println("\n----------------------------------------------------------------\n");
              
              String MESSAGE = "\nSupercalafrajalisticexpealidocious!";
              
              //1. Convert String to byte array
              byte DATA[] = MESSAGE.getBytes();
              
              //2. Set path to file
              Path The_Path = Paths.get("./Supercalafrajalistic.txt");

              //3. 
              try(OutputStream out = new BufferedOutputStream(
              Files.newOutputStream(The_Path, CREATE, APPEND))) 
              {
                   System.out.println("\nWriting DATA to file.\n");
                   out.write(DATA, 0, DATA.length);
              } 
              catch (IOException x) 
              {
                  System.err.println(x);
              }
              
              System.out.println("\n----------------------------------------------------------------\n\n");

              System.exit(0);      
       }                

//-----------------------------------------------------------------------------------    

}

//---------------------------------------------------------------------------------------------------------------------------


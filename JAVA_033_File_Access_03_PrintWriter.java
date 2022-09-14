//033 - File Access - PrintWriter - 2004/2022 C. S. Germany

/*

Writing data to a file using PrintWriter.
One of best ways to append content to a file.
it provides additional functioanlity over BufferedWriter.

*/


//---------------------------------------------------------------------------------------------------------------------------

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.BufferedWriter;
import java.io.IOException;

//---------------------------------------------------------------------------------------------------------------------------

public class JAVA_033_File_Access_03_PrintWriter
{      
       public static void main(String[] args) 
       {
              System.out.println("\n----------------------------------------------------------------\n");

              try
              {
                  File file = new File("Top_Secret.txt");
    	          if(!file.exists()){ file.createNewFile(); }
                  
    	          FileWriter fw = new FileWriter(file,true);
    	          BufferedWriter bw = new BufferedWriter(fw);
    	          PrintWriter pw = new PrintWriter(bw);
                  
                  //This will add a new line to the file content
    	          pw.println("Hello, everypony.");
    	          pw.println("This is Twilight Sparkle.");
    	          pw.println("I just want to say:");
    	          pw.println("\"Love one another!\"");
                  pw.println("\"Friendship is MAGIC.\"");
    	          pw.close();

	          System.out.println("Data successfully appended at the end of file");

              }
              catch(IOException ioe)
              {
    	          System.out.println("An error occurred: ");
    	          ioe.printStackTrace();
              }
              
              System.out.println("\n----------------------------------------------------------------\n\n");

              System.exit(0);      
       }                

//-----------------------------------------------------------------------------------    

}

//---------------------------------------------------------------------------------------------------------------------------


//038 - Writing to Files Using FileOutputStream and PrintStream - 2004/2022 C. S. Germany

/*

Writing to Files Using FileOutputStream and PrintStream 

*/


//---------------------------------------------------------------------------------------------------------------------------

import java.io.*;

//---------------------------------------------------------------------------------------------------------------------------

public class JAVA_038_File_Access_08_FileOutputStream_PrintStream
{      
//-----------------------------------------------------------------------------------

       public static void main(String[] args)
       {
              SaveHighScores();
              System.exit(0);
       }  
       
//-----------------------------------------------------------------------------------

       public static void SaveHighScores()
       {
              String[][] The_Scores = {  {"Carly Salali", "9000"},  
                                         {"Twilight Sparkle", "9999"},
                                         {"Rainbow Dash", "20000"},
                                         {"Apple Jack", "5555"}
                                      };

              System.out.println("\n------------------------------------------------------------------------------");
           
              try
              {   
                  //1. Create a File object
                  File High_Scores = new File("High_Scores.txt");
                
                  //2. Declare a FileOutputStream object
                  FileOutputStream Stream_Scores;
               
                  //3. Instantiate the FileOutputStream object passing in the File object as an argument
                  if (High_Scores.exists())
                  {
                      System.out.println("\nHigh_Scores.txt already exists -- appending new scores to it.\n");
                      Stream_Scores = new FileOutputStream(High_Scores, true); //"true" = append, 2 arguments
                  }   
                  else
                  {
                      System.out.println("\nhighscores.txt does not exist -- I'll create it!\n");
                      Stream_Scores = new FileOutputStream(High_Scores); //no append, 1 argument
                  }               
               
                  //4. Create a PrintStream object passing in the FileOutputStream object as an argument
                  PrintStream Print_Scores = new PrintStream(Stream_Scores);
                
                  //5. Write the data to the file using the PrintStream object
                  System.out.println("Writing DATA to file ...\n");
                  for(int x = 0; x < The_Scores.length; x++)
                  {
                      Print_Scores.println("Name: " + The_Scores[x][0]);
                      Print_Scores.println("Score: " + The_Scores[x][1]);
                  }
                
                  //6. Close objects
                  Print_Scores.close();
                  Stream_Scores.close();
              }
              catch (IOException e)
              {
                  System.out.print("\nERROR saving scores.\n");
              }

              System.out.println("------------------------------------------------------------------------------\n");
    
       }  //close SaveHighScores() function

//-----------------------------------------------------------------------------------

}//close class def

//---------------------------------------------------------------------------------------------------------------------------


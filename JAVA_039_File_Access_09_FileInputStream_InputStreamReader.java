//039 - Reading from Files Using Using FileInputStream and InputStreamReader - 2004/2022 C. S. Germany

/*

Writing to Files Using FileInputStream and InputStreamReader

*/


//---------------------------------------------------------------------------------------------------------------------------

import java.io.*;

//---------------------------------------------------------------------------------------------------------------------------

public class JAVA_039_File_Access_09_FileInputStream_InputStreamReader
{      
//-----------------------------------------------------------------------------------

       public static void main(String[] args)
       {
              Save_High_Scores();
              Read_High_Scores();
              System.out.println("\nExiting program ...");
              System.exit(0);
       }  
       
//-----------------------------------------------------------------------------------

       public static void Save_High_Scores()
       {
            String[][] The_Scores = {  {"Carly Salali", "9000"},  
                                       {"Twilight Sparkle", "9999"},
                                       {"Rainbow Dash", "25000"},
                                       {"Apple Jack", "5555"},
                                       {"Rarity", "1200"},
                                       {"Fluttershy", "8444"},
                                       {"Pinkie Pie", "4777"},
                                       {"Naruto Uzumaki", "15000"},
                                       {"Sakura Haruno", "11235"},
                                       {"Sasuke Uchiha", "12067"},
                                       {"Hinata Hyuga", "956"},
                                       {"Kakashi Hatake", "28000"}
                                    };
           
            try
            {   
                //1. Create a File object
                File High_Scores = new File("High_Scores.txt");
                
                //2. Declare a FileOutputStream object
                FileOutputStream Stream_Scores;
               
                //3. Instantiate the FileOutputStream object passing in the File object as an argument
                if (High_Scores.exists())
                {
                    System.out.println("\nHigh_Scores.txt already exists -- appending new score to it.\n");
                    //Stream_Scores = new FileOutputStream(High_Scores, true);   //"true" = append, 2 arguments
                    Stream_Scores = new FileOutputStream(High_Scores);           //no append, 1 argument
                }   
                else
                {
                    System.out.println("\thighscores.txt does not exist -- I'll create it!");
                    Stream_Scores = new FileOutputStream(High_Scores); //no append, 1 argument
                }               
               
                //4. Create a PrintStream object passing in the FileOutputStream object as an argument
                PrintStream Print_Scores = new PrintStream(Stream_Scores);
                
                //5. Write the data to the file using the PrintStream object
                for(int x = 0; x < The_Scores.length; x++)
                {
                    Print_Scores.println(The_Scores[x][0]);
                    Print_Scores.println(The_Scores[x][1]);
                }
                
                //Close objects
                Print_Scores.close();
                Stream_Scores.close();

                System.out.println("\nHigh scores sucessfully written to file.\n");
            }

            catch (IOException e)
            {
                System.out.print("ERROR saving scores.");
            }
    
       }//close Save_High_Scores() function
       
 //----------------------------------------------------------------------------------- 

       public static void Read_High_Scores()
       {
              String Player_Name = "ANONYMOUS";    //Just initalizing to non-null value, will be overwritten
              int Player_Score = 9000;             //Just initalizing to non-null value, will be overwritten
              String Convert_To_Int = "NOPE";      //Just initalizing to non-null value, will be overwritten
              int Player_Score_Counter = 0;
              boolean Successful;

              try
              {  
                 //1. Create a File object
                 System.out.println("\n-----------------------------------------------------------------");
                 System.out.print("\n1. Creating a File object.");
                 File File_Score = new File("High_Scores.txt");
                 
                 //2. Create a FileInputStream object and pass the File object into it
                 System.out.println("\n-----------------------------------------------------------------");
                 System.out.print("\n2. Creating a FileInputStream object and passing the File object into it.");
                 FileInputStream File_Input_Score = new FileInputStream(File_Score);
                 
                 //3. Create an InputStreamReader object and pass the FileInputStream object into it
                 System.out.println("\n-----------------------------------------------------------------");
                 System.out.print("\n3. Creating a InputStreamReader object and passing the FileInputStream object into it.");
                 InputStreamReader Input_Score = new InputStreamReader(File_Input_Score);
                 
                 //4. Create a BufferedReader object and pass the InputStreamReader object into it
                 System.out.println("\n-----------------------------------------------------------------");
                 System.out.print("\n4. Creating a BufferedReader object and passing the InputStreamReader object into it.");
                 BufferedReader Buff_Scores = new BufferedReader(Input_Score);
                 
                 //5. Go through file and count the unknown # of Name and Score pairs (every 2 lines)
                 System.out.println("\n-----------------------------------------------------------------");
                 System.out.print("\n5. Going through file and counting up all Name-Score pairs.");
                 while(Player_Name != null)
                 {
                       Player_Name = Buff_Scores.readLine();
                       Convert_To_Int = Buff_Scores.readLine();
                       Player_Score_Counter++;  //increment for every 2 lines (name and score pair)
                 }
                 
                 //6. Create and initialize 2 PARALLEL arrays of EXACT number of Name-Score pairs found in file above
                 System.out.println("\n-----------------------------------------------------------------");
                 System.out.print("\n6. Creating and initializing 2 PARALLEL arrays of EXACT number of Name-Score pairs.");
                 String[] PLAYER_NAMES = new String[Player_Score_Counter];
                 int[] PLAYER_SCORES = new int[Player_Score_Counter];
                 
                 //7. Reset all stream and file objects and move file pointer back to beginning
                 System.out.println("\n-----------------------------------------------------------------");
                 System.out.print("\n7. Resetting all stream and file objects. Moving file pointer back to beginning.");
                 File_Score = new File("High_Scores.txt");
                 File_Input_Score = new FileInputStream(File_Score);
                 Input_Score = new InputStreamReader(File_Input_Score);
                 Buff_Scores = new BufferedReader(Input_Score);
                 
                 //8. Read Name-Score pairs from file and populate into parallel arrays
                 System.out.println("\n-----------------------------------------------------------------");
                 System.out.print("\n8. Reading Name-Score pairs from file. Each pair is a record.\n");
                 for(int x = 0; x < (Player_Score_Counter-1); x++)
                 {
                     System.out.println("\nRecord: " + (x+1)); 
                     PLAYER_NAMES[x] = Buff_Scores.readLine();
                     System.out.println("Name: " + PLAYER_NAMES[x]);
                     Convert_To_Int = Buff_Scores.readLine();
                     PLAYER_SCORES[x] = Integer.parseInt(Convert_To_Int);
                     System.out.println("Score: " + PLAYER_SCORES[x]);
                 }  
                 
                 
                 //9. Clean up. Close all the open File objects since no longer needed
                 System.out.println("\n-----------------------------------------------------------------");
                 System.out.print("\n9. Cleaning up and closing all open File objects. They are no longer needed.\n");
                 Buff_Scores.close();
                 Input_Score.close();
                 File_Input_Score.close();
                 
                 //10. Bubble Sort the High Scores in Descending Order
                 System.out.println("\n-----------------------------------------------------------------");
                 System.out.print("\n10. Bubble Sort High Scores from highest to lowest in descending order.\n");
                 System.out.println("   Total of " + Player_Score_Counter + " high score records found in file.");
                  
                 for(int q = 0; q < (Player_Score_Counter-1); q++)
                 {
                     for(int r = 1; r < Player_Score_Counter; r++)
                     {
                         if(PLAYER_SCORES[r] > PLAYER_SCORES[r - 1])
                         {
                              Player_Score = PLAYER_SCORES[r];
                              Player_Name = PLAYER_NAMES[r];
                              PLAYER_SCORES[r] = PLAYER_SCORES[r - 1];
                              PLAYER_NAMES[r] = PLAYER_NAMES[r - 1];
                              PLAYER_SCORES[r - 1] = Player_Score;
                              PLAYER_NAMES[r - 1] = Player_Name;          
                          
                         }//close if
                          
                     }//close inner for loop
                      
                 }//close outer for loop  
                 
                 //11. Display the Bubble Sorted High Scores
                 System.out.println("\n-----------------------------------------------------------------");
                 System.out.print("\n11. Display the High Scores now that they have been Bubble Sorted.\n");
                 System.out.println("\n***************** High Scores *****************\n");
                 System.out.println("---------------------------------------------------");
                 
                 for(int y = 0; y < (Player_Score_Counter-1); y++)
                 {
                     System.out.print("" + (y+1) + ". Name: " + PLAYER_NAMES[y] + "  Score: " + PLAYER_SCORES[y] + "\n");
                     System.out.println("---------------------------------------------------");  
                 }                 
                 
                 Successful = true;
              }
              catch(Exception e)
              {
                   System.out.print("\nUnable to read \"High_Scores.txt\".\n");
                   e.printStackTrace();
                   Successful = false;
              }
              
              if(Successful == true)
              {
                  System.out.println("\nHigh Scores successfully read from file and bubble sorted.");
              }
              else
              {
                  System.out.println("\nUnable to computer and sort high scores. Unable to read file.");
              }

       }//close Read_High_Scores() function

 //----------------------------------------------------------------------------------- 

}//close class def

//---------------------------------------------------------------------------------------------------------------------------


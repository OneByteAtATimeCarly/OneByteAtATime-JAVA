//055 - Project - Console - Game - Trivia Quiz - 2006 C. S. Germany

/*

Using what you've learned to make something fun: 
Trivia Quiz usind 2-D array

*/

import javax.swing.*;
import java.io.*;

public class JAVA_055_PRJ_CONS_GAME_TriviaQuiz_MultiD_Arrays_2
{
       //Initializaions and Instantiations
       static LineNumberReader cin = new LineNumberReader(new InputStreamReader(System.in));
//-------------------------------------------------------------------------------

       public static void main(String[] args)
       {
              int score = 0;
              final int NumberofQuestions = 5;
    
   	      System.out.println("\n\n\n\n\n\n\n\t\tQuiz 1.0\n\n");

              //Store questions and answers in 2 dimensional array
              String[][] QandA = {
                                  {"Who is Scooby Doo's best friend?","shaggy"},
                                  {"Who developed relativity?","einstein"},
                                  {"When year did the twin towers fall?","2001"},
                                  {"Who was the first president?","washington"},
                                  {"What is the meaning of life?","42"} };
                                  
             String[] Answers = new String[NumberofQuestions];
 
            //loop through each string in the array and compare it to answers
            for(int x = 0; x < NumberofQuestions; x++)
            {
                 System.out.print("\t\t" + (x+1) + ". " + QandA[x][0] + "   ");
                 
                 try { Answers[x] = cin.readLine(); }
                 catch (IOException e) { System.err.println("Error."); }
      
                 Answers[x].toLowerCase();
                 
                 if(QandA[x][1].equals(Answers[x]))
                 {
                      score++;
                 }//close if 

                 System.out.print("\n");

            }//close outer loop                                 
    
            System.out.println("\n\t\tYou got " + score + " of "
                               + NumberofQuestions + " right!\n\n\n"); 

            System.exit(0);
            
       }//close main() function  
       
//-------------------------------------------------------------------------------

}//close Quiz class

//054 - Project - Console - Game - Trivia Quiz - 2006 C. S. Germany

/*

Using what you've learned to make something fun: 
Trivia Quiz using Multi-D array
*/

import java.io.*;

public class JAVA_054_PRJ_CONS_GAME_TriviaQuiz_MultiD_Arrays_1
{
              public static LineNumberReader INPUT =
                  new LineNumberReader(new InputStreamReader(System.in));

    public static void main(String[] args)
    {
           int SCORE = 0;
           int x = 0;
           int WrongGuesses = 0;

           System.out.print("\n\n\tQuiz 1.0\n\n");
           
           String [][] QuestionsAndAnswers = {
          //            0                         1              2             3                      4
           {"What is the meaning of life?",     "42",         "stuff", "According to Douglass Adams", ""},
           {"Who was the first US president?",  "washington", "george",      "George...",                   ""},
           {"Does LIFE exist on other planets?","maybe",      "perhaps",      "Could be...",                 ""},
           {"What is your favorite color?",     "blue",       "aqua",      "Red, white and ...",          ""},
           {"When does Java class end?",        "1:00 pm",    "1",      "after NOON...",               ""}};

          for(x = 0; x < 5; x++)
          {
               System.out.print("\n\t" + (x+1) + ". " + QuestionsAndAnswers[x][0] + " ");
               QuestionsAndAnswers[x][4] = IN();
               QuestionsAndAnswers[x][4] = QuestionsAndAnswers[x][4].toLowerCase();

               if(QuestionsAndAnswers[x][4].equals(QuestionsAndAnswers[x][1]) ||
                  QuestionsAndAnswers[x][4].equals(QuestionsAndAnswers[x][2]))
               {
                   System.out.print("\n\tCorrect!");
                   SCORE++;
                   WrongGuesses = 0;
               }
               else
               {
                   System.out.print("\n\tIncorrect.");

                   if(WrongGuesses < 1)
                   {
                        System.out.print("Hint: " + QuestionsAndAnswers[x][3]);
                        WrongGuesses++;
                        x--;
                   }
                   else
                   {
                       WrongGuesses = 0;
                   }

               }

          }

               System.out.print("\n\n\tSCORE: " + SCORE);

               if(SCORE > 2)
               {
                   System.out.print("\n\tWIN!");
               }
               else
               {
                   System.out.print("\n\tLOOSE!");
               }

    }
//---------------------------------------------------------------------------
       public static String IN()
       {
              String BANANA = "ERROR";
              try{BANANA = INPUT.readLine(); }
              catch(IOException KIWI) { System.out.print("\n\tError!"); }
              return BANANA;
       }
//---------------------------------------------------------------------------
}

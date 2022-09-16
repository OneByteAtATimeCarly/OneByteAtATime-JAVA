//053 Project Calculator - C. S. Germany 2006

/*
Using what you've learned to make something fun: 
A Calculator
*/

import java.io.*;

public class JAVA_053_PRJ_CONS_Calculator
{
       //Initializaions and Instantiations - Stuff to Happen Once in Main
       static LineNumberReader cin = new LineNumberReader(new InputStreamReader(System.in));

//------------------------------------------------------------------------------ 

       public static void main(String[] args)
       {
              int RunProgram = 100;
              String choice = "";
              int WhatToDo = 100;

              System.out.println("\n\n\n\n\n");               
              System.out.println(
              "\tCalculator Program 1.0, Java Version - 2006 C. Germany\n");
             
              while(RunProgram != 0) 
              {
                 System.out.println(
                 "----------------------------------------------------");
                 System.out.println("\tMENU - Select an option\n");
                 System.out.println("\t1 = Basic Calculations\n"
                                    + "\t2 = Square a Number\n"
                                    + "\t3 = Cube a Number\n"
                                    + "\t4 = Convert Farenheit or Celcius\n"
	                            + "\t0 = Quit");
                 System.out.println(
                 "----------------------------------------------------");

                System.out.print("\n\tEnter your choice:\t");               
                try { choice = cin.readLine(); }               
                catch (IOException e) { System.err.println("Error."); }
                WhatToDo = Integer.parseInt(choice);
                
                switch(WhatToDo) 
                {
                   case 0 : RunProgram = 0; break;
                   case 1 : Calculate(); break;
                   case 2 : Square(); break;
                   case 3 : Cube(); break;
                   case 4 : Convert(); break;
                   default : System.out.println("Sorry, invalid choice."); break;
                }//close switch statement
                
	     }//close while true loop on choice

             System.out.println("\n\tYou have choosen to quit." + 
                                "\n\tEnding calculator program." +
                                "  Exiting...\n\n");
             System.exit(0); 
 
       }//close main() function

//------------------------------------------------------------------------------ 
    
       public static void Calculate()
       {
              int FirstNum = 0;
              int SecondNum = 0;
              int Answer = 0;
              String choice = "";
              char WhatToDo = '#';
     
              System.out.println("\tBasic Calculations:\n");
              
              System.out.print("\tEnter 1st number:\t");              
              try { choice = cin.readLine(); }               
              catch (IOException e) { System.err.println("Error."); }              
              FirstNum = Integer.parseInt(choice);
     
              System.out.print("\tEnter 2nd number:\t");      
              try { choice = cin.readLine(); }               
              catch (IOException e) { System.err.println("Error."); }
              SecondNum = Integer.parseInt(choice);              
     
              System.out.print("\n\tWhat would you like to do?\n"
                                 + "\t(a)dd\n"
                                 + "\t(s)ubtract\n"
                                 + "\t(m)ultiply\n"
                                 + "\t(d)ivide\n\n\t");
          
              try { choice = cin.readLine(); }               
              catch (IOException e) { System.err.println("Error."); }           
              WhatToDo = choice.charAt(0);
     
              switch(WhatToDo)
              {
                     case 'a' : Answer = FirstNum + SecondNum; break;
                     case 's' : Answer = FirstNum - SecondNum; break;
                     case 'm' : Answer = FirstNum * SecondNum; break;
                     case 'd' : Answer = FirstNum / SecondNum; break;
                     default : System.out.println("\tInvalid response."); break;    
              }

              System.out.println("\n\tThe answer is " + Answer + ".\n");     

       }//close Calculate() Function


//------------------------------------------------------------------------------ 

       public static void Square() 
       {
              String choice = "";
              int Number = 0;
              int Answer = 0;
       
              System.out.println("\n\tSquare of Number");
              System.out.print("\tEnter number to be squared:\t");
       
              try { choice = cin.readLine(); }               
              catch (IOException e) { System.err.println("Error."); }              
              Number = Integer.parseInt(choice);
                   
              Answer = Number * Number;
              System.out.println("\n\tAnswer is " + Answer + " .\n");
       }

//------------------------------------------------------------------------------ 
       public static void Cube() 
       {
              String choice = "";
              int Number = 0;
              int Answer = 0;
       
              System.out.println("\n\tCube of Number");
              System.out.print("\tEnter number to be cubed:\t");
       
              try { choice = cin.readLine(); }               
              catch (IOException e) { System.err.println("Error."); }              
              Number = Integer.parseInt(choice);
                   
              Answer = Number * Number * Number;
              System.out.println("\n\tAnswer is " + Answer + " .\n");
       }

//------------------------------------------------------------------------------ 
       public static void Convert() 
       {

              float TempFar = 0;
              float TempCel = 0;
              String choice = "";
              char WhatToDo = '#';
       
              System.out.println("\tWhat would you like to convert?\n");
              System.out.println("\t(F)arenheit to Celcius\n");
              System.out.println("\t(C)elcius to Farenheit\n");
     
              try { choice = cin.readLine(); }               
              catch (IOException e) { System.err.println("Error."); }           
              WhatToDo = choice.charAt(0);
                   
              if(WhatToDo == 'F' || WhatToDo == 'f')
              {
	          System.out.print(
                  "\tPlease enter the temperature in degrees Farenheit:\t");
         
                  try { choice = cin.readLine(); }               
                  catch (IOException e) { System.err.println("Error."); }              
                  TempFar = Float.parseFloat(choice);
                       
                  TempCel = ((TempFar - 32) * 5) / 9;
          
                  System.out.println("\n" + TempFar + " degrees Farenheit is equal"
                                     + " to " + TempCel + " degrees Celcius.\n");
              }

              if(WhatToDo == 'C' || WhatToDo == 'c')
              {
                  System.out.print(
                  "\tPlease enter the temperature in degrees Celcius:\t");
        
                  try { choice = cin.readLine(); }               
                  catch (IOException e) { System.err.println("Error."); }              
                  TempCel = Float.parseFloat(choice);
                      
	          TempFar = (TempCel * 9 / 5) + 32;
                  System.out.println("\n" + TempCel + " degrees Celcius is equal"
                                  + " to " + TempFar + " degrees Farenheit.\n");
              }
       
              if(WhatToDo != 'F' && WhatToDo !='f' && WhatToDo !='C' && WhatToDo !='c') 
              {
                  System.out.println("\tSorry, invalid choice.\n");
              }

       } //close function
       
//------------------------------------------------------------------------------ 

}//close Calculator class
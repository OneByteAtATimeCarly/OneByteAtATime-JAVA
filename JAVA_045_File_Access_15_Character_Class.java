//043 - Random Access database Files - 2004/2022 C. S. Germany

/*

Random Access Files - can be used to store data more efficiently than sequential access files. This is because, rather than
sequentially searching through every record in the file until a value is found, a random access file can seek() directly to the
record within the file that is desired. The project below covers various aspects of creating and using Random Access files in Java

*/


//---------------------------------------------------------------------------------------------------------------------------

import java.io.*;

//---------------------------------------------------------------------------------------------------------------------------

public class JAVA_045_File_Access_15_Character_Class
{    
     //Globals
     //RECORDSIZE = int + double + StringBuffer1 + StringBuffer2
     //int = 4 bytes
     //double = 8 bytes
     //char = 1 byte
    public static final int RECORDSIZE = 36;
    public static final int NUMRECORDS = 25;

//--------------------------------------------------------------------------------------------  
            
    public static void main(String[] args) throws IOException
    {
           char choice = '#';
           boolean EndIt = false;
           while(EndIt == false)
           {
              System.out.println("\n\n\tRandom Access Data 2.0.\n\t"
              + "What would you like to do?");
              
              System.out.print(      "\n\n\tMenu\n\n\t(I)nitialize Database" + 
                                     "\n\t(E)nter Data" + 
                                     "\n\t(R)ead Records" + 
                                     "\n\t(S)earch Records by ID" +
                                     "\n\t(N)ame Search" +
                                     "\n\t(Q)uit\n\n\t");
        
              choice = CINchar();
              switch(choice)
              {
                  case 'i' : InitializeRandomAccessFile(); break;
                  case 'e' : EnterData(); break;
                  case 'r' : ReadRecords(); break;
                  case 's' : SearchRecords(); break;
                  case 'n' : NameSearch(); break;
                  case 'q' : EndIt = true; break;
                  default : System.out.println("\tThat was an invalid choice."); break;
              }//close switch statement
           }//close while loop
           System.exit(0);

    }//close main() function

//--------------------------------------------------------------------------------------------              

    public static void PreInitializeRandomAccessFile() throws IOException
    { 
               //Note: Unlike C++, "pre-initialize" the file to get it to work right brfore
               //you initialize the file. Buggy without this step.
           RandomAccessFile inputfile = new RandomAccessFile("Test.dat", "rw");
           int NUMRECORDS = 100; 
           try
           {
               for(int x = 0; x < NUMRECORDS; x++)
               {
                   inputfile.writeInt(0);
                   inputfile.writeDouble(0.0); 
               }
           }   
           catch(IOException e)
           {
               System.out.println("Error.");
           }
           finally
           {
               inputfile.close(); 	
           }  
    }//close PreInitializeRandomAccessFile() function
    
//--------------------------------------------------------------------------------------------   
           
    public static void InitializeRandomAccessFile() throws IOException
    { 
               //Note: Either have to place this in the try block below or write
               //"throws IOException" in the class header as above
           PreInitializeRandomAccessFile();
           RandomAccessFile inputfile = new RandomAccessFile("Test.dat", "rw");
           StringBuffer EmpFirstName = new StringBuffer(12);  
           StringBuffer EmpLastName = new StringBuffer(12);
           try
           {
               for(int x = 0; x < NUMRECORDS; x++)
               {
                   inputfile.writeInt(0);
                   inputfile.writeDouble(0.0);
                   inputfile.writeUTF(EmpFirstName.toString());
                   inputfile.writeUTF(EmpLastName.toString());  
               }
           }
           catch(IOException e)
           {
               System.out.println("Error.");
           }
           finally
           {
               inputfile.close(); 	
           } 
    }//close InitializeRandomAccessFile() function

//--------------------------------------------------------------------------------------------      
        
    public static void EnterData() throws IOException
    {
           RandomAccessFile inputfile = new RandomAccessFile("Test.dat", "rw");
           StringBuffer EmpFirstName = new StringBuffer(12);  
           StringBuffer EmpLastName = new StringBuffer(12);
           String EmpLast = "";
           String EmpFirst = "";
           int EmployeeID = 0;
           double PayRate = 0.0;            
           int position = 0;
           boolean quit = false;
           try
           {
               while(quit == false)
               {   
                   System.out.print("\n\tEnter employee ID: ");  
                   EmployeeID = CINInteger();
                   if(EmployeeID > 0)
                   { 
                      position = EmployeeID - 1;
                      inputfile.seek(position * RECORDSIZE);
                      System.out.print("\n\tEnter the rate of pay: ");
                      PayRate = CINDouble();  
                      System.out.print("\n\tEnter employee's first name: ");
                      EmpFirst = CINString();
                      EmpFirstName.delete(0,10); //Need to clear string buffer from last iteration
                      EmpFirstName.append(EmpFirst); //Copies a String to a StringBuffer
                      System.out.print("\n\tEnter employee's last name: ");
                      EmpLast = CINString();
                      EmpLastName.delete(0,10); //Need to clear string buffer from last iteration  
                      EmpLastName.append(EmpLast); //Copies a String to a StringBuffer                  
                      inputfile.writeInt(EmployeeID);
                      inputfile.writeDouble(PayRate);
                      inputfile.writeUTF(EmpFirstName.toString());
                      inputfile.writeUTF(EmpLastName.toString());    
                      System.out.print(
                      "\tEnter \"q\" to quit, any other to continue.   ");
                      quit = CINboolean();
                   }
                   else  { System.out.println("\n\tInvalid ID!"); break; }   
               }
           }
           catch(IOException e) { System.out.println("\tError: " + e.getMessage()); } 
           finally { inputfile.close(); }
      
    }//close EnterData() function

//-------------------------------------------------------------------------------------------- 
                 
    public static void ReadRecords() throws IOException
    {
           RandomAccessFile inputfile = new RandomAccessFile("Test.dat", "rw");
           String EmpLast = "";
           String EmpFirst = "";
           int EmployeeID = 0;
           double PayRate = 0.0;            
           System.out.println("");
           System.out.println(
           "----------------------------------------------------------------");
           try
           {
               for(int x = 0; x < NUMRECORDS; x++)
               {   
                   inputfile.seek(x * RECORDSIZE);
                   EmployeeID = inputfile.readInt();
                   PayRate = inputfile.readDouble();
                   EmpFirst = inputfile.readUTF();
                   EmpLast = inputfile.readUTF();
                   if(EmployeeID != 0)
                   {  
                      System.out.println("\tID: " + EmployeeID + "   PayRate: " + PayRate + 
                                         "   First: " + EmpFirst + "  Last: " + EmpLast);  
                   }
               }//close for loop               
           }//close try block          
           catch(IOException e) { System.out.println("\tError: " + e.getMessage()); }   
           finally { inputfile.close(); }           
           System.out.println(
           "----------------------------------------------------------------");   
          
    }//close ReadRecords() function

//--------------------------------------------------------------------------------------------     
             
    public static void SearchRecords() throws IOException
    {
           RandomAccessFile inputfile = new RandomAccessFile("Test.dat", "rw");
           int position = 0;     
           String EmpLast = "";
           String EmpFirst = "";
           int EmployeeID = 0;
           double PayRate = 0.0;                  
           System.out.print("\tEnter employee ID to search for: ");  
           EmployeeID = CINInteger();
           position = EmployeeID - 1;             
           try
           {
               inputfile.seek(position * RECORDSIZE);            
               EmployeeID = inputfile.readInt();
               PayRate = inputfile.readDouble();
               EmpFirst = inputfile.readUTF();
               EmpLast = inputfile.readUTF();                        
               if(EmployeeID != 0)
               {
                   System.out.println(
                   "----------------------------------------------------------------");
                   System.out.println(
                   "\n\tID: " + EmployeeID + "   PayRate: " + PayRate + 
                   "   First: " + EmpFirst + "  Last: " + EmpLast);
                   System.out.println(
                   "----------------------------------------------------------------");
               }
               else
               { System.out.println("\tThat record does not exist."); }
           }//close try block
           catch(IOException e) { System.out.println("\tError: " + e.getMessage()); }
           finally { inputfile.close(); }
    }//close SearchRecords() function       

//--------------------------------------------------------------------------------------------          
    
    public static void NameSearch() throws IOException
    {
           RandomAccessFile inputfile = new RandomAccessFile("Test.dat", "rw");
           String EmpLast = "";
           String EmpFirst = "";
           int EmployeeID = 0;
           double PayRate = 0.0;                   
           int position = 0; 
           System.out.print("\n\t(F)irst or (L)ast name?   ");  
           char choice = CINchar();          
           if(choice == 'f' || choice == 'l') 
           {
               System.out.print("\n\tEnter the name:   ");  
               String NAME = CINString();              
               try
               {  
                   System.out.println(
                   "----------------------------------------------------------------");
                   for(int x = 0; x < NUMRECORDS; x++)
                   {   
                       inputfile.seek(x * RECORDSIZE);

                       EmployeeID = inputfile.readInt();
                       PayRate = inputfile.readDouble();
                       EmpFirst = inputfile.readUTF();
                       EmpLast = inputfile.readUTF();
                       switch(choice)
                       {
                           case 'f' : if(EmpFirst.equals(NAME))
                                      {  
                                         System.out.println(
                                         "\n\tID: " + EmployeeID + "   PayRate: " + 
                                         PayRate + "   First: " + EmpFirst + 
                                         "  Last: " + EmpLast);  
                                      }
                                      break;
                           case 'l' : if(EmpLast.equals(NAME))
                                      {  
                                         System.out.println(
                                         "\n\tID: " + EmployeeID + "   PayRate: " + 
                                         PayRate + "   First: " + EmpFirst + 
                                         "  Last: " + EmpLast);  
                                      }
                                      break;
                       }//close switch      
                   }//close for loop               
                   System.out.println(
                   "----------------------------------------------------------------");
               }//close try block
               catch(IOException e) { System.out.println("\tError: " + e.getMessage()); }
               finally { inputfile.close(); }       
           }//close if
           else { System.out.println(
           "\tThat was an invalid choice. Valid choices = \"f\" and \"l\".");  }
    }//close function  

//--------------------------------------------------------------------------------------------  
            
          //No concise CIN method in Java for "char" as in C++, so let's make our own!
          //Can overload argument list but not return type
       public static double CINDouble()
       {
              LineNumberReader cin = new LineNumberReader(new InputStreamReader(System.in));
              String choice = "";
              double WhatToLookFor = 0.0;
              try { choice = cin.readLine(); }               
              catch (IOException e) { System.err.println("\tError."); }
              choice.toLowerCase();
              if(choice.equals("")) { WhatToLookFor = 0.0; }
              else 
              { 
                    //We need to handle the error if they don't enter a number
                    try { WhatToLookFor = Double.parseDouble(choice); }
                    catch(NumberFormatException e) 
                    { 
                       System.out.println("\tThat was not a number!"); 
                       WhatToLookFor = 0.0; 
                   }
              }
              return WhatToLookFor;
       }

//--------------------------------------------------------------------------------------------              

       public static int CINInteger()
       {
              LineNumberReader cin = new LineNumberReader(new InputStreamReader(System.in));
              String choice = "";
              int WhatToLookFor = 0;
              try { choice = cin.readLine(); }               
              catch (IOException e) { System.err.println("\tError."); }
              choice.toLowerCase();
              if(choice.equals("")) { WhatToLookFor = 0; }
              else 
              { 
                    //We need to handle the error if they don't enter a number
                    try { WhatToLookFor = Integer.parseInt(choice); }
                    catch(NumberFormatException e) 
                    { 
                       System.out.println("\tThat was not a number!"); 
                       WhatToLookFor = 0; 
                   }
              }
              return WhatToLookFor;
       }
//--------------------------------------------------------------------------------------------  
           
       public static boolean CINboolean()
       {
              LineNumberReader cin = new LineNumberReader(new InputStreamReader(System.in));
              String choice = "";
              char WhatToLookFor = '#';
              boolean ToQuit = true;
              try { choice = cin.readLine(); }               
              catch (IOException e) { System.err.println("\tError."); }
              choice.toLowerCase();     
              //In case it's empty
              if(choice.equals("")) { WhatToLookFor = '#'; }
              else { WhatToLookFor = choice.charAt(0); }
              switch(WhatToLookFor)
              {
                  case 'q' : ToQuit = true; break;
                  default : ToQuit = false; break;
              }            
              return ToQuit;
       }       

//--------------------------------------------------------------------------------------------              

       public static char CINchar()
       {
              LineNumberReader cin = new LineNumberReader(new InputStreamReader(System.in));
              String choice = "";
              char WhatToLookFor = '#';
              try { choice = cin.readLine(); }               
              catch (IOException e) { System.err.println("\tError."); }
              choice.toLowerCase(); 
              //In case it's empty
              if(choice.equals("")) { WhatToLookFor = '#'; }
              else { WhatToLookFor = choice.charAt(0); }   
              return WhatToLookFor;
       }  

//--------------------------------------------------------------------------------------------    
          
       public static String CINString()
       {
              LineNumberReader cin = new LineNumberReader(new InputStreamReader(System.in));
              String choice = ""; 
              try { choice = cin.readLine(); }               
              catch (IOException e) { System.err.println("\tError."); }
              return choice;
       }
       
//-------------------------------------------------------------------------------------------- 

}//close class def

//---------------------------------------------------------------------------------------------------------------------------


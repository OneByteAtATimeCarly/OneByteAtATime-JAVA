//042 - Serializing a Class - Reading from a File - 2004/2022 C. S. Germany

/*

Serializing a Class - Reading from a File

*/


//---------------------------------------------------------------------------------------------------------------------------

import java.io.*;

//---------------------------------------------------------------------------------------------------------------------------

public class JAVA_042_File_Access_12_Serializing_a_Class_Reading
{    
  
//A "pointer" to a Monster object, allows object to persist in memory and be passed from function to function    
public static Monster Godzilla;
    
//-----------------------------------------------------------------------------------
    
       public static class Monster
       {
              //Member Data
              public String M_Name = "Anonymous"; 
              public String M_Class = "Generic Monster";
              public int M_Health = 100;
              public int M_ATK = 10;
              public int M_DEF = 10;
              
              //Constructor
              Monster() { System.out.println("Building a Monster."); }
              
              //Member Methods
              public void Display_Monster() 
              { 
                  System.out.println("--------------Monster Stats--------------");
                  System.out.println("Name: " + M_Name);
                  System.out.println("Class: " + M_Class);
                  System.out.println("Health: " + M_Health);
                  System.out.println("ATK: " + M_ATK);
                  System.out.println("DEF: " + M_DEF);
              }
             
       }
       
//-----------------------------------------------------------------------------------       
    
       public static void main(String[] args)
       {
              Load_Monster();
              System.out.println("\nFinished reading data from file and loaded into Monster object.");
              System.out.println("Displaying Monster stats as they were loaded now.\n");
              Godzilla.Display_Monster();
              System.exit(0);
       }  
       
//-----------------------------------------------------------------------------------
       
       //Serialize a Monster object member by member to a File
       public static void Load_Monster()
       {
              System.out.println("LOADING: Reading serialized Monster from File.");
              
              String The_Password = "";
              String File_Name = "";
              String MON_NAME = "";
              String MON_CLASS = "";
              String MON_HEALTH = "";
              String MON_ATK = "";
              String MON_DEF = "";
              
              LineNumberReader cin = new LineNumberReader(new InputStreamReader(System.in));
              
              System.out.print("\nEnter Player file to load: ");
              
              try { File_Name = cin.readLine(); }              
              catch (IOException e) { System.err.println("Error."); }  
              
              //Add game file extension
              File_Name = File_Name + ".gam";
              
              System.out.print("Enter a password: ");
              
              try { The_Password = cin.readLine(); }              
              catch (IOException e) { System.err.println("Error."); }
              
              try
              {
                   File Player_File = new File(File_Name);
                   FileInputStream File_Input_Object = new FileInputStream(Player_File);
                   InputStreamReader Input_Player = new InputStreamReader(File_Input_Object);
                   BufferedReader Buff_Player = new BufferedReader(Input_Player);
                  
                   String PASSWORD = Buff_Player.readLine();
                   
                   if(PASSWORD.equals(The_Password))
                   { 
                      //SERIALIZING: Must read data back in exact same order as written
                      MON_NAME = Buff_Player.readLine();
                      MON_CLASS = Buff_Player.readLine();
                      MON_HEALTH = Buff_Player.readLine();
                      MON_ATK = Buff_Player.readLine();
                      MON_DEF = Buff_Player.readLine();  
                      
                      //Instantiate a Monster object to contain data
                      Godzilla = new Monster();
                      
                      //Load data members up Monster object with values from file
                      Godzilla.M_Name = MON_NAME;
                      Godzilla.M_Class = MON_CLASS ;
                      Godzilla.M_Health = Integer.parseInt(MON_HEALTH);
                      Godzilla.M_ATK = Integer.parseInt(MON_ATK);
                      Godzilla.M_DEF = Integer.parseInt(MON_DEF);
                   }    
                   else
                   {
                       System.out.println("\nSorry, but that was the incorrect password. Access denied.");
                   }
                   
                   //Serialization: Reading Moster object from file

            }
           
            catch (IOException e)
            {
                System.out.print("ERROR saving character file.");
            }
              
       }//close Load_Monster() function  

}//close class def

//---------------------------------------------------------------------------------------------------------------------------


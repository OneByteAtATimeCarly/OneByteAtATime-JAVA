//041 - Serializing a Class - Writing to a File - 2004/2022 C. S. Germany

/*

Serializing a Class - Writing to a File 

*/


//---------------------------------------------------------------------------------------------------------------------------

import java.io.*;

//---------------------------------------------------------------------------------------------------------------------------

public class JAVA_041_File_Access_11_Serializing_a_Class_Writing
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
              Create_Monster();
              Godzilla.Display_Monster();
              Save_Monster();
              System.exit(0);

       }//close main() function  
       
//-----------------------------------------------------------------------------------

       public static void Create_Monster()
       {
              Godzilla = new Monster();
              Godzilla.M_Name = "Godzilla";
              Godzilla.M_Class = "Giant Radio-active Lizard";
              Godzilla.M_Health = 9000;
              Godzilla.M_ATK = 5000;
              Godzilla.M_DEF = 57000;

       }//close Create_Monster() function  
       
//----------------------------------------------------------------------------------- 
       
       //Serialize a Monster object member by member to a File
       public static void Save_Monster()
       {
              System.out.println("SAVING: Serializing  Monster object to File.");
              
              String Character_Name = "";
              String passwd = "";
              LineNumberReader cin = new LineNumberReader(new InputStreamReader(System.in));
              
              System.out.print("\nEnter the file name to save as: ");
              
              try { Character_Name = cin.readLine(); }              
              catch (IOException e) { System.err.println("Error."); }  
              
              //Add game file extension
              Character_Name = Character_Name + ".gam";
              
              System.out.print("Enter a password: ");
              
              try { passwd = cin.readLine(); }              
              catch (IOException e) { System.err.println("Error."); }
              
              try
              {
                   File Player_File = new File(Character_Name);
                   FileOutputStream Player_Object = new FileOutputStream(Player_File );  
                   PrintStream Write_Player = new PrintStream(Player_Object);
                  
                   //Serialization of Character class in plain ASCII
                   Write_Player.println(passwd);                       
                   Write_Player.println(Godzilla.M_Name);
                   Write_Player.println(Godzilla.M_Class);
                   Write_Player.println(Godzilla.M_Health);
                   Write_Player.println(Godzilla.M_ATK);
                   Write_Player.println(Godzilla.M_DEF);

                   Write_Player.close(); 
                   Player_Object.close();
            }
           
            catch (IOException e)
            {
                System.out.print("ERROR saving character file.");
            }              
       }//close Save_Monster() function
        
}//close class def

//---------------------------------------------------------------------------------------------------------------------------


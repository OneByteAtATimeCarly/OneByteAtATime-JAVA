//022- Classes - Inheritance - Static - 2004/2022 C. S. Germany

/*

Inheritance - a parent-child relationship between base and derviced classes. Allows maximum re-use of code and versatility with projects.

Inheritance Hierarchy - The chain of inheritance between objects in a project.

*/

//---------------------------------------------------------------------------------------------------------------------------

import java.io.*;

//---------------------------------------------------------------------------------------------------------------------------

public class JAVA_021_Classes_Basic
{  
//-----------------------------------------------------------------------------------    
       
       //The PARENT class. Known as BASE class. ADT (Abstract Data Type)
       public static class Monster
       {     
              Monster() 
              { System.out.println("Building a Generic ADT base class Monster."); }
              
              public void Do_Monster_Stuff() 
              { System.out.println("Generic Monster rampaging!"); }

        }//close Monster class    
   
//-----------------------------------------------------------------------------------

       //The Child Class. Derives from parent base class Monster
       public static class Giant_Radioactive_Lizard extends Monster
       {     
              Giant_Radioactive_Lizard() 
              { System.out.println("Building a Giant_Radioactive_Lizard."); }
              
              public void Nuke_City() 
              { System.out.println("Giant_Radioactive_Lizard nuking city!"); }

        }//close Monster class  

//-----------------------------------------------------------------------------------
       
       public static void main(String[] args) 
       {
              System.out.println("\n----------------------------------------------------------------");
              System.out.println("Inside the class's main() function.");
        
              Giant_Radioactive_Lizard GODZILLA = new Giant_Radioactive_Lizard();
              GODZILLA.Do_Monster_Stuff();
              GODZILLA.Nuke_City();
              
              System.out.println("----------------------------------------------------------------\n");
              
              System.exit(0);      
       }                

//-----------------------------------------------------------------------------------    

}

//---------------------------------------------------------------------------------------------------------------------------


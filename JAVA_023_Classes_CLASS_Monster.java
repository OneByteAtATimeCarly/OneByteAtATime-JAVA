//023- Monster Class - Non-Static - 2004/2022 C. S. Germany

// Monster class, a base class ADT, non-static instance and definition

/*
Note: If you aren't using an IDE like NetBeans or Visual Studio Code, and you are compiling from a command prompt
using the JDK, you will need to do THIS:

1. compile the driver class with the main method from the command prompt with "javac". 
   Example: javac JAVA_024_Classes_Basic_Non_Static.java

   This should compile the driver class as well as all the classes it's instantiating into bytecode .class files.

2. After compiling to byte code, then run it by typing "java" + the driver class name. 
   Example: java JAVA_024_Classes_Basic_Non_Static

*/

//---------------------------------------------------------------------------------------------------------------------------
       //The PARENT class. Known as BASE class. ADT (Abstract Data Type).
//---------------------------------------------------------------------------------------------------------------------------

public class JAVA_023_Classes_CLASS_Monster
{  
       //Data Members (private)
       private String Monster_Name = "Anonymous Monster";
       private int HEALTH = 100;
       private int ATK = 10;
       private int DEF = 10;  
       
      //Constructor, always same name as the class, called at instantiation
       JAVA_023_Classes_CLASS_Monster() 
       { System.out.println("Building a Generic ADT base class Monster."); }

       //Accessor Methods (public)
       public void Set_MonsterName(String n) { Monster_Name = n; }
       public String Get_MonsterName() { return Monster_Name; }
       public void Set_Health(int h) { HEALTH = h; }
       public int Get_Health() { return HEALTH; } 
       public void Set_Attack(int a) { ATK = a; }
       public int Get_Attack() { return ATK; } 
       public void Set_Defense(int d) { DEF = d; }
       public int Get_Defense() { return DEF; } 
       
       //Member Methods      
       public void Display_Monster()
       {
              System.out.println("\n----------------- Monster Stats-----------------");
              System.out.println("Name: " + Monster_Name);
              System.out.println("Health: " + HEALTH);
              System.out.println("Attack: " + ATK);
              System.out.println("Defense: " + DEF);
       }

       public void Rampage() 
       { System.out.println("\nGeneric Monster rampaging!"); }  

}//close Monster class    
   
//---------------------------------------------------------------------------------------------------------------------------


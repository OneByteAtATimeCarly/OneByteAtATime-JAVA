//025- Giant_Radioactive_Lizard Class - Non-Static - 2004/2022 C. S. Germany

//Giant_Radioactive_Lizard class, a derived child class of parent base class Monster, non-static instance and definition

/*
Note: If you aren't using an IDE like NetBeans or Visual Studio Code, and you are compiling from a command prompt
using the JDK, you will need to do THIS:

1. compile the driver class with the main method from the command prompt with "javac". 
   Example: javac JAVA_026_Classes_Inheritance_Non_Static.java

   This should compile the driver class as well as all the classes it's instantiating into bytecode .class files.

2. After compiling to byte code, then run it by typing "java" + the driver class name. 
   Example: java JAVA_026_Classes_Inheritance_Non_Static

*/

//---------------------------------------------------------------------------------------------------------------------------
       //The PARENT class. Known as BASE class. ADT (Abstract Data Type).
//---------------------------------------------------------------------------------------------------------------------------

public class JAVA_025_Classes_CLASS_CHILD_Giant_Radioactive_Lizard extends JAVA_023_Classes_CLASS_Monster
{     
      //Constructor, always same name as the class, called at instantiation
       JAVA_025_Classes_CLASS_CHILD_Giant_Radioactive_Lizard() 
       { System.out.println("Building a derived child class Giant_Radioactive_Lizard."); }

       //Member Methods      
       public void Nuke_City() 
       { System.out.println("Giant_Radioactive_Lizard nuking city!"); }

}//close Monster class    
   
//---------------------------------------------------------------------------------------------------------------------------
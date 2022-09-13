//021- Classes - Basic - Static - 2004/2022 C. S. Germany

/*

Classes - provide a way to further modularize and organize your code.  Like C++ classes, Java classes are designed to encapsulate real world objects.
They combine attributes of an object (data members or variables) with functions and methods of an objects. In this fashion, unlike old C structures,
C++ and Java classes combine what an object is, has and does into a single entity. Classes in both C++ and Java practice "inheritance". In C++, you
have base classes and derived classes and you declare a class to inherit from another with "class CHILD : public PARENT". In Java, you use the keyword
"extends" to do the same thing. Example: "public class CHILD extends PARENT". One aspect in which Java is different than C++ is that unlike C++,
Java will allow you to nest classes inside of each other.

Classes are nomrally defined in a separate file for each alass in Java. But you can nest classes inside other classes in Java, if you make them static.
When you declare a variable or a method as STATIC, it belongs to the class, rather than a specific instance. This means that only one instance of a
static member exists, even if you create multiple objects of the class, or if you don't create any. It will be shared by all objects.

When you are building larger, more complex programs in JAVA you won't want this. You will want each instance of a class to have its own set of
attribute data and member methods and so be defined in its own class file. But to keep things simple and in one file we will make our 1st
class static in this example.

*/

//---------------------------------------------------------------------------------------------------------------------------

import java.io.*;

//---------------------------------------------------------------------------------------------------------------------------

public class JAVA_021_Classes_Basic
{  
//-----------------------------------------------------------------------------------    
       public static class Monster
       {     
              Monster() 
              { System.out.println("Building a Monster."); }
              
              public void Do_Monster_Stuff() 
              { System.out.println("Monster rampaging!"); }

        }//close Monster class    
   
//-----------------------------------------------------------------------------------
       
       public static void main(String[] args) 
       {
              System.out.println("\n----------------------------------------------------------------");
              System.out.println("Inside the class's main() function.");
        
              Monster GODZILLA = new Monster();
              GODZILLA.Do_Monster_Stuff();
              
              System.out.println("----------------------------------------------------------------\n");
              
              System.exit(0);      
       }                

//-----------------------------------------------------------------------------------    

}

//---------------------------------------------------------------------------------------------------------------------------


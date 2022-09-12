//003 - Final Variables :-) - 2004 C. S. Germany

/*
Note: Variables can hold different sized values. The keyword "final" operates as the keyword "const" in C++, it means the value cannot change.
Using this practice reduces errors in programming for constants that are not supposed to change.
It is unfortunate that this applies to the variable "payrate". :-)
*/

//---------------------------------------------------------------------------------------------------------------------------

public class JAVA_003_Final_Variables
{  
       public static void main(String args[])
       { 
              int hours = 40;
              final double payrate = 12.0;
              double commission = 100.2358;    
              
              System.out.println("\nDeclaring final variables, which are constant and cannot change.");
              System.out.println("Your earn: $" + ((hours * payrate) + commission) + ".");
       }
}

//---------------------------------------------------------------------------------------------------------------------------


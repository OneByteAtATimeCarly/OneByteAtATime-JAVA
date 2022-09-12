//007 - Casting - Converting Variables from One Data Type to Another - 2004/2022 C. S. Germany

/*
Casting - Java implicitly converts nonconforming operands to a unifying type.
Type casting explicitly converts and overrides the unifying type imposed by Java.
To type cast, place the desired result in parenthesis followed by the variable or constant to be cast. 

Examples: 

double exam;    
float test = (float) exam /4;   //we would loose some data here as it would be truncated.

Widening Casting (automatically) - converting a smaller type to a larger type size
byte -> short -> char -> int -> long -> float -> double

Narrowing Casting (manually, truncates) - converting a larger type to a smaller size type
double -> float -> long -> int -> char -> short -> byte



*/

//---------------------------------------------------------------------------------------------------------------------------

public class JAVA_007_Casting
{  
       public static void main(String args[])
       { 
              System.out.println("\n---------------------------------------------------------------------------");
              System.out.println("A. Widening casting expands and is automatic and implicit:");
              int Lucky_Int = 444;
              double Lucky_Double = Lucky_Int;                                          //Automatic casting: int to double
              System.out.println("   Lucky_Int: " + Lucky_Int);                         //Output: 444
              System.out.println("   Implicitly cast to double is: " + Lucky_Double);   //Output: 444.0

              System.out.println("\n---------------------------------------------------------------------------");
              System.out.println("B. Narrowing casting truncates and is manual and explicit:");
              double Unlucky_Double = 777.77d;
              int Unlucky_Int = (int) Unlucky_Double;                                  //Manual casting: double to int
              System.out.println("   Unlucky_Double: " + Unlucky_Double);              //Output: 777.77
              System.out.println("   Explicitly cast to int is: " + Unlucky_Int);      //Output: 777
              
              System.out.println("---------------------------------------------------------------------------\n");
       }
}

//---------------------------------------------------------------------------------------------------------------------------


//030 - Strings - 2004/2022 C. S. Germany

/*

String Class Methods:

equals() - evaluates contents of 2 strings to see if they are equivalent: if(astring.equals(anothersting)) .
equalsIgnoreCase() - ignores case and determines if 2 strings are equal: if(astring.equalsIgnoreCase(anothersting)) .
compareTo() - returns 0 if 2 strings hold same value, negative if calling object < argument, and positive if calling object > argument. Example: If name = "Roger" then name.compareTo("Robert") returns a 5 since "g" is 5 higher than "b".
toUpperCase() - converts to upper case.
toLowerCase() - converts to lower case.
indexOf() - determines whether specific character occurs within a string. If so it returns the position of the character. The return value is -1 if the character does not exist in the string. name.indexOf('a') would be 2.
charAt() - takes an int argument and returns character at that place: If name = "Stacy" then name.charAt(0) = "S".
endsWith() - returns true if string ends with specified argument: name.endsWith("Z") is false.
startsWith() - returns true if string begins with specified argument: name.startsWith("Sta") is true.
toString() - converts primitive type (like int, double, float) to string. you must specify the type in conversion.
Example: If int age = 32 then MyAgeString = Integer.toString(age);
Integer.parseInt() - takes a string arguemtn and converts it (returns) its integer value: AgeInt = Integer.parseInt("32");.

Integer class - part of java.lang, automatically imported. Contains parseInt().

concatenation - process of joining strings, usually with "+".

sorting - arranging a series of objects in logical order. Can be descending or ascending.

bubble sort - the "heaviest" value sinks to the bottom as the "lighter" values bubble to the top. Compare 2 numbers 1 by 1, if not in ascending order swap them. When bubble sorting an array using nested for loops, you generally need to pass through the list as many times as its length minus 1. To sort in descending order instead of ascending order, you only have to change the > to a < in the if(someNums[b] > someNums[b + 1]) part of the nested for loops. Remove the minus 1 evaluation from the for loops to increase program efficiency when sorting large numbers of array elements. you can also sort arrays of objects.

Note: When sorting arrays of String objects, you can not determine whether 2 String objects need swapping by comparing their names since String names are just addresses. You must use the compareTo() method to compare String objects.
parallel arrays - arrays with mathcing sets of values.

StringBuffer - alternative to String class. Strings are immutable, their value is fixed. StringBuffer allows you to insert or append contents. 3 constructors: public StringBuffer() = no characters and default size of 16, public StringBuffer(int length) = no characters and capacity specified by length, public StringBuffer(String s) = characters stored in String objects s + 16 additional characters.

append() - adds characters to end of StringBuffer object: someBuffer.append(" Birthday");.
insert() - inserts characters at specific location: someBuffer.insert(6, "32nd");.
setCharAt() - alters just 1 character in a StringBuffer object: someBuffer.setCharAt(6, '4');
reverse() - reverses all the characters in the string buffer

StringBuilder - a mutable sequence of characters. The String Class in Java creates an immutable sequence of characters. The StringBuilder class
provides an alternative. It creates a mutable sequence of characters. Note that instances of StringBuilder are not safe for use by multiple threads.

StringBuilder(): Constructs a string builder with no characters in it and an initial capacity of 16 characters.
StringBuilder(int capacity): Constructs a string builder with no characters in it and an initial capacity specified by the capacity argument.
StringBuilder(CharSequence seq): Constructs a string builder that contains the same characters as the specified CharSequence.
StringBuilder(String str): Constructs a string builder initialized to the contents of the specified string.

*/


//---------------------------------------------------------------------------------------------------------------------------


//---------------------------------------------------------------------------------------------------------------------------

public class JAVA_030_Strings_Basics_and_Methods
{      
       public static void main(String[] args) 
       {
              System.out.println("\n----------------------------------------------------------------\n");

              String Player_Name = "Carly Germany";
              String Character_Name = "Rainbow Dash";
              StringBuilder Shaman = new StringBuilder(30);
              Shaman.append("Twilight Sparkle");

              System.out.println("String Player_Name value = " + Player_Name);
              System.out.println("String Character_Name value = " + Character_Name);
              System.out.println("StringBuilder Shaman value = " + Shaman.toString());
              System.out.println("StringBuilder Shaman capacity = " + Shaman.capacity());
              
              System.out.println("\n----------------------------------------------------------------\n\n");

              System.exit(0);      
       }                

//-----------------------------------------------------------------------------------    

}

//---------------------------------------------------------------------------------------------------------------------------


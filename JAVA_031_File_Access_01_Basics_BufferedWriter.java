//031 - File Access - BufferedWriter- 2004/2022 C. S. Germany

/*

File Access comes in three varieties under Java:

1. ASCII sequential text files
2. random access files
3. binary files 

All methods of accessing data will involve an instantiation of class objects in Java.

Sequential files require instantiation of the File class. It contains these methods:

canRead()
canWrite()
exists()
getName()
getPath()
getParent()
length()
lastModified()

Sequential Access files utilize different methods to write different data types:

writeChar()
writeInt()
writeDouble()
writeFloat()
writeLong()
writeUTF()
readChar()
readInt()
readDouble()
readFloat()
readLong()
readUTF()

Because Java does not impose any structure while manipulating sequential access to a file, it is the responsibility of
the programmer to establish a structure, meaning, how the data will be stored in the file.

Writing data to a file using BufferedWriter.

*/


//---------------------------------------------------------------------------------------------------------------------------

import java.io.FileWriter;
import java.io.BufferedWriter;

//---------------------------------------------------------------------------------------------------------------------------

public class JAVA_031_File_Access_01_Basics_BufferedWriter
{      
       public static void main(String[] args) 
       {
              System.out.println("\n----------------------------------------------------------------\n");

              String DATA = "\nFriendship is MAGIC everypony!\n";
              
              System.out.println("Value of DATA = \n\"" + DATA + "\"\n");
              System.out.println("\nWriting DATA to file now.");
              
              try 
              {
                 //1. Create a FileWriter
                 FileWriter The_File = new FileWriter("The_Message.txt");

                 //2. Create a BufferedWriter
                 BufferedWriter The_Output = new BufferedWriter(The_File);

                 //3. Write DATA to the file
                 The_Output.write(DATA);

                 //4. Close the writer
                 The_Output.close();
              }
              catch(Exception e) 
              {
                  System.out.println("There was a problem writing the DATA to a file.");
                  e.getStackTrace();
              }
              
              System.out.println("\n----------------------------------------------------------------\n\n");

              System.exit(0);      
       }                

//-----------------------------------------------------------------------------------    

}

//---------------------------------------------------------------------------------------------------------------------------


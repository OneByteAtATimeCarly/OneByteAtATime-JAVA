//006 - Date and Time - 2004/2022 C. S. Germany

/*
Note: Date() object has been deprecated. 
*/

//---------------------------------------------------------------------------------------------------------------------------

import java.time.format.DateTimeFormatter;  
import java.time.LocalDateTime; 

//---------------------------------------------------------------------------------------------------------------------------

public class JAVA_006_char_Date_and_Time
{  
       public static void main(String args[])
       { 
              DateTimeFormatter DTF = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
              LocalDateTime NOW = LocalDateTime.now();  
              System.out.println("\nThe time is now: " + DTF.format(NOW) + ".\n");
       }
}

//---------------------------------------------------------------------------------------------------------------------------


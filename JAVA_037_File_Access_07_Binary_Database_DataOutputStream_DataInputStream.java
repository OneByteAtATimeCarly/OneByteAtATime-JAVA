//037 - Database Using DataOutputStream and DataInputStream - 2004/2022 C. S. Germany

/*

Reading data from and writing to a file using DataOutputStream and DataInputStream

*/


//---------------------------------------------------------------------------------------------------------------------------

import java.io.*;

//---------------------------------------------------------------------------------------------------------------------------

public class JAVA_037_File_Access_07_Binary_Database_DataOutputStream_DataInputStream
{      

       public static final int NumEmps = 3; //Global
    
       //Unlike C++, nested classes are allowed in Java. When you compile a nested class, Java
         //will compile each nested class in separate files as "ParentClass$NestedChildClass".
       public static class Employee
       {
              public Employee() {  }           
              public void DisplayInfo()
              {
                     System.out.print("\tEmployee ID #:" + ID +
                     "\n\t\tFirst Name: " + FirstName +
                     "\n\t\tLast Name: " + LastName +
                     "\n\t\tSocial Security Number: " + Social +
                     "\n\t\tPay Rate: " + PayRate + "\n\n"); 
              }
              public void setID(int x) { ID = x; }              
              public void setFirst(String x) { FirstName = x; }
              public void setLast(String x) { LastName = x; }
              public void setSocial(int x) { Social = x; }
              public void setPayRate(double x) { PayRate = x; }
              public int getID() { return ID; }              
              public String getFirst() { return FirstName; } 
              public String getLast() { return LastName; } 
              public int getSocial() { return Social; } 
              public double getPayRate() { return PayRate; }       
              private int ID = 1;
              private String FirstName = "";
              private String LastName = "";
              private int Social = 0;
              private double PayRate = 0.0;
       }//close nested Employee class
      
      public static void main(String[] args) throws IOException 
      { 
            char choice = '#';
            boolean EndIt = false; 
            while(EndIt == false)
            {          
                System.out.println("\n\n\tEmployee Database Menu");
                System.out.print("\n\n\t(A)dd Employees" +
                                 "\n\t(L)ist Employees" +
                                 "\n\t(Q)uit\n\n\t");
                 choice = CINchar();                  
                 switch(choice)
                 {
                     case 'a' : AddEmployees(); break;
                     case 'l' : ListEmployees(); break;
                     case 'q' : EndIt = true; break;
                     default : System.out.println("\tThat was an invalid choice."); break;
                 }//close switch statement
            }//close while loop
            System.exit(0); 
      }//close main() function 
      
       public static void AddEmployees() throws IOException 
       {
              try 
              {
                  DataOutputStream outtie;
                  outtie = new DataOutputStream(new FileOutputStream("EmployeeData.txt"));
                  Employee EMP = new Employee(); 

                  for(int x = 0; x < NumEmps; x++)
                  {
                      System.out.println("\nEntry " + (x+1) + " of " + NumEmps + "\n");

                      System.out.print("\nEnter employee's ID: ");
                      EMP.setID(CINInteger()); 

                      System.out.print("Enter employee's first name: ");
                      EMP.setFirst(CINString());

                      System.out.print("Enter employee's last name: ");
                      EMP.setLast(CINString()); 

                      System.out.print("Enter employee's social security number: ");
                      EMP.setSocial(CINInteger());

                      System.out.print("Enter employee's pay rate: ");
                      EMP.setPayRate(CINDouble());
 
                      outtie.writeInt(EMP.getID());
                      outtie.writeUTF(EMP.getFirst());
                      outtie.writeUTF(EMP.getLast());
                      outtie.writeInt(EMP.getSocial());
                      outtie.writeDouble(EMP.getPayRate()); 

                  }//close for loop

                  outtie.close();

              }//close try 

              catch (IOException e) { System.err.print("Unable to open file."); }
       }//close AddEmployees() function
       
       public static void ListEmployees() throws IOException 
       {
              try 
              {
                  DataInputStream innie;
                  innie = new DataInputStream(new FileInputStream("EmployeeData.txt"));
                  Employee EMP = new Employee(); 

                  //In Java, there is no ".eof()" function. Instead, read() returns -1 at EOF. 
                  for(int x = 0; x < NumEmps; x++)
                  { 
                      System.out.print("\nEntry " + (x+1) + " of " + NumEmps + ":");

                      EMP.setID(innie.readInt());
                      EMP.setFirst(innie.readUTF());
                      EMP.setLast(innie.readUTF());
                      EMP.setSocial(innie.readInt());
                      EMP.setPayRate(innie.readDouble()); 
                      EMP.DisplayInfo();
                  }//close for

                  innie.close();

              }//close try

              catch (IOException e) { System.err.print("\tUnable to open file."); }
       }//close AddEmployees() function
       

//-----------------------------------------------------------------------------------------   
       public static char CINchar()
       {
              LineNumberReader cin = new LineNumberReader(new InputStreamReader(System.in));
              String choice = "";
              char WhatToLookFor = '#';
              try { choice = cin.readLine(); }              
              catch (IOException e) { System.err.println("\tError."); }
              choice.toLowerCase();
              //In case it's empty
              if(choice.equals("")) { WhatToLookFor = '#'; }
              else { WhatToLookFor = choice.charAt(0); }  
              return WhatToLookFor;
       } 

      
       public static double CINDouble()
       {
              LineNumberReader cin = new LineNumberReader(new InputStreamReader(System.in));
              String choice = "";
              double WhatToLookFor = 0.0;
              try { choice = cin.readLine(); }              
              catch (IOException e) { System.err.println("\tError."); }
              choice.toLowerCase();
              if(choice.equals("")) { WhatToLookFor = 0.0; }
              else
              {
                    //We need to handle the error if they don't enter a number
                    try { WhatToLookFor = Double.parseDouble(choice); }
                    catch(NumberFormatException e)
                    {
                       System.out.println("\tThat was not a number!");
                       WhatToLookFor = 0.0;
                   }
              }
              return WhatToLookFor;
       }
//----------------------------------------------------------------------------------------- 

       public static int CINInteger()
       {
              LineNumberReader cin = new LineNumberReader(new InputStreamReader(System.in));
              String choice = "";
              int WhatToLookFor = 0;
              try { choice = cin.readLine(); }              
              catch (IOException e) { System.err.println("\tError."); }
              choice.toLowerCase();
              if(choice.equals("")) { WhatToLookFor = 0; }
              else
              {
                    //We need to handle the error if they don't enter a number
                    try { WhatToLookFor = Integer.parseInt(choice); }
                    catch(NumberFormatException e)
                    {
                       System.out.println("\tThat was not a number!");
                       WhatToLookFor = 0;
                   }
              }
              return WhatToLookFor;
       }

       public static String CINString()
       {
              LineNumberReader cin = new LineNumberReader(new InputStreamReader(System.in));
              String choice = "";
              try { choice = cin.readLine(); }              
              catch (IOException e) { System.err.println("\tError."); }
              return choice;
       }  

}

//---------------------------------------------------------------------------------------------------------------------------


// CSE2
// Athicha Srivirote
// ats219
// 10/30/15
// Arrays Program
// Purpose of the program: to print out the student name and the midterm score

import java.util.Scanner;

// Declare class
     public class Arrays{
         
         // Create a main method 
         public static void main(String[] args)
         {
           //Create an instance for Scanner  
           Scanner myScanner = new Scanner( System.in );
           
           int num = ( (int) ( Math.random()*6 ) ) + 5;
           
           String students [];
           students = new  String[num];
           
           int midterm [];
           midterm = new int[num];
          
           
           System.out.println("Enter "+num+" student names:");
           
           for( int count = 0; count < num; count++ )
           {
               students [count] = myScanner.nextLine();
               midterm [count] =  (int) (Math.random()*101);
              
           }
           System.out.println("Here are the midterm grades of the 5 students above:");
           
           for( int x = 0; x < num; x++)
           {
                System.out.println(students [x] + " : "+midterm[x]);
                
           }
           
         }
}
// CSE2
// Athicha Srivirote
// ats219
// 10/30/15
// Arrays Program
// Purpose of the program: to print out the student name and the midterm score

import java.util.Scanner;

// Declare class
     public class Search{
         
         // Create a main method 
         public static void main(String[] args)
         {
             
             int array1 [] = new int[5000];
             int array2 [] = new int[5000];
    
            for( int index = 0; index < array1.length; index++)
            {
                array1 [index] = (int) (Math.random()*100001);
            }
             
            
            for( int index = 0 ; index < array1.length ; index++ )
            {
                int max = array1[index];
                int next = index + 1;
                
            while( next < array1.length)
             {
                if ( array1[index] < array1[next] )
                {
                    max = array1[next];
                }
                else
                {
                    max = array1[index];
                } 
                next++;
             }   
                if( index == array1.length - 1)
                {
                    System.out.println("The maximum of array1 is: "+max);
                    System.out.println(array1[0]);
                }
                 
            } 
            
            
            for( int index = 0; index < array1.length; index++ )
            {
                int min = array1[index];
                int next = index + 1;
                
            while( next < array1.length)
             {
                if ( array1[index] > array1[next] )
                {
                    min = array1[next];
                }
                else
                {
                    min = array1[index];
                } 
                next++;
             }   
                if( index == array1.length - 1)
                {
                    System.out.println("The minimum of array1 is: "+min);
             
                }
            }
            
         }
     }
     
         
         
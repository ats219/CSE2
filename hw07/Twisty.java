// CSE2
// Athicha Srivirote
// ats219
// 10/12/15
// Twisty Program
// Purpose of the program: Ask the user to input length and width and then print out the pattern starting
//                         with # going down from the upper left corner, / going up from the bottom left corner and # going up from a bottom
//                         right corner and \ going down from the upper left. Then alterante the sign. This should produce multiple X depending on the length
                        
import java.util.Scanner;

// Declare class
     public class Twisty{
         // Create a main method 
         public static void main(String[] args)
         {
           //Create an instance for Scanner  
           Scanner myScanner = new Scanner( System.in );
           
           // Store the input length in l 
           int l = 0;
           // Use 2 booleans to test if l satisfies the condition
           boolean accep_length = false;
           boolean accep_length2 = false;
           System.out.print("Input your desired length: ");
           // First while loop is to test if the input is an int
           while( !accep_length )
           {
               if( myScanner.hasNextInt() )
               {
                   l = myScanner.nextInt();
                   accep_length = true;
               }
               else
               {
                   System.out.println("   Error: Please type in an integer.");
                   System.out.print("Input your desired length: ");
                   myScanner.next();
               }
           } 
           // Second while loop is to test if the length is less than 80
           while( !accep_length2 )
           {
               if( l <= 80 )
               {
                  
                  accep_length2 = true;
                   
               }
               else
               {
                   System.out.println("   Error: Please input an integer smaller than 80.");
                   System.out.print("Input your desired length: ");
                   l = myScanner.nextInt();
                   
               }
           } 
           
           // Store the input width in w
           int w = 0;
           // Use 2 booleans to test if w satisfies the condition
           boolean accep_width = false;
           boolean accep_width2 = false;
           System.out.print("Input your desired width: ");
           // First while loop is to test if the input is an int
           while( !accep_width )
           {
               if( myScanner.hasNextInt() )
               {
                   w = myScanner.nextInt();
                   accep_width = true;
                   
               }
               else
               {
                   System.out.println("   Error: Please type in an integer.");
                   System.out.print("Input your desired width: ");
                   myScanner.next();
               }
           }  
            // Second while loop is to test if the width is less than length
            while( !accep_width2 )
           {
                     if( w < l )
                    {
                     accep_width2 = true;
                    }
                    else
                    {
                        System.out.println("   Error: Please input an integer smaller than the length.");
                        System.out.print("Input your desired width: ");
                        w = myScanner.nextInt();
                        
                    } 
          }
          
          System.out.println();
              
              
              // Since the pattern will repeat over time, we found that the pattern will repeat after the it finish printing out 
              // the column that is equal to 2*width. So we use c % (2 * w) to determine the position of the sign
              // Use nested for loop to print out the pattern line by line.
              // r is defined as row 
              for ( int r = 0; r < w; r++ )
              {
               
               // c is defined as column
               for( int c = 0; c < l ; c++ )
               {
                 
                 // Find the postion to print \
                 if ( c % (2 * w) == (w + r)  )
                 {
                 
                  System.out.print("\\");
                 
                 }
                 // Find the postion to print #
                 // Note that # will be printed out 2 times in one cycle so that we need 2 conditions 
                 // which as at c % (2 * w) == r or c % (2 * w) == (2 * w - r - 1) 
                 else if ( c % (2 * w) == r || c % (2 * w) == (2 * w - r - 1)  )
                 {
                 
                  System.out.print("#");
                 
                 }
                // Find the position to print /
                 else if( c % (2 * w) == (w - r - 1) )
                 {
                 
                  System.out.print("/");
                 
                 }
                 // The rest of the space will be space
                 else
                 {
                 
                  System.out.print(" ");
                 
                 }
                
              }
               // To move to the next line after finishing each row
               System.out.println();
              }
               
           
               
         }
     }
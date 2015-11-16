// CSE2
// Athicha Srivirote
// ats219
// 10/09/15
// encrypted_x Program
// Purpose of the program: ask the user to input the size of the square which will generate with x inside 


import java.util.Scanner;

// Declare class
     public class encrypted_x{
         // Create a main method 
         public static void main(String[] args)
         {
           //Create an instance for Scanner  
           Scanner myScanner = new Scanner( System.in );
           int input = 0;
           boolean acceptable1 = false; 
           
           //Ask the user to input the size of the square
           System.out.print("Input size of the square between 0-100: ");
           
           //Use while loop to check if the input is appropriate
            
               while ( !acceptable1 )
              {
                   if( myScanner.hasNextInt() )
                   {
                       input = myScanner.nextInt();
                       acceptable1 = true;
                   }
                   else
                   {
                       System.out.println("   Error: This is not an interger");
                       System.out.print("Please input an integer between 0-100: ");
                       myScanner.next();
                       
                   }
              }    
                   
               boolean acceptable2 = false;
               
                   while( !acceptable2 )
                  { 
                    if( 0 <= input && input <= 100 )
                   {
                       acceptable2 = true;
                   }
                   else
                   {
                       System.out.println("   Error: This is out of range");
                       System.out.print("Please input an integer between 0-100: ");
                       input = myScanner.nextInt();
                   }
              
                  }
           
           
           for( int i = 0; i < input+1; i++ )
           {
               for( int j = 0; j < input+1; j++ )
               {
                   if( i == j || i+j == input)
                   {
                       System.out.print(" ");
                   }
                   else
                   {
                       System.out.print("*");
                   }
              
               }
           
              System.out.println();
           }
           
           
        }     
             
             
} 
         
// CSE2
// Athicha Srivirote
// ats219
// 10/06/15
// CheckDigit  Program
// Purpose of the program: to check ISBN whether it is valid or not and tell the user to input 
//                         appropriate data each time.

// import Scanner class for the user to input data
import java.util.Scanner; 

// Declare Class
     public class CheckDigit{
         
         // Create main method 
         public static void main(String[] args){
             
             //Create instance for Scanner to store an input
             Scanner myScanner = new Scanner( System.in );
             
             //Prompt the user to input the ISBN
             System.out.print("Please enter a 10 digit barcode: ");
             
             //Store the input in digit
             String input = myScanner.nextLine();
             
             
     
    int x = 0;
    while ( x == 0)
   {
             
           // Use .length to determine how manys digit of the input 
           int inputLength = input.length();
              
           if ( inputLength == 10)
        {
            
             System.out.print("yay");
             int count = 0;
             while (count == 0)
            {
             
                // Convert the String in put into decimal number 
                int digit_1 = 0;
                char char_1 = input.charAt(0); 
                if ( char_1 >= '0' && char_1 <= '9')
                {
                     digit_1 = (int) input.charAt(0) - 48;
                }
                else if ( char_1 == 'X')
                {
                     digit_1 = (int) input.charAt(0) - 78;
                }
                else
                {
                     System.out.println("This is a valid NOT a valid ISBN. Please enter 10 digits: ");
                     input = myScanner.nextLine(); 
                     count++;
                }
                
                
                
                
                int digit_2 = 0;
                char char_2 = input.charAt(1); 
                if ( char_2 >= '0' && char_2 <= '9')
                {
                     digit_2 = (int) input.charAt(1) - 48;
                }
                else if ( char_2 == 'X')
                {
                     digit_2 = (int) input.charAt(1) - 78;
                }
                else
                {
                     System.out.println("This is a valid NOT a valid ISBN. Please enter 10 digits: ");
                     input = myScanner.nextLine(); 
                     count++;
                }
                
                
                
                
                int digit_3 = 0;
                char char_3 = input.charAt(2); 
                if ( char_3 >= '0' && char_3 <= '9')
                {
                     digit_3 = (int) input.charAt(2) - 48;
                }
                else if ( char_3 == 'X')
                {
                     digit_3 = (int) input.charAt(2) - 78;
                }
                else
                {
                     System.out.println("This is a valid NOT a valid ISBN. Please enter 10 digits: ");
                     input = myScanner.nextLine(); 
                     count++;
                }
                
              
              
              
                int digit_4 = 0;              
                char char_4 = input.charAt(3); 
                if ( char_4 >= '0' && char_4 <= '9')
                {
                     digit_4 = (int) input.charAt(3) - 48;
                }
                else if ( char_4 == 'X')
                {
                     digit_4 = (int) input.charAt(3) - 78;
                }
                else
                {
                     System.out.println("This is a valid NOT a valid ISBN. Please enter 10 digits: ");
                     input = myScanner.nextLine(); 
                     count++;
                }
                
                
                
                int digit_5 = 0;
                char char_5 = input.charAt(4); 
                if ( char_5 >= '0' && char_5 <= '9')
                {
                     digit_5 = (int) input.charAt(4) - 48;
                }
                else if ( char_5 == 'X')
                {
                     digit_5 = (int) input.charAt(4) - 78;
                }
                else
                {
                     System.out.println("This is a valid NOT a valid ISBN. Please enter 10 digits: ");
                     input = myScanner.nextLine(); 
                     count++;
                }
                
                
                
                
                
                int digit_6 = 0;
                char char_6 = input.charAt(5); 
                if ( char_6 >= '0' && char_6 <= '9')
                {
                     digit_6 = (int) input.charAt(5) - 48;
                }
                else if ( char_6 == 'X')
                {
                     digit_6 = (int) input.charAt(5) - 78;
                }
                else
                {
                     System.out.println("This is a valid NOT a valid ISBN. Please enter 10 digits: ");
                     input = myScanner.nextLine(); 
                     count++;
                }
                
                
                
                
                int digit_7 = 0;
                char char_7 = input.charAt(6); 
                if ( char_7 >= '0' && char_7 <= '9')
                {
                     digit_7 = (int) input.charAt(6) - 48;
                }
                else if ( char_7 == 'X')
                {
                     digit_7 = (int) input.charAt(6) - 78;
                }
                else
                {
                     System.out.println("This is a valid NOT a valid ISBN. Please enter 10 digits: ");
                     input = myScanner.nextLine(); 
                     count++;
                }
                
                
                
                
                int digit_8 = 0;
                char char_8 = input.charAt(7); 
                if ( char_8 >= '0' && char_8 <= '9')
                {
                     digit_8 = (int) input.charAt(7) - 48;
                }
                else if ( char_8 == 'X')
                {
                     digit_8 = (int) input.charAt(7) - 78;
                }
                else
                {
                     System.out.println("This is a valid NOT a valid ISBN. Please enter 10 digits: ");
                     input = myScanner.nextLine(); 
                     count++;
                }
                
                
                
                int digit_9 = 0;
                char char_9 = input.charAt(8); 
                if ( char_9 >= '0' && char_9 <= '9')
                {
                      digit_9 = (int) input.charAt(8) - 48;
                }
                else if ( char_9 == 'X')
                {
                      digit_9 = (int) input.charAt(8) - 78;
                }
                else
                {
                     System.out.println("This is a valid NOT a valid ISBN. Please enter 10 digits: ");
                     input = myScanner.nextLine(); 
                     count++;
                }
                
                
                int digit_10 = 0;
                char char_10 = input.charAt(9); 
                if ( char_10 >= '0' && char_10 <= '9')
                {
                     digit_10 = (int) input.charAt(9) - 48;
                     
                }
                else if ( char_10 == 'X')
                {
                      digit_10 = (int) input.charAt(9) - 78;
                     
                }
                else
                {
                     System.out.println("This is a valid NOT a valid ISBN. Please enter 10 digits: ");
                     input = myScanner.nextLine(); 
                     count++;
                }
                
            
             
               
                
                
                 /* Multiply the first digit by 10, continue decrementing until the 9th digit has been multiplied by 2
                 and find the sum*/
                 int sum = (digit_1*10) + (digit_2*9) + (digit_3*8) + (digit_4*7) + (digit_5*6) + (digit_6*5) +
                  (digit_7*4) + (digit_8*3) + (digit_9*2);
                // Find the remainder of the sum devided by 11      
                 int check = sum % 11;
                 System.out.println(sum);
                 System.out.println(check);
                     if ( check == digit_10)
                     {
                         System.out.println("This is a valid ISBN.");
                     }
                     else
                     {
                         if( digit_10 == 10)
                            {
                             System.out.println("This is NOT a valid ISBN. Check digit should be X"); 
                            }
                         else
                            {
                             System.out.println("This is NOT a valid ISBN. Check digit should be "+check);
                            }
                     } 
                     System.out.println("x: "+x);
                     x++;
                     break;
             
                       
             
             
        }
             
            }
            
        
         else 
        {
            System.out.print("This is a valid NOT a valid ISBN. Please enter 10 digits: ");
            input = myScanner.nextLine(); 
           
           
            
        } 
            
            
            
            
            
       
             
          
          
          
          
            
            
            
}
            
            
            
         }
     }
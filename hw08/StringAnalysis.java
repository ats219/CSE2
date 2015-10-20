// CSE2
// Athicha Srivirote
// ats219
// 10/19/15
// StringAnalysis Program
// Purpose of the program: to examine whether the input is all letter or not.
//                          The user can choose to examine the whole input( every character ) or specify a certain number of characters to be examined


import java.util.Scanner;

// Declare class
     public class StringAnalysis{
         
         
        
         // Create a main method 
         public static void main(String[] args)
         {
           //Create an instance for Scanner  
           Scanner myScanner = new Scanner( System.in );
           
           //Ask the user to input characters
           System.out.print("Input characters which you want to examine whether they are all letters or not: ");
           String input = myScanner.nextLine();
           
           System.out.println();
           //Ask if user want to specify a certain number of characters
           System.out.println("Do you want to specify a certain number for examing?");
           System.out.println("Type 'yes' if you want to specify a certain number of characters");
           System.out.println("Type 'no' if you want to examine all characters ");
           String yesOrNo = myScanner.nextLine();
           
           boolean accept = false;// to test until get the valid value: 'yes' or 'no'
         
         while( !accept )
    {     
           if( yesOrNo.equals("yes") )
           {   
              
               boolean acceptable = false;
               int num = 0;
               System.out.print("Input desired number of the characters: ");
               while( !acceptable )
               {
                   
                   if( myScanner.hasNextInt() )
                   {
                       num = myScanner.nextInt();
                       acceptable = true;
                   }
                   else
                   {
                       System.out.print("   ERROR: This is not a valid value. \n   Please input an Interger: ");
                       myScanner.next();
                   }
               }
               
               accept = true;
               
               boolean result = analysis( input,num ); // send to analysis method
               // Use if else to print out the result
               if( result == true )
               {
                   System.out.print("Your characters are all letters");
               }
               else
               {
                   System.out.print("Your characters is not all letters");   
               }
               
           }
           else if( yesOrNo.equals("no") )
           {     
               boolean result = analysis( input );// sent to analysis mehtod
               // Use if else to print out the result
               if( result == true )
               {
                   System.out.print("Your characters are all letters");
               }
               else
               {
                   System.out.print("Your characters are not all letters");   
               }
               
               accept = true;
           }
           
           else
           {
               //Tell the user that the input is invalid
               System.out.print("   ERROR: Please input 'yes' or 'no' as your answer: ");
               yesOrNo = myScanner.nextLine();
               
           }
           
           
           
        }
        
    
    }
         
         
         
         
         // Analysis method with only String as a parameter
         public static boolean analysis( String input )
         {
             boolean result = true;
             int length = input.length();
             
             //Use for loop to test each of the characters 
             for( int x = 0; x < length; x++ )
             {
                 char character = input.charAt(x);
                 // Test if the charater is a letter
                 if( character >= 'a' && character <= 'z')
                 {
                     System.out.println(""+character+" is a letter");
                     result = true;
                     
                 }
                 else
                 {
                     System.out.println(""+character+" is not a letter");
                     result = false;
                 }
                 
                 
                 
             }
             return result;
         
         } 
         
         
         
         // Another analysis method with int and String as parameters
         public static boolean analysis( String input, int num )
         {  
                int length = input.length();
                boolean result = true;
                if( num <= length - 1 )
            {
                    input = input.substring( 0, num+1 );
                    
                
                         for( int x = 0; x < num ; x++ )
                  {
                         char character = input.charAt(x);
                         //Test if the character is a letter
                         if( character >= 'a' && character <= 'z')
                      {
                           System.out.println(""+character+" is a letter");
                           result = true;
                      }
                        else
                      {
                           System.out.println(""+character+" is not a letter");
                           result = false;
                      }
                 
                 
                
                  }
            }     
            
            // in case that the number that user inputs is more than index of the String
            else
            {
                    input = input.substring(0, length );
                    
                
                     for( int x = 0; x < length; x++ )
                    {
                        char character = input.charAt(x);
                        if( character >= 'a' && character <= 'z')
                        {
                            System.out.println(""+character+" is a letter");
                            result = true;
                        }
                        else
                        {
                            System.out.println(""+character+" is not a letter");
                            result = false;
                        }
                 
                    
                    }
            }
            
            return result;
        }
     
         
     }
     
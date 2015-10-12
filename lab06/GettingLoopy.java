// CSE2
// Athicha Srivirote
// ats219
// 10/02/15
// Lab 06 
// GettingLoopy Program
// Purpose of the program: using three different kind of loop to print out the numbers

// Declare class
     public class GettingLoopy{
         // Create main method of the class
         public static void main(String []args){
             
             //Step 1: print out number 1-7
             // Use for loop to print out number 1-7
             System.out.println("Step 1:");
             
             for (int x = 1; x < 8 ;x++)
             {
                 System.out.print(x);
                 
             }
             
             // Use for loop to print out other 6 7s
             for( int n = 0; n < 5; n++)
             {
                 System.out.print(7);
             }
             System.out.println(); 
             
             
             //Step 2: print out prime number from 10-100, use three different kind of loops  
            System.out.println(); 
             
            int number = 10;
            int factor = 2; 
            boolean prime = true; // boolean variable to determine whether the number is prime or not
            System.out.println("Step 2:"); 
           
          
             
             
             
             System.out.print("WHILE LOOP: ");
             
            
           
             while ( number <= 100)
             {
                 
                 while( factor < number )
                 
                    {
                        if( number % factor == 0)
                         {
                           prime = false;
                           break; // break out of the loop because this is not prime number
                         }
                         else 
                         {
                           prime = true;
                         }
                        factor++;
                 
                    }
                    
                    
                    if( prime )
                    {
                        System.out.print(number+" ");
                    }
                    
                factor = 2; //set a factor value back to 2, starting at the beginning   
                number++;
                    
             }
             
             System.out.println();
             System.out.print("FOR LOOP: ");
             for( number = 10; number < 100; number++ )
             {
                 for( factor = 2; factor < number; factor++ )
                 {
                    if ( number % factor == 0)
                    {
                        prime = false;
                        break;
                    }
                    else
                    {
                        prime = true;
                    }
                    
                 }
                 if( prime )
                 {
                     System.out.print(number+" ");
                 }
             }
             
             System.out.println();
             System.out.print("DO WHILE LOOP: ");
            do 
             {
                   do
                    {
                        if( number % factor == 0)
                         {
                           prime = false;
                           break; // break out of the loop because this is not prime number
                         }
                         else 
                         {
                           prime = true;
                         }
                        factor++;
                 
                    }while( factor < number );
                    
                    
                    if( prime )
                    {
                        System.out.print(number+" ");
                    }
                    
                factor = 2; //set a factor value back to 2, starting at the beginning   
                number++;
                    
             }while ( number <= 100);
            
             
             
             
             System.out.println();
             // Step 3: print out a symbol(smiley face) for the number of random number from 5-200
             System.out.println();
             System.out.println("Step 3:");
         
             int random = (int) (Math.random() * 196) + 5;
             // Use for loop to printout the symbol
             for ( int count = 1; count < random; count++ )
             {
                 //Use if to determine when to go to the next line
                 if( count % 20 == 0)
                 {
                     System.out.println();
                 }
                 else
                 {
                     System.out.print('\u263A');
                 }
             }
             
             
           
           
           
           
                    
         }
         
         
     }
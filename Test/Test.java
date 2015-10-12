public class Test{

// add main method

  public static void main(String[] args) {
   
   /*// Math.round() how to convert double into 2 decimal points 
            double a = 56.78676;
            double b =14.346;
            double c = 34.111;
            
            double x =  Math.round(a*100);
            System.out.println(x);
            x =  Math.round(a*100)/100;
            System.out.println(x);
            x =  (double) Math.round(a*100)/100; // this one is the correct one
            x = Math.round(a*100)/100d // this one also works fine
            System.out.println(x);
            x =  Math.round((a*100)/100);
            System.out.println(x);
            x =  Math.round(a);
            System.out.println(x);
            



 // Ask the user to input expenses for the rest of the week
               System.out.print("Expenses for Tuesday: ");
               double tue = (double) Math.round(myScanner.nextDouble()*100)/100;
               
               System.out.print("Expenses for Wednesday: ");
               double wed = (double) Math.round(myScanner.nextDouble()*100)/100;
               
               System.out.print("Expenses for Thursday: ");
               double thu = (double) Math.round(myScanner.nextDouble()*100)/100;
               
               System.out.print("Expenses for Friday: ");
               double fri = (double) Math.round(myScanner.nextDouble()*100)/100;
               
               System.out.print("Expenses for Saturday: ");
               double sat = (double) Math.round(myScanner.nextDouble()*100)/100;
               
               System.out.print("Expenses for Sunday: ");
               double sun = (double) Math.round(myScanner.nextDouble()*100)/100;
               
               
               
                while( !goodMon )
                   
                   {
                     myScanner.next();
                     System.out.println("Sorry, you did not enter an integer. Try again: $");
                     goodMon = myScanner.hasNextDouble();
                     
                   } */
                   
                   /*int x = 1;
                   do
                   {
                    System.out.print(x);
                    x++;
                   }while( x < 10 ); */
                   
                   
             int number = 10;
             int factor = 2; 
             boolean prime = true; // boolean variable to determine whether the number is prime or not
             /* while ( number <= 100)
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
                    
             } */
             
            System.out.println(); 
            System.out.print("DO WHILE LOOP: "); 
             
             do 
             {
                   //System.out.println("Looktan is cute");
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
                        //System.out.print("Looktan is cute");
                 
                    }while( factor < number );
                    
                    
                    if( prime )
                    {
                        System.out.print(number+" ");
                        //System.out.print("Looktan is cute");
                    }
                    
                factor = 2; //set a factor value back to 2, starting at the beginning   
                number++;
                    
             }while ( number <= 100);
             
             
             
             
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
             
           

  }
}
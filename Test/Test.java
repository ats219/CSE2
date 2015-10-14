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
                   
                   
                   
                  /* System.out.println("#");
                   System.out.println("/");
                   System.out.println("\\"); */
                   
              /* for ( int row = 1; row < 5; row++ )
              {
                  for( int col = 1; col < 5; col++ )
                  {
                    for( int a = 1; a < 5; a++)
                    {
                     System.out.print("#");
                    }
                    
                    for(int b = 1; b < 5; b++)
                    {
                        System.out.print("o");
                    }
                    
                     
                  }
                  
                  System.out.println();
              } */
              
              
              
              
              
            /*    for ( int row = 1; row < 5; row++ )
              {
                  for( int col = 1; col <= row - 1  ; col++ )
                  {
                     
                         System.out.print("#");
                    
                  }
                  
                  for( int x = 1; x <= 5 - row ; x++ )
                  {
                      System.out.print("o");
                  }
                  
                  System.out.println();
                  
              } */
              
              
              
              
              
              
              
              
            /*  int size = 5;
              for ( int row = 1; row < size; row++ )
              {
                  for( int col = 1; col <= size  ; col++ )
                  {
                         if( row == col )
                         {
                            System.out.print("#");  
                         }
                         else
                         {
                             System.out.print(" ");
                         }
                        
                         if( size == row + col )
                         {
                            System.out.print("o");
                         }
                         else
                         {
                             System.out.print(" ");
                         }
                        
                  }
                  
                  
                  
                 
                  
                  
                  System.out.println();
                  
              } */
              
              
             /* int size = 5;
              for ( int row = 1; row < size; row++ )
              {
                  for( int col = 1; col <= size; col++ )
                  {
                         for( int x = 1; x < size; x++ )
                        {
                         if( row == col )
                         {
                            System.out.print("#");  
                         }
                         else
                         {
                             System.out.print(" ");
                         }
                        
                         if( size == row + col )
                         {
                            System.out.print("o");
                         }
                         else
                         {
                             System.out.print(" ");
                         }
                        }
                  }
                  
                  
                  
                 
                  
                  
                  System.out.println();
                  
              } */
           
              
            /*  int w = 5;
              int l = 45;
              int z = (l/(2*w)) + 2;


              for ( int i = 1; i < w; i++ )
              {
               
               for( int s = 1; s < z ; s++)
              { 
               for( int c = 1 + (2*w)*(s-1) ; c < 2*w + (2*w)*(s-1) && c < l + 1; c++ )
               {
                
                if ( c ==  (w + i) + (2 * w)*(s - 1)  )
                {
                 System.out.print("\\");
                }
                else if ( c == (i + (2 * w ) * (s - 1) ) || c == ( (2*w - i + 1) + (2 * w ) * (s - 1) ) )
                {
                 System.out.print("#");
                }
                else if( c == ((w - i + 1) + (2 * w ) * (s - 1) ))
                {
                 System.out.print("/");
                }
                else
                {
                 System.out.print(" ");
                }
                
               } 
              }
               System.out.println();
              } */
              
              
              
              /* int w = 7;
              int l = 39;
              int z = (l/(2*w)) + 2;


              for ( int i = 0; i < w; i++ )
              {
               for( int s = 1; s < z ; s++)
              {
               for( int c = 0; c < l ; c++ )
               {
                
                if ( c ==  ((w + i)%(2*w))  )
                {
                 System.out.print("\\");
                }
                else if ( c == (i%(2*w)) || c == ( (2*w - i - 1)%(2*w)  ) )
                {
                 System.out.print("#");
                }
                else if( c == ((w - i - 1) ))
                {
                 System.out.print("/");
                }
                else
                {
                 System.out.print("_");
                }
               } 
              }
               System.out.println();
              } */
              
              
              
              int w = 7;
              int l = 39;


              for ( int i = 0; i < w; i++ )
              {
               

               for( int c = 0; c < l ; c++ )
               {
                
                if ( c % (2 * w) == (w + i)  )
                {
                 
                 System.out.print("\\");
                 
                }
                
                else if ( c % (2 * w) == i || c % (2 * w) == (2 * w - i - 1)  )
                {
                 
                 System.out.print("#");
                 
                }
                
                else if( c % (2 * w) == (w - i - 1) )
                {
                 
                 System.out.print("/");
                 
                }
                
                else
                {
                 
                 System.out.print(" ");
                 
                }
                
              }
               System.out.println();
              }
               
           

  }
}
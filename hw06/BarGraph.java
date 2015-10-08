// CSE2
// Athicha Srivirote
// ats219
// 10/06/15
// BarGraph  Program
// Purpose of the program: to calculate weekly expense and also print out bargraph of the spent money each day
//                         and also predict accumulative 4 years expense in college

// import Scanner class for the user to input expense of each day
import java.util.Scanner; 

// Declare Class
     public class BarGraph{
         
         // Create main method 
         public static void main(String[] args){
             
             //Create instance for Scanner to store an input
               Scanner myScanner = new Scanner( System.in );
             
             
             
             
            // Prompt the user to input an expense for Monday
            System.out.print("Expenses for Monday: $"); 
          
            double monInput = 0;
            // Create boolean goodMon to test whether the input is a double
            
            boolean goodMon = myScanner.hasNextDouble();
            
                     while( !goodMon )
                   
                    {
                     myScanner.next();
                     System.out.print("Sorry, you did not enter an integer. Try again: $");
                     goodMon = myScanner.hasNextDouble();
                    }     
                    
                     monInput = myScanner.nextDouble();
          
                     while ( monInput < 0 )
                    {
                     System.out.print("Please only enter positive numbers. Try again: $");
                     monInput = myScanner.nextDouble();
                     //System.out.println(monInput);
                    }
                   
                    //Store the input in digit and also use Math.round() to format the input into 2 decimal points 
                    double mon = (double) Math.round(monInput);
                    
            
            
             // Prompt the user to input an expense for Tuesday
            System.out.print("Expenses for Tuesday: $"); 
          
            double tueInput = 0;
            // Create boolean goodMon to test whether the input is a double
            
            boolean goodTue = myScanner.hasNextDouble();
            
                     while( !goodTue )
                   
                    {
                     myScanner.next();
                     System.out.print("Sorry, you did not enter an integer. Try again: $");
                     goodTue = myScanner.hasNextDouble();
                    }     
                    
                     tueInput = myScanner.nextDouble();
          
                     while ( tueInput < 0 )
                    {
                     System.out.print("Please only enter positive numbers. Try again: $");
                     tueInput = myScanner.nextDouble();
                     //System.out.println(monInput);
                    }
                   
                    //Store the input in digit and also use Math.round() to format the input into 2 decimal points 
                    double tue = (double) Math.round(tueInput);
                    
                    
                    
            // Prompt the user to input an expense for Wednesday
            System.out.print("Expenses for Wednesday: $"); 
          
            double wedInput = 0;
            // Create boolean goodwed to test whether the input is a double
            
            boolean goodwed = myScanner.hasNextDouble();
            
                     while( !goodwed )
                   
                    {
                     myScanner.next();
                     System.out.print("Sorry, you did not enter an integer. Try again: $");
                     goodwed = myScanner.hasNextDouble();
                    }     
                    
                     wedInput = myScanner.nextDouble();
          
                     while ( wedInput < 0 )
                    {
                     System.out.print("Please only enter positive numbers. Try again: $");
                     wedInput = myScanner.nextDouble();
                     //System.out.println(wedInput);
                    }
                   
                    //Store the input in digit and also use Math.round() to format the input into 2 decimal points 
                    double wed = (double) Math.round(wedInput);
                    
                
                
             // Prompt the user to input an expense for Thursday
            System.out.print("Expenses for Thursday: $"); 
          
            double thuInput = 0;
            // Create boolean goodthu to test whether the input is a double
            
            boolean goodthu = myScanner.hasNextDouble();
            
                     while( !goodthu )
                   
                    {
                     myScanner.next();
                     System.out.print("Sorry, you did not enter an integer. Try again: $");
                     goodthu = myScanner.hasNextDouble();
                    }     
                    
                     thuInput = myScanner.nextDouble();
          
                     while ( thuInput < 0 )
                    {
                     System.out.print("Please only enter positive numbers. Try again: $");
                     thuInput = myScanner.nextDouble();
                     //System.out.println(thuInput);
                    }
                   
                    //Store the input in digit and also use Math.round() to format the input into 2 decimal points 
                    double thu = (double) Math.round(thuInput);
                    
                    
                    
            // Prompt the user to input an expense for Friday
            System.out.print("Expenses for Friday: $"); 
          
            double friInput = 0;
            // Create boolean goodfri to test whether the input is a double
            
            boolean goodfri = myScanner.hasNextDouble();
            
                     while( !goodfri )
                   
                    {
                     myScanner.next();
                     System.out.print("Sorry, you did not enter an integer. Try again: $");
                     goodfri = myScanner.hasNextDouble();
                    }     
                    
                     friInput = myScanner.nextDouble();
          
                     while ( friInput < 0 )
                    {
                     System.out.print("Please only enter positive numbers. Try again: $");
                     friInput = myScanner.nextDouble();
                     //System.out.println(friInput);
                    }
                   
                    //Store the input in digit and also use Math.round() to format the input into 2 decimal points 
                    double fri = (double) Math.round(friInput);
                    
                    
                    
             // Prompt the user to input an expense for Saturday
            System.out.print("Expenses for Saturday: $"); 
          
            double satInput = 0;
            // Create boolean goodsat to test whether the input is a double
            
            boolean goodsat = myScanner.hasNextDouble();
            
                     while( !goodsat )
                   
                    {
                     myScanner.next();
                     System.out.print("Sorry, you did not enter an integer. Try again: $");
                     goodsat = myScanner.hasNextDouble();
                    }     
                    
                     satInput = myScanner.nextDouble();
          
                     while ( satInput < 0 )
                    {
                     System.out.print("Please only enter positive numbers. Try again: $");
                     satInput = myScanner.nextDouble();
                     //System.out.println(satInput);
                    }
                   
                    //Store the input in digit and also use Math.round() to format the input into 2 decimal points 
                    double sat = (double) Math.round(satInput);
                    
                    
                    
             // Prompt the user to input an expense for Sunday
            System.out.print("Expenses for Sunday: $"); 
          
            double sunInput = 0;
            // Create boolean goodsun to test whether the input is a double
            
            boolean goodsun = myScanner.hasNextDouble();
            
                     while( !goodsun )
                   
                    {
                     myScanner.next();
                     System.out.print("Sorry, you did not enter an integer. Try again: $");
                     goodsun = myScanner.hasNextDouble();
                    }     
                    
                     sunInput = myScanner.nextDouble();
          
                     while ( sunInput < 0 )
                    {
                     System.out.print("Please only enter positive numbers. Try again: $");
                     sunInput = myScanner.nextDouble();
                     //System.out.println(sunInput);
                    }
                   
                    //Store the input in digit and also use Math.round() to format the input into 2 decimal points 
                    double sun = (double) Math.round(sunInput);
                    
                    
                    
             //Print out bar graph using * to represent each dollar 
            System.out.print("Mon:     ");
            //Use for loop for each day to determine how many * will be printed
            for( int x = 0; x < mon; x++ )
            {
               System.out.print("*");
            }
            System.out.println("");
            
            
             //Print out bar graph using * to represent each dollar 
            System.out.print("Tues:     ");
            for( int x = 0; x < tue; x++ )
            {
               System.out.print("*");
            }
            System.out.println("");
            
            
             //Print out bar graph using * to represent each dollar 
            System.out.print("Wed:     ");
            for( int x = 0; x < wed; x++ )
            {
               System.out.print("*");
            }
            System.out.println("");
            
            
             //Print out bar graph using * to represent each dollar 
            System.out.print("Thu:     ");
            for( int x = 0; x < thu; x++ )
            {
               System.out.print("*");
            }
            System.out.println("");
            
             
             //Print out bar graph using * to represent each dollar 
            System.out.print("Fri:     ");
            for( int x = 0; x < fri; x++ )
            {
               System.out.print("*");
            }
            System.out.println("");
            
            
             //Print out bar graph using * to represent each dollar 
            System.out.print("Sat:     ");
            for( int x = 0; x < sat; x++ )
            {
               System.out.print("*");
            }
            System.out.println("");
            
             
             //Print out bar graph using * to represent each dollar 
            System.out.print("Sun:     ");
            for( int x = 0; x < sun; x++ )
            {
               System.out.print("*");
            }
            System.out.println("");
            
                    
            // find the weekly average        
            double avg = (mon + tue + wed + thu + fri + sat + sun)/7;  
            double avgRound = (double) Math.round(avg * 100)/100;
            System.out.println("Your average daily expenses are: $" +avgRound );
            
            //Declare varaibles for calculation of 4 years
            double next = 0; // next is the amount of money you would specd in the next week based on the prediction
            double fourYears = 0; // the estimation of 4 years expenditure
            int range = 0; // range of the fluctuated percent between -20<= range <= 20
            double percent = 0; 
            double sum = 0;
            
            //Since one year has 52*7 = 364 days, so that 4 years have 364*4 = 1456 days
            for ( int x = 0; x < 1456; x++)
            {
               range = (int) (Math.random()*41)-20;
               
               percent =  (double) range/100; // fluctuated percent
               
               
               next = avgRound + (avgRound * percent); 
               
               sum = avgRound + next;
              
              //Assign next to avgRound in order to be the average for the next day
               avgRound = next;
              //The sum of all expense in 4 years
               fourYears = sum + fourYears;
              
                     
            }
            // Round the result to two decimal points 
            fourYears = (double) Math.round(fourYears*100)/100;
            // Print out the result to the screen
            System.out.println("Estimated expenditure for 4 years: $"+ fourYears);
            
            
            
        }
     }
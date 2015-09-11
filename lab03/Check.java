// CSE2
// Athicha Srivirote
// ats219
// 09/11/15
// Check Program
// Purpose of the program: to calculate money that each person has to pay for the dinner( also including tip that they wish to give)

import java.util.Scanner; // import Scanner class to enable user to put information

// Declare class
     public class Check{
         // write a main method
         public static void main(String[] args){
             
             // create instance for scanner to store an input
             Scanner myScanner = new Scanner( System.in );
             
             // prompt the user to input the original cost of the check
             System.out.print("Enter the original cost of the check in the form xx.xx: ");
             
             //accept user input by using nextdouble method
             double checkCost = myScanner.nextDouble();
             
             System.out.print("Enter the percentage tip that you wish to pay as a whole number (in the form xx): ");
             //store tip in tipPercent
             double tipPercent = myScanner.nextDouble();
             // convert percentage to decimal value
             tipPercent /=100; 
             
            //ask user to input the number of people
            System.out.print("Enter the number of people who went out to dinner: ");
            int numPeople = myScanner.nextInt();
            
            double totalCost;
            double costPerPerson;
            int dollars; 
            int dimes;
            int pennies;
            
            totalCost = checkCost*(1+tipPercent);
            costPerPerson = totalCost/numPeople;
            // use % operator to calculate dimes and pennies 
            dollars = (int) costPerPerson;
            dimes =  (int) (costPerPerson*10) % 10;
            pennies = (int) (costPerPerson*100) % 10;
            // the final cost for each person
            System.out.println("Each person in the group owes $"+dollars+"."+dimes+pennies);
            
         }
         
     }

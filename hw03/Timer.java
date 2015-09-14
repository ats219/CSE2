// CSE2
// Athicha Srivirote
// ats219
// hw03
// Timer program 
// Purpose of the program: calculate the remaining time before dinner


import java.util.Scanner; //Import Scanner Class 

//Declare class
     public class Timer{
         //Create a main method
         public static void main(String[] args){
             
             //Create instance for Scanner to store an input
             Scanner myScanner = new Scanner( System.in);
             
             //Prompt the user to input the time
             System.out.print("Enter the current time: ");
             
             //Store the input in timeCurrent
             int timeCurrent = myScanner.nextInt();
             
             //Convert input to time in minutes 
             timeCurrent = ((int) (timeCurrent/100))*60 + (int)(timeCurrent % 100);
             
             
             //Prompt the user to input the time that they will eat dinner
             System.out.print("Enter the time that you will be eating dinner: ");
             
             //Store input in timeEat
             int timeEat = myScanner.nextInt();
             
             //Convert timeEat into minutes
             timeEat = ((int) (timeEat/100))*60 + (int)(timeEat % 100);
             double timeRemain = timeEat - timeCurrent;
             int hours;
             int minutes;
             
             //Calculate the remaining time in hours and minutes 
             hours = (int) (timeRemain / 60);
             minutes = (int) (timeRemain % 60);
             
             System.out.print("You have "+hours+" hours and "+minutes+" minutes until dinner." );
             
             
         }
     }
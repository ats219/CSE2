// CSE2
// Athicha Srivirote
// ats219
// 10/16/15
// Lab 08
// Stats Program
// Purpose of the program: Ask the user to input 5 number and then print out mean amd median of that set of numbers

import java.util.Scanner;


// Declare class
     public class Stats{
         // Create main method of the class
         public static void main(String []args){
             
            Scanner myScanner = new Scanner( System.in ); 
            
            System.out.print("Input the fisrt number: ");
            double a = myScanner.nextDouble();
            
            
            System.out.print("Input the second number: ");
            double b = myScanner.nextDouble();
            boolean accept1 = false;
            while ( !accept1 )
            {
                if( b > a )
                {
                    accept1 = true;
                }
                else
                {
                    System.out.print("Please input greater number than a previous number: ");
                    b = myScanner.nextDouble();
                }
            }
            
            boolean accept2 = false;
            System.out.print("Input the third number: ");
            double c = myScanner.nextDouble();
            while ( !accept2 )
            {
                if( c > b )
                {
                    accept2 = true;
                }
                else
                {
                    System.out.print("Please input greater number than a previous number: ");
                    c = myScanner.nextDouble();
                }
            }
            
            
            boolean accept3 = false;
            System.out.print("Input the forth number: ");
            double d = myScanner.nextDouble();
            while ( !accept3 )
            {
                if( d > c )
                {
                    accept3 = true;
                }
                else
                {
                    System.out.print("Please input greater number than a previous number: ");
                    d = myScanner.nextDouble();
                }
            }
            
            
            boolean accept4 = false;
            System.out.print("Input the fifth number: ");
            double e = myScanner.nextDouble();
            while ( !accept4 )
            {
                if( e > d )
                {
                    accept4 = true;
                }
                else
                {
                    System.out.print("Please input greater number than a previous number: ");
                    e = myScanner.nextDouble();
                }
            } 
            
            
            
           double mean = getMean( a,b,c,d,e );
           double median = getMedian( c );
           printOut( mean, median );
            
         }
         
         
         
         public static double getMean( double first, double second, double third, double forth, double fifth )
         {
             double mean = ( first + second + third + forth + fifth )/5;
             
             return mean;
         }
         public static double getMedian( double third )
         {
             return third;
         }
         
         
         public static void printOut( double mean, double median)
         {
             System.out.println("The mean is "+mean);
             System.out.println("The median is "+median);
         }
         
         
         
     }
         
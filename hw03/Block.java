// CSE2
// Athicha Srivirote
// ats219
// hw03
// Block program 
// Purpose of the program: calculate the volume of the block and the surface area by user's input

//import Scanner Class 
import java.util.Scanner;

//Declare Block class
    public class Block{
        //Create main method
        public static void main (String []args){
            
            //Create instance for Scanner class
            Scanner myScanner = new Scanner( System.in );
            
            //Prompt the user to input length
            System.out.print("Enter the lenght of the block: ");
            //Store lenght in the variable length
            double length = myScanner.nextDouble();
            
            //Prompt the user to input width
            System.out.print("Enter the width of the block: ");
            //Store width in the variable width
            double width = myScanner.nextDouble();
            
            //Prompt the user to input height
            System.out.print("Enter the height of the block: ");
            //Store height in the varaible height 
            double height = myScanner.nextDouble();
            
            //Calculate the volume of the block
            double volume = (length*width*height);
            
            //Display volume to the user
            System.out.println("The volume of the block of dimensions "+length+" x "+width+" x "+height+" is "+volume+".");
            
            //Calculate the surface area of the block
            double surfaceArea = 2*( (length*width)+(length*height)+(width*height) );
            
            //Display surface to the user
            System.out.println("The surface area of the block is "+surfaceArea+".");
        }
        
    }
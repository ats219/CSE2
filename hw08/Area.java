// CSE2
// Athicha Srivirote
// ats219
// 10/19/15
// Area Program
// Purpose of the program: to calculate 3 different areas: circle, triangle, and rectangle by asking the user what 
//                         shape the user want the program to calculate. The user also inputs appropriate parameter for each shape.
import java.util.Scanner;

// Declare class
     public class Area{
         
         // Create a main method 
         public static void main(String[] args)
         {
           //Create an instance for Scanner  
           Scanner myScanner = new Scanner( System.in );
           
           System.out.print("Please indicate the shape you want to calculate the area: ");
           String shape = myScanner.nextLine();
           boolean acceptable = false; // to check if the shape is appropriate
           
           String circle = "circle";
           String triangle = "triangle";
           String rectangle = "rectangle";
           
           
          while( !acceptable )
           {
               if( shape.equals( circle ) )
               {
                   acceptable = true;
                   
                   input( circle );// send circle to input method
                   
               }
               else if( shape.equals( triangle ) )
               {
                   acceptable = true;
                   
                   input( triangle );// send triangle to input method
               }
               else if( shape.equals( rectangle ) )
               {
                   acceptable = true;
                   
                   input( rectangle );// send rectangle to input method
               }
               else
               {
                   System.out.print("   ERROR: This is not a valid shape. \n   Plese enter 'circle', 'triangle', or 'rectangle' without capitalizing: " );
                   shape = myScanner.nextLine();
               }
           } 
           
           
         
          
         }
         
         
         
         
         // Input method: to check what area mehod to call based on the user input 
         public static void input( String parameter )
         {
             
           Scanner myScanner = new Scanner( System.in ); 
           boolean acceptable2 = false; // 
           boolean acceptR = false; // acceptRadius: to check if the radius is acceptable 
           boolean acceptTB = false;// acceptTriangleBase: to check if the base length of triangle is acceptable
           boolean acceptTH = false;// acceptTriangleHeight: to check if the height length of triangle is acceptable
           boolean acceptRB = false;// acceptRectangleBase: to check if the base length of rectangle is acceptable
           boolean acceptRH = false;// acceptRectangleHeight: to check if the height length of rectangle is acceptable
           
           
           double radius = 0;// radius of the circle
           double baseT = 0;// baseT represents baseTriangle  
           double heightT = 0;// heightT represents heightTriangle
           double baseR = 0;// baseR represents baseRectangle
           double heightR = 0;// heightR represents heightRectangle
         
             
                
                if( parameter.equals("circle") )
                {
                    System.out.print("Enter the radius: ");
                    while ( !acceptR )
                     {
                          if( myScanner.hasNextDouble() )
                         { 
                            radius = myScanner.nextDouble();
                            acceptR = true;
                         }
                         else
                         {
                             System.out.println("   ERROR: Please type in an interger ");
                             System.out.print("Input your desired radius: ");
                             myScanner.next();
                         }
                         
                         
                     }
                      circle( radius );// to calculate the area of the circle
                         
                }
                
                else if( parameter.equals("triangle") )
                {
                       
                     System.out.print("Enter the length of the base: ");
                     while( !acceptTB )
                       {
                           if( myScanner.hasNextDouble() )
                           {
                             baseT = myScanner.nextDouble();
                             acceptTB = true;
                           }
                           else
                           {
                             System.out.println("   ERROR: Please type in an interger ");
                             System.out.print("Input your desired base length: ");
                             myScanner.next();
                           }
                       }
                       
                       System.out.print("Enter the length of the height: ");
                       while( !acceptTH )
                       {
                           if( myScanner.hasNextDouble() )
                           {
                             heightT = myScanner.nextDouble();
                             acceptTH = true;
                           } 
                           else
                           {
                             System.out.println("   ERROR: Please type in an interger ");
                             System.out.print("Input your desired height length: ");
                             myScanner.next();
                           }
                           
                       }
                       
                       
                        triangle( baseT,heightT );// to calculate the area of the triangle
                        
                } 
                
                
                else if( parameter.equals("rectangle") )
                {
                        System.out.print("Enter the length of the base: ");  
                        while( !acceptRB )
                        {
                            if( myScanner.hasNextDouble() )
                           {
                             baseR = myScanner.nextDouble();
                             acceptRB = true;
                           } 
                           else 
                           {
                             System.out.print("   ERROR: Please type in an interger: ");
                             System.out.print("Input your desired base length: ");
                             myScanner.next();
                           }
                        }
                        
                        System.out.print("Enter the length of the height: ");  
                        while( !acceptRH )
                        {
                           if( myScanner.hasNextDouble() )
                           {
                             heightR  = myScanner.nextDouble();
                             acceptRH = true;
                           }
                           else
                           {
                             System.out.print("   ERROR: Please type in an interger: ");
                             System.out.print("Input your desired height length: ");
                             myScanner.next();
                           }
                        }
                        
                    rectangle( baseR,heightR );// to calculate the area of the rectangle
                        
                }        
                        
         }
         
         
                       
                   
                   
                   
                    
              
         
         
        public static void circle( double radius )
         {
             double area =  Math.PI*radius*radius;
             System.out.println("The area of the circle is: "+area);
         }
         
         
         
         public static void triangle( double base, double height )
         {
             double area = 0.5 * base * height;
             System.out.println("The area of the triangle is: "+area);
         }
         
         
         
         public static void rectangle( double base, double height )
         {
             double area = base * height;
             System.out.println("The are of the rectangle is: "+area);
         } 
         
         
     }
        
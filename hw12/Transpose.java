// CSE2
// Athicha Srivirote
// ats219
// 11/15/15
// Transpose Program
// Purpose of the program: take the width and the height from the user and print out the matrix that size
//                         then transposed the matrix and print it out.
//                         note: also check if the matrix is a rectangular matrix in the printMatrix method.


import java.util.Scanner;


// Declare class
     public class Transpose{
         
         // Create a main method 
         public static void main(String[] args)
         {
             
           Scanner myScanner = new Scanner( System.in );
           int width = 0;
           boolean acceptable1 = false; 
           
           //Ask the user to input the size of the square
           System.out.print("Input width of the matrix: ");
           
           //Use while loop to check if the input is appropriate
            
               while ( !acceptable1 ) //Check if the width is an integer 
              {
                   if( myScanner.hasNextInt() )
                   {
                       width = myScanner.nextInt();
                       acceptable1 = true;
                   }
                   else
                   {
                       System.out.println("   Error: This is not an interger");
                       System.out.print("Please input an integer for the width: ");
                       myScanner.next();
                       
                   }
              }    
                   
               boolean acceptable2 = false;
               
                   while( !acceptable2 ) //Check if the widht is a positive number
                  { 
                    if( 0 <= width )
                   {
                       acceptable2 = true;
                   }
                   else
                   {
                       System.out.println("   Error: This is a negative width");
                       System.out.print("Please input a positive integer: ");
                       width = myScanner.nextInt();
                   }
              
                  }
                  
            int height = 0;
            boolean acceptable3 = false; 
           
           //Ask the user to input the size of the square
           System.out.print("Input height of the matrix: ");
           
           //Use while loop to check if the input is appropriate
            
               while ( !acceptable3 )//Check if the height is an integer
              {
                   if( myScanner.hasNextInt() )
                   {
                       height = myScanner.nextInt();
                       acceptable3 = true;
                   }
                   else
                   {
                       System.out.println("   Error: This is not an interger");
                       System.out.print("Please input an integer for the height: ");
                       myScanner.next();
                       
                   }
              }    
                   
               boolean acceptable4 = false;
               
                   while( !acceptable4 ) // Check if the height is a positive number
                  { 
                    if( 0 <= height )
                   {
                       acceptable4 = true;
                   }
                   else
                   {
                       System.out.println("   Error: This is a negative height");
                       System.out.print("Please input a positive integer: ");
                       height = myScanner.nextInt();
                   }
              
                  } 
                  
             int [][] matrix = randomMatrix(height,width);
             System.out.print("The matrix is ");
             printMatrix(matrix);
             System.out.println();
             int [][] transposed = transposeMatrix(matrix);
             System.out.print("The transposed matrix is ");
             printMatrix(transposed);
            
         }
         
         
         //randomMatrix to assign random form -10 to 10 to matrix 
         public static int[][] randomMatrix( int height, int width)
         {
             int [][] matrix = new int[height][width];
             for( int i = 0; i < height; i++)
             {
                 for( int j = 0; j < width; j++ )
                 {
                     matrix[i][j] = (int) (Math.random()*21) - 10;
                 }
             }
             return matrix;
         }
         
         //printMatrix to print out the matrix as well as check if the matrix is rectangular 
         public static void printMatrix( int[][] matrix )
         {
              boolean rectangular = false;
             // check if the matrix is rectangular
             for( int i = 0; i < matrix.length; i++ )
             {
                int member = matrix[0].length;
                int memberArray = matrix[i].length;
                 
               
                   
                   if( member == memberArray )  
                   {
                       rectangular = true;
                       
                   }
                   else
                   {
                       rectangular = false;
                       
                   }
               
               }
                if( rectangular )
               {
                   System.out.println("a rectangular matrix");
               }
               else
               {
                   System.out.println("NOT a rectangular matrix");
                   return;
               }
             
             
             // print out the matrix
             for( int i = 0; i < matrix.length; i++ )
             {
                 for( int j = 0; j < matrix[i].length; j++ )
                 {
                     
                     System.out.printf(matrix[i][j]+" ");
                 }
                 System.out.println();
             }
             
         }
         
        //transposeMatrix is to transpose matrix and then return trasposed matrix 
        public static int[][] transposeMatrix( int[][] matrix )
        {
            int height= matrix[0].length;
            int width = matrix.length;
        
            int [][] transposed = new int [height][width];
            
            
            for( int i = 0; i < height; i++ )
            {
                for( int j = 0; j < width; j++ )
                {
                    transposed[i][j] = matrix[j][i];
                }
            }
            
            return transposed;
        }
         
         
}
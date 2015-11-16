// CSE2
// Athicha Srivirote
// ats219
// 11/13/15
// MuiltipleArrays Program



// Declare class
     public class MultipleArrays{
         
         // Create a main method 
         public static void main(String[] args)
         {
          
          int [][] array = raggedArray();
          System.out.println("The ragged array is: ");
          printArray(array);
          int [] arrayMin = findSmallest(array);
          System.out.print("The array with the smallest size is: ");
          printArray(arrayMin);
          findLargest(array);
          int [] arrayEven = mostEven(array);
          System.out.println("The array with the largest number of even numbers is: ");
          printArray(arrayEven);
          
          
         }
         
         public static int[][] raggedArray()
         {
             int x = (int) (Math.random()*11) + 10;
             int array [][] = new int[x][];
  
             for( int i = 0; i < x; i++ )
             {
                 array[i] = new int[(int) (Math.random()*11) + 10];
             }
            
             for( int row = 0; row < array.length; row++)
             {
                 for( int col = 0; col < array[row].length; col++)
                 {
                     array[row][col] = (int) (Math.random()*2001) -1000;
                 }
             }
             return array;
         }
         
         public static void printArray( int[][] array )
         {
             
             for( int row = 0; row < array.length ; row++ )
             {
                 for( int col = 0; col < array[row].length; col++)
                 {
                     System.out.print(array[row][col]+"  ");
                 }
                 System.out.println();
             }
             System.out.println();
         }
         
         public static void printArray( int[] array )
         {   
           
             for( int i = 0; i < array.length; i++ )
             {
                 System.out.print(array[i]+" ");
             }
             System.out.println();
         }
         
         public static int[] findSmallest( int[][] array )
         {
            int min = array[0].length;
            int [] arrayMin = new int [0];
            for( int x = 0; x < array.length; x++ )
             {
                 if( array[x].length < min )
                 {
                     arrayMin = array[x];
                     
                 }
             }
            
             return arrayMin;
           
         }
         
         public static int[] findLargest( int[][] array )
         {
             int max = array[0][0];
             int maxArray = 0;
             int [] array2 = new int[maxArray];
             
             for( int row = 0; row < array.length; row++)
             {
                 for( int col = 0; col < array[row].length; col++ )
                 {
                     if( max < array[row][col] )
                     {
                         max = array[row][col];
                         array2 =  array[row];
                     }
                 } 
             }
             System.out.println("The largest value in the array is: "+max);
             
             System.out.print("The array that contains the largest value is: ");
             for ( int x = 0; x < array2.length; x++ )
             {  
                System.out.print(array2[x]+" ");
             }
             System.out.println();
             return array2;
             
         }
         
         public static int[] mostEven( int[][] array )
         {   
             int [] arrayEven = new int[0];
             int count = 0;
             int countMax = 0;
             for( int row = 0; row < array.length; row++ )
             {
                 for( int col = 0; col < array[row].length; col++ )
                 {
                     count = 0;
                     if( array[row][col] % 2 == 0 )
                     {
                         count++;
                     }
                 }
                 if( count > countMax)
                 {
                     countMax = count;
                     arrayEven = array[row];
                 }
             }
             /*for( int i = 0; i < arrayEven.length; i++)
             {
                 System.out.print("The arrayEven is: "+arrayEven[i]+" ");
             }*/
             return arrayEven;
         }
}

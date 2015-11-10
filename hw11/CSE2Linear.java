// CSE2
// Athicha Srivirote
// ats219
// 11/09/15
// CSE2Linear Program
// Purpose of the program: take 15 final scores of the student in CSE2 class and rearrange the score in ascending order
//                         ask user to search for score. Use binary search to tell the user if that score is found with iteration
//                         scramble all the scores and then ask user to search the score again. Use linear search to tell the user if that score
//                         is found with iteration 
import java.util.Scanner;
import java.util.Random;

// Declare class
     public class CSE2Linear{
         
         // Create a main method 
         public static void main(String[] args)
         {
             
             Scanner myScanner = new Scanner( System.in );
             
             System.out.println("Enter 15 ints for final grades in CSE2: ");
             
             int[] array1 = new int[15];
             
             for( int index = 0; index < array1.length; index++)
             {
                 //Use two booleans to check if the input is an integer and from 0 to 100
                 boolean acceptable1 = false;
                 boolean acceptable2 = false;
                
                 while( !acceptable1 ) // check integer
                 {
                     if( myScanner.hasNextInt() )
                     {
                        array1[index] = myScanner.nextInt();
                        acceptable1 = true;
                     }
                     else
                     {
                         System.out.println("   ERROR: need an integer");
                         System.out.print("Please enter an interger: ");
                         myScanner.next();
                     }
                     
                     
                 }
                 
                 while( !acceptable2 )// check the range drom 0 to 100
                 {
                     if( array1[index] >= 0 && array1[index] <= 100 )
                     {
                          acceptable2 = true;
                     }
                     
                     else
                     {
                         System.out.println("   ERROR: need an integer from 0 to 100");
                         System.out.print("Please an integer from 0 to 100: ");
                         array1[index] = myScanner.nextInt();
                     }
                 }
                 
                 
            }   
            
                 array1 = sortArray(array1); // call sortArray method to sort array in ascending order
                 System.out.print("The sorted score are: "); // print out sorted scores
                    for( int index = 0; index < array1.length ; index++ )
                   {
                     System.out.print(array1[index]+" ");
                   } 
                 System.out.println();
                 
                   
                
                System.out.print("Enter a grade to search for: ");
                int search = myScanner.nextInt();
                binarySearch( array1, search ); // binary search for sorted score
                System.out.println();
                    
                    
                System.out.print("The scrambled score are: ");    
                array1 = scramble(array1); // scramble all the scores
                for( int index = 0; index < array1.length ; index++ ) // print out scrambled scores
                   {
                     System.out.print(array1[index]+" ");
                   } 
                 System.out.println();
                 
                 
                 
                  System.out.print("Enter a grade to search for: ");
                  int search2 = myScanner.nextInt();
                  linearSearch(array1,search2); // use linear search for scrambled scores
                  
             
         }
                
                 // sortArray to sort the scores in ascending order
                 public static int[] sortArray( int[] array1 )
                {
                    for( int index = 0; index < array1.length; index++ )
                    {
                        int min = array1[index];
                        int minIndex = index;
                        
                        for( int next = index + 1; next < array1.length; next++ )
                        {
                            if( min > array1[next])
                            {
                                min = array1[next];
                                minIndex = next;
                            }
                        }
                        
                        
                            array1[minIndex] = array1[index];
                            array1[index] = min;
                       
                    }
                     return array1;
                }
                
                
               
                public static void binarySearch( int[] array1, int search)
                {
                    int count = 0; //use count to count iteration
                    int low = 0;
                    int high = array1.length - 1;
                    
                    while ( high >= low )
                    {
                        int mid = ( low + high )/2;
                        if( search < array1[mid] )
                        {
                            high = mid -1;
                            count++;
                        }
                        else if( search == array1[mid] )
                        {
                            count++;
                            System.out.print(search+" was found in the list with "+count+" iterations");
                            return;
                           
                        }
                        else
                        {
                            low = mid + 1;
                            count++;
                        }
                        
                    }
                    System.out.print(search+" was not found in the list with "+count+" iterations");
                }
                
                
                  
                  public static int[] scramble( int[] array1 )
                  {
                      Random randomArray = new Random();
                      for( int index = 0; index < array1.length; index++ )
                      {
                          int random = randomArray.nextInt(array1.length - 1 ); //use random to generate random index
                          int temp = array1[index];
                          array1[index] = array1[random];
                          array1[random] = temp;
                      }
                      return array1;
                  }
                  
                  
                
                public static void linearSearch( int[] array1, int search )
                {
                    int count = 0;
                    for( int index = 0; index < array1.length; index++ )
                    {
                        if( search == array1[index] )
                        {   
                            count++;
                            System.out.print(search+" was found in the list with "+count+" iterations");
                            return;
                        }
                        else 
                        {
                            count++;
                        }
                        
                        
                    }
                    System.out.print(search+" was not found in the list with "+count+" iterations");
                } 
                
                
               
     }
     
     
     
     
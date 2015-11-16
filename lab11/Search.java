// CSE2
// Athicha Srivirote
// ats219
// 10/30/15
// Arrays Program
// Purpose of the program: to print out the maximun and minimum value of array1
//                         to ask user to input number and then search in array2. Print the result out 
//                         if find the number or print the below and above value of that number

import java.util.Scanner;
 

// Declare class
     public class Search{
         
         // Create a main method 
         public static void main(String[] args)
         {
             
            int array1 [] = new int[5000];
            
            for( int index = 0; index < array1.length; index++)
            {
                array1 [index] = (int) (Math.random()*100001);
            }
             
            int max = array1[0];
            for( int index = 0 ; index < array1.length ; index++ )
            {
                if( max < array1[index])
                {
                    max = array1[index];
                }
            } 
            System.out.println("The maximum value in array1 is: "+max);
            
            int min = array1[0];
            for( int index = 0; index < array1.length; index++ )
            {
                if( min > array1[index] )
                {
                    min = array1[index];
                }
                
            }
            System.out.println("The minimum value in array1 is: "+min); 
            
           
            
            int array2 [] = new int[5000];
            
           
            for( int i = 0; i < array2.length; i++ )
            {   
                
                array2 [i] = (int) (Math.random()*100001);
                
                
            }
            
            for( int index = 0; index < array2.length; index++ )
                    {
                        min = array2[index];
                        int minIndex = index;
                        
                        for( int next = index + 1; next < array2.length; next++ )
                        {
                            if( min > array2[next])
                            {
                                min = array2[next];
                                minIndex = next;
                            }
                        }
                        
                        
                            array2[minIndex] = array2[index];
                            array2[index] = min;
                    }
            
            System.out.println("The maximum value in array2 is: "+array2[4999]);
            System.out.println("The minimum value in array2 is: "+array2[0]);
            
            
            Scanner myScanner = new Scanner( System.in );
            System.out.print("Enter number: ");
            int search = myScanner.nextInt();
            
             if( search < 0 )
             {
                return;
             }
            
            
                    int low = 0;
                    int high = array2.length - 1;
                    
                    while ( high >= low )
                    {
                        int mid = ( low + high )/2;
                        if(  search == array2[mid] )
                        {
                            System.out.print(search+" was found in the list");
                            return;
                            
                        }
                        
                        else if( high - low == 1 )
                        {
                            System.out.println(search+" was not found in the list");
                            
                           
                            if( search > array2[4999] )
                           {
                            System.out.println("The number above the key was none");
                            System.out.println("The number below the key was none");
                            
                           }
        
                           
                           
                           else if( search < array2[0] )
                             {
                               System.out.println("The number above the key was none");
                               System.out.println("The number below the key was none");
                             }
                             else
                             {   
                                 System.out.println("The number above the key was "+array2[high]);
                                 System.out.println("The number below the key was "+array2[low]);
                             }
                     
                           
                            break;
                            
                            
                      }
                        
                        else if( high - low == 0 )
                        {   
                            System.out.println(search+" was not found in the list");
                            
                           
                            if( search > array2[4999] )
                           {
                            System.out.println("The number above the key was none");
                            System.out.println("The number below the key was none");
                            
                           }
        
                           
                           
                           else if( search < array2[0] )
                             {
                               System.out.println("The number above the key was none");
                               System.out.println("The number below the key was none");
                             }
                             else 
                             {   
                                 System.out.println("The number above the key was "+array2[high]);
                                 System.out.println("The number below the key was "+array2[high-1]);
                             }
                     
                           
                            break;
                            
                            
                            
                        }
                        else if( search < array2[mid])
                        {
                            
                           high = mid -1;
                           
                        }
                        
                        else 
                        {
                            low = mid + 1;
                       
                        }
                        
                        
                        
                     }
         }      
            
            
    }
     
         
         
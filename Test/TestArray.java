import java.util.Scanner;
public class TestArray{

// add main method

  
  public static void main(String[] args) {
   
   Scanner myScanner = new Scanner( System.in );
   int [] array = new int[8];
    for( int i = 0; i < array.length; i++ )
    {
        array[i] = 2*i + 1;
    }
   
   System.out.println("The members in array are: ");
   for( int i = 0; i < array.length; i++ )
   {
       System.out.print(+array[i]+" ");
   }
   System.out.println();
   
   System.out.print("Input search number: ");
   int search = myScanner.nextInt();
   
   
                    int count = 0; //use count to count iteration
                    int low = 0;
                    int high = array.length - 1;
                    
                    while ( high >= low )
                    {
                        int mid = ( low + high )/2;
                        if(  search == array[mid] )
                        {
                            System.out.print(search+" was found in the list");
                            return;
                            
                        }
                        
                        else if( high - low == 1 )
                        {
                            System.out.println(search+" was not found in the list");
                            
                           
                            if( search > array[7] )
                           {
                            System.out.println("The number above the key was none");
                            System.out.println("The number below the key was none");
                            
                           }
        
                           
                           
                           else if( search < array[0] )
                             {
                               System.out.println("The number above the key was none");
                               System.out.println("The number below the key was none");
                             }
                             else
                             {   
                                 System.out.println("The number above the key was "+array[high]);
                                 System.out.println("The number below the key was "+array[low]);
                             }
                     
                           
                            break;
                            
                            
                      }
                        
                        else if( high - low == 0 )
                        {   
                            System.out.println(search+" was not found in the list");
                            
                           
                            if( search > array[7] )
                           {
                            System.out.println("The number above the key was none");
                            System.out.println("The number below the key was none");
                            
                           }
        
                           
                           
                           else if( search < array[0] )
                             {
                               System.out.println("The number above the key was none");
                               System.out.println("The number below the key was none");
                             }
                             else 
                             {   
                                 System.out.println("The number above the key was "+array[high+1]);
                                 System.out.println("The number below the key was "+array[high]);
                             }
                     
                           
                            break;
                            
                            
                            
                        }
                        else if( search < array[mid])
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
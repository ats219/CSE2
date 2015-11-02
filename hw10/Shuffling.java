// CSE2
// Athicha Srivirote
// ats219
// 11/02/15
// Shuffling Program
// Purpose of the program: to print out the deck of card without shuffling. print out the whole deck of cards after shuffling
//                         and print out 5 random cards that the program chooses from the deck.

            public class Shuffling{
                
                 public static void main(String[] args) {
                     
                 
	             //suits club, heart, spade or diamond
                 String[] suitNames={"C","H","S","D"};   
                 String[] rankNames={"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q","K","A"};
                 String[] cards = new String[52];
                 String[] hand = new String[5];
                  
                  //Use for loop to assing value to each card in the deck
                  for ( int i = 0; i < 52; i++ )
                    {
                        cards[i] = rankNames[i%13] + suitNames[i/13] ;
                       
                    }
                    
                        System.out.println("All cards are");
                        printArray(cards);
                        System.out.println();
                        
                        // Call shuffle method to shuffle the whole deck
                        shuffle(cards); 
                        System.out.println("Shuffled");
                        printArray(cards); 
                        
                        // Call randomizehand method to radomly pick out 5 cards
                        hand = randomizeHand(cards);
                        System.out.println();
                        System.out.println("Randomized hand!");
                        printArray(hand); 
  }
  
  
  
            // Shuffle by swapping the random card with the first card
            public static void shuffle( String[] cards )
            { 
                // Do the shuffle 52 times
                for ( int x = 0; x < cards.length ; x++ )
                {
                    // randomize the index
                    int index =  ((int) ( Math.random()*51 ) )+ 1;
                    
                    // Swap the value between cards[index] and cards[0] 
                    String temp = cards[0];
                    cards[0] = cards[index];
                    cards[index] = temp;
                    
                    
                }
            } 
            
            // Printout each card
            public static void printArray( String[] cards )
            {    
                 for( int index = 0; index < cards.length ; index++ )
                 {
                     System.out.print(cards[index]+" ");
                 }
                
            }
            
            
            public static String[] randomizeHand( String[] cards )
            {
                String[] random = new String[5];
                
                // Use while loop to prevent the program from selecting the same card again
                int index0 =  (int) (Math.random()*51);
                
                int index1 =  (int) (Math.random()*51);
                while ( index0 == index1)
                {
                    index1 = (int) (Math.random()*51);
                } 
                
                int index2 = (int) (Math.random()*51);
                while( index2 == index1 || index2 == index0 )
                {
                    index2 = (int) (Math.random()*51);
                } 
                
                int index3 = (int) (Math.random()*51);
                while( index3 == index2 || index3 == index1 || index3 == index0 )
                {
                    index3 = (int) (Math.random()*51);
                } 
                
                int index4 = (int) (Math.random()*51);
                while( index4 == index3 || index4 == index2 || index4 == index1 || index4 == index0 )
                {
                    index4 = (int) (Math.random()*51);
                } 
               
               // Assing value to the array random 
               random[0] = cards[index0];
               random[1] = cards[index1];
               random[2] = cards[index2];
               random[3] = cards[index3];
               random[4] = cards[index4];
               
               return random; 
            } 
}


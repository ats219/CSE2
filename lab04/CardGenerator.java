// CSE2
// Athicha Srivirote
// ats219
// 09/18/15
// CardGenerator Program
// Purpose of the program: to randomly generate one card out of the deck

// Declare class
     public class CardGenerator{
         // Create a main method 
         public static void main(String[] args){
             
             // Use Math.random method to generate number 1-52 inclusively
             int cardNum = (int)(Math.random()*52) + 1;
             
             // Categorize suit of the card by 1-13 represents the diamons, 14-26 as clubs, 27-39 as hearts, and 40-52 as spades
             
             
             String cardSuit =" ";
             if (cardNum <= 13)
             {
                 cardSuit = "Diamonds";
             }
                 
                 else if (14<= cardNum && cardNum <= 26 )
                 
                 { 
                     cardSuit = "Clubs";
                 }
                 
                 else if (26 <= cardNum && cardNum <= 39)
                 {
                     cardSuit = "Hearts";
                 }
                 
                 else  
                 {
                    cardSuit = "Spades";
                 }
             
              // Use switch to categorize the number of the card which also has a special character as Jack, Queen, and King
              String cardID =" ";
              switch ( cardNum ) {
                  
                   case 1: case 14: case 27: case 40: 
                       cardID= "ace";
                       break;
                       
                    case 2: case 15: case 28: case 41:
                        cardID = "2";
                        break;
                    
                    case 3: case 16: case 29: case 42:
                         cardID = "3";
                        break;
                        
                    case 4: case 17: case 30: case 43:
                         cardID = "4";
                        break;
                        
                    case 5: case 18: case 31: case 44:
                         cardID = "5";
                        break;
                        
                    case 6: case 19: case 32: case 45:
                         cardID ="6";
                        break;
                        
                    case 7: case 20: case 33: case 46:
                         cardID = "7";
                        break;
                        
                    case 8: case 21: case 34: case 47:
                         cardID = "8";
                        break;
                        
                    case 9: case 22: case 35: case 48:
                         cardID = "9";
                        break;
                        
                    case 10: case 23: case 36: case 49:
                         cardID = "10";
                        break;
                        
                    case 11: case 24: case 37: case 50:
                         cardID = "Jack";
                        break;
                        
                    case 12: case 25: case 38: case 51:
                         cardID = "Queen";
                        break;
                    
                    case 13: case 26: case 39: case 52:
                         cardID = "King";
                        break;
              }
               // Print out the selected card
               System.out.println("You pick the "+cardID+" of "+cardSuit);
              
              
    
            
         }
         
     }



// CSE2
// Athicha Srivirote
// ats219
// 09/22/15
// PokerHandCheck Program
// Purpose of the program: start with 5 decks of cards then randomly generate one card out of each deck abd tell the player whether he/she has special kind of card
//                         : a pair, two pairs, three of a kind, or high card hand

//import java.util.Scanner; // import Scanner class in order to test function of the program

// Declare Class
     public class PokerHandCheck{
         
         // Create main method 
         public static void main(String[] args){
             
             // Use Math.random method to generate number 1-52 inclusively
            // int cardNum_1 = (int)(Math.random()*52) + 1;
             
             // Create an instance for Scanner class
             //Scanner myScanner = new Scanner( System.in );
             
             // This part of code was for testing the function of the program (ask input from the user so that the programmer can fix bugs)
             /*System.out.print("Enter the number: ");
             int cardNum_1 = myScanner.nextInt();
             
             System.out.print("Enter the number: ");
             int cardNum_2 = myScanner.nextInt();
             
             System.out.print("Enter the number: ");
             int cardNum_3 = myScanner.nextInt();
             
             System.out.print("Enter the number: ");
             int cardNum_4 = myScanner.nextInt();
             
             System.out.print("Enter the number: ");
             int cardNum_5 = myScanner.nextInt();*/
             
             // Use Math.random() method to generate random number 
             int cardNum_1 = (int)(Math.random()*52) + 1;
             int cardNum_2 = (int)(Math.random()*52) + 1;
             int cardNum_3 = (int)(Math.random()*52) + 1;
             int cardNum_4 = (int)(Math.random()*52) + 1;
             int cardNum_5 = (int)(Math.random()*52) + 1;
             
             
             // Categorize suit of the card by 1-13 represents the diamons, 14-26 as clubs, 27-39 as hearts, and 40-52 as spades
             
             // Code for the 1st deck
             String cardSuit_1 =" ";
             if (cardNum_1 <= 13)
             {
                 cardSuit_1 = "Diamonds";
             }
                 
                 else if (14<= cardNum_1 && cardNum_1 <= 26 )
                 
                 { 
                     cardSuit_1 = "Clubs";
                 }
                 
                 else if (26 <= cardNum_1 && cardNum_1 <= 39)
                 {
                     cardSuit_1 = "Hearts";
                 }
                 
                 else  
                 {
                    cardSuit_1 = "Spades";
                 }
                 
                 int cardRemainder_1 = cardNum_1 % 13;
                 
                 String cardID_1 =" ";
              switch ( cardRemainder_1 ) {
                  
                   case 1:  
                        cardID_1 = "ace";
                        break;
                       
                    case 2: 
                        cardID_1 = "2";
                        break;
                    
                    case 3: 
                         cardID_1 = "3";
                        break;
                        
                    case 4: 
                         cardID_1 = "4";
                        break;
                        
                    case 5: 
                         cardID_1 = "5";
                        break;
                        
                    case 6:
                         cardID_1 ="6";
                        break;
                        
                    case 7: 
                         cardID_1 = "7";
                        break;
                        
                    case 8: 
                         cardID_1 = "8";
                        break;
                        
                    case 9: 
                         cardID_1 = "9";
                        break;
                        
                    case 10: 
                         cardID_1 = "10";
                        break;
                        
                    case 11: 
                         cardID_1 = "Jack";
                        break;
                        
                    case 12: 
                         cardID_1 = "Queen";
                        break;
                    
                    case 0: 
                         cardID_1 = "King";
                        break;
              }
                 
            
            
            
            
             // Code for th 2nd deck
             String cardSuit_2 =" ";
             if (cardNum_2 <= 13)
             {
                 cardSuit_2 = "Diamonds";
             }
                 
                 else if (14<= cardNum_2 && cardNum_2 <= 26 )
                 
                 { 
                     cardSuit_2 = "Clubs";
                 }
                 
                 else if (26 <= cardNum_2 && cardNum_2 <= 39)
                 {
                     cardSuit_2 = "Hearts";
                 }
                 
                 else  
                 {
                    cardSuit_2 = "Spades";
                 }
                 
                 int cardRemainder_2 = cardNum_2 % 13;
                 
                 String cardID_2 =" ";
              switch ( cardRemainder_2 ) {
                  
                    case 1:  
                        cardID_2 = "ace";
                        break;
                       
                    case 2: 
                        cardID_2 = "2";
                        break;
                    
                    case 3: 
                         cardID_2 = "3";
                        break;
                        
                    case 4: 
                         cardID_2 = "4";
                        break;
                        
                    case 5: 
                         cardID_2 = "5";
                        break;
                        
                    case 6:
                         cardID_2 ="6";
                        break;
                        
                    case 7: 
                         cardID_2 = "7";
                        break;
                        
                    case 8: 
                         cardID_2 = "8";
                        break;
                        
                    case 9: 
                         cardID_2 = "9";
                        break;
                        
                    case 10: 
                         cardID_2 = "10";
                        break;
                        
                    case 11: 
                         cardID_2 = "Jack";
                        break;
                        
                    case 12:
                         cardID_2 = "Queen";
                        break;
                    
                    case 0: 
                         cardID_2 = "King";
                        break;
              }
              
              
                
            
            
            // Code for the 3rd deck
            String cardSuit_3 =" ";
             if (cardNum_3 <= 13)
             {
                 cardSuit_3 = "Diamonds";
             }
                 
                 else if (14<= cardNum_3 && cardNum_3 <= 26 )
                 
                 { 
                     cardSuit_3 = "Clubs";
                 }
                 
                 else if (26 <= cardNum_3 && cardNum_3 <= 39)
                 {
                     cardSuit_3 = "Hearts";
                 }
                 
                 else  
                 {
                    cardSuit_3 = "Spades";
                 }
                 
                 int cardRemainder_3 = cardNum_3 % 13;
                 
                 String cardID_3 =" ";
              switch ( cardRemainder_3 ) {
                  
                    case 1:  
                        cardID_3 = "ace";
                        break;
                       
                    case 2: 
                        cardID_3 = "2";
                        break;
                    
                    case 3: 
                         cardID_3 = "3";
                        break;
                        
                    case 4: 
                         cardID_3 = "4";
                        break;
                        
                    case 5: 
                         cardID_3 = "5";
                        break;
                        
                    case 6:
                         cardID_3 ="6";
                        break;
                        
                    case 7: 
                         cardID_3 = "7";
                        break;
                        
                    case 8: 
                         cardID_3 = "8";
                        break;
                        
                    case 9: 
                         cardID_3 = "9";
                        break;
                        
                    case 10: 
                         cardID_3 = "10";
                        break;
                        
                    case 11: 
                         cardID_3 = "Jack";
                        break;
                        
                    case 12:
                         cardID_3 = "Queen";
                        break;
                    
                    case 0: 
                         cardID_3 = "King";
                        break;
              }
                 
               
              
              
              
              // Code for the 4th deck
              String cardSuit_4 =" ";
             if (cardNum_4 <= 13)
             {
                 cardSuit_4 = "Diamonds";
             }
                 
                 else if (14<= cardNum_4 && cardNum_4 <= 26 )
                 
                 { 
                     cardSuit_4 = "Clubs";
                 }
                 
                 else if (26 <= cardNum_4 && cardNum_4 <= 39)
                 {
                     cardSuit_4 = "Hearts";
                 }
                 
                 else  
                 {
                    cardSuit_4 = "Spades";
                 }
                 
                 int cardRemainder_4 = cardNum_4 % 13;
                 
                 String cardID_4 =" ";
              switch ( cardRemainder_4 ) {
                  
                    case 1:  
                        cardID_4 = "ace";
                        break;
                       
                    case 2: 
                        cardID_4 = "2";
                        break;
                    
                    case 3: 
                         cardID_4 = "3";
                        break;
                        
                    case 4: 
                         cardID_4 = "4";
                        break;
                        
                    case 5: 
                         cardID_4 = "5";
                        break;
                        
                    case 6:
                         cardID_4 ="6";
                        break;
                        
                    case 7: 
                         cardID_4 = "7";
                        break;
                        
                    case 8: 
                         cardID_4 = "8";
                        break;
                        
                    case 9: 
                         cardID_4 = "9";
                        break;
                        
                    case 10: 
                         cardID_4 = "10";
                        break;
                        
                    case 11: 
                         cardID_4 = "Jack";
                        break;
                        
                    case 12:
                         cardID_4 = "Queen";
                        break;
                    
                    case 0: 
                         cardID_4 = "King";
                        break;
              }
                 
               
               
               
               
               
            // Code for the 5th deck  
             String cardSuit_5 =" ";
             if (cardNum_5 <= 13)
             {
                 cardSuit_5 = "Diamonds";
             }
                 
                 else if (14<= cardNum_5 && cardNum_5 <= 26 )
                 
                 { 
                     cardSuit_5 = "Clubs";
                 }
                 
                 else if (26 <= cardNum_5 && cardNum_5 <= 39)
                 {
                     cardSuit_5 = "Hearts";
                 }
                 
                 else  
                 {
                    cardSuit_5 = "Spades";
                 }
                 
                 int cardRemainder_5 = cardNum_5 % 13;
                 
                 String cardID_5 =" ";
              switch ( cardRemainder_5 ) {
                  
                    case 1:  
                        cardID_5 = "ace";
                        break;
                       
                    case 2: 
                        cardID_5 = "2";
                        break;
                    
                    case 3: 
                         cardID_5 = "3";
                        break;
                        
                    case 4: 
                         cardID_5 = "4";
                        break;
                        
                    case 5: 
                         cardID_5 = "5";
                        break;
                        
                    case 6:
                         cardID_5 ="6";
                        break;
                        
                    case 7: 
                         cardID_5 = "7";
                        break;
                        
                    case 8: 
                         cardID_5 = "8";
                        break;
                        
                    case 9: 
                         cardID_5 = "9";
                        break;
                        
                    case 10: 
                         cardID_5 = "10";
                        break;
                        
                    case 11: 
                         cardID_5 = "Jack";
                        break;
                        
                    case 12:
                         cardID_5 = "Queen";
                        break;
                    
                    case 0: 
                         cardID_5 = "King";
                        break;
              }
                 
               
            
            
            
            // Create boolean expression to test a pair
            
            // First set of boolean: to test 1st card with 2nd, 3rd, 4th,and 5th card
            boolean pair12 = cardID_1.equals(cardID_2);
            boolean pair13 = cardID_1.equals(cardID_3);
            boolean pair14 = cardID_1.equals(cardID_4);
            boolean pair15 = cardID_1.equals(cardID_5);
            
            // Second set of boolean: to test 2nd card with 3rd, 4th, and 5th card
            boolean pair23 = cardID_2.equals(cardID_3);
            boolean pair24 = cardID_2.equals(cardID_4);
            boolean pair25 = cardID_2.equals(cardID_5);
            
            // Third set of boolean: to test 3rd card with 4th and 5th card
            boolean pair34 = cardID_3.equals(cardID_4);
            boolean pair35 = cardID_3.equals(cardID_5);
            
            // Fort set of boolean: to test 4th card with 5th card
            boolean pair45 = cardID_4.equals(cardID_5);
            
            
            
            // Create boolean expression to test three of a kind
            // First set of boolean: to test three of a kind by testing 1st and 2nd pair with 3th, 4th, and 5th
            boolean three123 = cardID_1.equals(cardID_2) && cardID_1.equals(cardID_3);
            boolean three124 = cardID_1.equals(cardID_2) && cardID_1.equals(cardID_4);
            boolean three125 = cardID_1.equals(cardID_2) && cardID_1.equals(cardID_5);
            
           
            boolean three134 = cardID_1.equals(cardID_3) && cardID_1.equals(cardID_4);
            boolean three135 = cardID_1.equals(cardID_3) && cardID_1.equals(cardID_5);
            
            
            boolean three145 = cardID_1.equals(cardID_4) && cardID_1.equals(cardID_5);
            
            
            //Sencond set of boolean: to test 2nd with other cards  
            boolean three234 = cardID_2.equals(cardID_3) && cardID_2.equals(cardID_4);
            boolean three235 = cardID_2.equals(cardID_3) && cardID_1.equals(cardID_5);
            boolean three245 = cardID_2.equals(cardID_4) && cardID_2.equals(cardID_5);
            
            // Third set of boolean: to test 3rd with other cards
            boolean three345 = cardID_3.equals(cardID_4) && cardID_3.equals(cardID_5);
            
            
            
           
            
            // Create boolean expression to determine a pair, two pairs, and three of a kind
            boolean pair = (pair12 || pair13) || (pair14 ||  pair15) || (pair23 || pair24) || (pair25 || pair34) || (pair35 || pair45);
            
            // Create boolean expression to determine two pairs
            boolean pairTwo = (pair12 && pair13) || (pair12 && pair14) || (pair12 && pair15) || (pair12 && pair23) || (pair12 && pair24) || (pair12 &&pair25) || (pair12 && pair34) || (pair12 && pair35) || (pair12 && pair45) || (pair13 || pair14) || (pair13 || pair15) || (pair14 || pair15) || (pair23 && pair24) || (pair23 && pair25) || (pair23 && pair34) || (pair23 && pair35) || (pair34 && pair35) || (pair34 && pair45) || (pair35 && pair45) ;
   
            // Create boolean expression to determine the three of a kind
            boolean three = (three123 || three124) || (three125 || three134) || (three135 || three145) || (three234 || three235) || (three245 || three345);
            
            
            
            
            // Print out the result of the random cards 
            System.out.println("Your random card were:");
            System.out.println("the "+cardID_1+" of "+cardSuit_1);
            System.out.println("the "+cardID_2+" of "+cardSuit_2);
            System.out.println("the "+cardID_3+" of "+cardSuit_3);
            System.out.println("the "+cardID_4+" of "+cardSuit_4);
            System.out.println("the "+cardID_5+" of "+cardSuit_5);
            System.out.println("");
            
              
            // Use if statement to check three of a kind first,two pairs,a pair,three of a kind with a pair respectively and print out the result to the screen
            
            if ( three && pair)
            {
                System.out.println("You have three of a kind !");
                System.out.println("You have a pair !");
                
            }
            else if ( three )
            {
                System.out.println("You have three of a kind !");
                
            }
            else if ( pairTwo )
            {
                System.out.println("You have two pairs !");
                
            }
            
            else if ( pair ) 
            {
                 System.out.println("You have a pair !");
                
            }
            
            else 
            {
                System.out.println("You have a high card hand !");
                
            }
            
        
             
         }
     }

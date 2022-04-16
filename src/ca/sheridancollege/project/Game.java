/**
 * SYST 17796 Project Base code.
 * Students can modify and extend to implement their game.
 * Add your name as an author and the date!
 */
package ca.sheridancollege.project;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * The class that models your game. You should create a more specific child of this class and instantiate the methods
 * given.
 *
 * @author dancye
 * @author Paul Bonenfant Jan 2020
 */
public class Game {
    public static void main (String [] args){
        //Checks for game over
        boolean gameOver = false;
        System.out.println("This is Blackjack!");
        //Create new deck and shuffle it
        Deck deckOfCards = new Deck();
        deckOfCards.deckCreate();
        deckOfCards.shuffle();
        
        //Create small versions of deck for player and dealer's hands
        Deck playerCards = new Deck();
        Deck dealerCards = new Deck();
        
        Scanner playerChoice = new Scanner(System.in);
        //While the player has decided to play, continue playing
        while (!gameOver){
            System.out.println("Enter 9 to stop playing, enter any other number to continue playing");
            int playDecision = playerChoice.nextInt();
             if (playDecision == 9 ){
                break;
            }
             boolean roundOver = false;
             
             //Draw 2 cards for player and dealer
             playerCards.drawACard(deckOfCards);
             playerCards.drawACard(deckOfCards);
             
             dealerCards.drawACard(deckOfCards);
             dealerCards.drawACard(deckOfCards);
             
             while (true){
                 //Only reveal one of the dealer's cards
                 System.out.println("Dealers cards: " + dealerCards.getCard(0).toString()+ " and [Card Hidden]");
                 
                 
                 //Reveal both of player's cards
                 System.out.println("Your cards:");
                 System.out.println(playerCards.toString());
                 System.out.println("Your hands value: "+playerCards.cardValues());
                 
                 System.out.println("Type 1 to hit, type 2 to stand.");
                 int handChoice = playerChoice.nextInt();
                 
                 //If player hits, draw a card and add to hand, redisplay
                 if (handChoice==1){
                     playerCards.drawACard(deckOfCards);
                     System.out.println("You drew a: "+playerCards.getCard(playerCards.sizeOfDeck()-1).toString());
                     System.out.println("------------------------------");
                     
                     if (playerCards.cardValues()>21){
                         System.out.println("Hand value is: "+ playerCards.cardValues() +", Bust! Dealer wins!");
                         roundOver=true;
                         break;
                     }
                 }
                 //If player stands, proceed to hand delegation
                 if (handChoice==2){
                     break;
                 }
                 //If player reaches 21 or Blackjack, proceed to hand delegation
                 if (playerCards.cardValues()==21){
                     System.out.println("Max value reached");
                     roundOver=true;
                     break;
                 }
                 
                 //When player's hand decisions are done, dealer begins
                 System.out.println("Dealers Cards:" +dealerCards.toString());
                 if (dealerCards.cardValues()> playerCards.cardValues()&& roundOver==false){
                     System.out.println("Dealer Wins!!!");
                     roundOver=true;
                 }
                 //Dealer hits until hand value is 17 or over
                 while(dealerCards.cardValues()<17 && roundOver==false){
                     dealerCards.drawACard(deckOfCards);
                     System.out.println("Dealer drew a: "+dealerCards.getCard(dealerCards.sizeOfDeck()-1).toString());
                     System.out.println("------------------------------");
                 }
                 System.out.println("Dealer's hand value is:"+dealerCards.cardValues());
                 //If dealer busts, hand delegation
                 if ((dealerCards.cardValues()>21)){
                     System.out.println("Bust for the dealer!! You win!!");
                     roundOver=true;
                 }
             }
             //Hand delegation, redisplay and decide winner
             System.out.println("---------------");
             System.out.println("Your cards: Valued: "+playerCards.cardValues());
             System.out.println(playerCards.toString());
             System.out.println("---------------");
             System.out.println("Dealers cards: Valued: "+dealerCards.cardValues());
             System.out.println(dealerCards.toString());
             if ((playerCards.cardValues() == dealerCards.cardValues())){
                 System.out.println("It's a tie!");
                 roundOver = true;
             }
            
             //Check hand values to decide winner
            if ((playerCards.cardValues()>dealerCards.cardValues())&& playerCards.cardValues()<=21) {
                System.out.println("You win!!!");
                roundOver = true;
            }
            if ((dealerCards.cardValues()>playerCards.cardValues())&& dealerCards.cardValues()<=21){
                System.out.println("Dealer wins!");
                roundOver=true;
            }
            else if (roundOver == false){
                System.out.println("Dealer wins!");
                roundOver = true;
                
            }
            //Return all cards to deck, no need to shuffle since they are shuffled
            // at the beginning
             playerCards.returnCards(deckOfCards);
             dealerCards.returnCards(deckOfCards);
             System.out.println("-------------------------");
             System.out.println("This hand is over");
             System.out.println("-------------------------");
             
        }
        //Goodbye message when player decides to stop playing
        System.out.println("Thanks for playing!");
        
    }        
}//end class

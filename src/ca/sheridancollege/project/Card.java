/**
 * SYST 17796 Project Base code.
 * Students can modify and extend to implement their game.
 * Add your name as an author and the date!
 */
package ca.sheridancollege.project;

/**
 * A class to be used as the base Card class for the project. Must be general enough to be instantiated for any Card
 * game. Students wishing to add to the code should remember to add themselves as a modifier.
 *
 * @author dancye
 */
public class Card {
    //default modifier for child classes
	
        
    private Value value;
    private Suit suit;
    
//Gives each card a suit and value
    public Card(Suit suit, Value value){
        this.suit = suit;
        this.value = value;
    }
    //Making value retrievable
    public Value getValue(){
            return this.value;
    }
    public String toString(){
        return this.value.toString() +" of "+ this.suit.toString();
    }
}

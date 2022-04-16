/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ca.sheridancollege.project;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author Noah
 */
public class Deck {
    private ArrayList<Card> groupOfCards;
    public Deck(){
        this.groupOfCards = new ArrayList<Card>();
    }
    public void deckCreate(){
        for (Suit suits : Suit.values()){
            for(Value values : Value.values()){
                this.groupOfCards.add(new Card(suits,values));
            }
            
        }
    }
    public void shuffle(){
        ArrayList<Card> shuffleDeck = new ArrayList<Card>();
        Random rng = new Random();
        int location = 0;
        int deckSize = this.groupOfCards.size();
        for (int i =0;i<deckSize; i++){
            location = rng.nextInt((this.groupOfCards.size()-1 -0)+1) + 0;
            shuffleDeck.add(this.groupOfCards.get(location));
            this.groupOfCards.remove(location);
            
        }
        this.groupOfCards = shuffleDeck;
    }
    public void addCards(Card add){
        this.groupOfCards.add(add);
    }
    public void delCard(int f){
        this.groupOfCards.remove(f);
    }
    public Card getCard(int q){
        return this.groupOfCards.get(q);
    }
    
    public void drawACard(Deck deck){
        this.groupOfCards.add(deck.getCard(0));
        deck.delCard(0);
    }
    public int cardValues(){
        int aceCount=0;
        int handValue =0;
        
        for(Card cards : this.groupOfCards){
            switch(cards.getValue()){
                case TWO: handValue+=2;break;
                case THREE: handValue+=3;break;
                case FOUR: handValue+=4;break;
                case FIVE: handValue+=5;break;
                case SIX: handValue+=6;break;
                case SEVEN: handValue+=7;break;
                case EIGHT: handValue+=8;break;
                case NINE: handValue+=9;break;
                case TEN: handValue+=10;break;
                case JACK: handValue+=10;break;
                case QUEEN: handValue+=10;break;
                case KING: handValue+=10;break;
                case ACE: aceCount+=1;break;
            }
        }
        for (int x=0; x< aceCount;x++){
            if (handValue >10){
                handValue+=1;
            }
            else{
                handValue +=11;
            }
        }
        return handValue;
    }
    public int sizeOfDeck (){
        return this.groupOfCards.size();
    }
    public void returnCards(Deck d){
        int sizeOfDeck = this.groupOfCards.size();
        for (int i=0;i<sizeOfDeck;i++){
            d.addCards(this.getCard(i));
        }
        for (int z=0;z<sizeOfDeck;z++){
            this.delCard(0);
            
        }
    }
    public String toString(){
        String cardGroup = "";
        for(Card card : this.groupOfCards){
            cardGroup += "\n" + card.toString();
        }
        return cardGroup;
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package ca.sheridancollege.project;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Noah
 */
public class DeckTest {
    
    public DeckTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown(){
    }/**
     * Test of deckCreate method, of class Deck.
     */
    @Test
    public void testDeckCreate() {
        System.out.println("deckCreate");
        Deck instance = new Deck();
        instance.deckCreate();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of shuffle method, of class Deck.
     */
    @Test
    public void testShuffle() {
        System.out.println("shuffle");
        Deck instance = new Deck();
        instance.shuffle();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addCards method, of class Deck.
     */
    @Test
    public void testAddCards() {
        System.out.println("addCards");
        Card add = null;
        Deck instance = new Deck();
        instance.addCards(add);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of delCard method, of class Deck.
     */
    @Test
    public void testDelCard() {
        System.out.println("delCard");
        int f = 0;
        Deck instance = new Deck();
        instance.delCard(f);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of getCard method, of class Deck.
     */
    @Test
    public void testGetCard() {
        System.out.println("getCard");
        int q = 0;
        Deck instance = new Deck();
        Card expResult = null;
        Card result = instance.getCard(q);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of drawACard method, of class Deck.
     */
    @Test
    public void testDrawACard() {
        System.out.println("drawACard");
        Deck deck = null;
        Deck instance = new Deck();
        instance.drawACard(deck);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of cardValues method, of class Deck.
     */
    @Test
    public void testCardValues() {
        System.out.println("cardValues");
        Deck instance = new Deck();
        int expResult = 0;
        int result = instance.cardValues();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of sizeOfDeck method, of class Deck.
     */
    @Test
    public void testSizeOfDeck() {
        System.out.println("sizeOfDeck");
        Deck instance = new Deck();
        int expResult = 0;
        int result = instance.sizeOfDeck();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }
        public void testSizeOfDeckBad() {
        System.out.println("sizeOfDeck");
        Deck instance = new Deck();
        int expResult = 1;
        int result = 0;
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of returnCards method, of class Deck.
     */
    @Test
    public void testReturnCards() {
        System.out.println("returnCards");
        Deck d = null;
        Deck instance = new Deck();
        instance.returnCards(d);
        // TODO review the generated test code and remove the default call to fail.
    }
    

    /**
     * Test of toString method, of class Deck.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Deck instance = new Deck();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.

    }


    
}

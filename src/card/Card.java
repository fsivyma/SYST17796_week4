/*
    Class Name: 
    Author: 
    Date: 

    Description: 
*/

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//push changes to git

package card;

/**
 *
 * @author rebeccakong
 */
public class Card {
    private String suit;
    private int value;

    public Card() {
    }

    public Card(String givenSuit, int givenValue) {
        this.suit = givenSuit;
        this.value = givenValue;
    }

    public String getSuit() {
        return suit;
    }

    public void setSuit(String suit) {
        this.suit = suit;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
    
    
    
    

}

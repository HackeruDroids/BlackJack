package edu.tomer.java;

import java.util.ArrayList;

/**
 * Created by hackeru on 20/02/2017.
 */
public class Deck {
    private ArrayList<BlackJackCard> cards = new ArrayList<>();

    public Deck() {
        String[] suits = {"♥", "♦", "♣", "♠"};
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9",
                "10", "Jack", "Queen", "King", "Ace"};
        //nested for loops: Loop over all the ranks and suits:
        //4*13 = 52
        for (String s : suits) { //"♥", "♦", "♣", "♠"
            for (String r : ranks) { //"2", "3", "4", "5"
                BlackJackCard c = new BlackJackCard(s, r);
                cards.add(c);
            }
        }
        shuffle();
    }


    public void shuffle() {
        //1) init a new list Of Cards:
        ArrayList<BlackJackCard> tempCards = new ArrayList<>();
        while (cards.size() > 0) {
            int randIndex = RandomUtils.getInt(0, cards.size() - 1);
            BlackJackCard tempCard = cards.remove(randIndex);
            tempCards.add(tempCard);
        }
        cards = tempCards;
    }

    public BlackJackCard dealCard(){
        return cards.remove(0);
    }

    @Override
    public String toString() {
        return cards.toString();
    }

    public int size(){
        return cards.size();
    }

    public boolean isEmpty(){
        return size() == 0;
    }

}

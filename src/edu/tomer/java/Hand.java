package edu.tomer.java;

import java.util.ArrayList;

/**
 * Created by hackeru on 20/02/2017.
 */
public class Hand {
    //Properties:
    private ArrayList<BlackJackCard> cards = new ArrayList<>();

    //Methods:
    public void addCard(BlackJackCard card) {
        cards.add(card);
    }

    public int getValue() {
        int sum = 0;
        int aceCount = 0; //Count the aces while we calculate the value
        for (BlackJackCard c : cards) {
            sum += c.getValue();
            if (c.getValue() == 11)
                aceCount++;
        }

        while (sum > 21 && aceCount > 0) {
            sum -= 10;
            aceCount--;
        }

        return sum;
    }

    @Override
    public String toString() {
        return cards.toString();
    }
}

package edu.tomer.java;

/**
 * Created by hackeru on 20/02/2017.
 */
public class GamePlay {
    private Hand dealerHand;
    private Hand playerHand;
    private Deck deck;

    public GamePlay() {
        //init the hands and the deck:
        dealerHand = new Hand();
        playerHand = new Hand();
        deck = new Deck();

        //draw 2 cards for each player:
        for (int i = 0; i < 2; i++) {
            dealerHand.addCard(deck.dealCard());
            playerHand.addCard(deck.dealCard());
        }
    }

    public void printPlayersHand() {
        System.out.println(playerHand);
    }

    public void printDealersHand() {
        System.out.println(playerHand);
    }

    public boolean hit() {
        playerHand.addCard(deck.dealCard());

        return playerHand.getValue() > 21;
    }

    public void stand() {
        //Dealers turn.
        while (dealerHand.getValue() < 17)
            dealerHand.addCard(deck.dealCard());
    }
}

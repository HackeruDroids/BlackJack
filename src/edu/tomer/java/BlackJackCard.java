package edu.tomer.java;

/**
 * Created by hackeru on 20/02/2017.
 */
public class BlackJackCard {
    //properties:
    private final String suit;
    private final String rank;

    //Constructor:
    public BlackJackCard(String suit, String rank) {
        this.suit = suit;
        this.rank = rank;
    }

    public int getValue() {
        switch (rank) {
            case "2":
            case "3":
            case "4":
            case "5":
            case "6":
            case "7":
            case "8":
            case "9":
            case "10":
                return Integer.valueOf(rank);
            case "Jack":
            case "Queen":
            case "King":
                return 10;
            case "Ace":
                return 11;
            default:
                return 0;
        }

    }


    //Getters:
    public String getSuit() {
        return suit;
    }

    public String getRank() {
        return rank;
    }

    @Override
    public String toString() {
        //format is A static method in the String class
        return String.format("%s of %s", rank, suit);
    }
}

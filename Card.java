/*
// File:             Card.java
// Created:          2018/04/05
// Author:           danIv (Daniel Ivanovich)
// Description:      The class for every card in the deck.
*/


public class Card {
    public Suit suit;
    public String name;

    public enum Suit {
        DIAMONDS("\u2666"),
        HEARTS("\u2665"),
        SPADES("\u2660"),
        CLUBS("\u2663");

        public final String symbol;

        Suit(String character) {
            this.symbol = character;
        }
    }

    public static Card copyCard(Card card) {
        Card copiedCard = new Card();
        copiedCard.suit = card.suit;
        copiedCard.name = card.name;
        return copiedCard;
    }

    public static Card initCard(int number, Suit newSuit) {

        Card card = new Card();

        if (number <= 10) {
            card.name = Integer.toString(number);
        } else if (number == 11) {
            card.name = "Jack";
        } else if (number == 12) {
            card.name = "Queen";
        } else if (number == 13) {
            card.name = "King";
        } else {
            card.name = "Ace";
        }

        card.suit = newSuit;

        return card;
    }
}
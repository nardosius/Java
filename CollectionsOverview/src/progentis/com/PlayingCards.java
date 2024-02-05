package progentis.com;

import java.util.ArrayList;
import java.util.List;

enum Suits { CLUBS, DIAMONDS, HEARTS, SPADES}
enum FaceCards { JACK, QUEEN, KING, ACE }
enum CardNumbers {TWO (2), THREE (3), FOUR (4), FIVE (5), SIX (6), SEVEN (7),
    EIGHT (8), NINE(9), TEN(10);
    final int i;
    CardNumbers(int i) {
        this.i = i;
    }
}

public class PlayingCards {

    /*The ascii chars for playing card suits are:
    * ---> CLUB - 9827
    * ---> DIAMOND = 9830
    * ---> HEART = 9829
    * ---> SPADE = 9824
    * The goal of this class is the store all the cards in a standard card deck
    * and retrieve them as a full deck, based on suit and number passed or suit
    * and abbreviation, e.g., J, Q, K, A*/
    private List<Card> deck;
    private String suit;
    private String face;
    private int rank;

   public PlayingCards() {
       this.deck = populateDeck();

    }

    private class Card {
       private char suit;
       private String face;
       private int rank;

        public Card(char suit, String face, int rank) {
            this.suit = suit;
            this.face = face;
            this.rank = rank;
        }
    }

    private void getNumericCard(String suit, int rank) {
        char s = 0;
        switch (suit) {
            case "CLUBS" -> s = (char) 9827;
            case "DIAMONDS" -> s = (char) 9830;
            case "HEARTS" -> s = (char) 9829;
            case "SPADES" -> s = (char) 9824;
            default -> s = '*';
        }
       Card matchCard = new Card(s, "", rank);
       for (var c : deck) {
           if (c.suit == s && c.rank == rank) {
                matchCard = c;
           }
       }
        System.out.println("The matching card is: " + matchCard.face + " "
                + matchCard.suit + " " + "(" + matchCard.rank + ")");
    }

    public void pushGetNumericCard(String suit, int rank) {
       getNumericCard(suit, rank);

   }
    private void getFaceCard(String suit, String abbreviation) {
        suit = suit.toUpperCase();
        String face;
        switch (abbreviation) {
            case "J" -> face = FaceCards.JACK.toString();
            case "Q" -> face = FaceCards.QUEEN.toString();
            case "K" -> face = FaceCards.KING.toString();
            case "A" -> face = FaceCards.ACE.toString();
            default -> face = "Face card not found";
        }
        char s = 0;
        switch (suit) {
            case "CLUBS" -> s = (char) 9827;
            case "DIAMONDS" -> s = (char) 9830;
            case "HEARTS" -> s = (char) 9829;
            case "SPADES" -> s = (char) 9824;
            default -> s = '*';
        }
        Card matchCard = new Card(s, face, rank);
        for (var c : deck) {
            if (c.suit == s && c.face.equals(face)) {
                matchCard = c;
            }
        }
        System.out.println("The matching card is: " + matchCard.face + " "
                + matchCard.suit + " " + "(" + matchCard.rank + ")");
    }

    public void pushGetFaceCard(String suit, String abbreviation) {
       getFaceCard(suit, abbreviation);
    }
    private void getStandardDeck() {
        for (var c : deck) {
            System.out.println(c.face + " " + c.suit + " " + "(" + c.rank + ")");
        }
    }
    public void pushGetStandardDeck() {
       getStandardDeck();
    }

    private void printDeck() {
        for (var c : deck) {
            System.out.println(c.face + " " + c.suit + " " + "(" + c.rank + ")");
        }
    }
    private List<Card> populateDeck() {
        int[] deckSuits = {9827, 9830, 9829, 9824};
        List<Card> cards = new ArrayList<>();
        for (int suits : deckSuits) {
            char c = (char) suits;
            System.out.println();
            for (int j = 2; j < 15; j++) {
                String face;
                int rank = j - 2;
                switch (j) {
                    case 11 -> face = FaceCards.JACK.toString();
                    case 12 -> face = FaceCards.QUEEN.toString();
                    case 13 -> face = FaceCards.KING.toString();
                    case 14 -> face = FaceCards.ACE.toString();
                    default -> face = Integer.toString(j);
                }
                cards.add(new Card(c, face, rank));
            }
        }
        return cards;
    }

}

package progentis.com;
/*Use enums to hard code deck elements
to populate standard deck in constructor*/
import java.util.*;

enum Suit {
    CLUBS, DIAMONDS, HEARTS, SPADES;

    public char getImage() {
        return (new char[]{9827, 9830, 9829, 9824})[this.ordinal()];//indexes array with enum
    }
}
enum Face { TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE,
    TEN, JACK, QUEEN, KING, ACE }

public class Deck {
    private final List<Card> deck;
    List<Object> hands = new ArrayList<>();

    public Deck() {
        this.deck = new ArrayList<>(52);
        populateDeck();
        shuffleDeck(deck);
    }

    static class Card {
        private final Suit suit;
        private final char symbol;
        private final Face face;
        private final int rank;

        public Card(Suit suit, char symbol, Face face, int rank) {
            this.suit = suit;
            this.symbol = suit.getImage();
            this.face = face;
            this.rank = rank;
        }
        @Override
        public String toString() {
            return suit + " " + " " + symbol + " " + face + " " + rank;
        }
    }

    private void populateDeck() {
        int count = 0;//will populate rank field
        for (Suit s : Suit.values()) {
            for (Face f : Face.values()) {
                Card card = new Card(s, s.getImage(), f, count);
                if (count < 12) {
                count++;
                } else count = 0;
                deck.add(card);
            }
        }
    }

    public static void printDeck(List<Card> deck) {
        int rows = 4;
        System.out.println("-".repeat(60));
        System.out.println("Current Shuffled Deck : ");
        int cardsInRow = deck.size() / rows;
        for (int i = 0; i < rows; i++) {
            int startIndex = i * cardsInRow;
            int endIndex = startIndex + cardsInRow;
            deck.subList(startIndex, endIndex).forEach(c -> System.out.print(c.face + "/" +
                    c.suit + c.symbol + "(" + c.rank + ")" + " "));
            System.out.println();
        }
    }
    public void pushPrintDeck() {
        printDeck(deck);
    }

    private static void shuffleDeck(List<Card> deck) {
        Collections.shuffle(deck);
    }

    public void pushShuffleDeck() {
        shuffleDeck(deck);
    }
    private List<Card> returnRandomHand() {
        List<Card> playerHand = new ArrayList<>(5);
        for (int i = 0; i < 5; i++) {
            Card card = deck.get(new Random().nextInt(52));
            if (!playerHand.contains(card)) {//if-else designed to reduce collisions(duplicates)
                playerHand.add(card);
            } else {
                Card newCard = deck.get(new Random().nextInt(52));
                playerHand.add(newCard);
            }
        }
        return playerHand;
    }
    public List<Card> pushReturnRandomHand() {
        return returnRandomHand();
    }
   public void dealPlayers(int numPlayers) {
        /*This method is designed to deal cards to quantity of numPlayers at the same
        * time.*/
//        populate playerNames with List<Card> names, i.e., player1, player2, etc...

       switch (numPlayers) {
           case 1: List<Card> player1 = returnRandomHand();
                   hands.add(player1);
                   break;
           case 2: List<Card> player1a = returnRandomHand();
                   List<Card> player2 = returnRandomHand();
                   hands = Arrays.asList(player1a, player2);
                   break;
           case 3: List<Card> player1b = returnRandomHand();
                   List<Card> player2a = returnRandomHand();
                   List<Card> player3 = returnRandomHand();
                   hands = Arrays.asList(player1b, player2a, player3);
                   break;
           case 4: List<Card> player1c = returnRandomHand();
                   List<Card> player2b = returnRandomHand();
                   List<Card> player3a = returnRandomHand();
                   List<Card> player4 = returnRandomHand();
                   hands = Arrays.asList(player1c, player2b, player3a, player4);
                   break;
           case 5: List<Card> player1d = returnRandomHand();
                   List<Card> player2c = returnRandomHand();
                   List<Card> player3b = returnRandomHand();
                   List<Card> player4a = returnRandomHand();
                   List<Card> player5 = returnRandomHand();
                  hands = Arrays.asList(player1d, player2c, player3b, player4a, player5);
                   break;
           default:
               if (numPlayers > 5) {
                   System.out.println("Max number of players (5) exceeded");
               }
          }
      }

    public void dealHands(int numPlayers) {
        List<Card> player1 = returnRandomHand();
        List<Card> player2 = returnRandomHand();
        List<Card> player3 = returnRandomHand();
        List<Card> player4 = returnRandomHand();
        List<Card> player5 = returnRandomHand();
        hands = Arrays.asList(player1, player2, player3, player4, player5);
        List<Object> handsDealtArray = hands.subList(0, numPlayers);
        int count = 1;
        for (Object h : handsDealtArray) {
            System.out.println("Hand # " + count + ") " + h);
            count++;
        }
    }
      public void printPlayerHands() {
        int count = 1;
        for (Object h : hands) {
            System.out.println("Hand # " + count + ") " + h);
            count++;
        }
      }
}
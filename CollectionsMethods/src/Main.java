import java.util.*;

public class Main {
    public static void main(String[] args) {
        /*List<Card> deck = Card.getStandardDeck();
        Card.printDeck(deck);*/

        /*Card[] cardArray = new Card[13];
        Card aceOfHearts = Card.getFaceCard(Card.Suit.HEARTS, 'A');
        Arrays.fill(cardArray, aceOfHearts);
        Card.printDeck(Arrays.asList(cardArray), "Aces of Hearts", 1);

        List<Card> cards = new ArrayList<>(52);
        Collections.fill(cards, aceOfHearts);
        System.out.println(cards);
        System.out.println("cards.size() = " + cards.size());

        Card kingOfClubs = Card.getFaceCard(Card.Suit.CLUBS, 'K');
        List<Card> acesOfHearts = Collections.nCopies(13, aceOfHearts);
        List<Card> kingsOfClubs = Collections.nCopies(13, kingOfClubs);
        Card.printDeck(acesOfHearts, "Aces of Hearts", 3);
        Card.printDeck(kingsOfClubs, "Kings of Clubs", 1);

        Collections.addAll(cards, cardArray);
        Collections.addAll(cards, cardArray);
        Card.printDeck(cards, "Card Collection with Aces added", 2);

        Collections.copy(cards, kingsOfClubs);//if # elements in destination List<> is less than
//        the # of elements in the source list, java will not compile. Throw size mismatch error
        Card.printDeck(cards, "Card Collection with Kings copied", 2);

        cards = List.copyOf(kingsOfClubs);
        Card.printDeck(cards, "List Copy of Kings", 1);*/

        List<Card> deck = Card.getStandardDeck();
        Card.printDeck(deck);
//        Collections.shuffle(deck);
//        Card.printDeck(deck, "Shuffled Deck", 4);

//        Collections.reverse(deck);
//        Card.printDeck(deck, "Reversed Deck", 4);

        var sortingAlgorithm = Comparator.comparing(Card::rank).thenComparing(Card::suit);
        Collections.sort(deck, sortingAlgorithm);//List.sort is the way to go.
        // Collections.sort is legacy code
        /*Card.printDeck(deck, "Deck sorted by Rank, Suit", 13);
        Collections.reverse(deck);
        Card.printDeck(deck, "Reversed Deck sorted by Rank, Suit", 13);*/

        List<Card> kings = new ArrayList<>(deck.subList(4, 8));//Carving out separate list from deck
        Card.printDeck(kings, "New Kings list", 1);

        List<Card> tens = new ArrayList<>(deck.subList(16, 20));//Carving out separate list from deck
        Card.printDeck(tens, "List of Tens", 1);


        int subListIndex = Collections.indexOfSubList(deck, tens);
        System.out.println("sublist index for tens = " + subListIndex);
        System.out.println("Contains = " + deck.containsAll(tens));

        boolean disjoint = Collections.disjoint(deck, tens);//Checks if lists have elements in common
        System.out.println("disjoint = " + disjoint);//false if elements in common, true if not

        boolean disjoint2 = Collections.disjoint(kings, tens);//Checks if lists have elements in common
        System.out.println("disjoint = " + disjoint2);
/*The following is an example of a binarySearch method on Collections. Please be advised that
* your list must be properly sorted to avoid and index out of bounds error at runtime. This
* method could replace multiple if statements when searching for matches in a database*/
        Card tenOfHearts = Card.getNumericCard(Card.Suit.HEARTS, 10);
        int foundIndex = Collections.binarySearch(deck, tenOfHearts, sortingAlgorithm);
        System.out.println("foundIndex = " + foundIndex);
        System.out.println("foundIndex = " + deck.indexOf(tenOfHearts));//does same as binarySearch
        System.out.println(deck.get(foundIndex));
//        binarySearch better for large data sets, indexOf() better for smaller sets
        Card tenOfClubs = Card.getNumericCard(Card.Suit.CLUBS, 10);
        Collections.replaceAll(deck, tenOfClubs, tenOfHearts);
        Card.printDeck(deck.subList(32, 36), "Tens row", 1);

        Collections.replaceAll(deck, tenOfHearts, tenOfClubs);
        Card.printDeck(deck.subList(32, 36), "Tens row", 1);

        if (Collections.replaceAll(deck, tenOfHearts, tenOfClubs)) {
            System.out.println("Tens of hearts replaced with tens of clubs");
        } else {
            System.out.println("No tens of hearts found in the list");
        }
        System.out.println("Ten of Clubs Cards = " + Collections.frequency(deck, tenOfClubs));

        System.out.println("Best Card = " + Collections.max(deck, sortingAlgorithm));
        System.out.println("Worst Card = " + Collections.min(deck, sortingAlgorithm));

        var sortBySuit = Comparator.comparing(Card::suit)
                .thenComparing(Card::rank);
        deck.sort(sortBySuit);
        Card.printDeck(deck, "Sorted by Suit, Rank", 4);
//      rotate method
        List<Card> copied = new ArrayList<>(deck.subList(0, 13));
        Collections.rotate(copied, 2);
        System.out.println("Unrotated: " + deck.subList(0, 13));
        System.out.println("Rotated: " + 2 + ": " + copied);

        copied = new ArrayList<>(deck.subList(0, 13));
        Collections.rotate(copied, -2);
        System.out.println("Unrotated: " + deck.subList(0, 13));
        System.out.println("Rotated: " + -2 + ": " + copied);
//      swap method
        copied = new ArrayList<>(deck.subList(0, 13));
        for (int i = 0; i < copied.size() / 2; i++) {
            Collections.swap(copied, i, copied.size() - 1 - i);
        }
        System.out.println("Manual reverse with swap : " + copied);
//      This does the same thing as swap
        copied = new ArrayList<>(deck.subList(0, 13));
        Collections.reverse(copied);
        System.out.println("Using reverse: " + copied);
    }
}
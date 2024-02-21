import javax.swing.plaf.synth.ColorType;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        String aText = "Hello";
        String bText = "Hello";
        String cText = String.join("l", "He", "lo");
        String dText = "He".concat("llo");
        String eText = "hello";

        List<String> hellos = Arrays.asList(aText, bText, cText, dText, eText);
        hellos.forEach(s -> System.out.println(s + ": " + s.hashCode()));

        Set<String> mySet = new HashSet<>(hellos);
        System.out.println("mySet = " + mySet);
        System.out.println("# elements in mySet: " + mySet.size());

        for (String setValue : mySet) {
            System.out.print(setValue + ": ");
            for (int i = 0; i < hellos.size(); i++) {
                if (setValue == hellos.get(i)) {
                    System.out.print(i + ", ");
                }
            }
            System.out.println(" ");
        }
        PlayingCard card1 = new PlayingCard("Hearts", "Queen");
        PlayingCard card2 = new PlayingCard("Diamonds", "King");
        PlayingCard card3 = new PlayingCard("Spades", "Jack");

        List<PlayingCard> cards = Arrays.asList(card1, card2, card3);
        cards.forEach((s -> System.out.println(s + ": " + s.hashCode())));

        Set<PlayingCard> deck = new HashSet<>();
        for (PlayingCard c : cards) {
            if (!deck.add(c)) {//this will add c as long as c not already in set
                System.out.println("Found a duplicate for " + c);
            }
        }
        System.out.println(deck);
    }
}
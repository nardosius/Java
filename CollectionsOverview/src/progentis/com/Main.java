package progentis.com;

public class Main {
    public static void main(String[] args) {
        /*The ascii chars for playing card suits are:
         * ---> CLUB - 9827
         * ---> DIAMOND = 9830
         * ---> HEART = 9829
         * ---> SPADE = 9824
         */

        /*String[] names = {"Anna", "Bob", "David", "Edna"};
//        no sort() method at Collection<T> level
        Collection<String> list = new HashSet<>(Arrays.asList(names));
        list.forEach(System.out::println);

        list.add("Fred");
        list.addAll(Arrays.asList("George", "Gary", "Grace"));
        System.out.println(list);
        System.out.println("Is Gary in the list? " + list.contains("Gary"));
        list.removeIf(s -> s.startsWith("G"));
        System.out.println(list);
        System.out.println("Is Gary in the list? " + list.contains("Gary"));*/

        /*PlayingCards card1 = new PlayingCards();
        card1.pushGetStandardDeck();
        System.out.println("-".repeat(30));*/
        PlayingCards card2 = new PlayingCards();
        card2.pushGetNumericCard("DIAMONDS", 9);
       card2.pushGetFaceCard("CLUBS", "A");

        /*int[] deckSuits = {9827, 9830, 9829, 9824};
        for (int i : deckSuits) {
            System.out.println("ASCII # " + i + " Yields ---> " + (char) i);
        }*/







    }
}
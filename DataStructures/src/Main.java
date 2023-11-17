import java.util.*;

record groceryItems(String name, String type, int count){

    public groceryItems(String name){
        this(name, "DAIRY", 1);
    }
}

public class Main {

    public static void main(String[] args) {
        /*Object[] groceryArray = new Object[3];//basic; groceryArray as a generic object
        groceryArray[0] = new groceryItems("milk");
        groceryArray[1] = new groceryItems("apple", "produce", 5);
        groceryArray[2] = "5 oranges";*/
        /*groceryItems[] groceryArray = new groceryItems[3];//object becomes type; can make array out of it
        groceryArray[0] = new groceryItems("milk");
        groceryArray[1] = new groceryItems("apple", "produce", 1);
        groceryArray[2] = new groceryItems("oranges", "produce", 5);
        System.out.println(Arrays.toString(groceryArray));

        ArrayList<groceryItems> groceryList = new ArrayList<>();
        groceryList.add(new groceryItems("cheese", "dairy", 2));
        groceryList.add(new groceryItems("grapes", "produce", 1));
        groceryList.add(new groceryItems("steak", "meats", 2));
        System.out.println(groceryList.toString());

        String[] items = {"milk", "eggs", "bacon", "bread"};//can place into a generic data structure
        List<String> itemList = List.of(items);//from generic List to.....
        ArrayList<String> list = new ArrayList<>(itemList);//more specific typed ArrayList
        ArrayList<String> nextList = new ArrayList<>(List.of("mustard", "ketchup", "pickles", "onions"));
        nextList.addAll(Arrays.asList("monkey", "rooster", "dog", "rat"));
        System.out.println();
        System.out.println(list.toString());
        nextList.sort(Comparator.naturalOrder());
        System.out.println(nextList.toString());*/

        /*ArListChallenge arListChallenge = new ArListChallenge();
        arListChallenge.menu();*/

        LinkedList<Place> placesToVisit = new LinkedList<>();
        Place adelaide = new Place("Adelaide", 1374);
        Place brisbane = new Place("Brisbane", 917);
        Place perth = new Place("Perth", 3923);
        Place aliceSprings = new Place("Alice Springs", 2771);
        Place darwin = new Place("Darwin", 3972);
        Place melbourne = new Place("Melbourne", 877);
        ListIterator.addPlace(placesToVisit, adelaide);
        ListIterator.addPlace(placesToVisit, brisbane);
        ListIterator.addPlace(placesToVisit, perth);
        ListIterator.addPlace(placesToVisit, aliceSprings);
        ListIterator.addPlace(placesToVisit, darwin);
        ListIterator.addPlace(placesToVisit, melbourne);

        placesToVisit.addFirst(new Place("Sydney", 0));
        System.out.println(placesToVisit);
        StringBuilder s = new StringBuilder();
                for (Place p : placesToVisit) {
            s.append(p.name() + " ").append(p.distance() + ", ");
        }
        System.out.println(s);
                var iterator = placesToVisit.listIterator();
                Scanner scanner = new Scanner(System.in);
                boolean quitLoop = false;
                boolean forward = true;

                ListIterator.printMenu();
        System.out.println();
                while (!quitLoop) {
                    if (!iterator.hasPrevious()) {
                        System.out.println("Originating : " + iterator.next());
                        forward = true;
                    }
                    if (!iterator.hasNext()) {
                        System.out.println("Final : " + iterator.previous());
                        forward = false;
                    }
                    System.out.println("Enter Value: ");
                    String menuItem = scanner.nextLine().toUpperCase().substring(0, 1);

                    switch (menuItem) {
                        case "F":
                            System.out.println("User wants to go forward");
                            if (!forward) {//reversing
                                forward = true;
                                if (iterator.hasNext()) {
                                    iterator.next();
                                }
                            }
                            if (iterator.hasNext()) {
                                System.out.println(iterator.next());
                            }
                            break;
                        case "B":
                            System.out.println("User wants to go backwards");
                            if (forward) {//reversing
                                forward = false;
                                if (iterator.hasPrevious()) {
                                    iterator.previous();
                                }
                            }
                            if (iterator.hasPrevious()) {
                                System.out.println(iterator.previous());
                            }
                            break;
                        case "M":
                            ListIterator.printMenu();
                            break;
                        case "L":
                            System.out.println(placesToVisit);
                            break;
                        default:
                            quitLoop = true;
                            break;
                    }
                }
    }
}
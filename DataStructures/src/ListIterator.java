import java.util.LinkedList;

record Place(String name, int distance){//can use record to create simple object to store in a list
    @Override
    public String toString(){
        return String.format("%s (%d)", name, distance);
    }

}
public class ListIterator {

    public static void addPlace(LinkedList<Place> list, Place place){

        if (list.contains(place)){
            System.out.println("Found duplicate entry: " + place);
            return;
        }
        for (Place p : list){
            if(p.name().equalsIgnoreCase(place.name())){
                System.out.println("Found duplicate entry: " + place);
                return;
            }
        }
        int matchedIndex = 0;
        for (var listPlace : list) {
            if (place.distance() < listPlace.distance()) {
                list.add(matchedIndex, place);
                return;
            }
            matchedIndex++;
        }
        list.add(place);
    }

    public static void printMenu() {
        String textBlock = """
                Available actions (select word or letter):
                (F)orward
                (B)ackward
                (L)ist Places
                (M)enu
                (Q)uit""";
        System.out.print(textBlock + " ");
    }
}

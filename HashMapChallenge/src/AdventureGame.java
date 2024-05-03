import com.sun.jdi.request.StepRequest;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/*This is a text based game with preloaded locations provided in csv format.
* The most difficult part of this challenge is formatting and manipulating the
* data source using the String class.*/
public class AdventureGame {
//Need to study Buffered Reader/IO stream to manipulate external data souces
    private static final String GAME_LOCATIONS = """
             road,at the end of the road,W:hill,E:well house,S:valley,N:forest
             hill,on top of hill with a view in all directions,N:forest,E:road
             well house,inside a well house for a small spring,W:road,N:lake,S:stream
             valley,in a forest valley beside a tumbling stream,N:road,W:hill,E:stream
             forest,at the edge of a thick dark forest,S:road,E:lake
             lake,by an alpine lake surrounded by wildflowers,W:forest,S:well house
             stream,near a stream with a rocky bed,W:valley,N:well house
             """;
//enum used to make map directions constants
    private enum Compass {
        E, N, S, W;
//Create String[] array of full direction names
        private static final String[] directions = {"East", "North", "South", "West"};
//Returns map directions sorted ordinal.
        public String getString() {
            return directions[this.ordinal()];//notice entire array sorted by "this.ordinal"
        }
    }
/*This is always hard to remember. I coded an entire location class. But need to remember
* that very simple objects can be records. Location only has a description and Map.
* Simple objects can be records*/
    private record Location(String description, Map<Compass, String> nextPlaces) {

    }
    private String lastPlace;
    /*This Map will contain the location name and the actual Location object*/
    private Map<String, Location> adventureMap = new HashMap<>();
//First constructor requires no arguments
    public AdventureGame() {
        this(null);
    }
//Second constructor allows user to load up custom locations
    public AdventureGame(String customLocations) {
        loadLocations(GAME_LOCATIONS);
        if (customLocations != null) {
            loadLocations(customLocations);
        }
    }
//This part is where the location data is broken up into the main location and description
    private void loadLocations(String data) {
        for (String s : data.split("\\R")) {//no declared separate array, just "split"
            //take data apart at line breaks
            String[] parts = s.split(",", 3);//take "s" apart at the commas
            Arrays.asList(parts).replaceAll(String::trim);//trim elements
            Map<Compass, String> nextPlaces = loadDirections(parts[2]);//populate nextPlaces Map
            Location location = new Location(parts[1], nextPlaces);
            adventureMap.put(parts[0], location);//populate Main Map w/ location name and
            //location object
        }
//        adventureMap.forEach((k, v) -> System.out.printf("%s:%s%n", k, v));
    }
//this is the part where the next places are broken out of the location data
    private Map<Compass, String> loadDirections(String nextPlaces) {
        Map<Compass, String> directions = new HashMap<>();
        List<String> nextSteps = Arrays.asList(nextPlaces.split(","));
        nextSteps.replaceAll(String::trim);
        for (String nextPlace : nextSteps) {
            String[] splits = nextPlace.split(":");//take apart @ ":"
            Compass compass = Compass.valueOf(splits[0].trim());//Letter direction
            String destination = splits[1].trim();//description part of letter direction
            directions.put(compass, destination);//populate Map w/direction, description
        }
        return directions;
    }

    private void visit(Location location) {
        System.out.printf("*** You're standing %s *** %n", location.description);
        System.out.println("\tFrom here, you can see:");

        location.nextPlaces.forEach((k, v) -> System.out.printf("\t• A %s to the %s (%S) %n", v, k.getString(), k));
        System.out.print("Select Your Compass (Q to quit) >> ");
    }
//method to move from one location to the next
    public void move(String direction) {
        var nextPlaces = adventureMap.get(lastPlace).nextPlaces;
        String nextPlace = null;
        if ("ENSW".contains(direction)) {
            nextPlace = nextPlaces.get(Compass.valueOf(direction));
            if (nextPlace != null) {
                play(nextPlace);
            }
        } else {
            System.out.println("!! Invalid direction, try again!!");
        }
    }
//continue game play
    public void play(String location) {
        if (adventureMap.containsKey(location)) {
            Location next = adventureMap.get(location);
            lastPlace = location;
            visit(next);
        } else {
            System.out.println(location + " is an invalid location");
        }
    }
}

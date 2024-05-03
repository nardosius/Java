import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Location {
    private String landmark;
    private String description;
    private HashMap<String, String> nextPlaces;
    private HashMap<String, String> locations;


    public Location() {
        nextPlaces = new HashMap<>();
        locations = new HashMap<>();
        String locations = """
                road,at the end of the road,W:hill,E:well house,S:valley,N:forest
                hill,on top of hill with a view in all directions,N:forest,E:road
                well house,inside a well house for a small spring,W:road,N:lake,S:stream
                valley,in a forest valley beside a tumbling stream,N:road,W:hill,E:stream
                forest,at the edge of a thick dark forest,S:road,E:lake
                lake,by an alpine lake surrounded by wildflowers,W:forest,S:well house
                stream,near a stream with a rocky bed,W:valley,N:well house""";

        String[] places = places(locations);
        populateLocations(places);
        populateNextPlaces(places);
        printLocations();
    }

    private String[] places(String locations) {
        return locations.split("\n");
    }

    private void printPlaces(String[] places) {
        Arrays.asList(places).forEach(System.out::println);

    }

    private void populateLocations(String[] places) {
         for (String p : places) {
            System.out.println(p);
            String[] kvs = p.split(",");
            locations.put(kvs[0], kvs[1]);
        }
    }

    private void populateNextPlaces(String[] places) {
        int count = 0;
        String[] next = new String[0];
        for (String s : places) {
            String[] np = s.split(",");
            for (int i = 2; i < np.length; i++) {
               next = new String[]{np[i]};

            }
        }

    }

    private void printLocations() {
        System.out.println(locations);
        System.out.println(nextPlaces);
    }
}

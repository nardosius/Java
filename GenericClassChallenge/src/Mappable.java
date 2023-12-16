import java.util.Arrays;
/*This interface with two abstract classes is used to break down data to be placed in an array ([][])
*please study the stringToLatLon method very carefully. The return value of this method is required to
* parse the 2D arrays needed to both instantiate the Park and River classes and to get the geo coordinates
* out of the elements*/
public interface Mappable {

    void render();
    static double[] stringToLatLon(String location) {

        var splits = location.split(",");//location represents lat and long e.g. "44.4882, -110.5916"
        double lat = Double.valueOf(splits[0]);//split on "," means input should be separated by a comma. [0] is latitude
        double lng = Double.valueOf(splits[1]);//[1] is longitude
        return new double[]{lat, lng};//creates new 2D array w/lat and lng as parameters
    }
}

abstract class Point implements Mappable {/*first abstract class, designed to return a single set of lat and long
will be passed to Line to complete geo-coordinate sets*/
    private double[] location;

    public Point(String location) {
        this.location = Mappable.stringToLatLon(location);
    }
/*Constructor initializes the parsing of the location parameter to the interface method stringToLatLon*/
    @Override
    public void render() {
        System.out.println("Render " + this + " as POINT (" + location() + ")");
        //"this" reps class in which this method is called
    }

    private String location() {
        return Arrays.toString(location);
    }
}

abstract class Line implements Mappable {
    private double[][] locations;

    public Line(String... locations) {//multi var string, can use one ore more strings as arguments
        this.locations = new double[locations.length][];
        int index = 0;
        for (var l : locations) {
            this.locations[index++] = Mappable.stringToLatLon(l);
            //assigns each additional index of locations to first dimension of location[x][]
        }
    }

    @Override
    public void render() {
        System.out.println("Render " + this + " as LINE (" + locations() + ")");
    }

    private String locations() {
        return Arrays.deepToString(locations);
    }

}

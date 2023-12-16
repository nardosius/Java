public class River extends Line{

    private String name;

    public River(String name, String... locations) {/*String name is not parsed to stringToLatLon but String... locations is
    the extra dots after String(...) means that multiple geo-coordinate pairs can be passed in*/
        super(locations);//passing locations into the Line class
        this.name = name;
    }

    @Override
    public String toString() {
        return name + " River";
    }
}

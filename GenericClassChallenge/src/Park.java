public class Park extends Point{

    private String name;

    public Park(String name, String location) {/*String name is not parsed to stringToLatLon but String Location is*/
        super(location);//passing location into the Point class
        this.name = name;
    }

    @Override
    public String toString() {
        return name + " National Park ";
    }
}

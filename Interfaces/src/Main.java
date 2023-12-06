import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Bird bird = new Bird();
        Animal animal = bird;//all of these instances are redundant
        FlightEnabled flier = bird;
        Trackable tracked = bird;/*Any class extending an abstract or implementing an interface
         can be instantiated under those conditions*/

        bird.move();
//        flier.move();
//        tracked.move();
//        flier.takeoff();
//        flier.fly();
//        tracked.track();
//        flier.land();
//        System.out.println();
        inFlight(flier);
        inFlight(new Jet());
        Trackable truck = new Truck();
        truck.track();
        double kmTraveled = 100;
        double milesTraveled = kmTraveled * FlightEnabled.KM_TO_MILES;
        System.out.printf("The truck traveled %.2f km  or %.2f miles%n", kmTraveled, milesTraveled);
        ArrayList<FlightEnabled> fliers = new ArrayList<>();
        fliers.add(bird);
        List<FlightEnabled> betterFliers = new ArrayList<>();//supposed to be better
        betterFliers.add(bird);
        /*A List is generic. You can pass all kinds of lists to it and code will compile. If you
        use an ArrayList or LinkedList, you would need to use that form and only that form
        throughout the code. Each method may need different functionality, so declaring List<>
        gives you the option to convert at each instance. This is called coding to the interface.*/
    }

    private static void inFlight(FlightEnabled flier) {
        flier.takeoff();
        flier.fly();
        if (flier instanceof Trackable tracked) {
            tracked.track();
        }
        flier.land();
    }
}
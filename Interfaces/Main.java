public class Main {
    public static void main(String[] args) {

        Bird bird = new Bird();
        Animal animal = bird;
        FlightEnabled flier = bird;
        Trackable tracked = bird;/*Any class extending an abstract or implementing an interface
         can be instantiated under those conditions*/

        animal.move();
//        flier.move();
//        tracked.move();

        flier.takeoff();
        flier.fly();
        tracked.track();
        flier.land();
    }
}
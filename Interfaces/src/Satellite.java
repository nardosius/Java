enum FlightStages implements Trackable {
    GROUNDED, LAUNCH, CRUISE, DATA_COLLECTION;

    @Override
    public void track() {
        if (this != GROUNDED) {
            System.out.println("Monitoring " + this);
        }
    }

    public FlightStages getNextStage() {//can put methods in an enum
        FlightStages[] allStages = values();//values() returns all enum constants stored in an
        // array allStages[]
        return allStages[(ordinal() + 1) % allStages.length];//will return all indexes of
        // allStages[]
    }
}
record DragonFly(String name, String type) implements FlightEnabled {
//records and enums can implement interfaces
    @Override
    public void takeoff() {

    }

    @Override
    public void land() {

    }

    @Override
    public void fly() {

    }
}
public class Satellite implements OrbitEarth {
FlightStages stage = FlightStages.GROUNDED;
    public void achieveOrbit() {
        transition("Orbit achieved!");
    }

    @Override
    public void takeoff() {
    transition("Taking off");
    }

    @Override
    public void land() {
    transition("Landing");
    }

    @Override
    public void fly() {
    achieveOrbit();
    transition("Data collection while orbiting");
    }

    public void transition(String description) {
        System.out.println(description);
        stage = transition(stage);
        stage.track();
    }

    @Override
    public String toString() {
        return getClass().getSimpleName();
    }
}

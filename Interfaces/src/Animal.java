interface OrbitEarth extends FlightEnabled {

    void achieveOrbit();

    static void log(String description) {
        var today = new java.util.Date();
        System.out.println(today + ": " + description);
    }

    private void logStage(FlightStages stage, String description){
        description = stage + ": " + description;
        log(description);
    }

    @Override
    default FlightStages transition(FlightStages stage) {
        FlightStages nextStage = FlightEnabled.super.transition(stage);
        logStage(stage, "Beginning transition to " + nextStage);
        return nextStage;
    }
}

interface FlightEnabled {
    //in interfaces, methods have no bodies ND END WITH "();"
//interface methods are implicitly public and abstract. no need to declare
    double MILES_TO_KM = 1.60934;
    double KM_TO_MILES = 0.621371;

    void takeoff();

    void land();

    void fly();

    default FlightStages transition(FlightStages stage) {
//        System.out.println("transition not implemented on " + getClass().getName());
//        return null;
        FlightStages nextStage = stage.getNextStage();
        System.out.println("Transitioning from " + stage + " to " + nextStage);
        return nextStage;
    } //this is called an interface extension. It allows the addition of a new method in an interface
// without affecting all the classes that implement the interface.
}

interface Trackable {

    void track();

}

public abstract class   Animal {

    public void move() {

    }
}

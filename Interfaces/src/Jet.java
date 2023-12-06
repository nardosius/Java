public class Jet implements FlightEnabled, Trackable{
//possible to instantiate class without constructor
    @Override
    public void takeoff() {
        System.out.println(getClass().getSimpleName() + " is taking off");

    }
    @Override
    public void land() {
        System.out.println(getClass().getSimpleName() + " is landing");
    }

    @Override
    public void fly() {
        System.out.println(getClass().getSimpleName() + " is flying");
    }

    @Override
    public void track() {
        System.out.println(getClass().getSimpleName() + "'s coordinates recorded");
    }

    @Override
    public FlightStages transition(FlightStages stage) {
        System.out.println(getClass().getSimpleName() + " transitioning");
//        return FlightStages.CRUISE;
        return FlightEnabled.super.transition(stage);
        //the little blue "o" to the left of this method means that the default method interface
        // is being overridden for real here
    }
}

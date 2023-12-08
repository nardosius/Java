import java.lang.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Mappable> mappables = new ArrayList<>();//coding to interface w/generic List mapped to ArrayList<>
        //used Mappable as type because can use ANY type class or object that implements Mappable.
        mappables.add(new Building("Sydney Town Hall", UsageType.GOVERNMENT));
        mappables.add(new Building("Sydney Opera House", UsageType.ENTERTAINMENT));
        mappables.add(new Building("Stadium Australia", UsageType.SPORTS));
        mappables.add(new UtilityLine("College St", UtilityType.FIBER_OPTIC));
        mappables.add(new UtilityLine("Olympic Blvd", UtilityType.WATER));

        for (var m: mappables) {
            Mappable.mapIt(m);
        }
/*THIS IS VERY IMPORTANT: Notice that the output from this iteration returns a perfectly JSO formatted set of objects -->
*
"properties": {"type": "POINT", label": "Sydney Town Hall( GOVERNMENT)", "marker": "RED STAR"}
"properties": {"type": "POINT", label": "Sydney Opera House( ENTERTAINMENT)", "marker": "GREEN TRIANGLE"}
"properties": {"type": "POINT", label": "Stadium Australia( SPORTS)", "marker": "ORANGE PUSH_PIN"}
*/
    }
}
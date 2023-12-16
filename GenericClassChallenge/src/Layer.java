import java.util.ArrayList;
import java.util.List;

public class Layer <T extends Mappable> {//extend interface to pull in functionality for generic class

    private List<T> layerElements;

    public Layer (T[] layerElements) {//"T" type array called layerElements
        this.layerElements = new ArrayList<T>(List.of(layerElements));/*T[] cast as an arraylist using List.of()
        command*/
    }

    public void addElements(T... elements) {//"..." allows multi-element support
        layerElements.addAll(List.of(elements));
    }

    public void renderLayer() {//when renderLayer() run in Main, each class render() method runs
        for (T element : layerElements) {
            element.render();
        }
    }
}


enum Geometry {LINE, POINT, POLYGON}

enum Color {BLACK, GREEN, BLUE, ORANGE, RED}
enum PointMarker {CIRCLE, PUSH_PIN, STAR, SQUARE, TRIANGLE}
enum LineMarker {DASHED, DOTTED, SOLID}
public interface Mappable {
    String JSON_PROPERTY = """
            "properties": {%s}""";
//the String declaration is implicitly public static final and a constant

    String getLabel();

    Geometry getShape();//returns enum type Geometry

    String getMarker();

    default String toJSON() {
        return """
               "type": "%s", label": "%s", "marker": "%s"  """.formatted(getShape(), getLabel(), getMarker());
    }

    static void mapIt(Mappable mappable) {
        System.out.printf((JSON_PROPERTY) + "%n", mappable.toJSON());
    }
}


public enum Topping {
    MUSTARD,
    PICKLES,
    BACON,
    CHEDDAR,
    TOMATO;

    public double getPrice() {
        return switch (this) {
            case BACON -> 1.5;
            case CHEDDAR -> 1.25;
            case TOMATO -> 0.5;
            case MUSTARD -> .05;
            case PICKLES -> .10;
            default -> 0.0;
        };
    }
}


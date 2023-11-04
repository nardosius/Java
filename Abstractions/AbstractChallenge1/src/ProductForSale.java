public abstract class ProductForSale {
    protected double price;
    protected String type;
    protected String description;

    public ProductForSale(String type, String description, double price) {

    }

    public void printPricedItem(int qty) {
        System.out.println();

    }

    public double getSalesPrice(int qty) {

        return qty * price;
    }

    abstract void showDetails();


    public final String getExplicitType() {//final cannot be overidden
        return getClass().getSimpleName() + " (" + type + ")";
    }
}

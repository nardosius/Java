public abstract class ProductForSale {
    protected double price;
    protected String type;
    protected String description;

    public ProductForSale(String type, String description, double price) {
            this.type = type;
            this.description = description;
            this.price = price;
    }

    public void printPricedItem(int qty) {
        System.out.printf("%2d qty at $%8.2f each, %-15s %-35s %n", qty, price, type, description);

    }

    public double getSalesPrice(int qty) {

        return qty * price;
    }

    abstract void showDetails();


    public final String getExplicitType() {//final cannot be overidden
        return getClass().getSimpleName() + " (" + type + ")";
    }
}

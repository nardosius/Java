public class Furniture extends ProductForSale {
    public Furniture(String type, String description, double price) {
        super(type, description, price);
    }

    @Override
    void showDetails() {
        System.out.println("Item: " + type );
        System.out.println("Description: " + description);
        System.out.println("Unit Price: " + price);

    }


}

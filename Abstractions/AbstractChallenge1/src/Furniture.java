public class Furniture extends ProductForSale {
    public Furniture(String type, String description, double price) {
        super(type, description, price);//when extending a class, just use the super instantiator.
    }

    @Override
    void showDetails() {
        System.out.println("Item: " + type );
        System.out.println("Description: " + description);
        System.out.println("Unit Price: " + price);

    }


}

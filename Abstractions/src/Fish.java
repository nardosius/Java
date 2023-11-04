public class Fish extends Animal {
    public Fish(String type, String size, double weight) {
        super(type, size, weight);
    }

    @Override
    public void move(String speed) {
        if (speed.equals("slow")){
            System.out.print(getExplicitType() + " lazily swimming");
        } else {
            System.out.println(getExplicitType() + " frantically swimming");
        }

    }

    @Override
    public void makeNoise() {
        if (type == "Goldfish") {//can call parameter "type" from super construction
            System.out.println("swish!");
        } else {
            System.out.println("splash!");
        }

    }
}

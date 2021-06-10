public class Sity extends Car {

    public Sity() {
        this.price += 40000;
    }

    @Override
    public int getPrice() {
        return this.price;
    }

    @Override
    public String toString() {
        return "Sity " + super.toString() + "optional having a total price of " + this.price + " TL";
    }
}

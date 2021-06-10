public class Scooter extends Motorbike {

    public Scooter() {
        this.price += 20000;
    }

    @Override
    public int getPrice() { return this.price; }

    @Override
    public String toString() {
        return "Scooter " + super.toString() + "optional having a total price of " + this.price + "TL.";
    }
}

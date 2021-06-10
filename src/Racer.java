public class Racer extends Motorbike {

    public Racer() {
        this.price += 60000;
    }

    @Override
    public int getPrice() {
        return this.price;
    }

    @Override
    public String toString() {
        return "Racer " + super.toString() + "optional having a total price of " + this.price + " TL.";
    }
}


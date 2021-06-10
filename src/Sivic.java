public class Sivic extends Car {

    public Sivic() {
        this.price += 50000;
    }

    @Override
    public int getPrice() {
        return this.price;
    }

    @Override
    public String toString() {
        return "Sivic " + super.toString() + "optional having a total price of " + this.price + " TL.";
    }
}

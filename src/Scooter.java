public class Scooter extends Motorbike{
    int price;

    public Scooter() {
        this.price = 20000;
    }

    @Override
    public int getPrice() { return this.price; }

    @Override
    public void setAbs(boolean abs) {
        this.abs = abs;
        if (this.abs) this.price += 5000;
    }
}

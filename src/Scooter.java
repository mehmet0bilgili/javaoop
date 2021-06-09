public class Scooter extends Motorbike{

    public Scooter() {
        super.price = 20000;
    }

    @Override
    public int getPrice() { return this.price; }

    @Override
    public void setAbs(boolean abs) {
        this.abs = abs;
        if (this.abs) this.price += 5000;
    }
}

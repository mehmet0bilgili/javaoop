public class Racer extends Motorbike {

    public Racer() {
        super.price = 60000;
    }

    @Override
    public int getPrice() {
        return price;
    }

    @Override
    public void setAbs(boolean abs) {
        this.abs = abs;
        if (this.abs) this.price += 5000;
    }
}

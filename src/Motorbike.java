public abstract class Motorbike {
    int price;
    boolean abs;

    public Motorbike() {
        this.price = 0;
        this.abs = false;
    }

    public abstract int getPrice();

    public abstract void setAbs(boolean abs);

}

public abstract class Sonda {
    int price;
    boolean abs; // I thought abs is universal.

    public Sonda() {
        this.price = 0;
        this.abs = false;
    }

    public void setAbs(boolean abs) {
        this.abs = abs; //problem is if somebody make this abs true when it is already true.
        if (this.abs) this.price += 5000; // it will cause unnecessary abs
    }

    public abstract int getPrice();

    @Override
    public String toString() {
        String tf = "with ";
        if (this.abs) tf += "ABS, ";
        return tf;
    }
}

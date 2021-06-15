public abstract class Sonda { // we can think the sonda as a mother of the all vehicles.
    protected int price;
    private boolean abs; // I thought abs was universal.

    public Sonda() {
        this.price = 0;
        this.abs = false;
    }

    public void setAbs(boolean abs) { // 5000
        if (abs && !this.abs) this.price += 5000; //if no abs (!this.abs) and want to add abs (abs).
        this.abs = abs;
    }

    public boolean isAbs() {
        return this.abs;
    }

    public abstract int getPrice();

    @Override
    public String toString() {
        String tf = "with ";
        if (this.abs) tf += "ABS, ";
        return tf;
    }
}

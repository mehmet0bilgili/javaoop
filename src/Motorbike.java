public abstract class Motorbike extends Sonda {
    boolean abs;

    public Motorbike() {
        this.abs = false;
    }

    @Override
    public abstract int getPrice();

    public abstract void setAbs(boolean abs);

}

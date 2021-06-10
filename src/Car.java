public abstract class Car extends Sonda {
    boolean airbag;

    public Car() {
        this.airbag = false;
    }

    @Override
    public abstract int getPrice();

    public abstract void setAirbag(boolean airbag);
}

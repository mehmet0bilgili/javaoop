public abstract class Car {
    boolean airbag;

    public Car() {
        this.airbag = false;
    }

    public abstract int getPrice();

    public abstract void setAirbag(boolean airbag);
}

public abstract class Motorbike extends Sonda {
    boolean seatHeating;

    public Motorbike() {
        this.seatHeating = false;
    }

    @Override
    public abstract int getPrice();

    public void setSeatHeating(boolean abs) {
        this.seatHeating = abs;
        if (this.seatHeating) this.price += 2000;
    }

    @Override
    public String toString() {
        String tf = super.toString();
        if (this.seatHeating) tf += "Seat Heating, ";
        return tf;
    }
}

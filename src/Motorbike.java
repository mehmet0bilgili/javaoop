public abstract class Motorbike extends Sonda {
    private boolean seatHeating;

    public Motorbike() {
        this.seatHeating = false;
    }

    @Override
    public abstract int getPrice();

    public boolean isSeatHeating() {
        return this.seatHeating;
    }

    public void setSeatHeating(boolean seatHeating) {
        if (seatHeating && !this.seatHeating) this.price += 2000;
        this.seatHeating = seatHeating;
    }

    @Override
    public String toString() {
        String tf = super.toString();
        if (this.seatHeating) tf += "Seat Heating, ";
        return tf;
    }
}

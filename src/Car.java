public abstract class Car extends Sonda {
    boolean airbag, musicSystem, sunroof;

    public Car() {
        this.airbag = false;
    }

    @Override
    public abstract int getPrice();

    public void setAirbag(boolean airbag) {
        this.airbag = airbag;
        if (this.airbag) this.price += 3000;
    }

    public void setMusicSystem(boolean musicSystem) {
        this.musicSystem = musicSystem;
        if (this.musicSystem) this.price += 1000;
    }

    public void setSunroof(boolean sunroof) {
        this.sunroof = sunroof;
        if (this.sunroof) this.price += 2000;
    }

    @Override
    public String toString() {
        String tf = super.toString();
        if (this.airbag) tf += "Air Bag, ";
        if (this.musicSystem) tf += "Music System, ";
        if (this.sunroof) tf += "Sunroof, ";
        return tf;
    }
}

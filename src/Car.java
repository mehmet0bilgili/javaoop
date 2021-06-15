public abstract class Car extends Sonda {
    private boolean airbag, musicSystem, sunroof;

    public Car() {
        this.airbag = false;
        this.musicSystem = false;
        this.sunroof = false;
    }

    @Override
    public abstract int getPrice();

    public boolean isMusicSystem() {
        return this.musicSystem;
    }

    public boolean isSunroof() {
        return this.sunroof;
    }

    public boolean isAirbag() {
        return this.airbag;
    }

    public void setAirbag(boolean airbag) {
        if (airbag && !this.airbag) this.price += 3000;
        this.airbag = airbag;
    }

    public void setMusicSystem(boolean musicSystem) { // 1000
        if (musicSystem && !this.musicSystem) this.price += 1000;
        this.musicSystem = musicSystem;
    }

    public void setSunroof(boolean sunroof) { // 2000
        if (sunroof && !this.sunroof) this.price += 2000;
        this.sunroof = sunroof;
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

public class Sivic extends Car {
    int price;

    public Sivic() {
        this.price = 50000;
    }

    @Override
    public int getPrice() {
        return price;
    }

    @Override
    public void setAirbag(boolean airbag) {
        this.airbag = airbag;
        if (this.airbag) this.price += 3000;
    }
}

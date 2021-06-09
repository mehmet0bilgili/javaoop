public class Sity extends Car {
    int price;

    public Sity() {
        this.price = 40000;
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

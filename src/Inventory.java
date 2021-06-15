import java.util.ArrayList;

public final class Inventory {
    private final ArrayList<Sonda> envanter;

    public Inventory() {
        this.envanter = new ArrayList<>();
    }

    public void addItem(Sonda sonda) {
        if (!this.envanter.contains(sonda)) {
            this.envanter.add(sonda);
        }
    }

    public ArrayList<Sonda> getEnvanter() {
        return this.envanter;
    }

    @Override
    public final String toString() {
        StringBuilder tf = new StringBuilder();
        int carNum = 0, sum = 0; //sum for money
        for (Sonda s : this.envanter) {
            tf.append(s.toString()).append("\n");
            if (s instanceof Car) carNum++;
            sum += s.getPrice();
        }
        int motoNum = this.envanter.size() - carNum;
        tf.append("TOTAL: ").append(this.envanter.size()).append(" Vehicles including ").append(carNum).append(" Cars and ").append(motoNum).append(" Motorbikes having a total price of ").append(sum).append(" TL.");
        return tf.toString();
    }
}

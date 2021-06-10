import java.util.ArrayList;

public class Inventory<E extends Sonda>  {
    ArrayList<E> envanter;

    public Inventory() {
        this.envanter = new ArrayList<>();
    }

    public void addItem(Sonda sonda) throws NullPointerException {
        if (!this.envanter.contains(sonda)) {
            this.envanter.add((E) sonda);
        }
    }

    @Override
    public String toString() {
        StringBuilder tf = new StringBuilder();
        int carNum = 0, sum = 0;
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

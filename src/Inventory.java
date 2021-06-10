import java.util.ArrayList;

public class Inventory {
    ArrayList<Sonda> envanter;

    public Inventory() {
        this.envanter = new ArrayList<>();
    }

    public void addItem(Sonda sonda) throws NullPointerException {
        if (!this.envanter.contains(sonda)) {
            this.envanter.add(sonda);
        }
    }
}

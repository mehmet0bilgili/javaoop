public class Tester {

    public static void main(String[] args) {
        Inventory<Sonda> envanter = new Inventory<>();

        Car car1 = new Sity(); // 40000
        car1.setSunroof(true); // 2000
        car1.setAbs(true); // 5000
        envanter.addItem(car1);

        car1 = new Sivic(); // 50000
        car1.setAbs(true); // 5000
        car1.setAirbag(true); // 3000
        car1.setMusicSystem(true); // 1000
        car1.setAbs(true); // nothing, car1 -sivic- already has this.
        envanter.addItem(car1);

        car1 = new Sity(); // 4000
        car1.setAbs(true); // 5000
        envanter.addItem(car1);

        //car1 = new Scooter();
        Motorbike mbike2 = new Scooter(); //20k
        mbike2.setAbs(true); // 5k
        mbike2.setSeatHeating(true); // 2k
        envanter.addItem(mbike2);

        Motorbike mbike1 = new Racer(); // 60k
        mbike1.setAbs(true); // 5k
        mbike1.setSeatHeating(true); // 2k
        envanter.addItem(mbike1);

        System.out.println(envanter);

        //mBike.setSunroof(true);

    }
}

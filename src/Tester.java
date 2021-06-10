public class Tester {

    public static void main(String[] args) {

        Inventory<Sonda> inventory = new Inventory<>();

        Car car = new Sivic(); //50000
        car.setAbs(true); // 5000
        car.setMusicSystem(true); //1000
        car.setAirbag(true); //3000
        inventory.addItem(car);

        car = new Sivic(); //50000
        car.setAbs(true); //5000
        car.setSunroof(true); // 2000
        inventory.addItem(car);

        car = new Sity(); // 40000
        car.setMusicSystem(true); // 1000
        car.setSunroof(true); // 2000
        inventory.addItem(car);

        Motorbike mBike = new Racer(); // 60000
        mBike.setAbs(true); // 5000
        mBike.setSeatHeating(true); // 2000
        inventory.addItem(mBike);

        System.out.println(inventory);

    }
}

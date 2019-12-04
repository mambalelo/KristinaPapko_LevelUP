package transport;

public class Minibus extends Car implements Working {

    public Minibus(String name, int releaseYear, int price, double fuelFlow) {
        super(name, releaseYear, price, fuelFlow);
    }

    @Override
    public void work() {
        System.out.println("Для работы на этом автомобиле требетуся водитель с категорией В");

    }
}

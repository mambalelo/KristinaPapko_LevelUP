package transport;

public abstract class Car implements Working {

    private String name;
    private int releaseYear;
    private int price;
    private double fuelFlow;


    public Car(String name, int releaseYear, int price, double fuelFlow) {
        this.name = name;
        this.releaseYear = releaseYear;
        this.price = price;
        this.fuelFlow = fuelFlow;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public double getFuelFlow() {
        return fuelFlow;
    }

    public void setFuelАlow(double fuelFlow) {
        this.fuelFlow = fuelFlow;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return  name + " год выпуска " + getReleaseYear() + " стоимость авто " + price + " расход топлива " + fuelFlow;
    }






}

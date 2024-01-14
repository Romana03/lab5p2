public class Bicycle extends Vehicle {
    private int numberOfGears;

    public Bicycle(String brand, int year, int numberOfGears) {
        super(brand, year);
        this.numberOfGears = numberOfGears;
    }

    public int getNumberOfGears() {
        return numberOfGears;
    }

    public void setNumberOfGears(int numberOfGears) {
        this.numberOfGears = numberOfGears;
    }
}
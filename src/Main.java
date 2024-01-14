public class Main {
    public static void main(String[] args) {
        Car car = new Car("Toyota", 2022, 4);
        Bicycle bicycle = new Bicycle("JJJJJ", 2022, 21);

        System.out.println("Car Details:");
        System.out.println("Brand: " + car.getBrand());
        System.out.println("Year: " + car.getYear());
        System.out.println("Number of Doors: " + car.getNumberOfDoors());

        System.out.println("\nBicycle Details:");
        System.out.println("Brand: " + bicycle.getBrand());
        System.out.println("Year: " + bicycle.getYear());
        System.out.println("Number of Gears: " + bicycle.getNumberOfGears());
    }
}
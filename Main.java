// Main.java
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Create instances of each type of car
        Car sedan = new Sedan("1234567890", "Toyota", "Corolla", 20000);
        Car utilityVehicle = new UtilityVehicle("0987654321", "Ford", "Explorer", 30000, true);
        Car truck = new Truck("1112131415", "Chevrolet", "Silverado", 40000, 7000);

        // Store the cars in a list
        List<Car> cars = new ArrayList<>();
        cars.add(sedan);
        cars.add(utilityVehicle);
        cars.add(truck);

        // Print the information for each car
        for (Car car : cars) {
            System.out.println(car.getInfo());
            System.out.println("--------------------------------");
        }
    }
}
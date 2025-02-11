package U7T2;
import java.util.ArrayList;
import java.util.Arrays;

public class AnotherMain {
    public static void main(String[] args) {
        // create an array with the known values
        // Integer[] intsArray = {1, 2, 3, 4, 5};

        // // use the Arrays.asList utility method to convert the array to a list "inline"
        // ArrayList<Integer> intList = new ArrayList<Integer>(Arrays.asList(intsArray));
        // System.out.println(intList);

        Car car1 = new Car("Mustang", 12500);
        Car car2 = new Car("Camry", 8400);
        Car car3 = new Car("Ram", 17200);
        Car car4 = new Car("Accent", 1980);
        Car car5 = new Car("Cruiser", 10500);
        Car[] cars = {car1, car2, car3, car4, car5};
        ArrayList<Car> carList = new ArrayList<Car>(Arrays.asList(cars));
        System.out.println(carList);
        
    }
}

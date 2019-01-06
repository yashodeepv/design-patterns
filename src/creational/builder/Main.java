package creational.builder;


/**
 *
 * Builder Pattern
 *
 * If you we have many optional attributes in a class then use Builder Pattern to instantiate
 *
 */
public class Main {

    public static void main(String[] args) {

        Car car = Car.builder() // this is am inner class created in Car
                .stearing("Sports") // function of Builder inner class
                .wheels(4) // function of Builder inner class
                .build(); // returns Car Object

        System.out.println(car.getNumberOfWheels());
    }

}

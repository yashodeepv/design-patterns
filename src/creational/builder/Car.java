package creational.builder;

public class Car {

    private int numberOfWheels;
    private String stearingType;

    public Car() {}

    public int getNumberOfWheels() {
        return numberOfWheels;
    }

    public void setNumberOfWheels(int numberOfWheels) {
        this.numberOfWheels = numberOfWheels;
    }

    public String getStearingType() {
        return stearingType;
    }

    public void setStearingType(String stearingType) {
        this.stearingType = stearingType;
    }

    // Function which will return instance of inner class Builder
    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {

        private Car car = new Car();

        public Car build() {
            return car;
        }

        public Builder wheels(int n) {
            car.setNumberOfWheels(n);
            return this; // imp
        }

        public Builder stearing(String typeOfStearing) {
            car.setStearingType(typeOfStearing);
            return this; // imp
        }
    }
}

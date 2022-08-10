public class Car {

    String manufacturer;
    String model;

    // Constructor method
    public Car(String manufacturer,String model){
        this.manufacturer = manufacturer;
        this.model = model;
    }

    // Overloaded constructor (takes in no parameters to make the object)
    public Car() {}

    // Method attached to class
    public void pushGas() {
        System.out.println("Vrooooom!");
    }

    // Public method not attached to class
    static void lookAtCar() {
        System.out.println("Wow! that car's so cool!");
    }

}

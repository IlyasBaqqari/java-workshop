public class CarInherit extends Vehicle {

    String manufacturer;

    // Constructor method
    public CarInherit() {}

    // Method attached to class
    public void pushGas() {
        System.out.println("Vrooooom!");
    }

    // Public method not attached to class
    static void lookAtCar() {
        System.out.println("Wow! that car's so cool!");
    }

}

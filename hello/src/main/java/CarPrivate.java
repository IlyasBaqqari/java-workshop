public class CarPrivate {

    private String manufacturer;

    // Constructor method
    public CarPrivate() {}

    // Getter
    public String getManufacturer() { return manufacturer; }

    // Setter
    public void setManufacturer(String manufacturer) { this.manufacturer = manufacturer; }



    // Method attached to class
    public void pushGas() {
        System.out.println("Vrooooom!");
    }

    // Public method not attached to class
    static void lookAtCar() {
        System.out.println("Wow! that car's so cool!");
    }

}

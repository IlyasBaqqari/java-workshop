import polymorphism.*;
import interfaces.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Hello {

    public static int globalAge = 100;

    public static void main(String[] args) {

        System.out.println("Hello world");

        // Pressing COMMAND+OPTION+L will format code automatically
        // Selecting lines and pressing COMMAND+/ will comment the lines out

        // Introductory Notes
        variables();
        casting();
        operators();
        conditionals();
        doWhile();

        // Methods
        methodsOverload();
        methodRecursion();
        scopes();

        // Classes & Objects
        createInstance();
        getterSetter();
        inheritance();
        polymorphism();
        interfacesAndAbstraction();

        // Data Structures
        javaArrays();
        arrayList();
        hashMap();
        hashSet();
        forLoop();
        forEachLoop();

        // More
        exceptionHandling();

    }

    /* LEARNING METHODS */

    static void comments() {

        //  Single line comment

        /*
            Multi line comment
        */

        // todo: Todo comment gets highlighted
        // TODO: Also a todo in caps

    }

    static void variables() {

        System.out.println("\n~~ VARIABLES ~~");

        // Primitive datatypes
        int number = 1;             // A 4byte number
        double price = 23.99;       // An 8byte decimal number
        boolean trueFalse = true;   // True or False

        byte Byte;              // A single byte
        short Short;            // A short 2byte number
        long Long;              // A long 8byte number
        float FloatingPoint;    // A 4byte decimal number
        char Character;         // A single character

        // Non-primitive datatypes
        String name = "Jimmy";  // String of characters
        Integer age = 200;      // Non-primitive int

        System.out.println(number);
        System.out.println(price);
        System.out.println(trueFalse);

        System.out.println(name);
        System.out.println(age);

    }

    static void casting() {

        /*
        Casting is like variable conversion
         */

        System.out.println("\n~~ CASTING ~~");

        // Widening int to double
        int myInt = 47;
        double myDouble = myInt;

        System.out.println(myInt);
        System.out.println(myDouble);

        // Narrowing double to int
        double doubleTrouble = 999.99999;
        int intEnse = (int) doubleTrouble;

        System.out.println(doubleTrouble);
        System.out.println(intEnse);

        // Char to String
        char myChar = 'c';
        String myString = String.valueOf(myChar);

        // Other things to String
        String numberString = String.valueOf(myInt);
        String doubleString = String.valueOf(doubleTrouble);

        System.out.println(myString);
        System.out.println(numberString);
        System.out.println(doubleString);

    }

    static void operators() {

        System.out.println("\n~~ OPERATORS ~~");

        int x = 5;
        int y = 6;
        String forename = "John";
        String surname = "Smith";

        // Arithmetic Operators
        System.out.println(x + y);  //  +   Addition
        System.out.println(x - y);  //  -   Subtraction
        System.out.println(x * y);  //  *   Multiply
        System.out.println(x / y);  //  /   Division
        System.out.println(x % y);  //  %   Modulus
        System.out.println(x++);    //  ++  Increment by 1
        System.out.println(x--);    //  --  Decrement by 1

        System.out.println(forename + " " + surname); // Concatenation using +

        // Comparison Operators
        System.out.println(x == y); //  ==  Equal to
        System.out.println(x != y); //  !=  Not equal
        System.out.println(x > y);  //  >   Greater than
        System.out.println(x < y);  //  <   Less than
        System.out.println(x >= y); //  >=  Greater than or equal to
        System.out.println(x <= y); //  <=  Less than or equal to

        System.out.println(forename.equals(surname));           // String comparison
        System.out.println(forename.equalsIgnoreCase(surname)); // Same as .equals but not case-sensitive

        // Logic Operators
        System.out.println(x == x && y == y);   //  &&  AND (True if both are true
        System.out.println(x == x || y == y);   //  ||  OR (True if either is true)
        System.out.println(!(x == x && y == y));    //  !   NOT (True if result is false)

    }

    static void conditionals() {

        System.out.println("\n~~ CONDITIONALS ~~");

        int x = 4;
        int y = 7;
        String food = "Cake";

        // IF...ELSE
        if (x == y) {
            System.out.println("x is equal to y");
        } else {
            System.out.println("x isn't equal to y");
        }

        // IF...ELSE IF...ELSE
        if (food.equals("Potato")) {
            System.out.println("Food is a Potato!");
        } else if (food.equals("Cake")) {
            System.out.println("Food is a Cake!");
        } else {
            System.out.println("Who knows what the food is...");
        }

        // TERNARY
        String result = (x > y) ? "x is greater than y" : "x isn't greater than y";
        System.out.println(result);

        // SWITCH
        switch (x) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Who knows what day it is...");
                break;
        }

    }

    static void doWhile() {

        System.out.println("\n~~ CONDITIONALS ~~");

        int age = 0;

        // WHILE loop
        while (age < 17) {
            System.out.println("You're "+age+"! you can't drive yet.");
            age++;
        }
        System.out.println("You're 17 or older so you can drive.");

        int number = 16;

        // DO WHILE loop
        do {
            System.out.println(number);
        } while (age < 15);

    }

    static void methodsOverload() {

        System.out.println("\n~~ OVERLOADED METHODS ~~");

        // Standard Method
        System.out.println(addition(2,2));

        // Overloaded Method
        String name = "Johny";
        int age = 300;
        String favColor = "";

        String message = (favColor.isEmpty() == true) ? greeting(name,age) : greeting(name,age,favColor);
        System.out.println(message);
    }

    static void methodModifiers() {

        /*
         static         - Belongs to the class, rather than an object
         final          - Cannot be modified or overridden
         transient      - Skipped when serializing the object containing them
         synchronized   - Methods can only be accessed by one thread at a time
         volatile       - Value of attribute is not cached thread-locally, and is always read from the main memory
         */

        final int constant = 123;   //  final - cannot be modified

    }

    static void methodRecursion() {

        System.out.println("\n~~ METHOD RECURSION ~~");

        // Method which calls itself within itself
        countDown(10);

    }

    static void scopes() {

        System.out.println("\n~~ SCOPES ~~");

        // Global age is defined on line 10
        globalAge = 74;
        int localAge = 47;

        System.out.println(globalAge+" is the global age.");
        System.out.println(localAge+" is the local age.");

    }

    static void createInstance() {

        System.out.println("\n~~ CREATE & INSTANTIATE OBJECT ~~");

        // Call constructor method
        Car myCar = new Car("Ford","Fiesta");

        // Call overloaded constructor (passes in no parameters)
        Car noCar = new Car();

        // Assign values to myCar object
        myCar.manufacturer = "Honda";
        myCar.model = "CRV";

        System.out.println("My Car : "+myCar.manufacturer+" "+myCar.model);

        // Call methods
        myCar.pushGas();
        Car.lookAtCar();

    }

    static void getterSetter() {

        System.out.println("\n~~ GETTERS & SETTERS ~~");

        /*
        For classes with private variables, getter and setter methods are required:

            Getter - Gets the value
            Setter - Sets the value

        The use of getter and setter is called encapsulation.
         */

        CarPrivate secretCar = new CarPrivate();

        secretCar.setManufacturer("Ford");
        System.out.println(secretCar.getManufacturer());

    }

    static void inheritance() {

        System.out.println("\n~~ INHERITANCE ~~");
        CarInherit beepCar = new CarInherit();

        // Method inherited from Vehicle class
        beepCar.horn();

    }

    static void polymorphism() {

        System.out.println("\n~~ POLYMORPHISM ~~");

        /* Polymorphism is when classes inherit things but change them in their own way */

        Circle myCircle = new Circle();
        Triangle myTriangle = new Triangle();
        Square mySquare = new Square();

        myCircle.sides();
        myTriangle.sides();
        mySquare.sides();

    }

    static void interfacesAndAbstraction() {

        System.out.println("\n~~ INTERFACES & ABSTRACTION ~~");

        Cat myCat = new Cat();
        Cow myCow = new Cow();
        Sheep mySheep = new Sheep();

        myCat.animalSound();
        myCat.sleep();
        myCow.animalSound();
        myCow.sleep();
        mySheep.animalSound();
        mySheep.sleep();

    }

    static void javaArrays() {

        System.out.println("\n~~ JAVA ARRAYS ~~");

        // Define array
        String[] cars = {"Volvo","BMW","Ford","Mazda"};

        // Output item at index 0 of cars array
        System.out.println(cars[0]);

    }

    static void arrayList() {

        System.out.println("\n~~ ARRAY LIST ~~");

        // Imported ArrayList on line 4

        // Define array
        ArrayList<String> cars = new ArrayList<String>();

        // Add values
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");

        // methods: get, set, remove, add, size, sort

        // Output entire array
        System.out.println(cars);

        // Output item at index 0 of cars array
        System.out.println(cars.get(0));

    }

    static HashMap<String, String> hashMap() {

        System.out.println("\n~~ HASH MAP ~~");

        /*
        Hash Map stores items in KEY/VALUE pairs
        One object is used as a KEY (index) to another OBJECT (value)
         */

        // Imported HashMap on line 5

        // Define new hashmap
        HashMap<String,String> capitalCities = new HashMap<String,String>();

        // Add keys and values (Country, City)
        capitalCities.put("England", "London");
        capitalCities.put("Germany", "Berlin");
        capitalCities.put("Norway", "Oslo");
        capitalCities.put("USA", "Washington DC");

        // Methods: put, retrieve, remove, clear all

        // Output hashmap
        System.out.println(capitalCities);

        // Output item with key Germany in hashmap
        System.out.println(capitalCities.get("Germany"));

        return capitalCities;
    }

    static HashSet<String> hashSet() {

        System.out.println("\n~~ HASH SET ~~");

        /*
        A HashSet is a collection of items where EACH ITEM IS UNIQUE.
        */

        // Imported HashSet at line 6

        HashSet<String> cars = new HashSet<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("BMW");
        cars.add("Mazda");

        // Methods: contains, remove, clear, size

        // Output will only show 1 instance of BMW in the list
        System.out.println(cars);

        // Check cars hashset contains Mazda
        System.out.println(cars.contains("Mazda"));

        return cars;
    }

    static void forLoop() {

        System.out.println("\n~~ FOR LOOP ~~");

        // Loop 10 times
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }

    }

    static void forEachLoop() {

        System.out.println("\n~~ FOR-EACH LOOP ~~");

        // Variation of for loop used to iterate through an array

        String[] cars = {"Volvo","BMW","Ford","Mazda"};

        // Loop through cars array
        for (String i : cars) {
            System.out.println(i);
        }

    }

    static void exceptionHandling() {

        System.out.println("\n~~ EXCEPTION HANDLING ~~");

        int[] values = {1,2,3};

        try {
            System.out.println(values[3]);
        } catch (Exception e) {
            System.out.println("ERROR! No value at index 3");
        } finally {
            System.out.println("Try Catch finished");
        }

    }

    /* ~~ METHODS LESSONS SPECIFICS STUFFS ~~ */

    static int addition(int x,int y) {
        return x+y;
    }
    static String greeting(String name,int age) {
        return "Hello "+name+"! You're "+age;
    }
    static String greeting(String name,int age,String favColour) {
        return "Hello "+name+"! You're "+age+". Your fav colour is "+favColour;
    }
    static void countDown(int startNumber) {

        int newNumber = startNumber - 1;

        if (newNumber > 0) {
            System.out.println(newNumber);
            countDown(newNumber);
        }

    }

}

/*
ALSO CHECK OUT
https://www.w3schools.com/java/default.asp
 */
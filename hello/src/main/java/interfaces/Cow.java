package interfaces;

public class Cow implements Animal{

    @Override
    public String animalSound() {
        System.out.println("MOOOOOOOOOO!");
        return "MOOOOOOOOOO!";
    }

    @Override
    public void sleep() {
        System.out.println("Moooozzzzzzz...");
    }

}

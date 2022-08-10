package interfaces;

public class Sheep implements Animal{

    @Override
    public String animalSound() {
        System.out.println("BAAAAAA Meep!");
        return "BAAAAAA Meep!";
    }

    @Override
    public void sleep() {
        System.out.println("Babababababababazzzzz");
    }

}

package interfaces;

public class Cat implements Animal{

    @Override
    public String animalSound() {
        System.out.println("Mew Prrrrr...");
        return "Mew Prrrrr...";
    }

    @Override
    public void sleep() {
        System.out.println("Prrrrr ZZZ...");
    }

}

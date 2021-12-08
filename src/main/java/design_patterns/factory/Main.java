package design_patterns.factory;

public class Main {

    public static void main(String[] args) {
        Speakable myDog = AnimalFactory.getAnimal("dog");
        System.out.println(myDog.speak());
    }
}

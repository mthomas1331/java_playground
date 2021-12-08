package design_patterns.factory;

public class AnimalFactory {
    public static Speakable getAnimal(String animal){
        switch (animal) {
            case "dog":
                return new Dog();
            case "cat":
                return new Cat();
            case "goldfish":
                return new Goldfish();
        }
        return null;
    }
}

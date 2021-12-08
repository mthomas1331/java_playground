package oop.animal_farm;

public class Dog extends Animal implements Canine {

    public Dog() {
        super(4);
    }

    @Override
    public String eat() {
        return null;
    }

    @Override
    public String sound() {
        return null;
    }

    @Override
    public String hunt() {
        return "Hunting small creatures";
    }

    @Override
    public String run(String speed) {
        return "I am going at " + speed + "m/s";
    }

    @Override
    public String tricks(String trick) {
        return trick;
    }
}

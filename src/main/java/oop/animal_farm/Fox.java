package oop.animal_farm;

public class Fox extends Animal implements Canine {

    public Fox() {
        super(4);
    }

    @Override
    public String eat() {
        return "anything!!!";
    }

    @Override
    public String sound() {
        return "What does the fox say?";
    }

    public static void main(String[] args) {
        Fox fox = new Fox();
        fox.sleep();
        System.out.println(fox.sound());
        System.out.println(fox.eat());
    }

    @Override
    public String hunt() {
        return "hunting";
    }

    @Override
    public String run(String speed) {
        return speed;
    }

    @Override
    public String tricks(String trick) {
        return trick;
    }
}

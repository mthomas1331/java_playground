package oop.animal_farm;

public abstract class Animal {
    private int legs;

    public Animal(int legs) {
        this.legs = legs;
    }

    public abstract String eat();
    public abstract String sound();

    public void sleep(){
        System.out.println("I am sleeping!!!");
    }

    public int getLegs() {
        return legs;
    }
}

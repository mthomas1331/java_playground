package oop.animal_farm;

import java.util.ArrayList;
import java.util.List;

public class AnimalSanctuary {
    private Dog max = new Dog();
    private Dog min = new Dog();
    private Fox alpha = new Fox();
    private Fox beta = new Fox();
    private List<Animal> animalsInTheSanctuary = new ArrayList<>();
    private List<Fox> foxesInTheSanctuary = new ArrayList<>();


    public AnimalSanctuary(){
        foxesInTheSanctuary.add(this.alpha);
        foxesInTheSanctuary.add(this.beta);

        animalsInTheSanctuary.add(this.max);
        animalsInTheSanctuary.add(this.min);
    }

}

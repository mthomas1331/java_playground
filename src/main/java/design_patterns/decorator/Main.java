package design_patterns.decorator;

import design_patterns.decorator.pizzas.Italian;
import design_patterns.decorator.sides.Chips;
import design_patterns.decorator.sides.Salad;

public class Main {
    public static void main(String[] args) {
        Italian italian = new Italian();
        System.out.println(italian.getDescription() + " Cost: " + italian.getCost());

        Salad salad = new Salad(italian);
        System.out.println(salad.getDescription() + " Cost: " + salad.getCost());

        Chips chips = new Chips(italian);
        System.out.println(chips.getDescription() + " Cost: " + chips.getCost());
    }
}

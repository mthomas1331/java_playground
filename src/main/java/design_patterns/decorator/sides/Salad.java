package design_patterns.decorator.sides;

import design_patterns.decorator.pizzas.Pizza;

public class Salad extends Sides{

    public Salad(Pizza pizza) {
        super(pizza);
    }

    @Override
    public double getCost() {
        return pizza.getCost() + 10;
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + " and salad";
    }
}

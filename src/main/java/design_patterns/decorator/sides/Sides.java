package design_patterns.decorator.sides;

import design_patterns.decorator.pizzas.Pizza;

public abstract class Sides extends Pizza {
    protected Pizza pizza;

    public Sides(Pizza pizza) {
        this.pizza = pizza;
    }

    public abstract String getDescription();

}

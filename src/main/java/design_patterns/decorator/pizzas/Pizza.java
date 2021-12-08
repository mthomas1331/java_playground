package design_patterns.decorator.pizzas;

public abstract class Pizza {
    private String description;
    private double cost;

    public String getDescription() {
        return description;
    }

    public double getCost() {
        return cost;
    }
}

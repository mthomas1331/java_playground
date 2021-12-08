package design_patterns.decorator.pizzas;

public class Chicago extends Pizza {
    @Override
    public String getDescription() {
        return "Chicago Pizza";
    }

    @Override
    public double getCost() {
        return 30;
    }
}

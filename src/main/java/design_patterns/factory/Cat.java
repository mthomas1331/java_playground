package design_patterns.factory;

public class Cat implements Speakable{
    @Override
    public String speak() {
        return "Meow";
    }
}

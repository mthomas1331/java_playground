package design_patterns.singleton;

public class Start {

    public static void main(String[] args) {
        Singleton sing1 = Singleton.getSingleton();
        Singleton sing2 = Singleton.getSingleton();

        System.out.println(sing1);
        System.out.println(sing2);


    }
}

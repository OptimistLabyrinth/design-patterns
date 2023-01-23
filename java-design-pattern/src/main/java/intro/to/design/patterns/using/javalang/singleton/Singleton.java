package intro.to.design.patterns.using.javalang.singleton;

public class Singleton {
    private static final Singleton instance = new Singleton();

    private Singleton() {
        System.out.println("created singleton instance");
    }

    public static Singleton getInstance() {
        return instance;
    }
}

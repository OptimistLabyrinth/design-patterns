package intro.to.design.patterns.using.javalang.singleton;

import java.util.Objects;

public class SingletonMain {
    public static void main(String[] args) {
        System.out.println("Start");
        Singleton obj1 = Singleton.getInstance();
        Singleton obj2 = Singleton.getInstance();
        if (Objects.equals(obj1, obj2)) {
            System.out.println("obj1 and obj2 are the same instance");
        } else {
            System.out.println("obj1 and obj2 are two different instances");
        }
        System.out.println("End");
    }
}

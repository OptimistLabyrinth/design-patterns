package intro.to.design.patterns.using.javalang.adapter;

public class AdapterMain {
    public static void main(String[] args) {
        Print p = new PrintBanner("Hello");
        p.printWeak();
        p.printStrong();
    }
}

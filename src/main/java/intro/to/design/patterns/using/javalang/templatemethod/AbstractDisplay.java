package intro.to.design.patterns.using.javalang.templatemethod;

public abstract class AbstractDisplay {
    private static final int LOOP_COUNT = 5;
    protected abstract void open();
    protected abstract void print();
    protected abstract void close();

    public final void display() {
        open();
        for (int i = 0; i < LOOP_COUNT; i++) {
            print();
        }
        close();
    }
}

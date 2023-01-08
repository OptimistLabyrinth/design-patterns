package intro.to.design.patterns.using.javalang.templatemethod;

public class StringDisplay extends AbstractDisplay {
    private final String string;
    private final int width;

    public StringDisplay(String string) {
        this.string = string;
        this.width = string.length();
    }

    private void printLine() {
        System.out.print("+");
        for (int i = 0; i < width + 2; ++i) {
            System.out.print("-");
        }
        System.out.println("+");
    }

    @Override
    public void open() {
        printLine();
    }

    @Override
    public void print() {
        System.out.println("| " + string + " |");
    }

    @Override
    public void close() {
        printLine();
    }
}

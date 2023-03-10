package intro.to.design.patterns.using.javalang.prototype.framework.product;

public class MessageBox implements Product {
    private final char decoChar;

    public MessageBox(char decoChar) {
        this.decoChar = decoChar;
    }

    public MessageBox(MessageBox other) {
        decoChar = other.decoChar;
    }

    @Override
    public void use(String s) {
        int decolen = 2 + s.length() + 2;
        for (int i = 0; i < decolen; ++i) {
            System.out.print(decoChar);
        }
        System.out.println();
        System.out.println(decoChar + " " + s + " " + decoChar);
        for (int i = 0; i < decolen; ++i) {
            System.out.print(decoChar);
        }
        System.out.println();
    }

    @Override
    public Product createCopy() {
        return new MessageBox(this);
    }
}

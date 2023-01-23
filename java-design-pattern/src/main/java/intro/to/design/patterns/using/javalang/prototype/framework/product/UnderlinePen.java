package intro.to.design.patterns.using.javalang.prototype.framework.product;

public class UnderlinePen extends Product {
    private final char ulChar;

    public UnderlinePen(char ulChar) {
        this.ulChar = ulChar;
    }

    public UnderlinePen(UnderlinePen other) {
        ulChar = other.ulChar;
    }

    @Override
    public void use(String s) {
        int ulen = s.length();
        System.out.println(s);
        for (int i = 0; i < ulen; ++i) {
            System.out.print(ulChar);
        }
        System.out.println();
    }
}

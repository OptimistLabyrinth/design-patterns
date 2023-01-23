package intro.to.design.patterns.using.javalang.prototype.framework.product;

public abstract class Product implements Cloneable {
    public abstract void use(String s);
    public Product createCopy() {
        Product p = null;
        try {
            p = (Product) clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
        return p;
    }
}

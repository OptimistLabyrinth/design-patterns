package intro.to.design.patterns.using.javalang.prototype.framework.product;

public interface Product extends Cloneable {
    public abstract void use(String s);
    public Product createCopy();
}

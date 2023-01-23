package intro.to.design.patterns.using.javalang.prototype.framework.product;

public interface Product extends Cloneable {
    void use(String s);
    Product createCopy();
}

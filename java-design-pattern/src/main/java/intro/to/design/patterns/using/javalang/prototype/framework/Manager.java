package intro.to.design.patterns.using.javalang.prototype.framework;

import intro.to.design.patterns.using.javalang.prototype.framework.product.Product;
import intro.to.design.patterns.using.javalang.prototype.framework.product.ProductKeyType;

import java.util.HashMap;
import java.util.Map;

public class Manager {
    private final Map<ProductKeyType, Product> showCase = new HashMap<>();

    public void register(ProductKeyType keyType, Product prototype) {
        showCase.put(keyType, prototype);
    }

    public Product create(ProductKeyType keyType) {
        Product p = showCase.get(keyType);
        return p.createCopy();
    }
}

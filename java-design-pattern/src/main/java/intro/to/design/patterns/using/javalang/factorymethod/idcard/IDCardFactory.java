package intro.to.design.patterns.using.javalang.factorymethod.idcard;

import intro.to.design.patterns.using.javalang.factorymethod.framework.Factory;
import intro.to.design.patterns.using.javalang.factorymethod.framework.Product;

public class IDCardFactory extends Factory {
    @Override
    protected Product createProduct(String owner) {
        return new IDCard(owner);
    }

    @Override
    protected void registerProduct(Product product) {
        System.out.println("now registered " + product);
    }
}

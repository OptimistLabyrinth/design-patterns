package intro.to.design.patterns.using.javalang.factorymethod.creditcard;

import intro.to.design.patterns.using.javalang.factorymethod.framework.Factory;
import intro.to.design.patterns.using.javalang.factorymethod.framework.Product;

public class CreditCardFactory extends Factory {
    @Override
    protected Product createProduct(String owner) {
        return new CreditCard(owner);
    }

    @Override
    protected void registerProduct(Product product) {
        System.out.println("now registered " + product);
    }
}

package intro.to.design.patterns.using.javalang.factorymethod.creditcard;

import intro.to.design.patterns.using.javalang.factorymethod.framework.Product;

public class CreditCard extends Product {
    private final String owner;

    CreditCard(String owner) {
        System.out.println("created credit card of " + owner);
        this.owner = owner;
    }

    @Override
    public void use() {
        System.out.println("using " + this);
    }

    public String getOwner() {
        return owner;
    }

    @Override
    public String toString() {
        return "CreditCard{" +
                "owner='" + owner + '\'' +
                '}';
    }
}

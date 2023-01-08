package intro.to.design.patterns.using.javalang.factorymethod.idcard;

import intro.to.design.patterns.using.javalang.factorymethod.framework.Product;

public class IDCard extends Product {
    private final String owner;

    IDCard(String owner) {
        System.out.println("created id card of " + owner);
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
        return "IDCard{" +
                "owner='" + owner + '\'' +
                '}';
    }
}

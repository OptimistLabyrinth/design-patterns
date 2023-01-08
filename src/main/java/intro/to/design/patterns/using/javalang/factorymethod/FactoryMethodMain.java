package intro.to.design.patterns.using.javalang.factorymethod;

import intro.to.design.patterns.using.javalang.factorymethod.creditcard.CreditCardFactory;
import intro.to.design.patterns.using.javalang.factorymethod.framework.Factory;
import intro.to.design.patterns.using.javalang.factorymethod.framework.Product;
import intro.to.design.patterns.using.javalang.factorymethod.idcard.IDCardFactory;

import java.util.ArrayList;
import java.util.Arrays;

public class FactoryMethodMain {
    public static void main(String[] args) {
        Factory idCardFactory = new IDCardFactory();
        Factory creditCardFactory = new CreditCardFactory();
        ArrayList<Product> cards = new ArrayList<>(Arrays.asList(
                idCardFactory.create("Youngjin Kim"),
                idCardFactory.create("Heunmin Son"),
                creditCardFactory.create("Kane Watson"),
                creditCardFactory.create("Draco Malfoy"),
                creditCardFactory.create("John Doe")
        ));
        System.out.println();

        cards.forEach(Product::use);
    }
}

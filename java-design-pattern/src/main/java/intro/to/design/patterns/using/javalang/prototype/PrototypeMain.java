package intro.to.design.patterns.using.javalang.prototype;

import intro.to.design.patterns.using.javalang.prototype.framework.Manager;
import intro.to.design.patterns.using.javalang.prototype.framework.product.*;

public class PrototypeMain {
    public static void main(String[] args) {
        Manager manager = new Manager();
        UnderlinePen underlinePen = new UnderlinePen('-');
        MessageBox messageBox1 = new MessageBox('*');
        MessageBox messageBox2 = new MessageBox('|');

        manager.register(UnderlinePenKeyType.STRONG_MESSAGE, underlinePen);
        manager.register(MessageBoxKeyType.WARNING_BOX, messageBox1);
        manager.register(MessageBoxKeyType.VERTICAL_LINE_BOX, messageBox2);

        Product p1 = manager.create(UnderlinePenKeyType.STRONG_MESSAGE);
        p1.use("Hello, World!");
        System.out.println();

        Product p2 = manager.create(MessageBoxKeyType.WARNING_BOX);
        p2.use("Hello, World!");
        System.out.println();

        Product p3 = manager.create(MessageBoxKeyType.VERTICAL_LINE_BOX);
        p3.use("Hello, World!");
    }
}

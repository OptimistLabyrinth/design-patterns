package intro.to.design.patterns.using.javalang.abstractfactory.listfactory;

import intro.to.design.patterns.using.javalang.abstractfactory.factory.Item;
import intro.to.design.patterns.using.javalang.abstractfactory.factory.Tray;

public class ListTray extends Tray {
    public ListTray(String caption) {
        super(caption);
    }

    @Override
    public String makeHtml() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("<li>\n");
        stringBuilder.append(caption).append("\n");
        stringBuilder.append("<ul>\n");
        for (final Item item : tray) {
            stringBuilder.append(item.makeHtml());
        }
        stringBuilder.append("</ul>\n");
        stringBuilder.append("</li>\n");
        return stringBuilder.toString();
    }
}

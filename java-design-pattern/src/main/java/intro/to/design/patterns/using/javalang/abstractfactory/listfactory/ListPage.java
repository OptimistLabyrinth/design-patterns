package intro.to.design.patterns.using.javalang.abstractfactory.listfactory;

import intro.to.design.patterns.using.javalang.abstractfactory.factory.Item;
import intro.to.design.patterns.using.javalang.abstractfactory.factory.Page;

public class ListPage extends Page {
    public ListPage(String title, String author) {
        super(title, author);
    }

    @Override
    public String makeHtml() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("<!DOCTYPE html>\n");
        stringBuilder.append("<html>\n");
        stringBuilder.append("<head><title>\n");
        stringBuilder.append(title);
        stringBuilder.append("</title></head>\n");
        stringBuilder.append("<body>\n");
        stringBuilder.append("<h1>");
        stringBuilder.append(title);
        stringBuilder.append("</h1>\n");
        stringBuilder.append("<url>\n");
        for (final Item item : content) {
            stringBuilder.append(item.makeHtml());
        }
        stringBuilder.append("</url>\n");
        stringBuilder.append("<address>\n");
        stringBuilder.append(author);
        stringBuilder.append("</address>\n");
        stringBuilder.append("</body>\n");
        stringBuilder.append("</html>\n");
        return stringBuilder.toString();
    }
}

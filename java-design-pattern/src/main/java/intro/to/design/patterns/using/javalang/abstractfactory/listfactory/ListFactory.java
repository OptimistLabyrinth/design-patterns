package intro.to.design.patterns.using.javalang.abstractfactory.listfactory;

import intro.to.design.patterns.using.javalang.abstractfactory.factory.Factory;
import intro.to.design.patterns.using.javalang.abstractfactory.factory.Link;
import intro.to.design.patterns.using.javalang.abstractfactory.factory.Page;
import intro.to.design.patterns.using.javalang.abstractfactory.factory.Tray;

public class ListFactory extends Factory {
    @Override
    public Link createLink(String caption, String url) {
        return new ListLink(caption, url);
    }

    @Override
    public Tray createTray(String caption) {
        return new ListTray(caption);
    }

    @Override
    public Page createPage(String title, String author) {
        return new ListPage(title, author);
    }
}

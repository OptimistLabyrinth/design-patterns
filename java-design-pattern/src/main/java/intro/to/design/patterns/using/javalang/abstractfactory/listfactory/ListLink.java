package intro.to.design.patterns.using.javalang.abstractfactory.listfactory;

import intro.to.design.patterns.using.javalang.abstractfactory.factory.Link;

public class ListLink extends Link {
    public ListLink(String caption, String url) {
        super(caption, url);
    }

    @Override
    public String makeHtml() {
        return String.format("  <li><a href=\"%s\">%s</a></li>\n", url, caption);
    }
}

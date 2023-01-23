package intro.to.design.patterns.using.javalang.abstractfactory;

import intro.to.design.patterns.using.javalang.abstractfactory.factory.Factory;
import intro.to.design.patterns.using.javalang.abstractfactory.factory.Link;
import intro.to.design.patterns.using.javalang.abstractfactory.factory.Page;
import intro.to.design.patterns.using.javalang.abstractfactory.factory.Tray;
import intro.to.design.patterns.using.javalang.abstractfactory.listfactory.ListFactory;

import java.util.Scanner;

public class AbstractFactoryMain {
    private static String fileName = "";
    private static String className = null;

    public static void main(String[] args) {
        getSelectedOption();

        if (className == null || className.isEmpty()) {
            usage();
            System.exit(0);
        }

        Factory factory = Factory.getFactory(className);

        Link blog1 = factory.createLink("Blog 1", "https://www.example.com/blog1");
        Link blog2 = factory.createLink("Blog 2", "https://www.example.com/blog2");
        Link blog3 = factory.createLink("Blog 3", "https://www.example.com/blog3");

        Tray blogTray = factory.createTray("Blog Site");
        blogTray.add(blog1);
        blogTray.add(blog2);
        blogTray.add(blog3);

        Link news1 = factory.createLink("News 1", "https://www.example.com/news1");
        Link news2 = factory.createLink("News 2", "https://www.example.com/news2");
        Tray news3 = factory.createTray("News 3");
        news3.add(factory.createLink("News 3 (US)", "https://www.example.com/news3us"));
        news3.add(factory.createLink("News 3 (KR)", "https://www.example.com/news3kr"));

        Tray newsTray = factory.createTray("News Site");
        newsTray.add(news1);
        newsTray.add(news2);
        newsTray.add(news3);

        Page page = factory.createPage("Blog and News", "Youngjin.com");
        page.add(blogTray);
        page.add(newsTray);

        page.output(fileName);
    }

    private static void getSelectedOption() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("select option: ");
        String option = scanner.nextLine();
        option = option.trim();
        String fileNameTmp = "";
        if (option.equals("1") || option.equals("list")) {
            fileNameTmp = "list.html";
            className = ListFactory.class.getCanonicalName();
            System.out.println("className: " + className);
        } else if (option.equals("2") || option.equals("div")) {
            fileNameTmp = "div.html";
//            className = DivFactory.class.getCanonicalName();
        }
        fileName = "src/main/java/intro/to/design/patterns/using/javalang/abstractfactory" + "/" + fileNameTmp;
    }

    private static void usage() {
        System.out.println("Usage: java Main fileName.html class.name.of.Concrete.Factory");
        System.out.println("< Select Options >");
        System.out.println("   1: list");
        System.out.println("   2: div");
    }
}

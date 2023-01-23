package intro.to.design.patterns.using.javalang.builder;

import java.util.Scanner;

public class BuilderMain {
    public static void main(String[] args) {
        final String userInput = readUserInput();
        if (userInput.equals("text")) {
            TextBuilder builder = new TextBuilder();
            Director director = new Director(builder);
            director.construct();
            String result = builder.getTextResult();
            System.out.println(result);
        } else if (userInput.equals("html")) {
            HtmlBuilder builder = new HtmlBuilder();
            Director director = new Director(builder);
            director.construct();
            String fileName = builder.getHtmlResult();
            System.out.printf("successfully created HTML file %s", fileName);
        } else {
            usage();
            System.exit(0);
        }
    }

    private static String readUserInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("select type: ");
        return scanner.nextLine();
    }

    private static void usage() {
        System.out.println("Usage: java Main text");
        System.out.println("Usage: java Main html");
    }
}

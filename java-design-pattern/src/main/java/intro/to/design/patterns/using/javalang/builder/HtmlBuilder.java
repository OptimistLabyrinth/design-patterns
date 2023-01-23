package intro.to.design.patterns.using.javalang.builder;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class HtmlBuilder implements Builder {
    private String fileName = "untitled.html";
    private final StringBuilder stringBuilder = new StringBuilder();

    @Override
    public void makeTitle(String title) {
        fileName = String.format("%s.html", title);
        stringBuilder.append("<!DOCTYPE html>\n");
        stringBuilder.append("<html>\n");
        stringBuilder.append("<head><title>");
        stringBuilder.append(title);
        stringBuilder.append("</title></head>\n");
        stringBuilder.append("<body>\n");
        stringBuilder.append("<h1>");
        stringBuilder.append(title);
        stringBuilder.append("</h1>\n\n");
    }

    @Override
    public void makeString(String str) {
        stringBuilder.append("<p>\n");
        stringBuilder.append(str).append("\n");
        stringBuilder.append("</p>\n\n");
    }

    @Override
    public void makeItems(String[] items) {
        stringBuilder.append("<ul>\n");
        for (final String s : items) {
            stringBuilder.append("<li>");
            stringBuilder.append(s);
            stringBuilder.append("</li>");
        }
        stringBuilder.append("</ul>\n\n");
    }

    @Override
    public void close() {
        stringBuilder.append("</body>\n");
        stringBuilder.append("</html>\n");
        try {
            final String targetDirectory = "src/main/java/intro/to/design/patterns/using/javalang/builder";
            Writer writer = new FileWriter(targetDirectory + "/" + fileName);
            writer.write(stringBuilder.toString());
            writer.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public String getHtmlResult() {
        return fileName;
    }
}

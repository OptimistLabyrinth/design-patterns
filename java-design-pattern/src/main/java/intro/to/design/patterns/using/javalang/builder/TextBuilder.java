package intro.to.design.patterns.using.javalang.builder;

public class TextBuilder implements Builder {
    private final StringBuilder stringBuilder = new StringBuilder();

    @Override
    public void makeTitle(String title) {
        stringBuilder.append("==============================\n");
        stringBuilder.append("[");
        stringBuilder.append(title);
        stringBuilder.append("]");
    }

    @Override
    public void makeString(String str) {
        stringBuilder.append("◼️");
        stringBuilder.append(str);
        stringBuilder.append("\n\n");
    }

    @Override
    public void makeItems(String[] items) {
        for (final String s : items) {
            stringBuilder.append(" -");
            stringBuilder.append(s);
            stringBuilder.append("\n");
        }
        stringBuilder.append("\n");
    }

    @Override
    public void close() {
        stringBuilder.append("==============================\n");
    }

    public String getTextResult() {
        return stringBuilder.toString();
    }
}

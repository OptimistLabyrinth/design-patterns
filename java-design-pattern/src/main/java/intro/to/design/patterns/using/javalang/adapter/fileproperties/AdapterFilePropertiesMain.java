package intro.to.design.patterns.using.javalang.adapter.fileproperties;

import java.io.IOException;

public class AdapterFilePropertiesMain {
    public static void main(String[] args) {
        AdapterFilePropertiesMain adapterFilePropertiesMain = new AdapterFilePropertiesMain();
        adapterFilePropertiesMain.setFileProperties();
        adapterFilePropertiesMain.getFileProperties();
    }

    private void setFileProperties() {
        FileIO f = new FileProperties();
        try {
            String filename = "src/main/java/intro/to/design/patterns/using/javalang/adapter/fileproperties/abc.txt";
            f.readFromFile(filename);
            f.setValue("width", "1024");
            f.setValue("height", "512");
            f.setValue("depth", "32");
            f.writeToFile(filename);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void getFileProperties() {
        FileIO f = new FileProperties();
        try {
            String filename = "src/main/java/intro/to/design/patterns/using/javalang/adapter/fileproperties/abc.txt";
            f.readFromFile(filename);
            String width = f.getValue("width");
            String height = f.getValue("height");
            String depth = f.getValue("depth");
            System.out.printf("width: %s\n", width);
            System.out.printf("height: %s\n", height);
            System.out.printf("depth: %s%n\n", depth);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

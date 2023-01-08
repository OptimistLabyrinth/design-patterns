package intro.to.design.patterns.using.javalang.adapter.fileproperties;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.Map;

public class FileProperties implements FileIO {
    private static final String SPLIT_DELIMITER = ": ";
    private final Map<String, String> properties;

    public FileProperties() {
        this.properties = new HashMap<>();
    }

    private String absoluteFilename(String filename) {
        Path currentPath = Paths.get("");
        return currentPath.toAbsolutePath().toString() + '/' + filename;
    }

    @Override
    public void readFromFile(String filename) throws IOException {
        try (BufferedReader bufferedReader =
                     new BufferedReader(
                             new InputStreamReader(
                                     new FileInputStream(new File(absoluteFilename(filename)).getCanonicalPath())))) {
            properties.clear();
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                String[] tokens = line.split(SPLIT_DELIMITER, 2);
                if (tokens.length < 2) {
                    continue;
                }
                properties.put(tokens[0], tokens[1]);
            }
        } catch (FileNotFoundException e) {
            System.out.println("no such file");
        }
    }

    @Override
    public void writeToFile(String filename) throws IOException {
        String targetFilename = absoluteFilename(filename);
        Path targetPath = Paths.get(targetFilename);
        if (Files.notExists(targetPath)) {
            Files.createFile(targetPath);
        }
        try (BufferedWriter bufferedWriter
                     = new BufferedWriter(
                             new OutputStreamWriter(
                                     new FileOutputStream(new File(targetFilename).getCanonicalPath())))) {
            bufferedWriter.write("# written by FileProperties\n");
            LocalDateTime localDateTime = LocalDateTime.now();
            bufferedWriter.write(
                    String.format("# %s\n",
                            localDateTime.format(DateTimeFormatter.ofPattern("yyyy-MM-dd (EEE), HH:mm:ss"))));
            for (Map.Entry<String, String> entry : properties.entrySet()) {
                String line = entry.getKey() + SPLIT_DELIMITER + entry.getValue() + '\n';
                bufferedWriter.write(line);
            }
        }
    }

    @Override
    public void setValue(String key, String value) {
        properties.put(key, value);
    }

    @Override
    public String getValue(String key) {
        return properties.get(key);
    }
}

// FileHandler

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileHandler {
    private List<String> lines;

    public FileHandler() {
        lines = new ArrayList<>();
    }

    public List<String> loadFileContent(String filePath) {
        if (!isPathEmpty(filePath)) {
            return readFileContent(filePath);
        }
        return new ArrayList<>();
    }

    private boolean isPathEmpty(String filePath) {
        return filePath == null || filePath.trim().isEmpty();
    }

    private List<String> readFileContent(String filePath) {
        List<String> fileContent = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                fileContent.add(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return fileContent;
    }
}

package Main.ex1;


import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileHandler {
    private List<String> lines;

    public FileHandler() {
        lines = new ArrayList<>();

    }

    public List<String> load(String path) throws IOException {
        if (path == null || path.length() < 1) {
            System.err.println("Nombre no válido");
            return null;
        }
        BufferedReader input = null;
        File file = new File(path);
        if (file.exists()) {
            System.err.println("No existe e archivo");
            return null;
        }
        try {
            input = new BufferedReader(new FileReader(file));
            while (input.ready()) {
                String line = input.readLine();
                this.lines.add(line);

            }
        } catch (FileNotFoundException e) {
            System.err.println("No se encuentra el archivo");
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            if (input != null) {
                try {
                    input.close();

                } catch (IOException e) {
                    System.err.println();
                }
            }
        }

        return this.lines;
    }

}



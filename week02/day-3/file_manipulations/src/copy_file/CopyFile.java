package copy_file;

import java.io.IOException;
import java.nio.file.*;
import java.util.ArrayList;
import java.util.List;

public class CopyFile {
    public static void main(String[] args) {
        // Write a function that copies the contents of a file into another
        // It should take the filenames as parameters
        // It should return a boolean that shows if the copy was successful

        System.out.println(copyFile("copy_from.txt", "copy_to.txt"));

    }

    public static List<String> readFile(String fileName) throws IOException {
        List<String> lines = new ArrayList<>();

            Path filePath = Paths.get(fileName);
            lines = Files.readAllLines(filePath);

        return lines;
    }

    public static void writeFile(String fileName, List<String> lines) throws IOException {

            Path filePath = Paths.get(fileName);
            Files.write(filePath, lines);

    }

    public static boolean copyFile(String input, String output){
        try {
            writeFile(output, readFile(input));
        }catch (IOException e){
            System.out.println("IOException");
            return false;
        }
        return true;
    }
}

package doubled;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Doubled {
    public static void main(String[] args) {
        // Create a method that decrypts the duplicated-chars.txt

        writeFile("doubled.txt", "doubled_cleaned.txt");
//        System.out.println(cleanDoubleCharacters(fileName));

    }

    public static List<String> readFile(String fileName) throws IOException {
        List<String> lines = new ArrayList<>();

        Path filePath = Paths.get(fileName);
        lines = Files.readAllLines(filePath);

        return lines;
    }

    public static List<String> cleanDoubleCharacters(List<String> lines) throws IOException {

        ArrayList<String> singleCharacters = new ArrayList<>();

        for (int i = 0; i < lines.size(); i++) {
            StringBuilder builder = new StringBuilder();
            for (int j = 0; j < lines.get(i).length(); j += 2) {
                builder.append(lines.get(i).charAt(j));
            }
            singleCharacters.add(builder.toString());

        }return singleCharacters;
    }

    public static void writeFile(String input, String output){

        try {
            List<String> characters = cleanDoubleCharacters(readFile(input));
            Path filePath = Paths.get(output);
            Files.write(filePath, characters);
        } catch (IOException e) {
            System.out.println("Uh-oh, could not write the file!");
            System.exit(2);
        }
    }
}

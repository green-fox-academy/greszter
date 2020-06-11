package reverse_lines;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class ReverseLines {
  public static void main(String[] args) {

    processByLines("reverse_lines.txt");
  }

  public static List<String> readFile(String fileName) {
    List<String> lines = new ArrayList<>();

    try {
      Path filePath = Paths.get(fileName);
      lines = Files.readAllLines(filePath);
    } catch (IOException e) {
      System.out.println("The file does not exist");
      System.exit(2);
    }
    return lines;
  }

  public static void processByLines(String fileName) {
    List<String> lines = new ArrayList<>();
    lines = readFile(fileName);
    List<String> reversedLines = new ArrayList<>();

    for (String line : lines) {
      StringBuilder builder = new StringBuilder();
      line.toCharArray();
      for (int i = 0; i < line.length(); i++) {
        builder.append(line.charAt(line.length() - i - 1));
      }
      reversedLines.add(builder.toString());
    }

    writeFile("re-reverse_lines.txt", reversedLines);
  }

  public static void writeFile(String fileName, List<String> newLines) {
    try {
      Path filePath = Paths.get(fileName);
      Files.write(filePath, newLines);
    } catch (IOException e) {
      System.out.println("Uh-oh, could not write the file!");
      System.exit(2);
    }
  }


}

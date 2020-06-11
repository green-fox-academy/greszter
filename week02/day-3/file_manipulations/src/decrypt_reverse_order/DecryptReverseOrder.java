package decrypt_reverse_order;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class DecryptReverseOrder {
  public static void main(String[] args) {
    // Create a method that decrypts reversed-order.txt

    reverse("reverse_order.txt");

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

  public static void reverse(String fileName){
    List<String> original = new ArrayList<>();
    original = readFile(fileName);

    List<String> newLines = new ArrayList<>();
    for (int i = 0; i < original.size(); i++) {
      newLines.add(original.get(original.size() - i - 1));
    }
    writeFile("re-reversed_order.txt", newLines);
  }

  public static void writeFile(String fileName, List<String> newLines){
    try {
      Path filePath = Paths.get(fileName);
      Files.write(filePath, newLines);
    } catch (IOException e) {
      System.out.println("Uh-oh, could not write the file!");
      System.exit(2);
    }
  }
}

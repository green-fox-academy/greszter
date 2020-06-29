package exercise11;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class Exercise11 {
  public static void main(String[] args) {
//    Create a Stream expression which reads all text from this file, and prints the 100 most common
//    words in descending order. Keep in mind that the text contains punctuation characters which
//    should be ignored. The result should be something like this:


    try {
      Map<String, Long> wordFrequency = Files.lines(Paths.get("RandomWikiArticle.txt"))
          .map(line -> line.toLowerCase().split("[\\s]+"))
          .flatMap(Arrays::stream)
          .filter(w -> !w.isEmpty())
          .collect(Collectors.groupingBy(w -> w, Collectors.counting()))
          .entrySet()
          .stream()
          .sorted((Map.Entry<String, Long> a, Map.Entry<String, Long> a2) -> a2.getValue().compareTo(a.getValue()))
          .limit(10)
          .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));

      System.out.println(wordFrequency.entrySet());

    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}

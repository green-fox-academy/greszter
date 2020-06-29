package exercise9;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class Exercise9 {
  public static void main(String[] args) {
//    Write a Stream Expression to find the frequency of characters in a given string!

    String example = "Write a Stream Expression to find the frequency of characters in a given string!";

    Map<String, Long> frequency = Arrays.stream(example.toLowerCase().split(""))
        .collect(Collectors.groupingBy(c -> c, Collectors.counting()));

    System.out.println(frequency.entrySet());

  }
}

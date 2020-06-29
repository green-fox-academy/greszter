package exercise10;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Exercise10 {
  public static void main(String[] args) {
    List<Fox> foxList = Arrays.asList(
        new Fox("fox1", Color.GREEN, 12),
        new Fox("fox2", Color.RED, 35),
        new Fox("fox3", Color.YELLOW, 13),
        new Fox("fox4", Color.GREEN, 3),
        new Fox("fox5", Color.BLUE, 10));

    foxList.stream()
        .filter(f -> f.getColor() == Color.GREEN)
        .forEach(f -> System.out.println(f.getName()));

    foxList.stream()
        .filter(f -> f.getColor() == Color.GREEN)
        .filter(f -> f.getAge() < 5)
        .forEach(f -> System.out.println(f.getName()));

    Map<Color, Long> frequency = foxList.stream()
        .collect(Collectors.groupingBy(f -> f.getColor(), Collectors.counting()));

    System.out.println(frequency.entrySet());

  }

}
//  Create a Fox class with 3 properties:name, color and age Fill a list with at least 5 foxes and:
//
//    Write a Stream Expression to find the foxes with green color!
//    Write a Stream Expression to find the foxes with green color, and age less then 5 years!
//    Write a Stream Expression to find the frequency of foxes by color!

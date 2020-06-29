package exercise6;

import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;

public class Exercise6 {
  public static void main(String[] args) {
//    Write a Stream Expression to find the uppercase characters in a string!

    String example = "Write a Stream Expression to find the uppercase characters in a string!";

    String upperCase = example.chars()
        .filter(Character::isUpperCase)
        .collect(StringBuilder::new,
            StringBuilder::appendCodePoint,
            StringBuilder::append)
        .toString();
    System.out.println("The uppercase characters are " + upperCase);

  }
}

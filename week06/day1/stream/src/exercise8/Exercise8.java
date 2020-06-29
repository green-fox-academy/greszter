package exercise8;

import java.util.Arrays;
import java.util.List;

public class Exercise8 {
  public static void main(String[] args) {
//    Write a Stream Expression to concatenate a Character list to a string!,

    List<Character> characters = Arrays.asList('a', 'b', 'c', 'd', 'e');

    String characterList = characters.stream()
        .collect(StringBuilder::new,
            StringBuilder::appendCodePoint,
            StringBuilder::append)
        .toString();

    System.out.println(characterList);

  }
}

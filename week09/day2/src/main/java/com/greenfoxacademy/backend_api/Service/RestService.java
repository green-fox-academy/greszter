package com.greenfoxacademy.backend_api.Service;

import com.greenfoxacademy.backend_api.Models.Appended;
import com.greenfoxacademy.backend_api.Models.ArrayHandler;
import com.greenfoxacademy.backend_api.Models.ArrayResult;
import com.greenfoxacademy.backend_api.Models.DoublingResult;
import com.greenfoxacademy.backend_api.Models.ErrorMessage;
import com.greenfoxacademy.backend_api.Models.Result;
import com.greenfoxacademy.backend_api.Models.SithInput;
import com.greenfoxacademy.backend_api.Models.SithOutput;
import com.greenfoxacademy.backend_api.Models.WelcomeMessage;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import org.springframework.stereotype.Service;

@Service
public class RestService {


  public DoublingResult doubling(Integer input) {
    return new DoublingResult(input, input * 2);
  }

  public ErrorMessage doublingError() {
    return new ErrorMessage("Please provide an input!");
  }

  public WelcomeMessage greeting(String name, String title) {
    return new WelcomeMessage(name, title);
  }

  public ErrorMessage greetingError(String name, String title) {
    if (name == null && title == null) {
      return new ErrorMessage("Please provide a name and a title!");
    } else if (name == null && title != null) {
      return new ErrorMessage("Please provide a name!");
    } else {
      return new ErrorMessage("Please provide a title!");
    }
  }

  public Appended appendA(String appendable) {
    return new Appended(appendable);
  }

  public Result sumUntil(Integer number) {
    int result = 0;
    for (int i = 0; i <= number; i++) {
      result += i;
    }
    return new Result(result);
  }

  public Result factorUntil(Integer number) {
    int result = 1;
    for (int i = 1; i <= number; i++) {
      result = result * i;
    }
    return new Result(result);
  }

  public ErrorMessage dountilError() {
    return new ErrorMessage("Please provide a number!");
  }

  public Result handleArray(ArrayHandler arrayHandler) {
    int[] numbers = arrayHandler.getNumbers();
    int result = 0;
    if (arrayHandler.getWhat().equals("sum")) {
      for (int i = 0; i < numbers.length; i++) {
        result += numbers[i];
      }
      return new Result(result);
    } else if (arrayHandler.getWhat().equals("multiply")) {
      result = 1;
      for (int i = 0; i < numbers.length; i++) {
        result = result * numbers[i];
      }
      return new Result(result);
    }
    return null;
  }

  public ArrayResult handleArrayIfDouble(ArrayHandler arrayHandler) {
    int[] numbers = arrayHandler.getNumbers();
    int[] doubledNumbers = new int[numbers.length];
    for (int i = 0; i < numbers.length; i++) {
      doubledNumbers[i] = numbers[i] * 2;
    }
    return new ArrayResult(doubledNumbers);
  }

  public ErrorMessage handleArrayError() {
    return new ErrorMessage("Please provide what to do with the numbers!");
  }

  public SithOutput sithReverse(SithInput sithInput) {
    String text = sithInput.getText().toLowerCase();
    List<String> words = Arrays.asList(text.split(" "));

    return new SithOutput(capitalize(reverseOrder(words)));
  }

  public List<String> reverseOrder(List<String> words){
    List<String> reorderedWords = new ArrayList<>();
    for (int i = 0; i < words.size() - 1; i += 2) {
      if (!words.get(i + 1).contains(".") && !words.get(i).contains(".")) {
        reorderedWords.add(words.get(i + 1));
        reorderedWords.add(words.get(i));
      } else if (words.get(i).contains(".")) {
        reorderedWords.add(words.get(i));
        reorderedWords.add(getRandomThing());
        i--;
      } else if (words.get(i + 1).contains(".")) {
        reorderedWords.add(words.get(i));
        reorderedWords.add(words.get(i + 1));
      }
    }
    if (words.size() % 2 == 0) {
      reorderedWords.add(words.get(words.size() - 1));
      reorderedWords.add(getRandomThing());
    } else {
      reorderedWords.add(getRandomThing());
    }
    return reorderedWords;
  }

  public String getRandomThing(){
    List<String> words = Arrays.asList(
        new String("Khm."),
        new String("Well."),
        new String("Err...er..er."),
        new String("Hohohoho."),
        new String("Haha."),
        new String("Whohoo."),
        new String("Boo."),
        new String("Hmmm."));

    Random random = new Random();
    int numberOfWords = random.nextInt(1);

    List<String> chosenWords = new ArrayList<>();
    if (numberOfWords == 0){
      chosenWords.add(words.get(random.nextInt(7)));
    } else if (numberOfWords == 1){
      chosenWords.add(words.get(random.nextInt(7)));
      chosenWords.add(words.get(random.nextInt(7)));
    }
    return String.join(" ", chosenWords);
  }

  public String capitalize(List<String> words) {
    words.set(0, words.get(0).substring(0, 1).toUpperCase() + words.get(0).substring(1));
    for (int i = 1; i < words.size() - 1; i++) {
      if (words.get(i - 1).endsWith(".")) {
        String firstWord = words.get(i);
        words.set(i, firstWord.substring(0, 1).toUpperCase() + firstWord.substring(1));
      }
    }
    return String.join(" ", words);

  }


    public ErrorMessage sithError () {
      return new ErrorMessage("Feed me some text you have to, padawan young you are. Hmmm.");
    }


}



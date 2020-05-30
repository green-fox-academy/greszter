package reverse_list;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import javax.print.event.PrintEvent;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ReverseList {
    public static void main(String[] args) {
        // - Create an array variable named `numbers`
        //   with the following content: `[3, 4, 5, 6, 7]`
        // - Reverse the order of the elements in `numbers`
        // - Print the elements of the reversed `numbers`

        Integer[] numbers = {3, 4, 5, 6, 7};

        System.out.println(Arrays.asList(numbers) + " ");

        reverseArray(numbers);


//        for (int j = 0; j < numbers.length / 2; j++) {
//            int temp = numbers[j];
//            numbers[j] = numbers[numbers.length - j - 1];
//            numbers[numbers.length - j - 1] = temp;
//        }
//
//        for (int k = 0; k < numbers.length; k++) {
//            System.out.print(numbers[k] + " ");
//        }
    }

    public static void reverseArray(Integer[] myArray){
        Collections.reverse(Arrays.asList(myArray));
        System.out.println(Arrays.asList(myArray));
    }
}


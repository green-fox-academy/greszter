package reverse_list;

public class ReverseList {
    public static void main(String[] args) {
        // - Create an array variable named `numbers`
        //   with the following content: `[3, 4, 5, 6, 7]`
        // - Reverse the order of the elements in `numbers`
        // - Print the elements of the reversed `numbers`

        int[] numbers = {3, 4, 5, 6, 7};

        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();

        for (int j = 0; j < numbers.length / 2; j++) {
            int temp = numbers[j];
            numbers[j] = numbers[numbers.length - j - 1];
            numbers[numbers.length - j - 1] = temp;
        }

        for (int k = 0; k < numbers.length; k++) {
            System.out.print(numbers[k] + " ");
        }
    }
}


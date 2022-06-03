import java.util.Arrays;
import java.util.stream.IntStream;

public class ArraysPart2 {
    public static void main(String[] args) {
        System.out.println("Task 1");
        int[] arr = generateRandomArray();
        int total = IntStream.of(arr).sum();

        System.out.println("The amount of expenses for the month was " + total + " rubles.");

        System.out.println("Task 2");
        var min = arr[0];
        for (int num : arr) {
            if (num < min) {
                min = num;
            }
        }
        System.out.println("The minimum amount spent per day was " + min + " rebles.");
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) max = Math.max(max, arr[i]);
        System.out.println("The maximum amount spent per day was " + max + " rebles.");
        System.out.println("Task 3");
        double average = 0;
        if (arr.length > 0) {
            double sum = 0;
            for (int j = 0; j < arr.length; j++) {
                sum += arr[j];
            }
            average = sum / arr.length;
            System.out.println("The average amount spent for the month was "+ average+" rubles.");
        }
        System.out.println("Task 4");
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        int length = 0;
        for (int element : reverseFullName)
        {
            length++;
        }
        for (int i = length - 1; i >= 0; i--)
        {
            System.out.print(reverseFullName[i]);
        }
        }



        public static int[] generateRandomArray () {
            java.util.Random random = new java.util.Random();
            int[] arr = new int[30];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = random.nextInt(100_000) + 100_000;
            }
            return arr;
        }
    }






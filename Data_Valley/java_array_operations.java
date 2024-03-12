import java.util.Arrays;

public class ArraySortAndCount {
    public static void main(String[] args) {
        int[] numbers = {3, 7, 1, 4, 2, 7, 8, 3, 7, 5, 9, 7}; // Example array
        int key = 7; // Number to find occurrences for

        // Sorting the array
        Arrays.sort(numbers);

        // Finding occurrences of a particular number
        int count = 0;
        for (int num : numbers) {
            if (num == key) {
                count++;
            }
        }

        // Outputting the sorted array and number of occurrences
        System.out.println("Sorted Array: " + Arrays.toString(numbers));
        System.out.println("Number of occurrences of " + key + ": " + count);
    }
}
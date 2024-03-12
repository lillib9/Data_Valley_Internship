public class MaxElementInArray {
    public static void main(String[] args) {
        int[] numbers = {3, 7, 1, 4, 2, 8, 5, 9, 6}; // Example array
        int max = numbers[0]; // Assume first element as maximum

        // Iterate through the array to find the maximum element
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }

        // Output the maximum element
        System.out.println("Maximum element in the array: " + max);
    }
}
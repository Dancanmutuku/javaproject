import java.util.Scanner;
import java.util.Arrays;

public class ArraySorting {

    public static void main(String[] args) {
        int[] numbers = getIntegers();
        System.out.println("Entered numbers:");
        printArray(numbers);

        int[] sortedNumbers = sortIntegers(numbers);
        System.out.println("Sorted numbers in descending order:");
        printArray(sortedNumbers);
    }

    // Method to get integers from the keyboard
    public static int[] getIntegers() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of integers: ");
        int count = scanner.nextInt();
        int[] array = new int[count];

        System.out.println("Enter the integers:");
        for (int i = 0; i < count; i++) {
            array[i] = scanner.nextInt();
        }

        return array;
    }

    // Method to print the contents of the array
    public static void printArray(int[] array) {
        for (int value : array) {
            System.out.print(value + " ");
        }
        System.out.println();
    }

    // Method to sort the array in descending order
    public static int[] sortIntegers(int[] array) {
        // Create a copy of the original array
        int[] sortedArray = Arrays.copyOf(array, array.length);

        // Sort the copy in descending order
        Arrays.sort(sortedArray);
        for (int i = 0; i < sortedArray.length / 2; i++) {
            int temp = sortedArray[i];
            sortedArray[i] = sortedArray[sortedArray.length - 1 - i];
            sortedArray[sortedArray.length - 1 - i] = temp;
        }

        return sortedArray;
    }
}

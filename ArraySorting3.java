import java.util.Arrays;
import java.util.Scanner;

public class ArraySorting3 {

    public static void main(String[] args) {
        int[] integers = getIntegers();
        System.out.print("Entered integers: ");
        printArray(integers);

        int[] sortedIntegers = sortIntegers(integers);
        System.out.print("Sorted integers in descending order: ");
        printArray(sortedIntegers);
    }

    public static int[] getIntegers() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of integers: ");
        int count = scanner.nextInt();
        int[] array = new int[count];

        System.out.println("Enter " + count + " integers:");
        for (int i = 0; i < count; i++) {
            array[i] = scanner.nextInt();
        }

        scanner.close();
        return array;
    }

    public static void printArray(int[] array) {
        for (int value : array) {
            System.out.print(value + " ");
        }
        System.out.println();
    }

    public static int[] sortIntegers(int[] array) {
        // Create a copy of the original array to avoid modifying the input array
        int[] newArray = Arrays.copyOf(array, array.length);

        // Sort the new array in descending order
        Arrays.sort(newArray);
        for (int i = 0; i < newArray.length / 2; i++) {
            int temp = newArray[i];
            newArray[i] = newArray[newArray.length - 1 - i];
            newArray[newArray.length - 1 - i] = temp;
        }

        return newArray;
    }
}


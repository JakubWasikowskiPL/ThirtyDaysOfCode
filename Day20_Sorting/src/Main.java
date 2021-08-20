import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] array = new int[n];
        for (int arrayIndex = 0; arrayIndex < n; arrayIndex++) {
            array[arrayIndex] = in.nextInt();
        }

        // Write Your Code Here
        int swapReturn = bubbleSort(array);
        System.out.format("Array is sorted in %d swaps.", swapReturn);
        System.out.println();
        System.out.println("First Element: " + array[0]);
        System.out.println("Last Element: " + array[array.length - 1]);
        //System.out.println(Arrays.toString(array));
    }

    public static int bubbleSort(int intArray[]) {

        int numberOfSwaps = 0;
        for (int i = 0; i < intArray.length; i++) {
            // Track number of elements swapped during a single array traversal


            for (int j = 0; j < intArray.length - i - 1; j++) {
                // Swap adjacent elements if they are in decreasing order
                if (intArray[j] > intArray[j + 1]) {
                    int temp = intArray[j];
                    intArray[j] = intArray[j + 1];
                    intArray[j + 1] = temp;
                    numberOfSwaps++;
                }
            }

            // If no elements were swapped during a traversal, array is sorted
            if (numberOfSwaps == 0) {

                break;
            }

        }
        return numberOfSwaps;
    }

}
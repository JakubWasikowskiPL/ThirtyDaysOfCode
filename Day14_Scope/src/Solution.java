import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int arraySize = scanner.nextInt();
        int[] numbersArray = new int[arraySize];
        for (int i = 0; i < arraySize; i++) {
            numbersArray[i] = scanner.nextInt();
        }
        scanner.close();
        Difference difference = new Difference(numbersArray);
        difference.computeDifference();
        System.out.print(difference.maximumDifference);
    }
}

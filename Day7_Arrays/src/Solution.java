import java.util.Random;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int N=scanner.nextInt();

        if(N>=1&&N<=1000) {
            int[] array = new int[N];
            for (int i = 0; i < N; i++) {
                Random random = new Random();
                array[i] = random.nextInt(10000);
            }
            for (int arr : array) {
                System.out.print(arr + " ");
            }
            System.out.println();
            for (int i = (array.length) - 1; i >= 0; i--) {
                System.out.print(array[i] + " ");
            }
        }else {
            System.out.println("Value not in the range");
        }

    }
}

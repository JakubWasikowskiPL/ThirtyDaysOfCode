import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        while (T >= 1 && T <= 30) {
            int n = sc.nextInt();
            if (n >= 1) {
                isPrimeChecker(n);
            } else {
                System.out.println("Wrong input");
            }
            T--;
        }

    }

    static void isPrimeChecker(int num) {
        if (num <= 1) {
            System.out.println("Not prime");
        } else if (num == 2) {
            System.out.println("Prime");
        } else {
            int divisorsCounter = 0;
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    divisorsCounter++;
                    System.out.println("Not prime");
                    break;
                }
            }
            if (divisorsCounter == 0) {
                System.out.println("Prime");
            }
        }
    }
}

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i < t; i++) {
            String[] nk = scanner.nextLine().split(" ");
            int n = Integer.parseInt(nk[0]);
            int k = Integer.parseInt(nk[1]);

            int max = 0;

            for (int x = 1; x <= n; x++) {
                for (int y = x + 1; y <= n; y++) {
                    if ((x & y) > max && (x & y) < k) {
                        max = x & y;

                    }
                }
            }

            System.out.println(max);
        }

        scanner.close();

    }
}

import java.util.Scanner;

public class Solution {

    public static int factorial (int n) {
        //Constrains 1<=n<=12
        //If you fail to use recursion or fail to name your recursive function factorial or Factorial, you will get a score of 0

            if(n>=1&&n<=12) {
                if (n <= 1) {
                    return 1;
                } else {
                    return n * factorial((n - 1));
                }
            }else {
                return 0;
            }


    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        System.out.println(factorial(n));
    }
}

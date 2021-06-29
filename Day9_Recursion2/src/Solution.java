import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        int test= factorial(n);
        System.out.println(test);
    }
    static  int factorial(int n){
        if (n<=1) {
            return 1;
        } else {
            return n*factorial((n-1));
        }
    }
}

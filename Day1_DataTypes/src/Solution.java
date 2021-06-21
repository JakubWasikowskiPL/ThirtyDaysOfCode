import java.util.Scanner;

public class Solution {
    /* Declare second integer, double, and String variables. */

    /* Read and save an integer, double, and String to your variables.*/
    // Note: If you have trouble reading the entire String, please go back and review the Tutorial closely.

    /* Print the sum of both integer variables on a new line. */

    /* Print the sum of the double variables on a new line. */

    /* Concatenate and print the String variables on a new line;
        the 's' variable above should be printed first. */

    public static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";

        Scanner scan=new Scanner(System.in);
//        System.out.println("Enter the integer number: ");
        int passedInteger=scan.nextInt();
//        System.out.println("Enter the double number: ");
        double passedDouble=scan.nextDouble();
        scan.nextLine();
//        System.out.println("Enter the String: ");
        String passedString=scan.nextLine();
        scan.close();
        System.out.println(i+passedInteger);
        System.out.println(d+passedDouble);
        System.out.println(s+passedString);

    }
}

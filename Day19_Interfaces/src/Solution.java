import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        System.out.println("Enter the integer number:");
        Scanner scanner=new Scanner(System.in);
        int number=scanner.nextInt();
        Calculator myCalculator=new Calculator();
        scanner.close();
        int result=myCalculator.divisorSum(number);

        System.out.println("I implemented: AdvancedArithmetic"+"\n"+result);
    }
}

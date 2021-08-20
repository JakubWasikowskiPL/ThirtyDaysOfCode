import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int t=scanner.nextInt();
        int n;
        int p;
        while (t-->0){
            n=scanner.nextInt();
            p=scanner.nextInt();

            Calculator myCalculator=new Calculator();
            try {
                int result =myCalculator.power(n,p);
                System.out.println(result);
            }catch (Exception e){
                System.out.println(e.getMessage());
            }
        }
        scanner.close();
    }
}

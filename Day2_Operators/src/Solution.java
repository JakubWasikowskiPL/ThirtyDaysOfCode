
import java.util.*;
class Result {

    /*
     * Complete the 'solve' function below.
     *
     * The function accepts following parameters:
     *  1. DOUBLE meal_cost
     *  2. INTEGER tip_percent
     *  3. INTEGER tax_percent
     */

    public static void solve(double meal_cost, int tip_percent, int tax_percent) {
           int total_cost=(int)Math.round((meal_cost+(meal_cost*tip_percent*0.01)+(meal_cost*tax_percent*0.01)));
        System.out.println(total_cost);
    }

}
public class Solution {

    public static void main(String[] args)  {
//        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        Scanner scan=new Scanner(System.in);
        double meal_cost = scan.nextDouble();
        int tip_percent = scan.nextInt();
        int tax_percent = scan.nextInt();
        scan.close();
        Result.solve(meal_cost, tip_percent, tax_percent);

    }
}

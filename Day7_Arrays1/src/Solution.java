import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int[] intArray = new int[N];
        for(int i=0; i < N; i++){
            intArray[i] = in.nextInt();
        }
        in.close();

        for (int i = (intArray.length)-1; i >= 0; i--) {
            System.out.print(intArray[i] + " ");
        }
    }

}

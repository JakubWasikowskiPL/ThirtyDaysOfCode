import java.util.Arrays;
import java.util.Scanner;

public class Solution {
    private static Scanner scanner=new Scanner(System.in);

    public static void main(String[] args) {
	int[][]array=new int[6][6];

	for(int i =0;i<6;i++){
	    String[] arrRowItems=scanner.nextLine().split(" ");
	    scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

//    ? matches exactly zero or one of the previous character.
//    | Alternative
//    [] Matches single character present in
//    \r matches a carriage return
//
//    \n newline
//
//    \u2028 matches the character with index 2018 base 16(8232 base 10 or 20050 base 8) case sensitive
//    \u2029 matches the character with index 2029 base 16(8233 base 10 or 20051 base 8) case sensitive
//    \u0085 matches the character with index 85 base 16(133 base 10 or 205 base 8) case sensitive
//
//    1st Alternative \r\n
//
//    \r matches a carriage return (ASCII 13)
//    \n matches a line-feed (newline) character (ASCII 10)
//
//    2nd Alternative [\n\r\u2028\u2029\u0085]
//
//    Match a single character present in the list below [\n\r\u2028\u2029\u0085]
//    \n matches a line-feed (newline) character (ASCII 10)
//    \r matches a carriage return (ASCII 13)
//    \u2028 matches the character with index 202816 (823210 or 200508) literally (case sensitive) LINE SEPARATOR
//    \u2029 matches the character with index 202916 (823310 or 200518) literally (case sensitive) PARAGRAPH SEPARATOR
//    \u0085 matches the character with index 8516 (13310 or 2058) literally (case sensitive) NEXT LINE

        for(int j=0;j<6;j++){
            int arrayItem=Integer.parseInt(arrRowItems[j]);
            array[i][j]=arrayItem;
        }
    }
	//array with sum of the 16 hourglasses
	int sum[]=new int[16];
	int h=0;

	for (int i=0;i<4;i++){
	    for ( int j=0;j<4;j++){
	        //sum of the hourglass stored in the array[0] to array[15]
	        sum[h]=array[i][j]+array[i][j+1]+array[i][j+2]+array[i+1][j+1]+array[i+2][j]+
                    array[i+2][j+1]+array[i+2][j+2];
	        h++;
        }
    }
        Arrays.sort(sum);
        System.out.println(sum[15]);
    scanner.close();
    }
}

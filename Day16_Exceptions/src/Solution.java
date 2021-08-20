import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String S=scanner.nextLine();
        try {
            int stringParsedToInt=Integer.parseInt(S);
            System.out.println(stringParsedToInt);
        }catch (Exception e){
            System.out.println("Bad String");
        }
    }
}

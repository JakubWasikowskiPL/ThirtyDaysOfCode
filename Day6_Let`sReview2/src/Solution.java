import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.nextLine();

        for (int i = 0; i < n; i++) {
            String s = scan.nextLine();
            String s1 = "", s2 = "";

            for (int j = 0; j < s.length(); j++) {
                if (j % 2 == 0)
                    s1 += s.substring(j, j + 1);
                else
                    s2 += s.substring(j, j + 1);
            }
            System.out.println(s1 + " " + s2);
        }

        scan.close();
    }
    }

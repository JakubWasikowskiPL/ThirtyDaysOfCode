import java.util.HashMap;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashMap<String, Integer> map = new HashMap<String,Integer>();
        int n=scanner.nextInt();
        scanner.nextLine();

        for(int i=0;i<n;i++){
            String name=scanner.next();
            int phone=scanner.nextInt();
            map.put(name, phone);
            scanner.nextLine();
        }

        while(scanner.hasNext()){
            String s=scanner.nextLine();
            if (map.containsKey(s)) {
                System.out.println(s+"="+map.get(s));
            } else {
                System.out.println("Not found");
            }
        }
    }
}

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


//Task
//        Given names and phone numbers, assemble a phone book that maps friends' names to their respective phone numbers. You will then be given an unknown number of names to query your phone book for.
//        For each queried, print the associated entry from your phone book on a new line in the form name=phoneNumber; if an entry for
//        is not found, print Not found instead.
//        Note: Your phone book should be a Dictionary/Map/HashMap data structure.

//Input Format

//        The first line contains an integer,n, denoting the number of entries in the phone book.
//        Each of the subsequent lines describes an entry in the form of space-separated values on a single line. The first value is a friend's name, and the second value is an
//        8-digit phone number.
//        After the n lines of phone book entries, there are an unknown number of lines of queries.
//        Each line (query) contains a name to look up, and you must continue reading lines until there is no more input.
//        Note: Names consist of lowercase English alphabetic letters and are first names only.

public class Solution {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int queries=0;
        scanner.nextLine();
        Map<String,Integer>map=new HashMap();

        if(n>=1&&n<=100000){
            for (int i=0;i<n;i++){
                String name=scanner.next();
                int phone=scanner.nextInt();
                if (phone<100000000) {
                    map.put(name, phone);
                }else {
                    map.put("Incorrect number length",-1);
                }
                scanner.nextLine();
            }

        }else {
            System.out.println("Value not in the range,constrains: 1<=n<=10000 ");
        }

        while (queries<=n){
           String s =scanner.nextLine();
           if (map.containsKey(s)){
               System.out.println(s+"="+map.get(s));
               queries++;
           }else {
               System.out.println("Not found");
               queries++;
           }

        }
    }
}

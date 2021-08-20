import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        scanner.nextLine();
       ArrayList<String>list=new ArrayList<String>();
        String regex = "[a-z]+@gmail\\.com$";
        Pattern p = Pattern.compile(regex);

        for (int i = 0; i < N; i++) {
            String name = scanner.next();
            String email = scanner.next();
            Matcher matcher = p.matcher(email);
            if(matcher.find()){
                list.add(name);
            }
        }
        scanner.close();
        Collections.sort(list);
        for (String s:list){
            System.out.println(s);
        }
    }
}

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        int T=scanner.nextInt();
        stringStorer(T);
//        scanner.nextLine();

    }
    public static void stringStorer(int T){
        if (T>=1&&T<=10) {
            Scanner scanner = new Scanner(System.in);
            int counter = 0;
            String[] stringTab = new String[T];
            while (counter < T) {
                stringTab[counter] = scanner.nextLine();
                counter++;
            }
            for(int i=0;i<T;i++){
                newStringGenerator(stringTab[i]);
            }
        }else {
            System.out.println("Number of cases out of range 1<=T<=10");
        }
    }
    public static void newStringGenerator(String tableString){
        String s1="";
        String s2="";

        for(int i=0;i<tableString.length();i++){
            if(i%2==0){
                s1+=tableString.charAt(i);
            }else{
                s2+=tableString.charAt(i);
            }
        }
        System.out.println((s1+" "+s2));

    }
}

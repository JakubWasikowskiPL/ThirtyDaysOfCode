import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int size=scanner.nextInt();
        Integer [] intArray= new Integer[size];
        for (int i=0;i<intArray.length;i++){
            intArray[i]=scanner.nextInt();
        }
        printArray(intArray);
        size=scanner.nextInt();
        String [] stringArray= new String[size];
        for (int i=0;i<stringArray.length;i++){
            stringArray[i]=scanner.next();
        }
        scanner.close();
        printArray(stringArray);
    }

    public static <D>void printArray(D[]array){
        for (D element:array){
            System.out.println(element);
        }
    }
}

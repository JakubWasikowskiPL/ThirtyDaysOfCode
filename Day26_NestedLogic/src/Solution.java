import java.util.Scanner;

public class Solution {
    public static int fineCalculator(int d1,int m1,int y1,int d2,int m2,int y2){
        if (y1<=y2&&m1<=m2&&d1<=d2){
            return 0;
        }else if(y1<=y2&&m1<=m2){
            return 15*(d1-d2);
        }else if(y1<=y2){
            return 500*((m1-m2)+Math.round((d1-d2)/30));
        }else {
            return 10000;
        }
    }
    public static int borrowBook(){
        int d1,d2,m1,m2,y1,y2;
        Scanner scanner=new Scanner(System.in);
        d1=scanner.nextInt();
        scanner.nextLine();
        m1=scanner.nextInt();
        scanner.nextLine();
        y1=scanner.nextInt();
        scanner.nextLine();
        d2=scanner.nextInt();
        scanner.nextLine();
        m2=scanner.nextInt();
        scanner.nextLine();
        y2=scanner.nextInt();
        scanner.close();
        if (d1<1||d1>31||d2<1||d2>31||m1<1||m1>12||m2<1||m2>12||y1<1||y1>3000||y2<1||y2>3000){
            System.out.println("incorrect input, scan values one more time");
            return borrowBook();
        }else {
            return fineCalculator(d1,m1,y1,d2,m2,y2);
        }
    }
    public static void main(String[] args) {
        int fine=borrowBook();
        System.out.println("Fine to pay is equal: "+fine);

    }
}

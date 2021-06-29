import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int moduloReminder,consecutiveCounter=0;

        while(n>0)
        {
            moduloReminder=n%2;
            n=n/2;
            if(moduloReminder==1)
            {  
                consecutiveCounter++;
            }else{
                consecutiveCounter=0;
            }
        }

        System.out.println(consecutiveCounter);
    }
}


public class Solution {

    public static String toBinary(int n){
        String binary="";

        if(n<1000000) {
            if (n > 0) {
                if (n % 2 == 0) {
                    n = (int) n / 2;
                    return toBinary(n) + "0" + binary;
                } else {
                    int rest = n % 2;
                    n = (int) n / 2;
                    return toBinary(n) + rest + binary;
                }
//            }
//            else if (n == 0) {
//                return "0";
            } else {
                return binary;
            }

        }else {
            return "Value out of the range, 1<=n<=1000000";
        }
    }
    public static int consecutiveCounter(String binaryRepresent){
        int counter=0;
        for (int i=0;i<binaryRepresent.length();i++){
            if(binaryRepresent.charAt(i)=='1'){
                counter++;
            }else {
                break;
            }
        }
        return counter;
    }
    public static void main(String[] args) {
        String s=toBinary(6);
        System.out.println(consecutiveCounter(s));
    }
}

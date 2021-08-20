
import java.util.Scanner;


public class Solution {


    public static void main(String[] args) {
        //Scanning word from the user
        Scanner scanner=new Scanner(System.in);
        String input=scanner.nextLine();
        scanner.close();

        //Convert input String to characters array:
        char[]stringArray=input.toCharArray();

        //Create a solution object:
        StackAndQue stackAndQueueInstance=new StackAndQue();

        //Enqueue/Push all chars to their respective data structures:
        for (char character:stringArray){
            stackAndQueueInstance.pushCharacter(character);
            stackAndQueueInstance.enqueueCharacter(character);
        }

        //Dequeue/Pop the chars at the head of both data structures and compare them:
        boolean isPalindrome = true;
        for (int i = 0; i < stringArray.length / 2; i++) {
            if (stackAndQueueInstance.popCharacter() != stackAndQueueInstance.dequeueCharacter()) {
                isPalindrome = false;
                break;
            }
        }
        //Print whether input string is palindrome or not.
        System.out.println("The word, " + input + ", is "
                + ((!isPalindrome) ? "not a palindrome." : "a palindrome."));
    }
}

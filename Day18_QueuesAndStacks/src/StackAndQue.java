import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class StackAndQue {
    Stack<Character> stack=new Stack<Character>();
    Queue<Character> queue=new LinkedList<Character>();

    void pushCharacter(char character){
        stack.push(character);
    }
    void enqueueCharacter(char character){
        queue.add(character);
    }
    char popCharacter(){
        return stack.pop();
    }
    char dequeueCharacter(){
        return queue.poll();
    }
}

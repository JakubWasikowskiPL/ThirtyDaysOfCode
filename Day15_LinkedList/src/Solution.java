import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Node head = null;
        int numberofNodes = scanner.nextInt();
        while (numberofNodes-- > 0) {
            int valueInNode = scanner.nextInt();
            head = insert(head, valueInNode);
        }
        display(head);
        scanner.close();
    }

    public static Node insert(Node head, int data) {
        Node current = head;
        Node temp;
        if (current == null) {
            temp=new Node(data);
            current = temp;
            return current;
        } else {
            while (current.next != null) {
                current = current.next;
            }
            current.next = new Node(data);
            return head;
        }
    }

    public static void display(Node head) {
        Node start = head;
        while (start != null) {
            System.out.print(start.data + " ");
            start = start.next;
        }
    }
}







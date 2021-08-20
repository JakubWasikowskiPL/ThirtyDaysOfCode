import java.util.HashSet;
import java.util.Scanner;

public class Solution {
    public static Node removeDuplicates(Node head) {


        Node temp = head;// temporary pointer pointing to the head
        Node prev = head;// previous pointer pointing to the head
        HashSet<Integer> checkNumber = new HashSet<Integer>(); //creating new hash set of the integers

        while (temp != null) {// loop executing until it reaches the end of the list

            if (!checkNumber.contains(temp.data)) { // it executes when hash set is not containing temp data
                prev = temp;//pointing point to the same element which is currently pointed by temp
                checkNumber.add(temp.data);//adding temp to the set
                temp = temp.next;//moving temp to point to the next node
            } else {// if hash set contains temp data
                prev.next = temp.next;// moving pointer to the next element (if element was duplicated it will be not longer in the list)
                temp = temp.next;//moving temp to point to the next node /upper node prev.next will point to the temp as a next element
            }

        }
        return head;//returning head of the list
    }

    public static  Node insert(Node head,int data) // inserting elements to the list
    {
        Node p=new Node(data);// creating new nodes
        if(head==null)// if list is empty
            head=p;//head is equal newly created node
        else if(head.next==null)// checking if next element is the end of the list
            head.next=p;// adding newly created node to the end of the list
        else
        {
            Node start=head;
            while(start.next!=null)//executing till the end of the list will be reached
                start=start.next; // moving pointer to the next node
            start.next=p;// if end of the list was reached then newly created node is added

        }
        return head; // returning beginning of the list;
    }
    public static void display(Node head)
    {
        Node start=head;// displaying a list
        while(start!=null)// loop is executing until it gets to the end of the list
        {
            System.out.print(start.data+" ");// current printing node value
            start=start.next;// current node is equal to the next node
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);// creating scanner
        Node head=null;//creating empty node
        int T=sc.nextInt(); //number of nodes/list size
        while(T-->0){// loop is executing until it will have T number of nodes
            int ele=sc.nextInt();// scanning number from the user
            head=insert(head,ele);// inserting new node with scanned data
        }
        head=removeDuplicates(head);// removing duplicated numbers
        display(head);// displaying list
    }
}

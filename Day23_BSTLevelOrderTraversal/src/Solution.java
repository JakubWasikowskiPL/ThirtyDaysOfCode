import java.util.Scanner;

public class Solution {
    static void levelOrder(Node root){
        //Write your code here
        int height=getHeight(root);// returning height of the tree
        for(int i=1;i<=height;i++)// loop printing elements starting from the root to the last element
        {
            printEachLevel(root,i); //printing each element of the tree starting from the root
        }

    }
    static void printEachLevel(Node root,int eachLevel)
    {
        if (root == null)// empty tree
            return;
        if (eachLevel == 1)//if there is just root
            System.out.print(root.data + " "); // printing root
        else if (eachLevel > 1)//if there are
        {
            printEachLevel(root.left, eachLevel-1); // printing left child using recursion
            printEachLevel(root.right, eachLevel-1);//printing right child using recursion
        }
    }
    static int getHeight(Node root){

        if(root == null)// the tree is empty
        {
            return 0; // height is 0
        }
        else// if the tree is not empty
        {
            int lHeight= getHeight(root.left);// recursive call of function to return left height
            int rHeight=getHeight(root.right);//recursive call of unction to return right height

            if(lHeight>rHeight)// if left height is bigger
            {
                return (lHeight+1); //returning total tree height -> (left height + root )
            }
            else
                return (rHeight+1);//returning total tree height -> (right height + root )
        }
    }

    public static Node insert(Node root,int data){ //method used to insert new elements to the tree
        if(root==null){ // if tree is empty
            return new Node(data); //creating new node with passed data
        }
        else{ //if tree is not empty
            Node cur; //Node pointer
            if(data<=root.data){// if passed data is lower than the root data
                cur=insert(root.left,data); //  left child is created with inserted data and it`s preserved in the pointer
                root.left=cur;// created node preserved in the pointer is now viewed as left child of the tree
            }
            else{//if passed data is higher than the root data
                cur=insert(root.right,data);//  right child is created with inserted data and it`s preserved in the pointer
                root.right=cur;// created node preserved in the pointer is now viewed as right child of the tree
            }
            return root;// returning root
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt(); //Integer size of the tree scanned as the user input
        Node root=null;//empty tree
        while(T-->0){ // inserting elements to the tree of size T
            int data=sc.nextInt();// scanning new int data from the user
            root=insert(root,data);// inserting elements to the tree
        }
        levelOrder(root);// printing elements
    }
}


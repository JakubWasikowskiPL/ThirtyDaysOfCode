import java.util.*;

class Solution {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        Node root = null;
        while (T-- > 0) {
            int data = sc.nextInt();
            root = insert(root, data);
        }
        int height = getHeight(root);
        System.out.println(height);
    }

    public static int getHeight(Node root) {

        if (root == null) {
            return -1;// if the tree is empty it returns
        } else {
            int lHeight = getHeight(root.left);
            int rHeight = getHeight(root.right);

            if (lHeight > rHeight) {
                return (lHeight + 1);
            } else
                return (rHeight + 1);
        }
    }

    public static Node insert(Node root, int data) {
        if (root == null) {
            return new Node(data); // if root is empty there is created new root
        } else {
            Node cur; //current node
            if (data <= root.data) {  //if passed data is smaller than data in the root
                cur = insert(root.left, data); // in the current node is created subtree because value of root.left==null so new Node(data); is returned
                root.left = cur;//root.left store the information about newly created subtree on the left branch of the tree
            } else {
                cur = insert(root.right, data);// in the current node is created subtree because value of root.right==null so new Node(data); is returned
                root.right = cur;//root.right store the information about newly created subtree on the right branch of the tree
            }
            return root;//node root is returned
        }
    }
}
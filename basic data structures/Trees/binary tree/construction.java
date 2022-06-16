import java.util.*;

public class construction {
    public static class Node {

        int val;
        Node right;
        Node left;

        Node() {
        }

        Node(int val) {
            this.val = val;
        }

        Node(int val, Node left, Node right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }

    }

    public static class pair {
        Node node;
        int state;

        pair() {

        }

        pair(Node node, int state) {
            this.node = node;
            this.state = state;
        }
    }

    public static void display(Node root) {
        if (root == null) {
            return;
        }
        System.out.println(root.val);
        display(root.left);
        display(root.right);
    }

    public static void display1(Node root) {
        if (root == null) {
            return;
        }
        if (root.left != null) {
            System.out.print(root.left.val);
        } else {
            System.out.print(".");
        }
        System.out.print("<-" + root.val + "->");
        if (root.right != null) {
            System.out.print(root.right.val);
        } else {
            System.out.print(".");
        }
        System.out.println();
        display1(root.left);
        display1(root.right);

    }

    public static void main(String[] args) {

        Integer[] arr = { 50, 25, 12, null, null, 37, 30, null, null, null, 75, 62, null, 70, null, null, 87, null,
                null };
        Node root = new Node(arr[0]);
        Stack<pair> st = new Stack<>();
        pair rootPair = new pair(root, 1);
        st.push(rootPair);
        int idx = 1;
        while (st.size() != 0) {
            pair peekPair = st.peek();

            if (peekPair.state == 1) {
                peekPair.state++;
                if (arr[idx] != null) {

                    Node leftChild = new Node(arr[idx]);
                    peekPair.node.left = leftChild;

                    st.push(new pair(leftChild, 1));

                }
                idx++;

            } else if (peekPair.state == 2) {
                peekPair.state++;
                if (arr[idx] != null) {

                    Node rightChild = new Node(arr[idx]);
                    peekPair.node.right = rightChild;

                    st.push(new pair(rightChild, 1));
                }
                idx++;
            } else {
                st.pop();
            }

        }

        display1(root);

    }
}
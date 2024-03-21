import java.util.*;
class Node
{
    int data;
    Node left,right;
    Node(int d)
    {
        data=d;
        left=right=null;
    }
}
class ZigZagTraversal {
//Function to store the zig zag order traversal of tree in a list.
ArrayList<Integer> zigZagTraversal(Node root)
{
    //Add your code here.
    Stack<Node> st1 = new Stack<>();
    Stack<Node> st2 = new Stack<>();
    boolean flag = true;
    ArrayList<Integer> list = new ArrayList<>();
    st1.push(root);
    while (!st1.isEmpty() || !st2.isEmpty()) {
        if (flag) {
            int size = st1.size();
            while (size-- > 0) {
                Node temp = st1.pop();
                list.add(temp.data); 
                if (temp.left != null) st2.push(temp.left);
                if (temp.right != null) st2.push(temp.right);
            }
        } else {
            int size = st2.size();
            while (size-- > 0) {
                Node temp = st2.pop();
                list.add(temp.data); 
                if (temp.right != null) st1.push(temp.right);
                if (temp.left != null) st1.push(temp.left);
            }
        }
        flag = !flag; 
    }
    return list;
}
}
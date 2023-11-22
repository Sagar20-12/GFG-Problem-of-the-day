

/*
class of the node of the tree is as
class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data = data;
        left=null;
        right=null;
    }
}

*/
// complete this function
// return true/false if the is Symmetric or not
public class SymmetricTree {
    public static boolean isSymmetric(Node root)
    {
        // add your code here;
        return root == null || solve(root.left, root.right);
    }
    static boolean solve(Node left, Node right){
        if(left == null || right == null)
            return left == right;
        if(left == null && right == null)
            return true;
        if(left.data!=right.data)
            return false;
        return solve(left.left, right.right) && solve(left.right, right.left);
    }
    
}

class Node {
    int data;
    Node left;
    Node right;
    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}
class DistributeCandiesBT {
    static int moves;
    static int solve(Node root){
        if(root == null)
            return 0;
        int l = solve(root.left);
        int r = solve(root.right);
        moves+=Math.abs(l) + Math.abs(r);
        return root.data-1 + l + r;
    }
    public static int distributeCandy(Node root)
    {
        //code here
        moves = 0;
        solve(root);
        return moves;
    }
    
}

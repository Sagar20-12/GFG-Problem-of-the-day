class FlattenBST {
    public Node flattenBST(Node root) {
        // Code here
        if(root == null || root.left == null && root.right == null){
            return root;
        }
        Node left = flattenBST(root.left);
        Node right = flattenBST(root.right);
        root.left = null;
        root.right = right;
        if(left == null) return root;
        else{
            Node temp = left;
            while(temp.right!=null) temp = temp.right;
            temp.right = root;
            root = left;
            return root;
        }
    }
}

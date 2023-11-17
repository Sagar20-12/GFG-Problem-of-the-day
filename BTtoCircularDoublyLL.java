
public class BTtoCircularDoublyLL {
    Node head;
    Node prev;
    void dfs(Node root){
        if(root!=null){
            dfs(root.left);
            if(prev!=null){
                prev.right=root;
                root.left=prev;
            }else
                head=root;
                prev=root;
                dfs(root.right);
            
        }
    }
    //Function to convert binary tree into circular doubly linked list.
    Node bTreeToClist(Node root)
    {
        //your code here
        prev = null;
        head = null;
        dfs(root);
        head.left=prev;
        prev.right=head;
        return head;
    
    }
    
}

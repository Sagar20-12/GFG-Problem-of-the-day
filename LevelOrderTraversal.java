import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
// class Node
// {
//     int data;
//     Node left, right;

//     Node(int item)
//     {
//         data = item;
//         left = right = null;
//     }
// }
public class LevelOrderTraversal {
    //Function to return the level order traversal of a tree.
    static ArrayList <Integer> levelOrder(Node root) 
    {
       ArrayList<Integer> level = new ArrayList<>();
       Queue<Node> q = new LinkedList<>();
       q.add(root);
       while(!q.isEmpty()){
           Node current = q.poll();
           level.add(current.data);
           if(current.left!=null)
                q.add(current.left);
            if(current.right!=null)
                q.add(current.right);
       }
       return level;
        
    }
}

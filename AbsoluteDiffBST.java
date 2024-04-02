import java.util.*;
class Solution
{
    void inorder(Node root, ArrayList<Integer> list)
    
    {
        //Your code here
        if(root!=null){
            inorder(root.left, list);
            list.add(root.data);
            inorder(root.right, list);
        }
    }
     int absolute_diff(Node root){
        ArrayList<Integer> list = new ArrayList<>();
        inorder(root, list);
        int min = Integer.MAX_VALUE;
        for(int i = 0; i<list.size()-1; i++)
            min = Math.min(min, list.get(i+1)- list.get(i));
        return min;
        
    }
    
}
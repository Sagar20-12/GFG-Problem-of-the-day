import java.util.ArrayList;

public class DiagonalSum {
    public static ArrayList <Integer> diagonalSum(Node root) 
    {
        ArrayList<Integer> arr = new ArrayList<>();
        diagonal(root, 0, arr);
        return arr;
    }
    public static void diagonal(Node node, int level, ArrayList<Integer> arr){
        if(node == null)
            return;
        if(arr.size()<=level)
            arr.add(node.data);
        else
            arr.set(level, arr.get(level) + node.data);
        diagonal(node.left, level + 1, arr);
        diagonal(node.right, level, arr);
    }
    
}

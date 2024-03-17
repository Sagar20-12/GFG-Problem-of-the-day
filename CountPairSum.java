import java.util.HashSet;
import java.util.LinkedList;

class CountPairSum{
    public static int countPairs(LinkedList<Integer> head1, LinkedList<Integer> head2,
                          int x) {
        // add your code here
        int count = 0;
        HashSet<Integer> set = new HashSet<>();
        for(int num : head1){
            set.add(num);
        }
        for(int num : head2){
            if(set.contains(x-num)){
                count++;
            }
        }
        return count;
    }
}
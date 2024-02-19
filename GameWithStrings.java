import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;

class GameWithStrings {
    static int minValue(String s, int k){
    PriorityQueue<Integer> queue = new PriorityQueue<Integer>(Collections.reverseOrder());
        int arr[] = new int[26];
        Arrays.fill(arr, 0);
        //Function to add frequency of the characters
        for(int i = 0; i<s.length(); i++){
            arr[s.charAt(i)-'a']++;
        }
        for(int i = 0; i<26; i++){
            if(arr[i]!=0)
                queue.add(arr[i]);
        }
        while(k!=0){
            int temp = queue.remove();
            temp--;
            queue.add(temp);
            k--;
        }
        int ans = 0;
        while(queue.size()!=0){
            int temp = queue.remove();
            ans += temp * temp;
        }
        return ans;
    }
}

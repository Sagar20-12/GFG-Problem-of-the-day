import java.util.HashMap;
class LongestArraySumDivisible {
    int longSubarrWthSumDivByK(int a[], int n, int k)
    {
        // Complete the function
        HashMap<Integer, Integer> map = new HashMap<>();
        int maxLen = 0;
        int curSum = 0;
        map.put(0, -1);
        for(int i = 0; i<n; i++){
            curSum+=a[i];
            int rem = curSum % k;
            if(rem < 0){
                rem += k;
            }
            if(map.containsKey(rem)){
                maxLen = Math.max(maxLen, i-map.get(rem));
                
            }
            if(!map.containsKey(rem)){
                map.put(rem,i);
            }
        }
        return maxLen;
        
       
    }
}

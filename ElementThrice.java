import java.util.HashMap;

public class ElementThrice {
    static int singleElement(int[] arr , int N) {
        // code here
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i<N; i++){
            map.put(arr[i], map.getOrDefault(arr[i],0) + 1);
            
        }
        for(int num : map.keySet()){
            if(map.get(num) == 1) return num;
        }
        return 0;
    }
    
}

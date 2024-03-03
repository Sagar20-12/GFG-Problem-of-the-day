import java.util.Arrays;
import java.util.Comparator;

class LargestNumberFormedFromArray {
    String printLargest(int n, String[] arr) {
        // code here
        StringBuilder temp = new StringBuilder();
        Arrays.sort(arr, new Comparator<String>(){
            public int compare(String x, String y){
                String a = x + y;
                String b = y + x;
                return b.compareTo(a);
            }
        });
        for(String x : arr) temp.append(x);
        return temp.toString();
    }
    
}

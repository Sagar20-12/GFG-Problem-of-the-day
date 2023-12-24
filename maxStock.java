import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class maxStock {
    public static int buyMaximumProducts(int n, int k, int[] price) {
        // code here
        List<List<Integer>> stocks = new ArrayList<>();
        
        for(int i = 0; i < n; i++) {
            ArrayList<Integer> stock = new ArrayList<>();
            stock.add(price[i]);
            stock.add(i + 1);
            
            stocks.add(stock);
        }
        
        Collections.sort(stocks, (List<Integer> s1, List<Integer> s2) -> {
            return s1.get(0) - s2.get(0);
        });
        
        int maxCount = 0;
        int i = 0;
        while(k > 0 && i < n) {
            List<Integer> stock = stocks.get(i);
            int count = Math.min(stock.get(1), k / stock.get(0));
            maxCount += count;
            k -= count * stock.get(0);
            i++;
        }
        
        
    }
    
}

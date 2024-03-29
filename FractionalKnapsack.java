import java.util.Arrays;
import java.util.Comparator;

class FractionalKnapsack {
    double fractionalKnapsack(int W, Item arr[], int n) 
    {
        // Your code here
        Arrays.sort(arr, Comparator.comparing((Item a) -> (double)a.value / a.weight). reversed());
        double result = 0;
        for(Item item : arr){
            if(item.weight<W){
                result += item.value;
                W-=item.weight;
            } else{
                result+= (double)(W * item.value) / item.weight;
                break;
            }
        }
        return result;
    }
    
}

public class MaximumIndex {
    static int maxIndexDiff(int a[], int n) { 
        
        // Your code here
        int i = 0;
        int j = n-1;
        int max = 0;
        while(i<=j){
            if(a[i]<=a[j]){
                int diff = j-i;
                max = Math.max(diff, max);
                i++;
                j = n-1;
                
            } else{
                j--;
            }
        }
        return max;
    }
}

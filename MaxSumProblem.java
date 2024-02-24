public class MaxSumProblem {
    public int maxSum(int n) 
    { 
        //code here.
        return solve(n);
    } 
    static int solve(int n){
        if(n == 0) return 0;
        int ans1 = Math.max(solve(n/2), n/2);
        int ans2 = Math.max(solve(n/3), n/3);
        int ans3 = Math.max(solve(n/4), n/4);
        return Math.max((ans1 + ans2 + ans3), n);
    }
}

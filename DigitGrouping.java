import java.util.Arrays;

class DigitGrouping {
    public int TotalCount(String str)
    {
        // Code here
        int[][] dp = new int[101][1001];
        for(int row[]: dp){
            Arrays.fill(row, -1);
        }
        return solve(str, 0, 0, dp);
    }
    public static int solve(String str, int index, int sum, int dp[][]){
        if(index == str.length()) 
            return 1;
        int curr = 0;
        int ans = 0;
        if(dp[index][sum]!=-1) 
            return dp[index][sum];
        for(int i = index; i<str.length(); i++){
            curr += (str.charAt(i) -  '0');
            if(curr >= sum)
            ans += solve(str, i+1, curr, dp);
        }
        return dp[index][sum] = ans;
    }
}

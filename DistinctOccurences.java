import java.util.Arrays;

public class DistinctOccurences {
    int  subsequenceCount(String s, String t)
    {
	// Your code here	
	    int n = s.length();
	    int m = t.length();
	    int[][] dp = new int[n][m];
	    for(int temp[] : dp) Arrays.fill(temp, -1);
	    return solve(s, t, 0, 0, dp);
    }
    static int MOD = 1000000007;
    static int solve(String s, String t, int i, int j, int dp[][]){
        if(j == t.length()) return 1;
        if(i == s.length()) return 0;
        if(dp[i][j]!=-1) return dp[i][j];
        int a = 0, b = 0;
        if(s.charAt(i) == t.charAt(j)){
            a = solve(s,t,i+1,j+1,dp);
        }
        b = solve(s,t,i+1,j,dp);
        return dp[i][j] = (a+b)%MOD;
    }
}

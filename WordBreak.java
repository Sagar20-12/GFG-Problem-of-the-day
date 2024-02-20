import java.util.ArrayList;
import java.util.HashSet;

class WordBreak {
    public static int wordBreak(String A, ArrayList<String> B )
    {
        //code here
        int n = A.length();
        HashSet<String> str = new HashSet<>(B);
        boolean[] dp = new boolean[n+1];
        dp[0] = true;
        for(int i = 1; i<=n; i++){
            for(int j = 0; j<i; j++){
                if(dp[j] && str.contains(A.substring(j,i))){
                    dp[i] = true;
                    break;
                }
            }
        }
        if(dp[n])
        return 1;
        else
        return 0;
    }
}

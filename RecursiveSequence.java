class RecursiveSequence {
    class Solution{
        static long sequence(int n){
            // code here
            long MOD = 1000000007;
            long ans = 0;
            long a = 1;
            for(int i = 0;i<n; i++){
                long b = 1;
                for( int j = 0; j<=i; j++){
                    b*=a;
                    b%=MOD;
                    a = a+1;
                }
                ans+=b;
                ans%=MOD;
            }
            return ans;
        }
    }
    
}

class Buildings {
    public int TotalWays(int N)
    {
        // Code here
        long mod=1000000007;
        long  ans=0,curr=1, prev=1;
        for(int i=1;i<=N;i++)
        {
            ans=(prev+curr)%mod; 
            prev=curr;
            curr=ans;
        }
        ans= (ans*ans)%mod;
        return (int)ans;
    }
    
}

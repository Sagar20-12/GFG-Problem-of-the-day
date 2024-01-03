class SmallestWindow {
    public int smallestSubstring(String S) {
        // Code here
        int zero = -1;
        int one = -1;
        int two = -1;
        
        int ans = Integer.MAX_VALUE;
        
        for(int i = 0 ; i < S.length(); i++){
            if(S.charAt(i) == '0'){
                zero = i;
            }        
            else if(S.charAt(i) == '1'){
                one = i;
            }
            else{
                two = i;
            }
            
            if(zero != -1 && one != -1 && two != -1){
                int max = Math.max(zero, Math.max(one, two));
                int min = Math.min(zero, Math.min(one, two));
                
                ans = Math.min(ans, max-min+1);
            }
        }
        
        return ans == Integer.MAX_VALUE ? -1 : ans;
    }

    
};

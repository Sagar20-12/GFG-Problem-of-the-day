//User function Template for Java

//Good question if you know how to play with bits
class RightmostDiffBit {
    public static int posOfRightMostDiffBit(int m, int n)
    {
            
        // Your code here   
        if(m == n){
            return -1;
            
        }
        String x = Integer.toBinaryString(m);
        String y = Integer.toBinaryString(n);
        int rem = 1;
        int q = Math.min(x.length(), y.length());
        for(int i = 0; i<q; i++){
            if(x.charAt(x.length()-1-i)!=y.charAt(y.length()-1-i)){
                return rem;
            } else{
                rem++; 
            }
        }
        return rem;
            
    }
    
}

public class ShortestPathfrom1ton {
    public int minStep(int n)
    {
        // code here
        int v=0;
        while(n!=1){
            if(n%3==0) {
                n=n/3;
                
            }
            else{
            n--;
                
            }
            v++;
            
        } 
        return v;
       
    }
    
}

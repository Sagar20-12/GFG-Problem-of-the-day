class PascalTriangle {
    ArrayList<Long> nthRowOfPascalTriangle(int n) {
        
        int MOD = 1000000007;
        ArrayList<Long> prev = new ArrayList<>();
        prev.add(1L);
        
        for(int i=1; i<n; i++){
            ArrayList<Long> next = new ArrayList<>();
            next.add(1L);
            
            for(int j=1; j<prev.size(); j++){
                next.add((prev.get(j) + prev.get(j-1))%MOD);
            }
            next.add(1L);
            prev = next;
        }
        return prev;
    }
}
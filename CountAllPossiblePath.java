class CountAllPossiblePath {
    public int isPossible(int[][] paths)
    {
        int n = paths.length;
        int[] edge = new int[n]; 
        for(int i = 0; i < n; i++){ 
            for(int j = 0; j < n; j++){ 
                if(paths[i][j] == 1){
                    edge[i]++; 
                }
            }
        }
        for(int i = 0; i < n; i++){ 
            if(edge[i] % 2 != 0){
                return 0;
            }
        }
        return 1;
    }
}

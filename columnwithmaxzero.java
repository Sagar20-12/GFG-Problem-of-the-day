class Solution
{
    int columnWithMaxZeros(int arr[][], int N)
    {
        // code here 
        int zerocol = 0;
        int col = -1;
        for(int i = 0; i<N; i++){
            int zerocount = 0;
            for(int j = 0; j<N; j++){
                if(arr[i][j] == 0){
                    zerocount++;
                }
            }
            if(zerocol<zerocount){
                zerocol = zerocount;
                col = i;
            }
        }
        return col;
    }
}
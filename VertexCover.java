class VertexCover {
     // code here
     int ans = Integer.MAX_VALUE;
     outerloop:
     for (int i = 0; i <= (1 << n) - 1; i++) {
         for (int j = 0; j < m; j++) {
             int vertex1 = edges[j][0] - 1;
             int vertex2 = edges[j][1] - 1;

             if ((i & (1 << vertex1)) == 0 && (i & (1 << vertex2)) == 0) {
                 continue outerloop;
             }
         }
         ans = Math.min(ans, Integer.bitCount(i));
     }
     return ans;
}

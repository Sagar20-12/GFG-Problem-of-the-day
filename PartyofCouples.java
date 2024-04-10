//The below code is giving TLE
// class Solution{
//     static int findSingle(int n, int arr[]){
//         // code here
//         Arrays.sort(arr);
//         for(int i = 0; i<n-1; i++){
//             if(arr[i] != arr[i+1]){
//                 return arr[i];
//             } else{
//                 i++;
//             }
//         }
//         return arr[n-1];
        
//     }
// }


public class PartyofCouples {
    static int findSingle(int n, int arr[]){
        int ans=0;
       for(int i=0;i<n;i++){
           ans^=arr[i];
       }
       
       return ans;
   }
}

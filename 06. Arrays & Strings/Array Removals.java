
import java.util.*;
class Solution {
    int removals(int[] arr, int n, int k) {

        Arrays.sort(arr);

        int i = 0; 
        int j = n - 1;
        int cnt = 0;

        while(i <= j){
            if(arr[j] - arr[i] <= k){
                return cnt;
            }else if(arr[j] - arr[i] > k){
                j--;
                cnt++;
            }else if(arr[j] - arr[i] < k){
                
            }
        }
        


        return 0;
    }
}
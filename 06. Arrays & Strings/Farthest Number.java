

//   https://www.geeksforgeeks.org/problems/farthest-number--170636/1


import java.util.*;
class Solution {
    static int[] farNumber(int N, int arr[]) {
        int[] ans = new int[N];
        Arrays.fill(ans, -1);

        for(int i = 0; i < arr.length; i++){
            int num = arr[i];

            for(int j = i + 1; j < arr.length; j++){
                if(arr[j] < num){
                    ans[i] = j;
                }
            }
        }

        return ans;

    }
}
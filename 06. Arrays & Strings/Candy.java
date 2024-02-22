

//   https://www.geeksforgeeks.org/problems/candy/1


import java.util.*;
class CandySolution2 {
    static int minCandy(int N, int ratings[]) {
        
        int[] ans = new int[N];
        Arrays.fill(ans, 1);

        for(int i = N - 2; i >= 0; i--){
            if(ratings[i] > ratings[i + 1]){
                ans[i] = ans[i + 1] + 1;
            }
        }

        for(int i = 1; i < N; i++){
            if(ratings[i] > ratings[i - 1]){
                ans[i] = Math.max(ans[i], ans[i - 1] + 1);
            }
        }

        int sum = 0;
        for(int val : ans){
            sum += val;
        }

        return sum;
    }
}

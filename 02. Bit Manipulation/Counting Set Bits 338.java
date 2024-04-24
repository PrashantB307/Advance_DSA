

//   https://leetcode.com/problems/counting-bits/

//   https://www.codingninjas.com/studio/problems/count-total-set-bits_784


class Solution {
    public int[] countBits(int n) {
     
        int[] ans = new int[n + 1];
        ans[0] = 0;

        for(int i = 1; i <= n; i++){
            int cnt = 0;
            int temp = i;

            while (temp != 0) {
                temp = temp & (temp - 1);
                cnt++;
            }

            ans[i] = cnt;
        }

        return ans;
    }
}


//XXXXXXXXXXXXXXXXXXXXXXXXXXXX=======>   Coding Ninja    <=======XXXXXXXXXXXXXXXXXXXXXXXXXXXXXX


class Solution2{
    public static int countSetBits(int n) {
        int[] ans = new int[n + 1];
        ans[0] = 0;

        for(int i = 1; i <= n; i++){
            int cnt = 0;
            int temp = i;

            while (temp != 0) {
                temp = temp & (temp - 1);
                cnt++;
            }

            ans[i] = cnt;
        }
        
        int sum = 0;
        for(int val : ans){
            sum += val;
        }

        return sum;
    }
}
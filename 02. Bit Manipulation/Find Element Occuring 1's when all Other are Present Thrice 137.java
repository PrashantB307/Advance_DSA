

//   https://www.geeksforgeeks.org/problems/find-element-occuring-once-when-all-other-are-present-thrice/1

//   https://leetcode.com/problems/single-number-ii/


class Solution {
    static int singleElement(int[] arr , int N) {
        
        int res = 0;
        for(int i = 0; i < 32; i++){
            int ans = 0;
            for(int j = 0; j < arr.length; j++){
                if((arr[j] & (1 << i)) != 0){
                    ans++;
                }
            }

            if(ans % 3 == 1){
                res += (1 << i);
            }
        }

        return res;
    }
}
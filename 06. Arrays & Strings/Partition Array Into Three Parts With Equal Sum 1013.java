

//   https://leetcode.com/problems/partition-array-into-three-parts-with-equal-sum/


class Solution {
    public boolean canThreePartsEqualSum(int[] arr) {
        
        int sum = 0;
        for(int val : arr){
            sum += val;
        }

        if(sum % 3 != 0){
            return false;
        }

        int avg = sum / 3;
        int temp = 0;
        int cnt = 0;

        for(int i = 0; i < arr.length; i++){
            temp += arr[i];

            if(temp == avg){
                temp = 0;
                cnt++;
            }
        }

        if(cnt >= 3){
            return true;
        }

        return false;
    }
}
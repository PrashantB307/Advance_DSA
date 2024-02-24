

//     https://www.geeksforgeeks.org/problems/find-the-number-of-sub-arrays-having-even-sum1533/1


class Solution {
    long countEvenSum(int[] arr, int n) {

        long ans = 0;
        int sum = 0;
        int even = 0;
        int odd = 0;

        for(int val : arr){
            sum += val;

            if(sum % 2 == 0){
                ans += even;
                even++;
            }else{
                ans += odd;
                odd++;
            }
        }

        return ans;
    }
}
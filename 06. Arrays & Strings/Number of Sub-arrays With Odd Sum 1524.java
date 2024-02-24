

//    https://leetcode.com/problems/number-of-sub-arrays-with-odd-sum/

//    https://www.codingninjas.com/studio/problems/number-of-sub-arrays-with-odd-sum_1463156


class Solution {
    public int numOfSubarrays(int[] arr) {
        long ans = 0;
        int even = 0;
        int odd = 0;
        int sum = 0;
        
        for(int val : arr){
            sum += val;

            if(sum % 2 == 0){
                ans += odd;
                even++;
            }else{
                ans += even + 1;
                odd++;
            }
        }
        
        
        return (int)(ans % 1000000007);
    }
}
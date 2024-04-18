

//    https://www.geeksforgeeks.org/problems/longest-alternating-subsequence5951/1


class Solution
{
    public int AlternatingaMaxLength(int[] nums)
    {
        int n = nums.length;
        if(n == 1){
            return 1;
        }

        int ma = 1;
        int mi = 1;

        for(int i = 1; i < n; i++){
            if(nums[i] > nums[i - 1]){
                ma = mi + 1;
            }else if(nums[i] < nums[i - 1]){
                mi = ma + 1;
            }else{
                continue;
            }
        }

        return Math.max(mi, ma);
    }
}
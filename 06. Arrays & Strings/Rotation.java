

//   https://www.geeksforgeeks.org/problems/rotation4723/1


class Solution1 {
    int findKRotation(int nums[], int n) {
        for(int i = 1; i < n; i++){
            if(nums[i] < nums[i - 1]){
                return i;

            }
        }

        return 0;
    }
}
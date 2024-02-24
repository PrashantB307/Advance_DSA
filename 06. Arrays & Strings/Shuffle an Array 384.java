

//    https://leetcode.com/problems/shuffle-an-array/description/


import java.util.Random;
class Solution {

    int[] nums;
    Random random;

    public Solution(int[] nums) {
        this.nums = nums;
        this.random = new Random();
    }
    
    public int[] reset() {
        return nums;
    }
    
    public int[] shuffle() {
        int[] shuffle = nums.clone();

        for(int i = nums.length - 1; i > 0; i--){
            int idx = random.nextInt(i + 1);

            int temp = shuffle[i];
            shuffle[i] = shuffle[idx];
            shuffle[idx] = temp;
        }

        return shuffle;
    }
}
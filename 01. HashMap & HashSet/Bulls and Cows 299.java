

//    https://leetcode.com/problems/bulls-and-cows/


class Solution {
    public String getHint(String secret, String guess) {
        int bulls = 0;
        int cows = 0;
        int[] nums = new int[10];

        for (int i = 0; i < secret.length(); i++) {
            int numsSecret = secret.charAt(i) - '0';
            int numsGuess = guess.charAt(i) - '0';

            if (numsSecret == numsGuess) {
                bulls++;
            } else {
                if (nums[numsGuess] < 0) {
                    cows++;
                }
                if (nums[numsSecret] > 0) {
                    cows++;
                }

                nums[numsGuess]++;
                nums[numsSecret]--;
            }
        }

        return bulls + "A" + cows + "B";
    }
}
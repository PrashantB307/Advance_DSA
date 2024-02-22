

//    https://leetcode.com/problems/increasing-triplet-subsequence/


class Solution {
    public boolean increasingTriplet(int[] arr) {
        int a = Integer.MAX_VALUE;
        int b = Integer.MAX_VALUE;

        for(int val : arr){
            if(val <= a){
                a = val;
            }else if(val <= b){
                b = val;
            }else{
                return true;
            }
        }

        return false;
    }
}
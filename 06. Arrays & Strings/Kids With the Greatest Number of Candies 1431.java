

//   https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/

//   https://www.codingninjas.com/studio/problems/maximum-candies-kid_2195422


import java.util.*;
class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int mx = 0;
        List<Boolean> ans = new ArrayList<>();

        for(int val : candies){
           if(val > mx){
               mx = val;
           }
        }

        for(int val : candies){
            if(val + extraCandies >= mx){
                ans.add(true);
            }else{
                ans.add(false);
            }
        }

        return ans;
    }
}
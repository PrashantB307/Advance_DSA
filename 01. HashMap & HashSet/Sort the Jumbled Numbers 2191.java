

//    https://leetcode.com/problems/sort-the-jumbled-numbers/description/


import java.util.*;
class Solution {
    public int[] sortJumbled(int[] mapping, int[] nums) {
        
        int[] mapped = new int[nums.length];
        HashMap<Integer, ArrayList<Integer>> map = new HashMap<>();

        for(int i = 0; i < nums.length; i++){
            int num = nums[i];
            int idx = 1;
            int nmbr = 0;

            while (num > 0) {
                int rem = num % 10;
                nmbr = nmbr + (mapping[rem] * idx);
                num = num / 10;
                idx *= 10;
            }

            if(nums[i] == 0){
                nmbr = mapping[0];
            }

            mapped[i] = nmbr;

            if(!map.containsKey(mapped[i])){
                map.put(mapped[i], new ArrayList<Integer>());
            }
            map.get(mapped[i]).add(nums[i]);
        }

        Arrays.sort(mapped);

        int idx = 0;
        for(int i = 0; i < mapped.length; i++){
            if(map.containsKey(mapped[i])){
                for(int val : map.get(mapped[i])){
                    nums[idx] = val;
                    idx++;
                }
            }
            map.remove(mapped[i]);
        }

        return nums;
    }
}
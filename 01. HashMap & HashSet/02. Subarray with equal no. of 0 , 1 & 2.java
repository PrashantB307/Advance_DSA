import java.util.*;

class Solution
{
    //Function to count subarrays with 1s and 0s.
    static int countSubarrWithEqualZeroAndOne(int arr[], int n)
    {
        int ans = 0;

         int sum = 0;
         HashMap<Integer, Integer> map = new HashMap<>();
         map.put(0, 1);

         for(int val: arr){
            sum += (val == 0 ? -1 : 1);

            if(map.containsKey(sum)) {
                ans += map.get(sum);
                map.put(sum, map.get(sum) + 1);
            }else{
                map.put(sum , 1);
            }
         }

         return ans;
    }
}



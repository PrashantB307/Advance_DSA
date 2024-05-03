

//   https://www.geeksforgeeks.org/problems/two-numbers-with-odd-occurrences5846/1

//   https://www.codingninjas.com/studio/problems/two-numbers-with-odd-occurrences_8160466

//   https://www.codingninjas.com/studio/problems/detect-odd_4605992


import java.util.*;
class Solution
{
    public int[] twoOddNum(int arr[], int N)
    {
        HashMap<Integer, Integer> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();

        for(int val : arr){
            map.put(val, map.getOrDefault(val, 0) + 1);
        }

        for(Map.Entry<Integer, Integer> m : map.entrySet()){
            if(m.getValue() % 2 != 0){
                list.add(m.getKey());
            }
        }

        // Collections.sort(list);  // ===> use this Line
        int n = list.size();
        int[] ans = new int[2];
        ans[0] = list.get(n - 1);
        ans[1] = list.get(n - 2);

        return ans;
    }
}
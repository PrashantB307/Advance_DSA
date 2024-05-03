

//   https://www.geeksforgeeks.org/problems/twice-counter4236/1


import java.util.*;
class Solution
{
    public int countWords(String list[], int n)
    {
        HashMap<String, Integer> map = new HashMap<>();

        for(String str : list){
            map.put(str, map.getOrDefault(str, 0) + 1);
        }

        int cnt = 0;
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 2) {
                cnt++;
            }
        }

        return cnt;
    }
}
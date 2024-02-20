

//    https://practice.geeksforgeeks.org/problems/relative-sorting4323/1

//    https://leetcode.com/problems/relative-sort-array/description/


import java.util.*;
class Solution{

    public static int[] sortA1ByA2(int A1[], int N, int A2[], int M)
    {
        HashMap<Integer, Integer> map = new HashMap<>();
        HashSet<Integer> set = new HashSet<>();
        int[] ans = new int[N];

        for(int val : A1){
            map.put(val, map.getOrDefault(val, 0) + 1);
        }

        for(int val : A2){
            set.add(val);
        }

        int j = 0;
        for(int val : A2){
            if(map.containsKey(val)){
                int num = map.get(val);
                for(int i = 0; i < num; i++){
                    ans[j++] = val;
                }
            }
        }

        ArrayList<Integer> list = new ArrayList<>();

        for(int val : A1){
            if(!set.contains(val)){
                list.add(val);
            }
        }

        Collections.sort(list);
        for(int val : list){
           ans[j++] = val;
        }

        return ans;
    }
}

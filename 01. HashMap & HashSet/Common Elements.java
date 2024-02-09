

//    https://practice.geeksforgeeks.org/problems/common-elements5420/1


import java.util.*;
class Solution{
    public static ArrayList<Integer> common_element(int v1[], int v2[])
    {
        HashMap<Integer, Integer> map = new HashMap<>();
        ArrayList<Integer> ans = new ArrayList<>();

        for(int val : v1){
            map.put(val, map.getOrDefault(val, 0) + 1);
        }

        for(int val : v2){
            if(map.containsKey(val)){
                if(map.get(val) > 1){
                    ans.add(val);
                    map.put(val, map.getOrDefault(val, 0) - 1);
                }else if(map.get(val) == 1){
                    ans.add(val);
                    map.remove(val);
                }
            }
        }

        Collections.sort(ans);
        return ans;
    }
}
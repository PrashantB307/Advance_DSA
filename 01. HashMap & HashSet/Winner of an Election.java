

//   https://practice.geeksforgeeks.org/problems/winner-of-an-election-where-votes-are-represented-as-candidate-names-1587115621/1



import java.util.*;
class Solution{
    //Function to return the name of candidate that received maximum votes.
    public static String[] winner(String arr[], int n)
    {
        HashMap<String, Integer> map = new HashMap<>();
        ArrayList<String> list = new ArrayList<>();
        
        for(String str : arr){
            map.put(str, map.getOrDefault(str, 0) + 1);
        }
        
        int vote = 0;
        
        Set<String> set = map.keySet();
        for(String str : set){
            if(vote <= map.get(str)){
                vote = map.get(str);
            }
        }
        
        for(String str : set){
            if(vote == map.get(str)){
                list.add(str);
            }
        }
        
        String[] ans = new String[2];
        Collections.sort(list);
        
        ans[0] = list.get(0);
        ans[1] = vote + "";
        
        return ans;
    }
}

 

//     https://practice.geeksforgeeks.org/problems/second-most-repeated-string-in-a-sequence0534/1


import java.util.*;
class Solution
{
    String secFrequent(String arr[], int N)
    {
       
        HashMap<String, Integer> map = new HashMap<>();
        
        for(int i = 0; i < N; i++){
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(map.values());

        Collections.sort(list);

        for(Map.Entry<String, Integer> mape : map.entrySet()){
            if(mape.getValue() == list.get(list.size() - 2)){
                return mape.getKey();
            }
        }

        return "";
    }
}
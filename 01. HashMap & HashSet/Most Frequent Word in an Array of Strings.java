

//   https://practice.geeksforgeeks.org/problems/most-frequent-word-in-an-array-of-strings3528/1



import java.util.*;
class Solution{
   
    public String mostFrequentWord(String arr[],int n){
        
        HashMap<String, Integer> map = new HashMap<>();
        HashSet<String> set = new HashSet<>();

        for(String str : arr){
            map.put(str, map.getOrDefault(str, 0) + 1);
        }

        int freq = 0;
        String ans = "";

		for(String str : arr){
			if(map.get(str) >= freq && !set.contains(str)){
				freq = map.get(str);
				ans = str;
                set.add(str);
			}
		}

		return ans;
    }

}
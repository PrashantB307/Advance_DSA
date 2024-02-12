

//    https://practice.geeksforgeeks.org/problems/print-anagrams-together/1

//    https://leetcode.com/problems/group-anagrams/description/
 
//    https://www.codingninjas.com/studio/problems/group-anagrams-together_985354



import java.util.* ;
class Solution {

	public static ArrayList<ArrayList<String>> getGroupedAnagrams(ArrayList<String> inputStr, int n) {
		
        HashMap< HashMap<Character, Integer>, ArrayList<String>> hmap = new HashMap<>();
        
        for(String str : inputStr){
            HashMap<Character, Integer> map = new HashMap<>();

            for(int i = 0; i < str.length(); i++){
                char ch = str.charAt(i);
                map.put(ch, map.getOrDefault(ch, 0) + 1);
            }

            if(hmap.containsKey(map) == false){
                ArrayList<String> list = new ArrayList<>();
                list.add(str);
                hmap.put(map, list);
            }else{
                ArrayList<String> list = hmap.get(map);
                list.add(str);
            }
        }

        ArrayList<ArrayList<String>> res = new ArrayList<>();
        for(ArrayList<String> val : hmap.values()){
            res.add(val);
        }

        return res;
	}
}
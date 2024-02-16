

//   https://practice.geeksforgeeks.org/problems/length-of-the-longest-substring3036/1
 
//   https://practice.geeksforgeeks.org/problems/longest-distinct-characters-in-string5848/1

//   https://www.codingninjas.com/studio/problems/longest-substring-without-repeating-characters_758894



import java.util.* ;
class Solution {
        
	public static int lengthOfLongestSubstring(String S) {
		int ans = 0;
        int i = -1; 
        int j = -1;
        
        HashMap<Character, Integer> map = new HashMap<>();
        
        while(true){
            boolean f1 = false;
            boolean f2 = false;
            
            while(i < S.length() - 1){
                f1 = true;
                
                i++;
                
                char ch = S.charAt(i);
                map.put(ch, map.getOrDefault(ch, 0) + 1);
                
                if(map.get(ch) == 2){
                    break;
                }else{
                    int len = i - j;
                    ans = Math.max(ans, len);
                }
            }
            
            while(j < i){
                f2 = true;
                
                j++;
                
                char ch = S.charAt(j);
                map.put(ch, map.get(ch) - 1);
                
                if(map.get(ch) == 1){
                    break;
                }
            }
            
            if(f1 == false && f2 == false){
                break;
            }
        }
        
        return ans;
	}
}


//   https://www.geeksforgeeks.org/problems/nuts-and-bolts-problem0431/1


import java.util.*;
class Solution {
    void matchPairs(int n, char nuts[], char bolts[]) {
        String str = "!#$%&*?@^";
        HashSet<Character> set = new HashSet<>();
        
        for(char ch : nuts){
            set.add(ch);
        }

        int k = 0;
        for(int i = 0; i < str.length(); i++){
            if(set.contains(str.charAt(i))){
                nuts[k] = str.charAt(i);
                bolts[k] = str.charAt(i);
                k++;
            }
        }
    }
}
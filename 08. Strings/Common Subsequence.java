

//   https://www.geeksforgeeks.org/problems/common-subsequence4049/1


import java.util.*;
class Sol {
    Boolean commonSubseq(String a, String b) {
        HashSet<Character> set = new HashSet<>();

        for (char ch : a.toCharArray()){
            set.add(ch);
        }
            
        for (char ch : b.toCharArray()){
            if (set.contains(ch)){
                return true;
            }
        }
            
        return false;
    }
}
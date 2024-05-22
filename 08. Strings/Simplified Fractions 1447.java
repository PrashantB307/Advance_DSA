

//    https://leetcode.com/problems/simplified-fractions/

//    https://www.naukri.com/code360/problems/simplified-fractions_1467060


import java.util.*;
class Solution {
    public List<String> simplifiedFractions(int n) {
        Set<String> set = new HashSet<>();
        
        for(int i = 1; i < n; i++){
            for(int j = i + 1; j <= n; j++){
                int gcd = gcd(i, j);
                set.add(i / gcd + "/" + j / gcd);
            }
        }

        return new ArrayList<>(set);
    }

    public int gcd(int a, int b){
        if(b == 0){
            return a;
        }

        return gcd(b , a % b);
    }
}


//   https://practice.geeksforgeeks.org/problems/roman-number-to-integer3201/1

//   https://leetcode.com/problems/roman-to-integer/description/

//   https://www.codingninjas.com/studio/problems/roman-numeral-to-integer_981308



import java.util.*;
class Solution {
    public int romanToInt(String str) {
    
        int n = str.length();
        int ans = 0;

        for(int i = 0; i < n - 1; i++){
            char ch1 = str.charAt(i);
            char ch2 = str.charAt(i + 1);

            if(getValue(ch1) < getValue(ch2)){
                ans -= getValue(ch1);
            }else{
                ans += getValue(ch1);
            }
        }

        ans += getValue(str.charAt(n - 1));

        return ans;
    }

    int getValue(char ch){
        switch (ch){
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            case 'M': return 1000;
            default: return 0;
        }
    }
}


// XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX



class Solution2 {
   
    public int romanToDecimal(String str) {
       
        HashMap<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000); 

        int n = str.length();
        int ans = 0;

        for(int i = 0; i < n - 1; i++){
            char ch1 = str.charAt(i);
            char ch2 = str.charAt(i + 1);

            if(map.get(ch1) < map.get(ch2)){
                ans -= map.get(ch1);
            }else{
                ans += map.get(ch1);
            }
        }

        ans += map.get(str.charAt(n - 1));

        return ans;
    }
}
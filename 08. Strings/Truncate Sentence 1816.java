

//   https://leetcode.com/problems/truncate-sentence/


class Solution {
    public String truncateSentence(String s, int k) {

        int space = 0;
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            if(ch == ' '){
                space++;
            }

            if(space == k){
                return s.substring(0, i);
            }
        }

        return s;
    }
}


//XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX


class Solution1 {
    public String truncateSentence(String s, int k) {

        String[] arr = s.split(" ");
        String ans = "";
        for(int i = 0; i < k - 1; i++){
            ans = ans + arr[i] + " ";
        }

        ans += arr[k - 1];
        
        return ans;
    }
}


//    https://leetcode.com/problems/number-of-steps-to-reduce-a-number-in-binary-representation-to-one/


class Solution {
    public int numSteps(String s) {
        
        int carry = 0;
        int steps = 0;

        for(int i = s.length() - 1; i > 0; i--){
            if((s.charAt(i) - '0' + carry) % 2 == 1){
                steps += 2;
                carry = 1;
            }else{
                steps++;
            }
        }

        return steps + carry;
    }
}
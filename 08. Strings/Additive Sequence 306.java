

//   https://www.geeksforgeeks.org/problems/additive-sequence/1

//   https://leetcode.com/problems/additive-number/


class Solution {
    public boolean isAdditiveSequence(String s) {

        int n = s.length();
        for(int i = 0; i < n / 2; i++){
            for(int j = i + 1; j < n - 1; j++){
                String a = s.substring(0, i + 1);
                String b = s.substring(i + 1, j + 1);
                String c = s.substring(j + 1);

                if(helper(a, b, c)){
                    return true;
                }
            }
        }

        return false;
    }

    public boolean helper(String a, String b, String c){

        String sum = findSum(a, b);
        int i = 0;
        int j = 0;

        while (i < c.length() && j < sum.length()) {
            if(c.charAt(i) != sum.charAt(j)){
                return false;
            }
            i++;
            j++;
        }

        if(j != sum.length()){
            return false;
        }

        if(i == c.length()){
            return true;
        }

        c = c.substring(i);

        return helper(b, sum, c);
    }

    public String findSum(String a, String b){
        int i = a.length() - 1;
        int j = b.length() - 1;

        StringBuilder sb = new StringBuilder();
        int carry = 0;

        while (i >= 0 && j >= 0) {
            int sum = (a.charAt(i) - '0') + (b.charAt(j) - '0') + carry;
            sb.append((char) sum % 10);
            carry = sum / 10;
            i--;
            j--;
        }
        while (i >= 0) {
            int sum = (a.charAt(i) - '0') + carry;
            sb.append((char) sum % 10);
            carry = sum / 10;
            i--;
        }
        while (j >= 0) {
            int sum = (b.charAt(j) - '0') + carry;
            sb.append((char) sum % 10);
            carry = sum / 10;
            j--;
        }

        if(carry != 0){
            sb.append((char)(carry + '0'));
        }

        StringBuilder temp = sb.reverse();

        return temp.toString();
    }
}



//   https://www.geeksforgeeks.org/problems/sum-of-numbers-or-number1219/1

//   https://leetcode.com/problems/add-strings/submissions/1189585851/


class Solution {
    String findSum(String X, String Y) {
        
        StringBuilder sb = new StringBuilder();
        int l1 = X.length() - 1;
        int l2 = Y.length() - 1;
        int carry = 0;

        while (l1 >= 0 || l2 >= 0 || carry > 0) {
            
            int d1 = l1 >= 0 ? X.charAt(l1--) - '0' : 0;
            int d2 = l2 >= 0 ? Y.charAt(l2--) - '0' : 0;

            int sum = d1 + d2 + carry;
            carry = sum / 10;

            sb.insert(0, sum % 10);
        }

        while (sb.length() > 1 && sb.charAt(0) == '0') {
            sb.deleteCharAt(0);
        }

        return sb.toString();
    }
}


// XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX


class Solution2 {
    String findSum(String X, String Y) {
       

        int num1 = Integer.parseInt(X);
        int num2 = Integer.parseInt(Y);

        int res = num1 + num2;
        return  res + "";
    }

    
}
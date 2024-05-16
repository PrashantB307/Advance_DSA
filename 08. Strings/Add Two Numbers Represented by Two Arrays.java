

//   https://www.geeksforgeeks.org/problems/add-two-numbers-represented-by-two-arrays2408/1


class Solution {
    String calc_Sum(int a[], int n, int b[], int m) {
        int i = a.length - 1;
        int j = b.length - 1;
        int carry = 0, sum = 0;
        String res = "";
        int n1 = 0, n2 = 0;

        while (i >= 0 || j >= 0) {
            n1 = i >= 0 ? a[i] : 0;
            n2 = j >= 0 ? b[j] : 0;

            sum = n1 + n2 + carry;
            carry = sum / 10;
            res = res + (sum % 10);

            i--;
            j--;
        }
        
        while (carry != 0) {
            res += carry % 10;
            carry = carry / 10;
        
        }
        StringBuilder sb = new StringBuilder(res).reverse();
        while (sb.length() >= 1 && sb.charAt(0) == '0') {
            sb.deleteCharAt(0);
        }
        
        return sb.toString();
    }
}


//   https://www.geeksforgeeks.org/problems/binary-representation-of-next-number3648/1


class Solution {
    String binaryNextNumber(String s) {
        char arr[] = s.toCharArray();
        int carry = 1, j = 0;

        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] == '0') {
                carry = 0;
                arr[i] = '1';
                break;
            } else{
                arr[i] = '0';
            }
                
        }

        s = new String(arr);
        if (carry == 1){
            s = '1' + s;
        }
            
        while (j < s.length() && s.charAt(j) == '0'){
            j++;
        }
            
        s = s.substring(j);

        return s;
    }
}
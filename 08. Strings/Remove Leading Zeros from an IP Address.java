

//   https://www.geeksforgeeks.org/problems/remove-leading-zeros-from-an-ip-address3530/1


class Solution {
    public String newIPAdd(String S) {
        String[] arr = S.split("[.]");
        StringBuilder sb = new StringBuilder();

        for (String str : arr) {
            int j = 0;
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == '0') {
                    j++;
                } else {
                    break;
                }
            }
            str = str.substring(j);
            if (str.length() == 0) {
                sb.append("0");
            }
            sb.append(str);
            sb.append(".");
        }

        return sb.deleteCharAt(sb.length() - 1).toString();
    }
}
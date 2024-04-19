
// ===> https://www.codingninjas.com/studio/problems/multiply-strings_982763

class Solution {
    public String multiplyStrings(String s1, String s2) {
        int sign = s1.charAt(0) == '-' ^ s2.charAt(0) == '-' ? -1 : 1;
        if (s1.indexOf('-') != -1)
            s1 = s1.substring(1);
        if (s2.indexOf('-') != -1)
            s2 = s2.substring(1);

        char[] a = s1.toCharArray();
        char[] b = s2.toCharArray();

        int[] ans = new int[a.length + b.length];
        for (int i = a.length - 1; i >= 0; i--) {
            for (int j = b.length - 1; j >= 0; j--) {
                ans[i + j + 1] += (a[i] - '0') * (b[j] - '0');
                ans[i + j] += ans[i + j + 1] / 10;
                ans[i + j + 1] %= 10;
            }
        }
        int leadingZeros = 0;
        for (int i = 0; i < ans.length; i++) {
            if (ans[i] != 0)
                break;
            else
                leadingZeros++;

        }
        StringBuilder sb = new StringBuilder();
        for (int i = leadingZeros; i < ans.length; i++) {
            sb.append(ans[i]);
        }
        if (sb.length() == 0)
            return "0";

        return sign < 0 ? "-" + sb : sb.toString();
    }
}